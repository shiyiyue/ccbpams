package pams.view.userdefrpt;

import org.apache.commons.lang.StringUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.ClsUdTblinfo;
import pams.repository.model.Ptenudetail;
import pams.repository.model.Ptoplog;
import pams.repository.model.userdefrpt.UserDefRptVO;
import pams.service.userdefrpt.UserDefRptService;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;
import skyline.service.ToolsService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 自定义报表 管理功能.
 * User: zhanrui
 * Date: 14-4-24
 * Time: 上午11:00
 */
@ManagedBean
@ViewScoped
public class UserDefRptMngAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserDefRptVO paramBean = new UserDefRptVO();
    private ClsUdTblinfo clsUdTblinfo = new ClsUdTblinfo();
    private List<ClsUdTblinfo> detlRecords;
    private ClsUdTblinfo selectedRecord;

    private boolean isBizBranch; //是否业务网点
    private String title = "...";
    private String rpttype;
    private String rptno;
    private String operation = "create"; // create update clear
    private UploadedFile uploadedFile;

    private String operid;
    private String branchid;

    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{userDefRptService}")
    private UserDefRptService userDefRptService;

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();
        operid = om.getOperatorId();
        branchid = om.getOperator().getDeptid();

        this.paramBean.setBranchid(branchid);

        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        rpttype = StringUtils.isEmpty(paramsMap.get("rpttype")) ? "" : paramsMap.get("rpttype");
        rptno = StringUtils.isEmpty(paramsMap.get("rptno")) ? "" : paramsMap.get("rptno");


        if (StringUtils.isBlank(paramsMap.get("rpttype"))) {
            throw new RuntimeException("报表类型未定义");
        }

        clsUdTblinfo.setRpttype(rpttype);
        title = "请在字典中定义标题：" + rpttype;

        List<Ptenudetail> ptenudetails = platformService.selectEnuDetail("USERDEFRPTTITLE");
        for (Ptenudetail ptenudetail : ptenudetails) {
            if (ptenudetail.getEnuitemvalue().equals(rpttype)) {
                title = ptenudetail.getEnuitemlabel();
            }
        }
        detlRecords = userDefRptService.selectTblInfos(rpttype);
    }

    public void onCreateRpt() {
        try {
            //检查KEY重复
            ClsUdTblinfo tbl_db = userDefRptService.selectTblInfo(clsUdTblinfo);
            if (tbl_db != null) {
                MessageUtil.addError("报表编号重复");
                return;
            }

            clsUdTblinfo.setStatus("0");
            clsUdTblinfo.setRemark(new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "新增,操作人:" + operid);
            clsUdTblinfo.setRecver(1);
            userDefRptService.insertTblInfo(clsUdTblinfo);
            detlRecords = userDefRptService.selectTblInfos(rpttype);
            clsUdTblinfo = new ClsUdTblinfo();
            clsUdTblinfo.setRpttype(rpttype);

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("UserDefRptMng_onAddRpt");
            oplog.setActionName("阶段性攻坚报表:新增报表");
            oplog.setOpDataBranchid(this.paramBean.getBranchid());
            platformService.insertNewOperationLog(oplog);
        } catch (Exception e) {
            logger.error("新增报表时出现错误。", e);
            MessageUtil.addWarn("新增报表时出现错误。" + e.getMessage());
        }
    }

    public void onUpdateRpt() {
        try {
            ClsUdTblinfo tbl_db = userDefRptService.selectTblInfo(clsUdTblinfo);
            if (tbl_db == null) {
                MessageUtil.addError("报表不存在。");
                return;
            }

            userDefRptService.modifyTblInfo(clsUdTblinfo);
            detlRecords = userDefRptService.selectTblInfos(rpttype);
            clsUdTblinfo = new ClsUdTblinfo();
            clsUdTblinfo.setRpttype(rpttype);
            operation = "create";
            RequestContext.getCurrentInstance().execute("document.forms['form']['form:tabview:rptnoInput'].disabled = false;");
            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("UserDefRptMng_onModifyRpt");
            oplog.setActionName("阶段性攻坚报表:报表修改");
            oplog.setOpDataBranchid(this.paramBean.getBranchid());
            platformService.insertNewOperationLog(oplog);
        } catch (Exception e) {
            logger.error("报表修改时出现错误。", e);
            MessageUtil.addWarn("报表修改时出现错误。" + e.getMessage());
        }
    }

    public void onClearRpt() {
        try {
            ClsUdTblinfo tbl_db = userDefRptService.selectTblInfo(clsUdTblinfo);
            if (tbl_db == null) {
                MessageUtil.addError("报表不存在。");
                return;
            }
            userDefRptService.clearAllRptInfo(rpttype, clsUdTblinfo.getRptno());
            detlRecords = userDefRptService.selectTblInfos(rpttype);
            clsUdTblinfo = new ClsUdTblinfo();
            clsUdTblinfo.setRpttype(rpttype);
            operation = "create";

            RequestContext.getCurrentInstance().execute("document.forms['form']['form:tabview:rptnoInput'].disabled = false;");

            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("UserDefRptMng_onDeleteRpt");
            oplog.setActionName("阶段性攻坚报表:报表清除");
            oplog.setOpDataBranchid(this.paramBean.getBranchid());
            platformService.insertNewOperationLog(oplog);
        } catch (Exception e) {
            logger.error("报表清除时出现错误。", e);
            MessageUtil.addWarn("报表清除时出现错误。" + e.getMessage());
        }
    }


    public String startImport() {
        return "rptDataImp";
    }

    public void startUpdateRpt() {
        this.clsUdTblinfo = selectedRecord;
        operation = "update";
        RequestContext.getCurrentInstance().execute("document.forms['form']['form:tabview:rptnoInput'].disabled = true;");
/*
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:addbtn').disabled = true;");
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:modibtn').disabled = false;");
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:delbtn').disabled = true;");
*/

        //RequestContext.getCurrentInstance().execute("setFieldAttr();");
//        RequestContext.getCurrentInstance().update("myDialogPanel");
//        RequestContext.getCurrentInstance().execute("myDialog.show();");
    }

    public void startClearRpt() {
        this.clsUdTblinfo = selectedRecord;
        operation = "clear";
        RequestContext.getCurrentInstance().execute("document.forms['form']['form:tabview:rptnoInput'].disabled = true;");
/*
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:addbtn').disabled = true;");
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:modibtn').disabled = true;");
        RequestContext.getCurrentInstance().execute("document.getElementById('form:tabview:delbtn').disabled = false;");

*/
    }

    //===================================================================
    public UserDefRptVO getParamBean() {
        return paramBean;
    }

    public void setParamBean(UserDefRptVO paramBean) {
        this.paramBean = paramBean;
    }

    public List<ClsUdTblinfo> getDetlRecords() {
        return detlRecords;
    }

    public void setDetlRecords(List<ClsUdTblinfo> detlRecords) {
        this.detlRecords = detlRecords;
    }

    public ClsUdTblinfo getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(ClsUdTblinfo selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public boolean isBizBranch() {
        return isBizBranch;
    }

    public void setBizBranch(boolean isBizBranch) {
        this.isBizBranch = isBizBranch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public UserDefRptService getUserDefRptService() {
        return userDefRptService;
    }

    public void setUserDefRptService(UserDefRptService userDefRptService) {
        this.userDefRptService = userDefRptService;
    }

    public String getRptno() {
        return rptno;
    }

    public void setRptno(String rptno) {
        this.rptno = rptno;
    }

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public ClsUdTblinfo getClsUdTblinfo() {
        return clsUdTblinfo;
    }

    public void setClsUdTblinfo(ClsUdTblinfo clsUdTblinfo) {
        this.clsUdTblinfo = clsUdTblinfo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
