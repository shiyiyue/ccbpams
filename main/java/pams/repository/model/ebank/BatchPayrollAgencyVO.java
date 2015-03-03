package pams.repository.model.ebank;

import java.math.BigDecimal;

/**
 * User: zhanrui
 * Date: 20150301
 */
public class BatchPayrollAgencyVO {
    private String branchId;
    private String chanlFlowNo;
    private String acctNo;
    private String acctName;
    private String startDate;
    private String endDate;

    private int offset;
    private int pagesize;
    private String  sortField;
    private String  sortOrder;

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getChanlFlowNo() {
        return chanlFlowNo;
    }

    public void setChanlFlowNo(String chanlFlowNo) {
        this.chanlFlowNo = chanlFlowNo;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
}
