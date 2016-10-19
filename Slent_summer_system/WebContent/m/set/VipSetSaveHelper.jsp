<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
UserData data=LandManager.instance.getUser(request);
if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
{
	%>你并没有权限！<%
	return ;}

%>
<%=SSVipManager.instance.saveVIPConfig(request, response).toString()%>