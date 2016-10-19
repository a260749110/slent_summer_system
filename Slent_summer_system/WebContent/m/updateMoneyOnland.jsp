<%@page import="com.user.DataReport"%>
<%@page import="com.sun.jmx.snmp.Timestamp"%>
<%@page import="java.util.Date"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.MoneyManager"%>
<%@page import="com.sql.mapperBean.TMonegChange"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
<body>
<%
Integer saveId=Integer.valueOf(request.getParameter("saveId").trim());
if(!MoneyManager.instance.canSave(saveId))
{
	response.sendRedirect("main2.jsp");
	return ;}
Float money=Float.valueOf(request.getParameter("money").trim());


TMonegChange monegLast=MoneyManager.instance.getMoneyLast();
//发送登陆汇报
DataReport.instance.sendLandReport(LandManager.instance.landId, monegLast, money);
TMonegChange monegChange=new TMonegChange();
UserData userData=LandManager.instance.getUser(request);
JSONObject jb=new JSONObject();


jb.put("erroUser", monegLast.getChangeUser());
jb.put("erroID", monegLast.getId());
jb.put("erroTime",monegLast.getTime());
monegChange.setChangeUser(userData.user.getId());
monegChange.setChangrFlight(LandManager.instance.landId.getFlight());
monegChange.setTime(new Date(System.currentTimeMillis()));
monegChange.setMoneyChangeType(1);
monegChange.setTip(jb.toString());
monegChange.setMoneyChangeTypeName(MoneyManager.instance.getMonetChangeTpye(1));
monegChange.setMoneyInit(monegLast.getMoneyFinish());
monegChange.setMoneyChange(money);
monegChange.setMoneyFinish(monegLast.getMoneyFinish()+money);
MoneyManager.instance.addMoneyChange(monegChange);
MoneyManager.instance.removeSaveId(saveId);
LandManager.instance.isNewLand=false;
response.sendRedirect("main2.jsp");

%>
</body>
</html>