package com.sql.bean;

public class TWimipayMobilePercent {
    private Integer id;

    private String type;

    private Integer percent;

    private String memo;

    private String candouble;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCandouble() {
        return candouble;
    }

    public void setCandouble(String candouble) {
        this.candouble = candouble;
    }
}