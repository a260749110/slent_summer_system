package com.sql.bean;

import java.util.Date;

public class TWimipayCodeDatecountInfo {
    private Integer id;

    private String prefix;

    private Integer type;

    private Float datenum;

    private Float deductednum;

    private Date date;

    private String tableName;
    
    private Date dateStart;
    
    private Date dateEnd;
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

    public Float getDatenum() {
        return datenum;
    }

    public void setDatenum(Float datenum) {
        this.datenum = datenum;
    }

    public Float getDeductednum() {
        return deductednum;
    }

    public void setDeductednum(Float deductednum) {
        this.deductednum = deductednum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
}