package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_land_id database table.
 * 
 */
@Entity
@Table(name="t_land_id")
@DynamicInsert
@DynamicUpdate
public class TLandIdPo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Timestamp endTime;
	private Date flight;
	private byte isClose;
	private int landId;
	private String landInfo;
	private Timestamp landTime;

	public TLandIdPo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="end_time")
	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}


	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getFlight() {
		return this.flight;
	}

	public void setFlight(Date flight) {
		this.flight = flight;
	}


	@Column(name="is_close", nullable=false)
	public byte getIsClose() {
		return this.isClose;
	}

	public void setIsClose(byte isClose) {
		this.isClose = isClose;
	}


	@Column(name="land_id", nullable=false)
	public int getLandId() {
		return this.landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}


	@Lob
	@Column(name="land_info", nullable=false)
	public String getLandInfo() {
		return this.landInfo;
	}

	public void setLandInfo(String landInfo) {
		this.landInfo = landInfo;
	}


	@Column(name="land_time", nullable=false)
	public Timestamp getLandTime() {
		return this.landTime;
	}

	public void setLandTime(Timestamp landTime) {
		this.landTime = landTime;
	}

}