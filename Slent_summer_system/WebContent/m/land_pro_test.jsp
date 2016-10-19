<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>land</title>
</head>
<body><%  
response.setContentType("text/html;charset=UTF-8");
System.err.println("test land");
if(LandManager.instance.landId==null)
{
	System.err.println("test f");
response.sendRedirect("login.jsp");
}
%>

</body>
</html>