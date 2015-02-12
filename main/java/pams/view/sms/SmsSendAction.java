package pams.view.sms;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.*;
import pams.repository.model.custlist.CustMngParam;
import pams.repository.model.sms.SmsCustInfo;
import pams.service.custmng.CustMngService;
import pams.service.marketingactivity.MaBaseInfoService;
import pams.service.sms.SmsMaService;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;
import skyline.service.ToolsService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * SMS 发送处理.
 * User: zhanrui
 * Date: 2015-2-8
 */
@ManagedBean
@ViewScoped
public class SmsSendAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private List<SmsCustInfo> custInfos;
    private SmsCustInfo selectedCustInfo;
    private SmsCustInfo[] selectedCustInfos;

    private boolean isBizBranch; //是否业务网点
    private String actiNo;

    private String operid;
    private String branchid;
    private CustMngParam paramBean;
    private List<SelectItem> branchList;
    private List<SelectItem> rptTypeList;
    private List<MaSmsTpl> smsTplList;
//    private String smsTplId;
//    private String smsTplText;
    private MaSmsTpl selectedSmsTpl = new MaSmsTpl();


    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{custMngService}")
    private CustMngService custMngService;

    @ManagedProperty(value = "#{maBaseInfoService}")
    private MaBaseInfoService maBaseInfoService;
    @ManagedProperty(value = "#{smsMaService}")
    private SmsMaService smsMaService;

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();
        operid = om.getOperatorId();
        branchid = om.getOperator().getDeptid();

        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        actiNo = StringUtils.isEmpty(paramsMap.get("actiNo")) ? "" : paramsMap.get("actiNo");

        this.branchList = toolsService.selectBranchList(branchid);

        initRptSelectItems();

        this.smsTplList = smsMaService.selectSmsTplList();

//        this.smsTplList = selectSmsTplList();

