package pams.view.userdefrpt;

import org.apache.commons.lang.StringUtils;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pams.common.SystemService;
import pams.common.utils.MessageUtil;
import pams.repository.model.*;
import pams.repository.model.userdefrpt.UdRptFeedbackData;
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
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �����Զ��屨�� չʾ.
 * User: zhanrui
 * Date: 14-4-24
 * Time: ����11:00
 */
@ManagedBean
@ViewScoped
public class UserDefRptShowAction implements Serializable {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private UserDefRptVO paramBean;
    private UdRptFeedbackData selectedRecord;
    private List<UdRptFeedbackData> selectedRecords;

    private boolean isBizBranch; //�Ƿ�ҵ������
    private String title = "...";
    private String tableWidth = "width:100%";
    private String rptno;
    private String rpttype;
    private boolean marketed;
    private boolean refused;
    Map<String, String> banksMap = new HashMap<>();
    Map<String, String> fieldsMap = new HashMap<>();

    private LazyDataModel<UdRptFeedbackData> lazyDataModel;
    private List<SelectItem> branchList;
    private List<ColumnModel> columns = new ArrayList<ColumnModel>();

    private DataTable dataTable;

    @ManagedProperty(value = "#{toolsService}")
    private ToolsService toolsService;
    @ManagedProperty(value = "#{platformService}")
    private PlatformService platformService;
    @ManagedProperty(value = "#{userDefRptService}")
    private UserDefRptService userDefRptService;

    static public class ColumnModel implements Serializable {

        private String header;
        private String property;

        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }

        public String getHeader() {
            return header;
        }

