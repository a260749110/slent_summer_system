package com.sql.mapperBean;

public class TMoneyChangeType extends TMoneyChangeTypeKey {
    private String monetChangeType;

    private String tip;

    public String getMonetChangeType() {
        return monetChangeType;
    }

    public void setMonetChangeType(String monetChangeType) {
        this.monetChangeType = monetChangeType;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}