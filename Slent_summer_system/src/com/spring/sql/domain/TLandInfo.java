package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the t_land_info database table.
 * 
 */
@Entity
@Table(name="t_land_info")
@DynamicInsert
@DynamicUpdate
public class TLandInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte close;
	private Date flight;
	private byte hasNext;
	private int landId;
	private Timestamp landTime;
	private String landUser;
	private String landUsers;
	private float moneyIn;
	private float moneyNeed;
	private float moneyTrue;
	private String nextUser;
	private String tip;

	public TLandInfo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(nullable=false)
	public byte getClose() {
		return this.close;
	}

	public void setClose(byte close) {
		this.close = close;
	}


	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getFlight() {
		return this.flight;
	}

	public void setFlight(Date flight) {
		this.flight = flight;
	}


	@Column(name="has_next", nullable=false)
	public byte getHasNext() {
		return this.hasNext;
	}

	public void setHasNext(byte hasNext) {
		this.hasNext = hasNext;
	}


	@Column(name="land_id", nullable=false)
	public int getLandId() {
		return this.landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}


	@Column(name="land_time", nullable=false)
	public Timestamp getLandTime() {
		return this.landTime;
	}

	public void setLandTime(Timestamp landTime) {
		this.landTime = landTime;
	}


	@Column(name="land_user", nullable=false, length=255)
	public String getLandUser() {
		return this.landUser;
	}

	public void setLandUser(String landUser) {
		this.landUser = landUser;
	}


	@Lob
	@Column(name="land_users", nullable=false)
	public String getLandUsers() {
		return this.landUsers;
	}

	public void setLandUsers(String landUsers) {
		this.landUsers = landUsers;
	}


	@Column(name="money_in", nullable=false)
	public float getMoneyIn() {
		return this.moneyIn;
	}

	public void setMoneyIn(float moneyIn) {
		this.moneyIn = moneyIn;
	}


	@Column(name="money_need", nullable=false)
	public float getMoneyNeed() {
		return this.moneyNeed;
	}

	public void setMoneyNeed(float moneyNeed) {
		this.moneyNeed = moneyNeed;
	}


	@Column(name="money_true", nullable=false)
	public float getMoneyTrue() {
		return this.moneyTrue;
	}

	public void setMoneyTrue(float moneyTrue) {
		this.moneyTrue = moneyTrue;
	}


	@Column(name="next_user", length=255)
	public String getNextUser() {
		return this.nextUser;
	}

	public void setNextUser(String nextUser) {
		this.nextUser = nextUser;
	}


	@Lob
	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}