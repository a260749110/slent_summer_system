package com.spring.sql.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_menu_group database table.
 * 
 */
@Entity
@Table(name="t_menu_group")

public class TMenuGroupPo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte enable;

	@Column(name="n_name")
	private String nName;

	public TMenuGroupPo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="`enable`")
	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public String getNName() {
		return this.nName;
	}

	public void setNName(String nName) {
		this.nName = nName;
	}

}