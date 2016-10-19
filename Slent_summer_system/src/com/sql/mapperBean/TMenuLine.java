package com.sql.mapperBean;

public class TMenuLine {
    private Integer id;

    private Float nPrice;

    private Float priceVip;

    private Boolean canOff;

    private Integer nGroupId;

    private Boolean enable;

    private Boolean isCombo;

    private String nName;

    private String barCode;

    private String nUnit;

    private String otherChoice;

    private String includeId;

    private Boolean ticketFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getnPrice() {
        return nPrice;
    }

    public void setnPrice(Float nPrice) {
        this.nPrice = nPrice;
    }

    public Float getPriceVip() {
        return priceVip;
    }

    public void setPriceVip(Float priceVip) {
        this.priceVip = priceVip;
    }

    public Boolean getCanOff() {
        return canOff;
    }

    public void setCanOff(Boolean canOff) {
        this.canOff = canOff;
    }

    public Integer getnGroupId() {
        return nGroupId;
    }

    public void setnGroupId(Integer nGroupId) {
        this.nGroupId = nGroupId;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getIsCombo() {
        return isCombo;
    }

    public void setIsCombo(Boolean isCombo) {
        this.isCombo = isCombo;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getnUnit() {
        return nUnit;
    }

    public void setnUnit(String nUnit) {
        this.nUnit = nUnit;
    }

    public String getOtherChoice() {
        return otherChoice;
    }

    public void setOtherChoice(String otherChoice) {
        this.otherChoice = otherChoice;
    }

    public String getIncludeId() {
        return includeId;
    }

    public void setIncludeId(String includeId) {
        this.includeId = includeId;
    }

    public Boolean getTicketFlag() {
        return ticketFlag;
    }

    public void setTicketFlag(Boolean ticketFlag) {
        this.ticketFlag = ticketFlag;
    }
}