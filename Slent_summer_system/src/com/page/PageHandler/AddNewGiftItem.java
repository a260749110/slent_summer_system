package com.page.PageHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.spring.service.impl.SqlService;
import com.spring.sql.domain.SGiftItemPo;

public class AddNewGiftItem implements PageHandlerInterface {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, JSONObject result) {
		// TODO Auto-generated method stub
		
		result.put("flag", true);
	SGiftItemPo giftItemPo=new SGiftItemPo();
	giftItemPo.setName("Unknow");
	giftItemPo.setOther("{}");
	giftItemPo.setType(-1);
	SqlService.getInstance().sGiftItemDao.save(giftItemPo);
	}

}
