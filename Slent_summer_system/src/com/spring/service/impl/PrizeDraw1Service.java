package com.spring.service.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import com.data.DataHelper;
import com.data.ENoahTitlesKey;
import com.spring.service.cells.PrizeDraw1Result;
import com.spring.sql.domain.SGiftItemPo;
import com.spring.sql.domain.SPrizeDrawItemPo;
import com.spring.sql.domain.SVipGiftPo;
import com.user.vip.SSVipManager;
import com.vip.VipInfo;
import com.vip.VipManeger;
import com.vip.enumCells.EGiftType;

import sun.net.www.content.image.gif;

public class PrizeDraw1Service {

	public static void random(HttpServletRequest request, HttpServletResponse response, JspWriter out)
			throws IOException {
		float randonUp = 1;
		long needIntegral=Long.valueOf(DataHelper.instance.getTitleData(ENoahTitlesKey.prize_draw1_use.getKey()).getnValue());
		VipInfo info = VipManeger.instance.getVipInfo(request);
		if (!info.isLogin) {
			return;
		}
		PrizeDraw1Result draw1Result = new PrizeDraw1Result();
		if((info.sVip.getHistory()*100)<needIntegral)
		{
			draw1Result.setFlag(false);
			draw1Result.setMsg("魂淡 (｡•ˇ‸ˇ•｡)  我的积分呢？");
	
			out.append(draw1Result.toJSONObjectStr());
			return;
		}
		List<SPrizeDrawItemPo> list = SqlService.getInstance().prizeDrawItemDao.getAll();
		long[] randMap = new long[list.size()];
		long all = 0;
		for (int i = 0; i < randMap.length; i++) {
			SPrizeDrawItemPo po = list.get(i);
			if (po.getMultiple() > 0) {
				randMap[i] = (long) (po.getRandomSize() + po.getRandomSize() * randonUp * po.getMultiple());
				all += randMap[i];
			}
			else
			{
				randMap[i] = (long) (po.getRandomSize() );
				all += randMap[i];
			}
		}
		Random randomSeed = new Random();
		long random = randomSeed.nextLong();
		if (random < 0) {
			random = -random;
		}
		random = random % all;
		
		for (int i = 0; i < randMap.length; i++) {
			random -= randMap[i];
			if (random < 0) {
				draw1Result.setResultIndex(i);
				break;
			}
		}
		draw1Result.setFlag(true);
		draw1Result.setMsg(
				list.get(draw1Result.getResultIndex()).getName() + list.get(draw1Result.getResultIndex()).getTip());

		
		
		DataHelper.instance.updataSvipById(info.sVip);
	int gif=list.get(draw1Result.getResultIndex()).getGift();
		if(gif>0)
		{
		
		SGiftItemPo giftItemPo=SqlService.getInstance().sGiftItemDao.findOne(list.get(draw1Result.getResultIndex()).getGift());
		if(giftItemPo!=null)
		{
			
			EGiftType.getByType(giftItemPo.getType()).getHandler().hande(info, giftItemPo);
			
			
		
		}
		}
		info.sVip.setHistory(info.sVip.getHistory()-(((float)needIntegral)/100f));
		draw1Result.setIntegral((long)(info.sVip.getHistory()*100));
		out.append(draw1Result.toJSONObjectStr());
	}
}
