package com.sql.mapperBean;

import java.util.Date;

public class TMonegChange {
    private Integer id;

    private Float moneyInit;

    private Float moneyChange;

    private Integer moneyChangeType;

    private Float moneyFinish;

    private String moneyChangeTypeName;

    private String changeUser;

    private Date time;

    private Date changrFlight;

    private String tip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMoneyInit() {
        return moneyInit;
    }

    public void setMoneyInit(Float moneyInit) {
        this.moneyInit = moneyInit;
    }

    public Float getMoneyChange() {
        return moneyChange;
    }

    public void setMoneyChange(Float moneyChange) {
        this.moneyChange = moneyChange;
    }

    public Integer getMoneyChangeType() {
        return moneyChangeType;
    }

    public void setMoneyChangeType(Integer moneyChangeType) {
        this.moneyChangeType = moneyChangeType;
    }

    public Float getMoneyFinish() {
        return moneyFinish;
    }

    public void setMoneyFinish(Float moneyFinish) {
        this.moneyFinish = moneyFinish;
    }

    public String getMoneyChangeTypeName() {
        return moneyChangeTypeName;
    }

    public void setMoneyChangeTypeName(String moneyChangeTypeName) {
        this.moneyChangeTypeName = moneyChangeTypeName;
    }

    public String getChangeUser() {
        return changeUser;
    }

    public void setChangeUser(String changeUser) {
        this.changeUser = changeUser;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getChangrFlight() {
        return changrFlight;
    }

    public void setChangrFlight(Date changrFlight) {
        this.changrFlight = changrFlight;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}