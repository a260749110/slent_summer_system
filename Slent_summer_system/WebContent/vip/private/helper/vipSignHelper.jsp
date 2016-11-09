<%@page import="com.vip.VipManeger"%>
<%@page import="org.json.JSONObject"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	VipManeger.instance.sign(request, response, out);
	
%>

