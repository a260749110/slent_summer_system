package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;



/**
 * The persistent class for the s_prize_draw_item database table.
 * 
 */
@Entity
@Table(name = "s_prize_draw_item")
@DynamicInsert
@DynamicUpdate
public class SPrizeDrawItemPo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
    @Column(name = "enable")
	private byte enable;
    @Column(name = "gift")
	private int gift;
    @Column(name = "`multiple`")
	private float multiple;
    @Column(name = "name")
	private String name;
    @Column(name = "other")
	private String other;
    @Column(name = "random_size")
	private Long randomSize;
    @Column(name = "tip")
	private String tip;

	public SPrizeDrawItemPo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public int getGift() {
		return this.gift;
	}

	public void setGift(int gift) {
		this.gift = gift;
	}

	public float getMultiple() {
		return this.multiple;
	}

	public void setMultiple(float multiple) {
		this.multiple = multiple;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Long getRandomSize() {
		return this.randomSize;
	}

	public void setRandomSize(Long randomSize) {
		this.randomSize = randomSize;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}