/*        this.custmgrList = selectSmsTplList(branchid);
        this.custmgrs = new String[custmgrList.size()];
        int i = 0;
        for (SelectItem selectItem : this.custmgrList) {
            this.custmgrs[i] = selectItem.getLabel();
            i++;
        }*/

        this.paramBean = new CustMngParam();
        paramBean.setActiNo(actiNo);
        paramBean.setCustmgrId(operid);
    }

    public void onQueryCustInfos() {
        if (StringUtils.isEmpty(paramBean.getRptType())) {
            paramBean.setMa_rptno("");
            paramBean.setMa_rpttype("");
        }
        this.custInfos = smsMaService.selectCustInfoForSendSms(paramBean);
    }

    public  void onChangeSmsTpl(ValueChangeEvent e) {
        String newValue = (String) e.getNewValue();
        if (StringUtils.isEmpty(newValue)) {
            this.selectedSmsTpl = null;
        }else{
            this.selectedSmsTpl = smsMaService.selectSmsTpl(newValue);
        }
    }

    public String onSend() {
        if (selectedCustInfos.length == 0) {
            MessageUtil.addError("请选择客户信息（点击单选、按住 Shift+点击 连续多选、按住 Ctrl+点击 挑选）...");
            return null;
        }
        if (StringUtils.isEmpty(this.selectedSmsTpl.getTplId())) {
            MessageUtil.addError("请选择短信模板");
            return null;
        }

        try {
            for (SmsCustInfo record : selectedCustInfos) {
                record.setActino(actiNo);
                record.setSendOperId(operid);
                record.setSendBranchId(branchid);
                DateTime dt = new DateTime();
                record.setSendDate(dt.toString("yyyy-MM-dd"));
                record.setSendTime(dt.toString("HH:mm:ss"));
                record.setSmsTplId(this.selectedSmsTpl.getTplId());
                record.setSmsTplName(this.selectedSmsTpl.getTplName());
                smsMaService.sendSms(record);
            }
            //this.lazyDataModel = new CustMngDataModel(custMngService.getCustlistMapper(), this.paramBean);
            this.custInfos = smsMaService.selectCustInfoForSendSms(paramBean);

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("CustMng_onDispatch");
            oplog.setActionName("SMS客户营销管理:短信发送");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            platformService.insertNewOperationLog(oplog);

            MessageUtil.addInfo("短信发送操作完成...");
        } catch (Exception e) {
            logger.error("短信发送时出现错误...", e);
            MessageUtil.addWarn("短信发送时出现错误。" + e.getMessage());
        }
        return null;
    }
    public void onRowSelect(SelectEvent event) {
        this.selectedSmsTpl = (MaSmsTpl) event.getObject();
    }

    //=========================
    private List<SelectItem> selectSmsTplList() {
        List<MaSmsTpl> records = smsMaService.selectSmsTplList();
        List<SelectItem> selectItems = new ArrayList<SelectItem>();
        selectItems.add(new SelectItem("", ""));
        for (MaSmsTpl record : records) {
            SelectItem item = new SelectItem(record.getTplId(), record.getTplName());
            selectItems.add(item);
        }
        return selectItems;
    }

    private void initRptSelectItems() {
        List<MaActiDetl> maActiDetls = maBaseInfoService.selectMaActivityDetlList(actiNo);
        SelectItem item = new SelectItem("", "");
        this.rptTypeList = new ArrayList<SelectItem>();
        rptTypeList.add(item);
        for (MaActiDetl maActiDetl : maActiDetls) {
            String rptno = maActiDetl.getRptno();
            String rpttype = maActiDetl.getRpttype();
            String rptname = "";
            if ("CLS".equals(rpttype)) {
                List<Ptenudetail> records = platformService.selectEnuDetail("CUST_LIST_RPT_TYPE");
                for (Ptenudetail record : records) {
                    if (record.getEnuitemvalue().equals(rptno)) {
                        rptname = record.getEnuitemexpand();
                        break;
                    }
                }
            } else if ("UD".equals(rpttype)) {
                rptname = maBaseInfoService.selectUserdefRptName(rptno);
            } else {
                throw new RuntimeException("不支持的报表类别:" + rptno);
            }

            item = new SelectItem(rpttype + "|" + rptno, rptname);
            rptTypeList.add(item);
        }
    }
    //=========================


    public List<SmsCustInfo> getCustInfos() {
        return custInfos;
    }

    public void setCustInfos(List<SmsCustInfo> custInfos) {
        this.custInfos = custInfos;
    }

    public SmsCustInfo getSelectedCustInfo() {
        return selectedCustInfo;
    }

    public void setSelectedCustInfo(SmsCustInfo selectedCustInfo) {
        this.selectedCustInfo = selectedCustInfo;
    }

    public boolean isBizBranch() {
        return isBizBranch;
    }

    public void setBizBranch(boolean isBizBranch) {
        this.isBizBranch = isBizBranch;
    }

    public String getActiNo() {
        return actiNo;
    }

    public void setActiNo(String actiNo) {
        this.actiNo = actiNo;
    }

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public ToolsService getToolsService() {
        return toolsService;
    }

    public void setToolsService(ToolsService toolsService) {
        this.toolsService = toolsService;
    }

    public PlatformService getPlatformService() {
        return platformService;
    }

    public void setPlatformService(PlatformService platformService) {
        this.platformService = platformService;
    }

    public MaBaseInfoService getMaBaseInfoService() {
        return maBaseInfoService;
    }

    public void setMaBaseInfoService(MaBaseInfoService maBaseInfoService) {
        this.maBaseInfoService = maBaseInfoService;
    }

    public CustMngParam getParamBean() {
        return paramBean;
    }

    public void setParamBean(CustMngParam paramBean) {
        this.paramBean = paramBean;
    }

    public SmsMaService getSmsMaService() {
        return smsMaService;
    }

    public void setSmsMaService(SmsMaService smsMaService) {
        this.smsMaService = smsMaService;
    }

    public List<SelectItem> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<SelectItem> branchList) {
        this.branchList = branchList;
    }

    public List<SelectItem> getRptTypeList() {
        return rptTypeList;
    }

    public void setRptTypeList(List<SelectItem> rptTypeList) {
        this.rptTypeList = rptTypeList;
    }

    public CustMngService getCustMngService() {
        return custMngService;
    }

    public void setCustMngService(CustMngService custMngService) {
        this.custMngService = custMngService;
    }

    public SmsCustInfo[] getSelectedCustInfos() {
        return selectedCustInfos;
    }

    public void setSelectedCustInfos(SmsCustInfo[] selectedCustInfos) {
        this.selectedCustInfos = selectedCustInfos;
    }

    public List<MaSmsTpl> getSmsTplList() {
        return smsTplList;
    }

    public void setSmsTplList(List<MaSmsTpl> smsTplList) {
        this.smsTplList = smsTplList;
    }

    public MaSmsTpl getSelectedSmsTpl() {
        return selectedSmsTpl;
    }

    public void setSelectedSmsTpl(MaSmsTpl selectedSmsTpl) {
        this.selectedSmsTpl = selectedSmsTpl;
    }
}
