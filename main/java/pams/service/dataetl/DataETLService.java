package pams.service.dataetl;

import freemarker.template.Template;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import pams.repo4odsbpbs.dao.common.AssetImportMapper;
import pams.repository.dao.SvCmsCustbaseMapper;
import pams.repository.dao.dataetl.DataETLMapper;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * �ͻ�������Ϣά�����ͻ�����.
 * User: zhanrui
 * Date: 12-12-17
 * Time: ����3:50
 */
@Service
public class DataETLService {
    private static final Logger logger = LoggerFactory.getLogger(DataETLService.class);

    @Autowired
    private SvCmsCustbaseMapper cmsCustbaseMapper;
    @Autowired
    private DataETLMapper dataETLMapper;
    @Autowired
    private AssetImportMapper assetImportMapper;

    public int mergeCustBaseRecords(String rptDate) {
        //������
        try {
            new SimpleDateFormat("yyyyMMdd").parse(rptDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }

        //mergeǰ��֤����Ϊ�յĽ��д���
        updateNullCertTypeRecords(rptDate, "�������֤");
        int cnt = dataETLMapper.mergeCustBaseRecords(rptDate);
        dataETLMapper.updateCustBaseRecords4CertInfo();
        return cnt;
    }

    private int updateNullCertTypeRecords(String rptDate, String certType) {
        return dataETLMapper.updateNullCertTypeRecords(rptDate, certType);
    }


    public void importLargeFlowRecords(String startDate) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }
        dataETLMapper.deleteLargeFlowData(startDate);
        dataETLMapper.importLargeFlowRecords(startDate);
    }

    public void importData_RptA07V1(String startDate) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }
        dataETLMapper.deleteData_RptA07V1(startDate);
        dataETLMapper.importRecords_RptA07V1(startDate);
    }

    public void importData_RptA08V1(String startDate) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }
        dataETLMapper.deleteData_RptA08V1(startDate);
        dataETLMapper.importRecords_RptA08V1(startDate);
    }

    public void importData_RptA11V1(String startDate, String endDate) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }
        dataETLMapper.deleteData_RptA11V1(startDate, endDate);
        dataETLMapper.importRecords_RptA11V1(startDate, endDate);
    }

    public void deleteData_RptA11V1(String startDate, String endDate) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        } catch (ParseException e) {
            throw new RuntimeException("���ڸ�ʽ����!", e);
        }
        dataETLMapper.deleteData_RptA11V1(startDate, endDate);
    }

    public void importData_RptA12V1() {
        dataETLMapper.deleteData_RptA12V1();
        dataETLMapper.importRecords_RptA12V1();
    }

    public void importData_RptA13V1() {
        dataETLMapper.deleteData_RptA13V1();
        dataETLMapper.importRecords_RptA13V1();
    }


    public void importData_RptA14V1(String startDate) {
        dataETLMapper.deleteData_RptA14V1_tmp();
        dataETLMapper.deleteData_RptA14V1();
        dataETLMapper.importRecords_RptA14V1_tmp(startDate);
        dataETLMapper.importRecords_RptA14V1(startDate);
    }

    //Rpt15 �������в���ǩԼ�ͻ�ǩԼ���յĽ��ױ������ݵ���
    public String selectCurrDate_RptA15V1() {
        String lastDate = dataETLMapper.selectCurrDate_RptA15V1();
        if (StringUtils.isEmpty(lastDate)) {
            DateTime dt = new DateTime();
            lastDate = dt.monthOfYear().withMinimumValue().dayOfMonth().withMinimumValue().toString("yyyy-MM-dd");
        }
        return lastDate;
    }


    public void importData_RptA15V1(String startDate) {
        dataETLMapper.deleteData_RptA15V1(startDate);

        DateTime localCurrDate = new DateTime(selectCurrDate_RptA15V1());
        DateTime odsbLastDate = new DateTime();
        if (StringUtils.isEmpty(dataETLMapper.selectLastDate_RptA15V1_ODSB())) {
            odsbLastDate = new DateTime();
        }
        dataETLMapper.importRecords_RptA15V1(localCurrDate.toString("yyyy-MM-dd"), odsbLastDate.toString("yyyy-MM-dd"));
    }

    //���˿ͻ��ʲ���Ϣ���ݵ���
    public int importData_AssetData(String startDate){
/*
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("startDate", startDate);
        return assetImportMapper.importData(paramMap);
*/
        String path = "pbCustAsset.xml";
//        path = this.getClass().getClassLoader().getResource("").getPath() + path;
        path = this.getClass().getResource("").getPath() + path;
        InputStream is = ClassLoader.getSystemResourceAsStream(path);


        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)webApplicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Connection conn = sqlSession.getConnection();

        //����һ��ģ�����
        Template t = null;
        try {
            t = new Template(null, new StringReader("�û�����${user};URL��    ${url};������ ��${name}"), null);
            //������ֵ��Map
            Map map = new HashMap();
            map.put("user", "lavasoft");
            map.put("url", "http://www.baidu.com/");
            map.put("name", "�ٶ�");
            //ִ�в�ֵ���������ָ�����������
            t.process(map, new OutputStreamWriter(System.out));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int importData_CapitalFlow(String startDate){
        return 0;
    }
    //=====================================================================

    private String getSql(){
        return "select * from QDBG_GJ_CUST_INFO_ALL";
    }

}
