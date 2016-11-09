package com.vip.cells;

import org.json.JSONObject;

import com.unit.AutoJSONObjectBase;

public class VipOtherMsgCell extends AutoJSONObjectBase {
	private String qq;
	private String mail;
	private Long signTime=0l;
	private Integer signCount=0;
public VipOtherMsgCell(JSONObject jb)
{
	super(jb);
	}
public VipOtherMsgCell()
{
	super();
	}
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getSignTime() {
		return signTime;
	}

	public void setSignTime(Long signTime) {
		this.signTime = signTime;
	}

	public Integer getSignCount() {
		return signCount;
	}

	public void setSignCount(Integer signCount) {
		this.signCount = signCount;
	}
}
