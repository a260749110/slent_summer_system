package com.sql.bean;

import java.util.Date;

public class TOgBiDataInfo {
    private Integer id;

    private String bName;

    private String prefix;

    private String imsiprovince;

    private String price;

    private String truePrice;

    private Integer success;

    private Integer fail;

    private Integer channel;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getImsiprovince() {
        return imsiprovince;
    }

    public void setImsiprovince(String imsiprovince) {
        this.imsiprovince = imsiprovince;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTruePrice() {
        return truePrice;
    }

    public void setTruePrice(String truePrice) {
        this.truePrice = truePrice;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getFail() {
        return fail;
    }

    public void setFail(Integer fail) {
        this.fail = fail;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}