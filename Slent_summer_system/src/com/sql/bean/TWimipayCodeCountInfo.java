package com.sql.bean;

public class TWimipayCodeCountInfo {
    private Integer id;

    private String prefix;

    private Integer type;

    private Float currentnum;

    private Float deductednum;

    private Float topnum;

    private Boolean state;

    private Float doublepayrate;

    private Float rate;

    private Boolean nextdaystate;

    private Float nextdaytopnum;

    private Float nextdayrate;

    private String tableName;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Float getDoublepayrate() {
        return doublepayrate;
    }

    public void setDoublepayrate(Float doublepayrate) {
        this.doublepayrate = doublepayrate;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Boolean getNextdaystate() {
        return nextdaystate;
    }

    public void setNextdaystate(Boolean nextdaystate) {
        this.nextdaystate = nextdaystate;
    }

    public Float getNextdaytopnum() {
        return nextdaytopnum;
    }

    public void setNextdaytopnum(Float nextdaytopnum) {
        this.nextdaytopnum = nextdaytopnum;
    }

    public Float getNextdayrate() {
        return nextdayrate;
    }

    public void setNextdayrate(Float nextdayrate) {
        this.nextdayrate = nextdayrate;
    }

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}