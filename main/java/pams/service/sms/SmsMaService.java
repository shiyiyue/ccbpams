package pams.service.sms;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pams.repository.dao.MaActiMainMapper;
import pams.repository.dao.MaSmsJrnlMapper;
import pams.repository.dao.MaSmsTplMapper;
import pams.repository.dao.PtoperMapper;
import pams.repository.dao.sms.SmsMaMapper;
import pams.repository.model.*;
import pams.repository.model.custlist.CustMngParam;
import pams.repository.model.sms.SmsCustInfo;
import pams.tools.TpsSocketClient;
import pams.tools.sms.MessageTools;
import pub.platform.advance.utils.PropertyManager;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by zhanrui on 2015/2/9.
 * SMS营销；客户分配  短信发送
 */
@Service
public class SmsMaService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PtoperMapper ptoperMapper;
    @Autowired
    private SmsMaMapper smsMaMapper;
    @Autowired
    private MaSmsTplMapper smsTplMapper;
    @Autowired
    private MaSmsJrnlMapper smsJrnlMapper;

    public String selectOperMobilePhone(String operid) {
        return ptoperMapper.selectByPrimaryKey(operid).getMobilephone();

    }

    public void updateOperMobilePhone(String operid, String phone) {
        Ptoper ptoper = ptoperMapper.selectByPrimaryKey(operid);
        ptoper.setMobilephone(phone);
        ptoperMapper.updateByPrimaryKey(ptoper);
    }

    public List<SmsCustInfo> selectCustInfoForMarketingActivity(CustMngParam param) {
        if (StringUtils.isNotEmpty(param.getRptType())) {
            String[] list = param.getRptType().split("\\|");
            param.setMa_rpttype(list[0]);
            param.setMa_rptno(list[1]);
        }
        return smsMaMapper.selectCustInfoForMarketingActivity(param);
    }

    public List<SmsCustInfo> selectCustInfoForSendSms(CustMngParam param) {
        if (StringUtils.isNotEmpty(param.getRptType())) {
            String[] list = param.getRptType().split("\\|");
            param.setMa_rpttype(list[0]);
            param.setMa_rptno(list[1]);
        }
        return smsMaMapper.selectCustInfoForSendSms(param);
    }

    public List<SmsCustInfo> selectCustInfoForSendSmsTodayHistory(CustMngParam param) {
        if (StringUtils.isNotEmpty(param.getRptType())) {
            String[] list = param.getRptType().split("\\|");
            param.setMa_rpttype(list[0]);
            param.setMa_rptno(list[1]);
        }
        return smsMaMapper.selectCustInfoForSendSmsTodayHistory(param);
    }

    public List<MaSmsTpl> selectSmsTplList() {
        MaSmsTplExample example = new MaSmsTplExample();
        example.createCriteria().andInvalidflagEqualTo("0");
        example.setOrderByClause(" tpl_id ");
        return smsTplMapper.selectByExample(example);
    }

    public MaSmsTpl selectSmsTpl(String smsTplId) {
        return smsTplMapper.selectByPrimaryKey(smsTplId);
    }

    public boolean sendSms(SmsCustInfo custInfo, String smsText) {
        boolean isSucc = false;
        try {
            //处理电话号码 以补充的电话号码为准
            String custPhone = custInfo.getContactInfoExt();
            if (StringUtils.isEmpty(custPhone)) {
                String contactInfo1 = custInfo.getContactInfo1();
                if (StringUtils.isEmpty(contactInfo1)) {
                    return false;
                } else {
                    custPhone = contactInfo1;
                }

            }

            custPhone = custPhone.trim();
            if (custPhone.startsWith("0")) {
                custPhone = custPhone.substring(1);
            }
            custInfo.setCustPhone(custPhone);

            if (custPhone.trim().length() == 11) {
                //发送
                String response = sendOneSmsMsg(custInfo, smsText);
                if ("000000000000".equals(response)) {
                    custInfo.setStatus("S"); //发送成功
                    //custInfo.setSmsReqsn("");
                    custInfo.setSmsRespCode(response);
                    custInfo.setSmsRespMsg(response);
                    isSucc = true;
                } else {
                    custInfo.setStatus("F"); //发送成功
                    custInfo.setSmsRespCode(response);
                    custInfo.setSmsRespMsg(response);
                    isSucc = false;
                }
            } else {
                return isSucc;
            }


            //处理短信发送日志表
            MaSmsJrnl maSmsJrnl = new MaSmsJrnl();
            BeanUtils.copyProperties(maSmsJrnl, custInfo);

            smsJrnlMapper.insert(maSmsJrnl);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("短信处理失败", e);
        }
    }

    //===========
    private String sendOneSmsMsg(SmsCustInfo custInfo, String smsText) {
        String operid = custInfo.getSendOperId();
        if (operid.length() < 9) {
            operid = StringUtils.rightPad(operid,9," ");
        }else{
            operid = operid.substring(0,9);
        }


        // 消息服务帐号|部门（分行）ID|客户渠道终端地址|消息类型|接入系统号码|短信类型编码|付费号码|
        // 手机号码|短消息的内容|客户号（证件号）|客户姓名|
        // 账户信息（帐号）|账户变动通知标志|签约客户所在的网点机构编码|营销短信提交人的9位操作员编码|营销短信审核人的9位操作员编码
        String msg = "57|371_dz|100371|192.168.1.11|002|371022|371_grb|12345678910|" +
                custInfo.getCustPhone()+ "|" +
                smsText + "|" +
                "000000000000000|" +
                custInfo.getCustName()+ "|" +
                "98745632100351|ZHBD0|" +
                custInfo.getSendBranchId() + "|" +
                operid+"|"+operid;

        MessageTools messageTools = new MessageTools();
        String singleMessage = messageTools.getSingleMessage(msg);
        logger.info("Send SMS: [" + msg + "]");

        TpsSocketClient socketClient = new TpsSocketClient(PropertyManager.getProperty("sms_server_ip"),
                Integer.parseInt(PropertyManager.getProperty("sms_server_port")));

        try {
            byte[] respBuf = socketClient.call(singleMessage.getBytes("GBK"));
            String resp = new String(respBuf, "GBK");
            logger.info("Recv SMS resp: [" + resp + "]");

            //TODO
            custInfo.setSmsReqsn(messageTools.getResponse(resp,5));

            return messageTools.getResponse(resp,10);
        } catch (Exception e) {
            throw  new RuntimeException("短信发送错误.", e);
        }
    }

    private String marshalSmsMsg() {
        return "";
    }
}
