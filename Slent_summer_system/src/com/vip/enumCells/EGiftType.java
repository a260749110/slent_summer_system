package com.vip.enumCells;

import com.vip.interfaceCells.GiftHandler;
import com.vip.interfaceCells.impl.GiftIntegralReturnHandler;
import com.vip.interfaceCells.impl.GiftNullHandler;
import com.vip.interfaceCells.impl.GiftSaveHandler;

public enum EGiftType {
	UKONW(-1,"未知",new GiftNullHandler()),
	GIFT_REAL(0,"实物兑换",new GiftSaveHandler()),
	INTEGRAL_RETURN(1,"积分返还",new GiftIntegralReturnHandler());
private GiftHandler handler;
private int type;
private String desc;
EGiftType(int type ,String desc ,GiftHandler handler)
{
	this.type=type;
	this.desc=desc;
	this.handler=handler;

	}
public static EGiftType getByType(int type)
{
	for (EGiftType t:EGiftType.values()) {
		if(type==t.type)
			return t;
	}
	return EGiftType.UKONW;
	}
public int getType() {
	return type;
}

public GiftHandler getHandler() {
	return handler;
}
public String getDesc() {
	return desc;
}


}
