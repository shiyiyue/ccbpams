package pams.repo4odsbpbs.model.common;

import java.math.BigDecimal;

/**
 * User: zhanrui
 */
public class AssetQryParam {
    private String rptDate;
    private String instNo;
    private String custNo;
    private String certType;
    private String certNo;
    private String custName;
    private String startDate;
    private String endDate;
    private BigDecimal depStartAmt; //存款
    private BigDecimal depEndAmt;
    private BigDecimal fundStartAmt; //基金
    private BigDecimal fundEndAmt;
    private BigDecimal finStartAmt; //理财
    private BigDecimal finEndAmt;
    private BigDecimal ctsStartAmt; //CTS
    private BigDecimal ctsEndAmt;

    private int offset;
    private int pagesize;
    private String sortField;
    private String sortOrder;

    public String getRptDate() {
        return rptDate;
    }

    public void setRptDate(String rptDate) {
        this.rptDate = rptDate;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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

    public BigDecimal getDepStartAmt() {
        return depStartAmt;
    }

    public void setDepStartAmt(BigDecimal depStartAmt) {
        this.depStartAmt = depStartAmt;
    }

    public BigDecimal getDepEndAmt() {
        return depEndAmt;
    }

    public void setDepEndAmt(BigDecimal depEndAmt) {
        this.depEndAmt = depEndAmt;
    }

    public BigDecimal getFundStartAmt() {
        return fundStartAmt;
    }

    public void setFundStartAmt(BigDecimal fundStartAmt) {
        this.fundStartAmt = fundStartAmt;
    }

    public BigDecimal getFundEndAmt() {
        return fundEndAmt;
    }

    public void setFundEndAmt(BigDecimal fundEndAmt) {
        this.fundEndAmt = fundEndAmt;
    }

    public BigDecimal getFinStartAmt() {
        return finStartAmt;
    }

    public void setFinStartAmt(BigDecimal finStartAmt) {
        this.finStartAmt = finStartAmt;
    }

    public BigDecimal getFinEndAmt() {
        return finEndAmt;
    }

    public void setFinEndAmt(BigDecimal finEndAmt) {
        this.finEndAmt = finEndAmt;
    }

    public BigDecimal getCtsStartAmt() {
        return ctsStartAmt;
    }

    public void setCtsStartAmt(BigDecimal ctsStartAmt) {
        this.ctsStartAmt = ctsStartAmt;
    }

    public BigDecimal getCtsEndAmt() {
        return ctsEndAmt;
    }

    public void setCtsEndAmt(BigDecimal ctsEndAmt) {
        this.ctsEndAmt = ctsEndAmt;
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

    public String getInstNo() {
        return instNo;
    }

    public void setInstNo(String instNo) {
        this.instNo = instNo;
    }
}
