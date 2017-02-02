package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_menu_line database table.
 * 
 */
@Entity
@Table(name="t_menu_line")
public class TMenuLinePo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="bar_code")
	private String barCode;

	@Column(name="can_off")
	private byte canOff;
	@Column(name="`enable`")
	private byte enable;

	@Column(name="include_id")
	private String includeId;

	@Column(name="is_combo")
	private byte isCombo;

	@Column(name="n_group_id")
	private int nGroupId;

	@Column(name="n_name")
	private String nName;

	@Column(name="n_price")
	private float nPrice;

	@Column(name="n_unit")
	private String nUnit;

	@Column(name="other_choice")
	private String otherChoice;

	@Column(name="price_vip")
	private float priceVip;

	@Column(name="ticket_flag")
	private byte ticketFlag;

	public TMenuLinePo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public byte getCanOff() {
		return this.canOff;
	}

	public void setCanOff(byte canOff) {
		this.canOff = canOff;
	}

	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public String getIncludeId() {
		return this.includeId;
	}

	public void setIncludeId(String includeId) {
		this.includeId = includeId;
	}

	public byte getIsCombo() {
		return this.isCombo;
	}

	public void setIsCombo(byte isCombo) {
		this.isCombo = isCombo;
	}

	public int getNGroupId() {
		return this.nGroupId;
	}

	public void setNGroupId(int nGroupId) {
		this.nGroupId = nGroupId;
	}

	public String getNName() {
		return this.nName;
	}

	public void setNName(String nName) {
		this.nName = nName;
	}

	public float getNPrice() {
		return this.nPrice;
	}

	public void setNPrice(float nPrice) {
		this.nPrice = nPrice;
	}

	public String getNUnit() {
		return this.nUnit;
	}

	public void setNUnit(String nUnit) {
		this.nUnit = nUnit;
	}

	public String getOtherChoice() {
		return this.otherChoice;
	}

	public void setOtherChoice(String otherChoice) {
		this.otherChoice = otherChoice;
	}

	public float getPriceVip() {
		return this.priceVip;
	}

	public void setPriceVip(float priceVip) {
		this.priceVip = priceVip;
	}

	public byte getTicketFlag() {
		return this.ticketFlag;
	}

	public void setTicketFlag(byte ticketFlag) {
		this.ticketFlag = ticketFlag;
	}

}