package com.vip.common;

import com.vip.VipInfo;

@SuppressWarnings("rawtypes")
public enum ESessionData {
	UNKNOW(null), VIP_INFO(VipInfo.class),
	VIP_WRONG(Integer.class)//密码错误
	;

	private Class objType;

	ESessionData(Class objType) {
		this.objType = objType;
	}

	public String getCode() {
		return "ESessionData:" + this.name();
	}
	public String getCode(String str) {
		return "ESessionData:" + this.name()+":"+str;
	}
	public Class getDataType() {
		return objType;
	}

}
