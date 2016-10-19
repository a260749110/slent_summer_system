<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册结果</title>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
<body>
<%
int result=SSVipManager.instance.regVip(response, request); 
if(result==1)
{
	%>新建成功<%
}
else if(result==-3)
{
	%>新建失败。该账号已被注册<%
}
else 
{
	%>新建失败,未知错误，错误码：<%=result%><%
}
%>
</body>
</html>