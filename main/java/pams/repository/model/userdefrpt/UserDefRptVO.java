package pams.repository.model.userdefrpt;

import pams.repository.model.ClsUdRptdata;

/**
 * User: zhanrui
 * Date: 14-4-24
 * Time: ÏÂÎç1:41
 */
public class UserDefRptVO extends ClsUdRptdata{
    private String startImpdate;
    private String endImpdate;

    private int offset;
    private int pagesize;
    private String  sortField;
    private String  sortOrder;


    public String getStartImpdate() {
        return startImpdate;
    }

    public void setStartImpdate(String startImpdate) {
        this.startImpdate = startImpdate;
    }

    public String getEndImpdate() {
        return endImpdate;
    }

    public void setEndImpdate(String endImpdate) {
        this.endImpdate = endImpdate;
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

}
