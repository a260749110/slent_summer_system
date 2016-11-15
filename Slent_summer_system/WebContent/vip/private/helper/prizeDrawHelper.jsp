<%@page import="com.spring.service.impl.PrizeDraw1Service"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	PrizeDraw1Service.random(request, response, out);
%>