        public String getProperty() {
            return property;
        }
    }

    @PostConstruct
    public void init() {
        Map<String, String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        rpttype = StringUtils.isEmpty(paramsMap.get("rpttype")) ? "" : paramsMap.get("rpttype");
        rptno = StringUtils.isEmpty(paramsMap.get("rptno")) ? "" : paramsMap.get("rptno");

        if (StringUtils.isEmpty(rpttype)) {
            throw new RuntimeException("��ָ����������.");
        }
        if (StringUtils.isEmpty(rptno)) {
            throw new RuntimeException("��ָ��������.");
        }

        OperatorManager om = SystemService.getOperatorManager();
        String operid = om.getOperatorId();
        String branchid = om.getOperator().getDeptid();


        //HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        this.branchList = toolsService.selectBranchList(branchid);
        if (branchList.size() == 1) {
            isBizBranch = true;
        }

        this.paramBean = new UserDefRptVO();

        //��ʼ������map
        List<String> bankIdAndNames = platformService.selectBranchIdAndName(branchid);
        for (String bankIdAndName : bankIdAndNames) {
            String[] sa = bankIdAndName.split("\\|");
            banksMap.put(sa[0].trim(), sa[1].trim());
        }

        //��̬����dtatable column
        columns.add(new ColumnModel("������", "branchid"));
        List<ClsUdFldinfo> fldinfos = userDefRptService.selectColumnsDefine(rpttype, rptno);
        for (ClsUdFldinfo fldinfo : fldinfos) {
            columns.add(new ColumnModel(fldinfo.getFldname(), "fld" + fldinfo.getFldsn()));
            fieldsMap.put("fld" + fldinfo.getFldsn(), fldinfo.getFldname());
        }

        //����UI�����
        tableWidth = "width:" + 100 * fldinfos.size() + "px;";

        //����Ϣ
        ClsUdTblinfo clsUdTblinfo = new ClsUdTblinfo();
        clsUdTblinfo.setRpttype(rpttype);
        clsUdTblinfo.setRptno(rptno);
        clsUdTblinfo = userDefRptService.selectTblInfo(clsUdTblinfo);
        title = clsUdTblinfo.getRptname();

        this.paramBean.setBranchid(branchid);
        this.paramBean.setRptno(rpttype);
        this.paramBean.setRptno(rptno);
        this.paramBean.setPagesize(0);
        this.paramBean.setOffset(0);
        this.lazyDataModel = new pams.view.userdefrpt.UserDefRptLazyDataModel(userDefRptService.getUserDefRptMapper(), this.paramBean);


        Ptoplog oplog = new Ptoplog();
        oplog.setActionId("UserDefRptShow_onQuery");
        oplog.setActionName("�Զ��屨��[" + title + "]:��ѯ");
        oplog.setOpDataBranchid(this.paramBean.getBranchid());
        platformService.insertNewOperationLog(oplog);
    }

    public String onQuery() {
        try {
            Ptoplog oplog = new Ptoplog();
            oplog.setActionId("UserDefRptShow_onQuery");
            oplog.setActionName("�Զ��屨��[" + title + "]:��ѯ");
            oplog.setOpDataBranchid(this.paramBean.getBranchid());
            platformService.insertNewOperationLog(oplog);

            this.paramBean.setRptno(rptno);

            this.lazyDataModel = new pams.view.userdefrpt.UserDefRptLazyDataModel(userDefRptService.getUserDefRptMapper(), this.paramBean);
        } catch (Exception e) {
            logger.error("��ѯ����ʱ���ִ���", e);
            MessageUtil.addWarn("��ѯ����ʱ���ִ���" + e.getMessage());
        }
        return null;
    }


    public void onRowSelect(SelectEvent event) {
        try {
            this.selectedRecord = (UdRptFeedbackData) event.getObject();
        } catch (Exception e) {
            MessageUtil.addWarn(e.getMessage());
        }
    }

    //������¼��������
    public void onSingleFeedback(String isMarketed, String isRefused) {
        try {
            selectedRecord.setIsmarketed(isMarketed);
            selectedRecord.setIsrefused(isRefused);
            userDefRptService.processSingleFeedback(selectedRecord);
        } catch (Exception e) {
            MessageUtil.addWarn("ϵͳ�������." + e.getMessage());
        }
    }
    //������¼��������
    public void onMultiFeedback(String isMarketed, String isRefused) {
        try {
            for (UdRptFeedbackData record : selectedRecords) {
                record.setIsmarketed(isMarketed);
                record.setIsrefused(isRefused);
                userDefRptService.processSingleFeedback(record);
            }
        } catch (Exception e) {
            MessageUtil.addWarn("ϵͳ�������." + e.getMessage());
        }
    }
    //===================================================================

    public UserDefRptVO getParamBean() {
        return paramBean;
    }

    public void setParamBean(UserDefRptVO paramBean) {
        this.paramBean = paramBean;
    }

    public UdRptFeedbackData getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(UdRptFeedbackData selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public LazyDataModel<UdRptFeedbackData> getLazyDataModel() {
        return lazyDataModel;
    }

    public void setLazyDataModel(LazyDataModel<UdRptFeedbackData> lazyDataModel) {
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


    public UserDefRptService getUserDefRptService() {
        return userDefRptService;
    }

    public void setUserDefRptService(UserDefRptService userDefRptService) {
        this.userDefRptService = userDefRptService;
    }

    public boolean isBizBranch() {
        return isBizBranch;
    }

    public void setBizBranch(boolean bizBranch) {
        isBizBranch = bizBranch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DataTable getDataTable() {
        return dataTable;
    }

    public void setDataTable(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public List<ColumnModel> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnModel> columns) {
        this.columns = columns;
    }

    public Map<String, String> getBanksMap() {
        return banksMap;
    }

    public void setBanksMap(Map<String, String> banksMap) {
        this.banksMap = banksMap;
    }

    public String getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(String tableWidth) {
        this.tableWidth = tableWidth;
    }

    public Map<String, String> getFieldsMap() {
        return fieldsMap;
    }

    public void setFieldsMap(Map<String, String> fieldsMap) {
        this.fieldsMap = fieldsMap;
    }

    public boolean isMarketed() {
        return marketed;
    }

    public void setMarketed(boolean marketed) {
        this.marketed = marketed;
    }

    public boolean isRefused() {
        return refused;
    }

    public void setRefused(boolean refused) {
        this.refused = refused;
    }

    public List<UdRptFeedbackData> getSelectedRecords() {
        return selectedRecords;
    }

    public void setSelectedRecords(List<UdRptFeedbackData> selectedRecords) {
        this.selectedRecords = selectedRecords;
    }
}
