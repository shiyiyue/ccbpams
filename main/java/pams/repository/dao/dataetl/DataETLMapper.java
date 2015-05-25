package pams.repository.dao.dataetl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * User: zhanrui
 * Date: 12-12-19
 * Time: 下午8:22
 */
@Component
public interface DataETLMapper {

    //客户基本信息维护
    int mergeCustBaseRecords(@Param("rptDate") String rptDate);
    int updateCustBaseRecords4CertInfo();
    int updateNullCertTypeRecords(@Param("rptDate") String rptDate, @Param("certType") String certType);
    //导入自定义报表的客户信息
    int mergeCustBaseRecordsForUserDefRpt(@Param("rptType") String rptType, @Param("rptNo") String rptNo, @Param("rptDate") String rptDate);


    //大额资金流向
    int deleteLargeFlowData(String startDate);
    int importLargeFlowRecords(String startDate);

    //基金成交客户明细
    int deleteData_RptA07V1(String startDate);
    int importRecords_RptA07V1(String startDate);

    //渠道交易明细
    int deleteData_RptA08V1(String startDate);
    int importRecords_RptA08V1(String startDate);

    //代发交易明细
    int deleteData_RptA11V1(@Param("startDate")String startDate, @Param("endDate")String endDate);
    int importRecords_RptA11V1(@Param("startDate")String startDate, @Param("endDate")String endDate);

    //CTS保证金余额
    int deleteData_RptA12V1();
    int importRecords_RptA12V1();

    //结算通卡余额明细表
    int deleteData_RptA13V1();
    int importRecords_RptA13V1();

    //个金部新开户客户明细导入  20150115 zr
    int deleteData_RptA14V1_tmp();
    int importRecords_RptA14V1_tmp(@Param("startDate")String startDate);
    int deleteData_RptA14V1();
    int importRecords_RptA14V1(@Param("startDate")String startDate);

    //电子银行部新签约客户签约当日的交易笔数数据导入  20150130 zr
    String selectCurrDate_RptA15V1();
    String selectLastDate_RptA15V1_ODSB();//获取ODSB系统中相关数据的最大日期的前一天
    int deleteData_RptA15V1(@Param("startDate")String startDate);
    int importRecords_RptA15V1(@Param("startDate")String startDate, @Param("endDate")String endDate);


}
