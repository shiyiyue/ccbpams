package pams.view.ebank;

import org.joda.time.DateTime;
import org.primefaces.model.LazyDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.OdsbPldfBatch;
import pams.repository.model.OdsbPldfDtl;
import pams.repository.model.Ptoplog;
import pams.repository.model.ebank.BatchPayrollAgencyVO;
import pams.repository.model.largedepflow.LargeDepFlowVO;
import pams.service.ebank.BatchPayrollAgencyService;
import pams.service.largedepflow.LargeDepFlowService;
import pams.view.largedepflow.LargeDepFlowLazyDataModel;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;
import skyline.service.ToolsService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 企业网银批量代发明细查询.
 * User: zhanrui
 * Date: 20150301
 */
@ManagedBean
//@ViewScoped
@SessionScoped
public class BatchPayrollAgencyAction implements Serializable {
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
        String operid = om.getOperatorId();
        String branchid = om.getOperator().getDeptid();

        this.branchList = toolsService.selectBranchList(branchid);
        if (branchList.size() == 1) {
            isBizBranch = true;
        }

        this.paramBean = new BatchPayrollAgencyVO();
        this.detlRecords = new ArrayList<>();

/*
        DateTime startDate = new DateTime().dayOfMonth().withMinimumValue();
        this.paramBean.setStartDate(startDate.toString("yyyy-MM-dd"));
        DateTime endDate = new DateTime().minusDays(1);
        if (startDate.isAfter(endDate)) {
            endDate = startDate;
        }
        this.paramBean.setEndDate(endDate.toString("yyyy-MM-dd"));
*/
    }

    public String onQuery() {
        try {
            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("BatchPayrollAgency_onQuery");
            oplog.setActionName("企业网银批量代发:查询批量主数据");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            oplog.setOpDataStartdate(this.paramBean.getStartDate());
            oplog.setOpDataEnddate(this.paramBean.getEndDate());
            platformService.insertNewOperationLog(oplog);

            this.detlRecords = batchPayrollAgencyService.selectOdsbPldfBatchRecords(paramBean);
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
        return null;
    }
    public String onQueryDtl() {
        try {
            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("BatchPayrollAgency_onQueryDtl");
            oplog.setActionName("企业网银批量代发:查询批量明细数据");
            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            oplog.setOpDataStartdate(this.paramBean.getStartDate());
            oplog.setOpDataEnddate(this.paramBean.getEndDate());
            oplog.setOpLog("");
            platformService.insertNewOperationLog(oplog);

        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
//        this.selectedRecord =
        return "batchPayrollAgencyDetl";
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
