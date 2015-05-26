package pams.repository.model.userdefrpt;

import pams.repository.model.ClsUdRptdata;

/**
 * Created by zhanrui on 2015/5/24.
 */
public class UdRptFeedbackData extends ClsUdRptdata {
    private String ismarketed;
    private String isrefused;
    private String marketdate;
    private String marketoper;
    private String refusedate;
    private String refuseoper;
    private String remark;

    public String getIsmarketed() {
        return ismarketed;
    }

    public void setIsmarketed(String ismarketed) {
        this.ismarketed = ismarketed;
    }

    public String getIsrefused() {
        return isrefused;
    }

    public void setIsrefused(String isrefused) {
        this.isrefused = isrefused;
    }

    public String getMarketdate() {
        return marketdate;
    }

    public void setMarketdate(String marketdate) {
        this.marketdate = marketdate;
    }

    public String getMarketoper() {
        return marketoper;
    }

    public void setMarketoper(String marketoper) {
        this.marketoper = marketoper;
    }

    public String getRefusedate() {
        return refusedate;
    }

    public void setRefusedate(String refusedate) {
        this.refusedate = refusedate;
    }

    public String getRefuseoper() {
        return refuseoper;
    }

    public void setRefuseoper(String refuseoper) {
        this.refuseoper = refuseoper;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
