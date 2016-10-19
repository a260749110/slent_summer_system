package com.sql.mapperBean;

import java.util.Date;

public class TLandId {
    private Integer id;

    private Integer landId;

    private Date landTime;

    private Date endTime;

    private Date flight;

    private Boolean isClose;

    private String landInfo;

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

    public Date getLandTime() {
        return landTime;
    }

    public void setLandTime(Date landTime) {
        this.landTime = landTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getFlight() {
        return flight;
    }

    public void setFlight(Date flight) {
        this.flight = flight;
    }

    public Boolean getIsClose() {
        return isClose;
    }

    public void setIsClose(Boolean isClose) {
        this.isClose = isClose;
    }

    public String getLandInfo() {
        return landInfo;
    }

    public void setLandInfo(String landInfo) {
        this.landInfo = landInfo;
    }
}