package pams.repository.dao.sms;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import pams.repository.model.custlist.CustMngParam;
import pams.repository.model.sms.SmsCustInfo;

import java.util.List;

/**
 * User: zhanrui
 * Date: 2014-02-10
 * Time: 下午8:22
 */
@Component
public interface SmsMaMapper {

    //客户分配
    List<SmsCustInfo> selectCustInfoForMarketingActivity(CustMngParam bean);


    //按照客户经理和报表编号查询待发短信记录
    List<SmsCustInfo> selectCustInfoForSendSms(CustMngParam bean);
    //按照客户经理和报表编号查询当日短信发送记录
    List<SmsCustInfo> selectCustInfoForSendSmsTodayHistory(CustMngParam bean);

    @Select("select rptname from  CLS_UD_TBLINFO t where t.rptno = #{rptno}")
    String selectUserdefRptName(String rptno);
}
