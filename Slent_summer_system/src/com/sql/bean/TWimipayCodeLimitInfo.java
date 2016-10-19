package com.sql.bean;

public class TWimipayCodeLimitInfo {
    private Integer type;

    private String memo;

    private Float currentnum;

    private Float deductednum;

    private Float topnum;

    private Float nextdaytopnum;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Float getCurrentnum() {
        return currentnum;
    }

    public void setCurrentnum(Float currentnum) {
        this.currentnum = currentnum;
    }

    public Float getDeductednum() {
        return deductednum;
    }

    public void setDeductednum(Float deductednum) {
        this.deductednum = deductednum;
    }

    public Float getTopnum() {
        return topnum;
    }

    public void setTopnum(Float topnum) {
        this.topnum = topnum;
    }

    public Float getNextdaytopnum() {
        return nextdaytopnum;
    }

    public void setNextdaytopnum(Float nextdaytopnum) {
        this.nextdaytopnum = nextdaytopnum;
    }
}