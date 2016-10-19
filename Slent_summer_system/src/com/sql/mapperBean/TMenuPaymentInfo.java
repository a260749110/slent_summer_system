package com.sql.mapperBean;

public class TMenuPaymentInfo {
    private Integer id;

    private String nName;

    private String title;

    private Boolean enable;

    private String selfData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getSelfData() {
        return selfData;
    }

    public void setSelfData(String selfData) {
        this.selfData = selfData;
    }
}