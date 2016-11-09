<%@page import="com.vip.VipManeger"%>
<%@page import="com.vip.VipInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>夏不语欢迎您</title>
	<!-- links -->
	<jsp:include page="../layout/links.jsp"></jsp:include>
	<!-- //links -->
</head>
<%
	VipInfo vipInfo = VipManeger.instance.getVipInfo(request);
%>
<body class="bg">
	<!-- nav -->
	<jsp:include page="../layout/nav.jsp"></jsp:include>
	<!-- //nav -->
	<!-- logo -->
<jsp:include page="../layout/logo.jsp"></jsp:include>
	<!-- //logo -->
	<!-- banner -->
	
</body>
</html>