package com.page.PageHandler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import org.json.JSONArray;
import org.json.JSONObject;

import com.spring.service.impl.SqlService;
import com.spring.sql.domain.SGiftItemPo;
import com.spring.sql.domain.SVipGiftPo;
import com.spring.sql.domain.SVipPo;
import com.vip.VipManeger;

public class VipGiftSelectHandler implements PageHandlerInterface {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, JSONObject result) {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String passw = request.getParameter("passw");
		SVipPo vipPo = SqlService.getInstance().sVipDao.findOne(id);
		if (vipPo == null || !vipPo.getPassW().equals(passw)) {
			result.put("flag", false);
			result.put("msg", "账号或者密码错误");
			return;
		}

		SqlService.getInstance().sVipGiftDao.removeByTime();
		List<SVipGiftPo> list = SqlService.getInstance().sVipGiftDao.findByVipId(Long.valueOf(vipPo.getId()));
		Iterable<SGiftItemPo> giftList = SqlService.getInstance().sGiftItemDao.getAll();
		Map<Integer, SGiftItemPo> giftMap = new HashMap();
		SimpleDateFormat dateFormat = new SimpleDateFormat(" yy-MM-dd HH:mm:ss");
		for (SGiftItemPo po : giftList) {
			giftMap.put(po.getId(), po);
		}
		JSONArray giftJl = new JSONArray();
		for (SVipGiftPo po : list) {
			JSONObject gift = new JSONObject();
			SGiftItemPo giftItem = giftMap.get(po.getGiftId());
			gift.put("name", giftItem.getName());
			gift.put("id", po.getId());
			gift.put("useFlag:",( po.getUseFlag()>0)?true:false);
			giftJl.put(gift);
			
		}
		result.put("flag", true);
		result.put("gifts", giftJl);
	}

}
