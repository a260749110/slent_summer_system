package com.page.helper;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import org.json.JSONObject;

import com.page.PageHandler.EPageHandlerKey;
import com.page.PageHandler.PageHandlerInterface;
import com.page.PageHandler.VipGiftSelectHandler;

public class PageHelperManeger {
	public static PageHelperManeger instance = new PageHelperManeger();
	private Map<EPageHandlerKey, PageHandlerInterface> handlerMap;

	private PageHelperManeger() {
		handlerMap = new HashMap<>();
		handlerMap.put(EPageHandlerKey.VIP_GIFT_SELECT, new VipGiftSelectHandler());
	}

	public void handle(EPageHandlerKey key, HttpServletRequest request, HttpServletResponse response, JspWriter out) {
		JSONObject result = new JSONObject();
		try {
			handlerMap.get(key).handle(request, response, result);
			try {
				boolean flag = result.getBoolean("flag");
			} catch (Exception e) {
				// TODO: handle exception
				result.put("flag", false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("flag", false);
			result.put("msg", e.getMessage());
		}
		try {
			out.append(result.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
