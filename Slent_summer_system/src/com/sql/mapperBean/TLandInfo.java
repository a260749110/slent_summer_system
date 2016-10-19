package com.sql.mapperBean;

import java.util.Date;

public class TLandInfo {
    private Integer id;

    private Integer landId;

    private String landUser;

    private Date landTime;

    private Date flight;

    private Boolean close;

    private String nextUser;

    private Boolean hasNext;

    private Float moneyIn;

    private Float moneyTrue;

    private Float moneyNeed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLandId() {
        return landId;
    }

    public void setLandId(Integer landId) {
        this.landId = landId;
    }

    public String getLandUser() {
        return landUser;
    }

    public void setLandUser(String landUser) {
        this.landUser = landUser;
    }

    public Date getLandTime() {
        return landTime;
    }

    public void setLandTime(Date landTime) {
        this.landTime = landTime;
    }

    public Date getFlight() {
        return flight;
    }

    public void setFlight(Date flight) {
        this.flight = flight;
    }

    public Boolean getClose() {
        return close;
    }

    public void setClose(Boolean close) {
        this.close = close;
    }

    public String getNextUser() {
        return nextUser;
    }

    public void setNextUser(String nextUser) {
        this.nextUser = nextUser;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Float getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(Float moneyIn) {
        this.moneyIn = moneyIn;
    }

    public Float getMoneyTrue() {
        return moneyTrue;
    }

    public void setMoneyTrue(Float moneyTrue) {
        this.moneyTrue = moneyTrue;
    }

    public Float getMoneyNeed() {
        return moneyNeed;
    }

    public void setMoneyNeed(Float moneyNeed) {
        this.moneyNeed = moneyNeed;
    }
}