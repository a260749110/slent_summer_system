package com.vip.interfaceCells.impl;

import org.json.JSONObject;

import com.spring.sql.domain.SGiftItemPo;
import com.vip.VipInfo;
import com.vip.cells.GiftIntegralRaturnOtherObj;
import com.vip.interfaceCells.GiftHandler;

public class GiftIntegralReturnHandler implements GiftHandler{

	@Override
	public void hande(VipInfo vipInfo, SGiftItemPo itemPo) {
		// TODO Auto-generated method stub
		
		GiftIntegralRaturnOtherObj otherObj=new GiftIntegralRaturnOtherObj(new JSONObject(itemPo.getOther()));
		vipInfo.sVip.setHistory(vipInfo.sVip.getHistory()+(((float)otherObj.getValue())/100));
	}

}
