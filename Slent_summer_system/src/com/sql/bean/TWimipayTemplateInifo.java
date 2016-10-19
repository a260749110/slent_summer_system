package com.sql.bean;

public class TWimipayTemplateInifo {
    private String wipayId;

    private Float price;

    private String memo;
    private String tableName;
    public String getWipayId() {
        return wipayId;
    }

    public void setWipayId(String wipayId) {
        this.wipayId = wipayId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}