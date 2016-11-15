package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the s_vip database table.
 * 
 */
@Entity
@Table(name="s_vip")
@DynamicInsert
@DynamicUpdate
public class SVipPo implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private String id;
    @Column(name = "`age`")
	private int age;
    @Column(name = "`cut_off`")
	private float cutOff;
    
    @Column(name = "`history`")
	private float history;
    @Column(name = "`lvl`")
	private int lvl;
    @Column(name = "`money`")
	private float money;
    @Column(name = "`name`")
	private String name;
    @Column(name = "`other`")
	private String other;
    @Column(name = "`pass_w`")
	private String passW;
    @Column(name = "`phone`")
	private String phone;
    @Column(name = "`referee`")
	private BigInteger referee;
    @Column(name = "`sex`")
	private String sex;
    @Column(name = "`time`")
	private Timestamp time;

	public SVipPo() {
	}



	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
	public float getCutOff() {
		return this.cutOff;
	}

	public void setCutOff(float cutOff) {
		this.cutOff = cutOff;
	}


	public float getHistory() {
		return this.history;
	}

	public void setHistory(float history) {
		this.history = history;
	}


	public int getLvl() {
		return this.lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}


	public float getMoney() {
		return this.money;
	}

	public void setMoney(float money) {
		this.money = money;
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


	
	public String getPassW() {
		return this.passW;
	}

	public void setPassW(String passW) {
		this.passW = passW;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public BigInteger getReferee() {
		return this.referee;
	}

	public void setReferee(BigInteger referee) {
		this.referee = referee;
	}


	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}