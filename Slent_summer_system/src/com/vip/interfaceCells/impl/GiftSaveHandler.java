package com.vip.interfaceCells.impl;

import java.sql.Timestamp;

import com.spring.service.impl.SqlService;
import com.spring.sql.domain.SGiftItemPo;
import com.spring.sql.domain.SVipGiftPo;
import com.vip.VipInfo;
import com.vip.interfaceCells.GiftHandler;

public class GiftSaveHandler implements GiftHandler {

	@Override
	public void hande(VipInfo info, SGiftItemPo giftItemPo) {
		// TODO Auto-generated method stub
		SVipGiftPo giftPo = new SVipGiftPo();
		giftPo.setGiftId(giftItemPo.getId());
		giftPo.setVipId(info.sVip.getId());
		Timestamp endTime = new Timestamp(System.currentTimeMillis());
		endTime.setDate(endTime.getDate() + giftItemPo.getGuaranteePeriod());
		giftPo.setEndDate(endTime);
		SqlService.getInstance().sVipGiftDao.save(giftPo);
	}

}
