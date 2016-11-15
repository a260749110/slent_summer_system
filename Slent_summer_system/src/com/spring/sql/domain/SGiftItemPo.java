package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * The persistent class for the s_gift_item database table.
 * 
 */
@Entity
@Table(name="s_gift_item")
@DynamicInsert
@DynamicUpdate
public class SGiftItemPo implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	@Column(name="guarantee_period")
	private int guaranteePeriod;
	@Column(name="name")
	private String name;
	@Column(name="other")
	private String other;
	@Column(name="type")
	private Integer type;
	public SGiftItemPo() {
	}


	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getGuaranteePeriod() {
		return this.guaranteePeriod;
	}

	public void setGuaranteePeriod(int guaranteePeriod) {
		this.guaranteePeriod = guaranteePeriod;
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


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}

}