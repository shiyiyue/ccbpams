package pams.view.ebank;

import org.apache.commons.lang.StringUtils;
import org.primefaces.model.LazyDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.OdsbPldfBatch;
import pams.repository.model.OdsbPldfDtl;
import pams.repository.model.Ptoplog;
import pams.repository.model.ebank.BatchPayrollAgencyVO;
import pams.service.ebank.BatchPayrollAgencyService;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 企业网银批量代发明细查询.
 * User: zhanrui
 * Date: 20150301
 */
@ManagedBean
@ViewScoped
public class BatchPayrollAgencyDetlAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private BatchPayrollAgencyVO paramBean;
    private OdsbPldfBatch selectedRecord;

    private boolean isBizBranch; //是否业务网点

    private LazyDataModel<OdsbPldfDtl> lazyDataModel;
    private List<OdsbPldfBatch> detlRecords;
    private List<SelectItem> branchList;

    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{batchPayrollAgencyService}")
    private BatchPayrollAgencyService batchPayrollAgencyService;

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();

        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String chanlFlowNo = StringUtils.isEmpty(paramsMap.get("chanlFlowNo")) ? "" : paramsMap.get("chanlFlowNo");
        String acctNo = StringUtils.isEmpty(paramsMap.get("acctNo")) ? "" : paramsMap.get("acctNo");
        String acctName = StringUtils.isEmpty(paramsMap.get("acctName")) ? "" : paramsMap.get("acctName");
        if (StringUtils.isEmpty(chanlFlowNo)) {
            //throw new RuntimeException("请指定批次号.");
            return;
        }

        this.paramBean = new BatchPayrollAgencyVO();
        this.paramBean.setAcctNo(acctNo);
        this.paramBean.setAcctName(acctName);
        paramBean.setChanlFlowNo(chanlFlowNo);

        this.detlRecords = new ArrayList<>();

        try {
            this.lazyDataModel = new BatchPayrollAgencyLazyDataModel(batchPayrollAgencyService.getBatchPayrollAgencyMapper(), this.paramBean);
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
    }

    public String onBack() {
        return "batchPayrollAgency";
    }
    //===================================================================


    public BatchPayrollAgencyVO getParamBean() {
        return paramBean;
    }

    public void setParamBean(BatchPayrollAgencyVO paramBean) {
        this.paramBean = paramBean;
    }

    public OdsbPldfBatch getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(OdsbPldfBatch selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public boolean isBizBranch() {
        return isBizBranch;
    }

    public void setBizBranch(boolean isBizBranch) {
        this.isBizBranch = isBizBranch;
    }

    public LazyDataModel<OdsbPldfDtl> getLazyDataModel() {
        return lazyDataModel;
    }

    public void setLazyDataModel(LazyDataModel<OdsbPldfDtl> lazyDataModel) {
        this.lazyDataModel = lazyDataModel;
    }

    public List<SelectItem> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<SelectItem> branchList) {
        this.branchList = branchList;
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

    public BatchPayrollAgencyService getBatchPayrollAgencyService() {
        return batchPayrollAgencyService;
    }

    public void setBatchPayrollAgencyService(BatchPayrollAgencyService batchPayrollAgencyService) {
        this.batchPayrollAgencyService = batchPayrollAgencyService;
    }

    public List<OdsbPldfBatch> getDetlRecords() {
        return detlRecords;
    }

    public void setDetlRecords(List<OdsbPldfBatch> detlRecords) {
        this.detlRecords = detlRecords;
    }
}
