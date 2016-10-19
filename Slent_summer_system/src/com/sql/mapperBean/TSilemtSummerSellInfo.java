package com.sql.mapperBean;

import java.util.Date;

public class TSilemtSummerSellInfo {
    private Integer id;

    private Float moneyTrue;

    private Integer sellId;

    private String sellName;

    private Long payId;

    private Integer payType;

    private String payName;

    private Date time;

    private Date flight;

    private Integer userId;

    private Boolean deleteFlag;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMoneyTrue() {
        return moneyTrue;
    }

    public void setMoneyTrue(Float moneyTrue) {
        this.moneyTrue = moneyTrue;
    }

    public Integer getSellId() {
        return sellId;
    }

    public void setSellId(Integer sellId) {
        this.sellId = sellId;
    }

    public String getSellName() {
        return sellName;
    }

    public void setSellName(String sellName) {
        this.sellName = sellName;
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getFlight() {
        return flight;
    }

    public void setFlight(Date flight) {
        this.flight = flight;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}