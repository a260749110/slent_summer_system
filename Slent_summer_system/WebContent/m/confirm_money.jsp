<%@page import="com.user.LandManager"%>
<%@page import="com.sql.mapperBean.TMonegChange"%>
<%@page import="com.user.MoneyManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>请确认钱箱金钱：</title>
</head>
<body style="text-align: center;">
<% if(!LandManager.instance.isNewLand)
	{
	response.sendRedirect("main2.jsp");
	return;
	}%>
<div >
请确认钱箱金钱：<%  TMonegChange last= MoneyManager.instance.getMoneyLast(); %><%=last.getMoneyFinish() %>
</div>
<form action="updateMoneyOnland.jsp"  method="post">
<div>金钱差异 :<input name="money"  id="money" type="text"></div>
<div>
<button>没有差异进入点单</button>
<input  type="submit" value="有差异记录差异">
<input type="text" name="saveId" readonly="readonly"  value="<%=MoneyManager.instance.getSaveId()  %>  " >
</div>
</form>
</body>
</html>