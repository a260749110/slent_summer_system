<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
UserData ud=LandManager.instance.getUser(request);
LandManager.instance.addOnduty(ud.user.getName());

%>