package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;


/**
 * The persistent class for the s_vip_gift database table.
 * 
 */
@Entity
@Table(name="s_vip_gift")
@DynamicInsert
@DynamicUpdate
public class SVipGiftPo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	@Column(name="end_date", nullable=false)
	private Timestamp endDate;
	@Column(name="gift_id", nullable=false)
	private int giftId;
	private String other;
	@Column(name="use_date")
	private Timestamp useDate;
	@Column(name="use_flag")
	private byte useFlag;
	@Column(name="vip_id")
	private Long vipId;

	public SVipGiftPo() {
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}



	public int getGiftId() {
		return this.giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}


	
	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}



	public Timestamp getUseDate() {
		return this.useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}



	public byte getUseFlag() {
		return this.useFlag;
	}

	public void setUseFlag(byte useFlag) {
		this.useFlag = useFlag;
	}



	public Long getVipId() {
		return this.vipId;
	}

	public void setVipId(Long vipId) {
		this.vipId = vipId;
	}

}