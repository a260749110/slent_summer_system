<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="com.alibaba.fastjson.JSONObject"%>
<%@page import="com.unit.Tool"%>
<%@page import="com.spring.service.dtoservice.DtoService"%>
<%@page import="com.activity.data.SecondCutOffData"%>
<%@page import="com.activity.EActivityType"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.spring.sql.dto.ActivityDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
	<%
		UserData udata = LandManager.instance.getUser(request);
		if (!udata.permissions.contains("MONEY_GET") && (!udata.permissions.contains("ALL"))) {
	%>你并没有权限！<%
		return;
		}
	%>
<%



	ActivityDto dto=null;
	//DtoService.instance.saveActivity(dto);
	String str=Tool.httpPostToJS(request).toJSONString().replaceAll("\"\\[","[").replaceAll("\\]\"","]");
	dto=JSON.parseObject(str, ActivityDto.class);
	DtoService.instance.saveActivity(dto);
	
%>