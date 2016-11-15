package com.page.PageHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import org.json.JSONObject;

public interface PageHandlerInterface {
public void handle(HttpServletRequest request , HttpServletResponse response ,JSONObject result)
;
}
