package pams.view.sms;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.repository.model.MaActiMain;
import pams.repository.model.custlist.CustMngParam;
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
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * SMS 客户分配 管理功能.
 * User: zhanrui
 * Date: 2015-2-8
 */
@ManagedBean
@ViewScoped
public class MAPortalAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private List<MaActiMain> mainDetls;
    private MaActiMain selectedMain;

    private boolean isBizBranch; //是否业务网点
    private String title = "短信营销活动列表";
    private String actiNo;

    private String operid;
    private String branchid;


    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{maBaseInfoService}")
    private MaBaseInfoService maBaseInfoService;

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();
        operid = om.getOperatorId();
        branchid = om.getOperator().getDeptid();

        //Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        //actiNo = StringUtils.isEmpty(paramsMap.get("actiNo")) ? "" : paramsMap.get("actiNo");

        mainDetls = maBaseInfoService.selectMaActivityMainDefList();
    }

    public void onQueryCustInfos(){

    }

    public String startAssign() {
        return "custAssign";
    }
    public String startSms() {
        return "smsSend";
    }
    //=========================

    public List<MaActiMain> getMainDetls() {
        return mainDetls;
    }

    public void setMainDetls(List<MaActiMain> mainDetls) {
        this.mainDetls = mainDetls;
    }

    public MaActiMain getSelectedMain() {
        return selectedMain;
    }

    public void setSelectedMain(MaActiMain selectedMain) {
        this.selectedMain = selectedMain;
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
}
