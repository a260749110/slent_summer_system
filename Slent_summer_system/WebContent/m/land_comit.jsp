<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
<%
String name=request.getParameter("name");
String passw=request.getParameter("password");
System.err.println("name: "+name+"passw:"+passw);
int landresult=LandManager.instance.land(name, passw,request);

if(landresult<0)
{
response.sendRedirect("login.jsp");
}
else
{
	if(landresult==2)
		response.sendRedirect("confirm_money.jsp");
	else
	{
		
	response.sendRedirect("main2.jsp");
	
	}}
%>

</body>
</html>