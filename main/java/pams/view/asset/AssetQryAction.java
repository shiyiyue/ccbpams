package pams.view.asset;

import org.apache.commons.beanutils.PropertyUtils;
import org.joda.time.DateTime;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repo4odsbpbs.dao.common.AssetQryMapper;
import pams.repo4odsbpbs.model.QdbgGjCustInfoAll;
import pams.repo4odsbpbs.model.common.AssetQryParam;
import pams.repository.model.OdsbLargedepFlow;
import pams.repository.model.Ptoplog;
import pams.repository.model.largedepflow.LargeDepFlowVO;
import pams.service.asset.AssetQryService;
import pams.service.largedepflow.LargeDepFlowService;
import pams.view.common.PamsLazyDataModel;
import pams.view.largedepflow.LargeDepFlowLazyDataModel;
import pub.platform.security.OperatorManager;
import skyline.service.PlatformService;
import skyline.service.ToolsService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 个人客户资产信息查询.
 * User: zhanrui
 * Date: 2015-05-22
 */
@ManagedBean
@ViewScoped
public class AssetQryAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private AssetQryParam paramBean;
    private QdbgGjCustInfoAll selectedRecord;

    private boolean isBizBranch; //是否业务网点
    private String currCd;   //币种  CNY：人民币   XXX：外币
    private String title = "...";

    private LazyDataModel<QdbgGjCustInfoAll> lazyDataModel;
    private List<SelectItem> branchList;

    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{assetQryService}")
    private AssetQryService assetQryService;

    @PostConstruct
    public void init() {
        OperatorManager om = SystemService.getOperatorManager();
        String operid = om.getOperatorId();
        String branchid = om.getOperator().getDeptid();

        this.branchList = toolsService.selectBranchList(branchid);
        if (branchList.size() == 1) {
            isBizBranch = true;
        }

        this.paramBean = new AssetQryParam();

        DateTime startDate = new DateTime().dayOfMonth().withMinimumValue();
        this.paramBean.setStartDate(startDate.toString("yyyy-MM-dd"));
        DateTime endDate = new DateTime().minusDays(1);
        if (startDate.isAfter(endDate)) {
            endDate = startDate;
        }
        this.paramBean.setEndDate(endDate.toString("yyyy-MM-dd"));
    }

    public String onBaseQuery() {
        try {
            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("AssetQry_onBaseQuery");
            oplog.setActionName("个人客户基础信息查询");
//            oplog.setOpDataBranchid(this.paramBean.getBranchId());
            oplog.setOpDataStartdate(this.paramBean.getStartDate());
            oplog.setOpDataEnddate(this.paramBean.getEndDate());
            platformService.insertNewOperationLog(oplog);

//            this.lazyDataModel = new LazyDataAssetModel(assetQryService.getAssetQryMapper(), this.paramBean);
            this.lazyDataModel = new LazyDataAssetModel();
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
        return null;
    }

    public void onCustRowSelect(SelectEvent event) {
        try {
//            this.custName = selectedCust.getCustName();
//            this.certType = selectedCust.getCertType();
//            this.certNo = selectedCust.getCertNo();
//            this.vo.setCustguid(selectedCust.getGuid());
//            salesVOList = custMngService.selectsaleDetails(selectedCust.getGuid());
        } catch (Exception e) {
            logger.error("查询数据时出现错误。", e);
            MessageUtil.addWarn("查询数据时出现错误。" + e.getMessage());
        }
    }
    public void onCustRowUnSelect(UnselectEvent event) {
        logger.debug("unselect" + event.toString());
    }

    //-------------------
//    class LazyDataAssetModel extends LazyDataModel<QdbgGjCustInfoAll> {
    class LazyDataAssetModel extends PamsLazyDataModel<QdbgGjCustInfoAll> {
        //private AssetQryParam paramBean;
//        private AssetQryMapper lazyDataMapper;
        private String defaultSortField = "1";

        public LazyDataAssetModel() {
//            this.lazyDataMapper = lazyDataMapper;
//            this.paramBean = paramBean;
        }

        @Override
        public List<QdbgGjCustInfoAll> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
            List<QdbgGjCustInfoAll> dataList;
            try {
                AssetQryParam vo = new AssetQryParam();
                PropertyUtils.copyProperties(vo, paramBean);
                vo.setOffset(first);
                vo.setPagesize(first + pageSize);
                if (sortField != null) {
                    vo.setSortField(changeBeanPropertyName2DBTableFieldName(sortField));
                    if (sortOrder != null) {
                        if (sortOrder.compareTo(SortOrder.DESCENDING) == 0) {
                            vo.setSortOrder(" DESC ");
                        }
                    }
                }else{ //默认排序字段
                    vo.setSortField(defaultSortField);
                }
//                dataList = this.lazyDataMapper.selectPagedRecords(vo);
//                dataList = this.lazyDataMapper.selectRecords(vo);
                dataList = assetQryService.selectPagedAssetRecords(vo);
            } catch (Exception e) {
                logger.error("查询数据出现错误.", e);
                throw new RuntimeException(e);
            }

            if (super.getRowCount() <= 0) {
//                int total = lazyDataMapper.countRecords(paramBean);
                int total = assetQryService.countAllAssetRecords(paramBean);
                this.setRowCount(total);
            }
            this.setPageSize(pageSize);
            return dataList;
        }

 /*       private String changeBeanPropertyName2DBTableFieldName(String propertyName) {
            char[] ch = propertyName.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < propertyName.length(); i++) {
                if ('A' <= ch[i] && ch[i] <= 'Z') {
                    sb.append("_");
                    sb.append(String.valueOf(ch[i]).toLowerCase());
                }else{
                    sb.append(String.valueOf(ch[i]).toLowerCase());
                }
            }
            return sb.toString();
        }*/
    }


    //===================================================================

    public AssetQryParam getParamBean() {
        return paramBean;
    }

    public void setParamBean(AssetQryParam paramBean) {
        this.paramBean = paramBean;
    }

    public QdbgGjCustInfoAll getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(QdbgGjCustInfoAll selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public boolean isBizBranch() {
        return isBizBranch;
    }

    public void setIsBizBranch(boolean isBizBranch) {
        this.isBizBranch = isBizBranch;
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LazyDataModel<QdbgGjCustInfoAll> getLazyDataModel() {
        return lazyDataModel;
    }

    public void setLazyDataModel(LazyDataModel<QdbgGjCustInfoAll> lazyDataModel) {
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

    public AssetQryService getAssetQryService() {
        return assetQryService;
    }

    public void setAssetQryService(AssetQryService assetQryService) {
        this.assetQryService = assetQryService;
    }
}
