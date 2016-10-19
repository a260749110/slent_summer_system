package com.sql.mapperBean;

public class TLandInfoWithBLOBs extends TLandInfo {
    private String landUsers;

    private String tip;

    public String getLandUsers() {
        return landUsers;
    }

    public void setLandUsers(String landUsers) {
        this.landUsers = landUsers;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}