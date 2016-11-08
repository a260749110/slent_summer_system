package com.vip.common;

import com.vip.VipInfo;

@SuppressWarnings("rawtypes")
public enum ESessionData {
	UNKNOW(null), VIP_INFO(VipInfo.class);

	private Class objType;

	ESessionData(Class objType) {
		this.objType = objType;
	}

	public String getCode() {
		return "ESessionData:" + this.name();
	}

	public Class getDataType() {
		return objType;
	}

}
