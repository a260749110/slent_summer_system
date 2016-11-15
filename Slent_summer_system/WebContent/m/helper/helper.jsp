<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.page.PageHandler.EPageHandlerKey"%>
<%@page import="com.page.helper.PageHelperManeger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<%
	String key = request.getParameter("key");
	PageHelperManeger.instance.handle(EPageHandlerKey.valueOf(key), request, response, out);
%>