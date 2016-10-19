<%@page import="com.user.LandManager"%>
<%@page import="com.unit.PrintTicketTool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.data.MenuHelper"%>
<%@page import="com.data.PortHelper"%>
<%@page import="com.data.DataHelper"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.unit.Tool"%>
<%@page import="com.data.PayObj"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
<body>
<%
Map<String,String[]> map=request.getParameterMap();

PayObj payObj=new PayObj(map);
ArrayList<String> tickets=payObj.getTick();

DataHelper.instance.saveSellInfo(payObj);
int i=0;
for(String ticket:tickets){
	i++;if(i>3)
	{
		i=0;
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{}
	}
	PrintTicketTool.print(ticket);
	}

Tool.print("--------------夏不语------------\r\n"+"wifi:xby2016512"+
"\r\n"+payObj.toPrintString()+"\r\n\r\n\r\n");

MenuHelper.instance.displayNeed(payObj.getAllMoney());
%>
</body>
</html>