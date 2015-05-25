package pams.repository.dao.dataetl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * User: zhanrui
 * Date: 12-12-19
 * Time: ����8:22
 */
@Component
public interface DataETLMapper {

    //�ͻ�������Ϣά��
    int mergeCustBaseRecords(@Param("rptDate") String rptDate);
    int updateCustBaseRecords4CertInfo();
    int updateNullCertTypeRecords(@Param("rptDate") String rptDate, @Param("certType") String certType);
    //�����Զ��屨��Ŀͻ���Ϣ
    int mergeCustBaseRecordsForUserDefRpt(@Param("rptType") String rptType, @Param("rptNo") String rptNo, @Param("rptDate") String rptDate);


    //����ʽ�����
    int deleteLargeFlowData(String startDate);
    int importLargeFlowRecords(String startDate);

    //����ɽ��ͻ���ϸ
    int deleteData_RptA07V1(String startDate);
    int importRecords_RptA07V1(String startDate);

    //����������ϸ
    int deleteData_RptA08V1(String startDate);
    int importRecords_RptA08V1(String startDate);

    //����������ϸ
    int deleteData_RptA11V1(@Param("startDate")String startDate, @Param("endDate")String endDate);
    int importRecords_RptA11V1(@Param("startDate")String startDate, @Param("endDate")String endDate);

    //CTS��֤�����
    int deleteData_RptA12V1();
    int importRecords_RptA12V1();

    //����ͨ�������ϸ��
    int deleteData_RptA13V1();
    int importRecords_RptA13V1();

    //�����¿����ͻ���ϸ����  20150115 zr
    int deleteData_RptA14V1_tmp();
    int importRecords_RptA14V1_tmp(@Param("startDate")String startDate);
    int deleteData_RptA14V1();
    int importRecords_RptA14V1(@Param("startDate")String startDate);

    //�������в���ǩԼ�ͻ�ǩԼ���յĽ��ױ������ݵ���  20150130 zr
    String selectCurrDate_RptA15V1();
    String selectLastDate_RptA15V1_ODSB();//��ȡODSBϵͳ��������ݵ�������ڵ�ǰһ��
    int deleteData_RptA15V1(@Param("startDate")String startDate);
    int importRecords_RptA15V1(@Param("startDate")String startDate, @Param("endDate")String endDate);


}
