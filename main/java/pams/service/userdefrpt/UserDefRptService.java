package pams.service.userdefrpt;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.common.SystemService;
import pams.repository.dao.ClsUdFeedbackMapper;
import pams.repository.dao.ClsUdFldinfoMapper;
import pams.repository.dao.ClsUdRptdataMapper;
import pams.repository.dao.ClsUdTblinfoMapper;
import pams.repository.dao.dataetl.DataETLMapper;
import pams.repository.dao.userdefrpt.UserDefRptMapper;
import pams.repository.model.*;
import pams.repository.model.userdefrpt.UdRptFeedbackData;
import pams.repository.model.userdefrpt.UserDefRptVO;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhanrui
 * Date: 14-4-24
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserDefRptService {
    @Autowired
    private UserDefRptMapper userDefRptMapper;
    @Autowired
    private ClsUdRptdataMapper rptdataMapper;
    @Autowired
    private ClsUdFeedbackMapper feedbackMapper;
    @Autowired
    private ClsUdFldinfoMapper fldinfoMapper;
    @Autowired
    private ClsUdTblinfoMapper tblinfoMapper;
    @Autowired
    private DataETLMapper dataETLMapper;

    @Autowired
    private PlatformService platformService;

    //rptdata
    public void clearRptData(String rpttype, String rptno) {
        ClsUdRptdataExample example = new ClsUdRptdataExample();
        example.createCriteria()
                .andRpttypeEqualTo(rpttype)
                .andRptnoEqualTo(rptno);
        rptdataMapper.deleteByExample(example);
    }

    public void insertRptData(String sn, String rpttype, String rptno, String[] fields) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ClsUdRptdata record = new ClsUdRptdata();
        Class clazz = record.getClass();

        record.setGuid(sn);
        record.setRptno(rptno);
        record.setRpttype(rpttype);
        record.setBranchid(fields[0]);
        record.setImpdate(new SimpleDateFormat("yyyyMMdd").format(new Date()));

        for (int i = 1; i < fields.length; i++) {
            String seq = StringUtils.leftPad("" + i, 2, "0");
            Method m = clazz.getDeclaredMethod("setFld" + seq, String.class);
            m.invoke(record, fields[i]);
        }
        rptdataMapper.insert(record);
    }

    //columns   info
    public List<ClsUdFldinfo> selectColumnsDefine(String rpttype, String rptno) {
        ClsUdFldinfoExample example = new ClsUdFldinfoExample();
        example.createCriteria()
                .andRpttypeEqualTo(rpttype)
                .andRptnoEqualTo(rptno);
        example.setOrderByClause(" fldsn ");
        return fldinfoMapper.selectByExample(example);
    }

    public void clearColumnNames(String rpttype, String rptno) {
        ClsUdFldinfoExample example = new ClsUdFldinfoExample();
        example.createCriteria()
                .andRpttypeEqualTo(rpttype)
                .andRptnoEqualTo(rptno);
        fldinfoMapper.deleteByExample(example);
    }

    public void insertColumnDefInfo(String rpttype, String rptno, String[] fields) {
        for (int i = 1; i < fields.length; i++) {
            ClsUdFldinfo clsUdFldinfo = new ClsUdFldinfo();
            clsUdFldinfo.setRpttype(rpttype);
            clsUdFldinfo.setRptno(rptno);
            clsUdFldinfo.setFldname(fields[i]);
            clsUdFldinfo.setFldsn(StringUtils.leftPad("" + i, 2, "0"));
            clsUdFldinfo.setFldtype("0"); //暂时统一为字符类型
            clsUdFldinfo.setRecver(1);
            fldinfoMapper.insert(clsUdFldinfo);
        }
    }

    //Table def info
    public List<ClsUdTblinfo> selectTblInfos(String rpttype) {
        ClsUdTblinfoExample example = new ClsUdTblinfoExample();
        example.createCriteria().andRpttypeEqualTo(rpttype);
        example.setOrderByClause(" rptno desc");
        return tblinfoMapper.selectByExample(example);
    }

    public ClsUdTblinfo selectTblInfo(ClsUdTblinfo record) {
        return tblinfoMapper.selectByPrimaryKey(record);
    }

    //新增报表
    public void insertTblInfo(ClsUdTblinfo record) {
        tblinfoMapper.insert(record);
    }

    //修改报表
    public void modifyTblInfo(ClsUdTblinfo clsUdTblinfo) {
        ClsUdTblinfo record = tblinfoMapper.selectByPrimaryKey(clsUdTblinfo);
        clsUdTblinfo.setRecver(record.getRecver() + 1);
        tblinfoMapper.updateByPrimaryKeySelective(clsUdTblinfo);
    }

    //更新数据导入时间
    public void updateImportDataDate(String rpttype, String rptno) {
        ClsUdTblinfoKey key = new ClsUdTblinfo();
        key.setRpttype(rpttype);
        key.setRptno(rptno);
        ClsUdTblinfo record = tblinfoMapper.selectByPrimaryKey(key);
        record.setImpdate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        tblinfoMapper.updateByPrimaryKey(record);
    }

    //关闭报表  清空所有相关数据
    public void clearAllRptInfo(String rpttype, String rptno) {
        ClsUdTblinfoKey key = new ClsUdTblinfo();
        key.setRpttype(rpttype);
        key.setRptno(rptno);
        tblinfoMapper.deleteByPrimaryKey(key);
        clearRptData(rpttype, rptno);
        clearColumnNames(rpttype, rptno);
    }

    //导入自定义报表的客户信息
    public int mergeCustBaseRecordsForUserDefRpt(String rpttype, String rptNo, String rptDate) {
        //检查参数
        try {
            new SimpleDateFormat("yyyyMMdd").parse(rptDate);
        } catch (ParseException e) {
            throw new RuntimeException("日期格式错误!", e);
        }

        return dataETLMapper.mergeCustBaseRecordsForUserDefRpt(rpttype, rptNo, rptDate);
    }

    //获取当前报表记录数
    public int countRptRecord(String rpttype, String rptNo){
        ClsUdRptdataExample example = new ClsUdRptdataExample();
        example.createCriteria().andRpttypeEqualTo(rpttype).andRptnoEqualTo(rptNo);
        return rptdataMapper.countByExample(example);
    }

    //增加或修改 营销标志
    public void processSingleFeedback(UdRptFeedbackData feedbackParam) {
        ClsUdFeedbackExample example = new ClsUdFeedbackExample();
        example.createCriteria().andRptkeyEqualTo(feedbackParam.getGuid());
        List<ClsUdFeedback> feedbacks = feedbackMapper.selectByExample(example);

        OperatorManager om = SystemService.getOperatorManager();
        String today = new SimpleDateFormat("yyyyMMdd").format(new Date());

        if (feedbacks.size() == 0) {
            ClsUdFeedback feedback = new ClsUdFeedback();
            String random = StringUtils.leftPad("" + (new SecureRandom().nextInt(99999) + 1), 5, "0");
            feedback.setPkid(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "-" + random);
            feedback.setRpttype(feedbackParam.getRpttype());
            feedback.setRptno(feedbackParam.getRptno());
            feedback.setRptkey(feedbackParam.getGuid());
            feedback.setIsmarketed(feedbackParam.getIsmarketed());
            feedback.setIsrefused(feedbackParam.getIsrefused());
            feedback.setMarketdate(today);
            feedback.setRefusedate(today);
            feedback.setMarketoper(om.getOperatorId());
            feedback.setRefuseoper(om.getOperatorId());
            feedbackMapper.insert(feedback);
        } else if (feedbacks.size() == 1) {
            ClsUdFeedback feedback = feedbacks.get(0);
            feedback.setIsmarketed(feedbackParam.getIsmarketed());
            feedback.setIsrefused(feedbackParam.getIsrefused());
            feedback.setMarketdate(today);
            feedback.setRefusedate(today);
            feedback.setMarketoper(om.getOperatorId());
            feedback.setRefuseoper(om.getOperatorId());
            feedbackMapper.updateByPrimaryKeySelective(feedback);
        } else {
            throw  new RuntimeException("系统错误，记录非一对一");
        }
        Ptoplog oplog = new Ptoplog();
        oplog.setActionId("UserDefRptService_processSingleFeedback");
        oplog.setActionName("自定义报表:查询");
        oplog.setOpDataBranchid(feedbackParam.getBranchid());
        oplog.setGuid(feedbackParam.getGuid());
        oplog.setOpLog("set marketed:" + feedbackParam.getIsmarketed() + "  set marketed:" + feedbackParam.getIsrefused());
        platformService.insertNewOperationLog(oplog);
    }

    //======================================================
    public UserDefRptMapper getUserDefRptMapper() {
        return userDefRptMapper;
    }

    public void setUserDefRptMapper(UserDefRptMapper userDefRptMapper) {
        this.userDefRptMapper = userDefRptMapper;
    }

    public ClsUdRptdataMapper getRptdataMapper() {
        return rptdataMapper;
    }

    public void setRptdataMapper(ClsUdRptdataMapper rptdataMapper) {
        this.rptdataMapper = rptdataMapper;
    }
}
