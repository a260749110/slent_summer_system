<%@page import="com.user.LandManager"%>
<%@page import="org.json.JSONObject"%>
<%@page import="netscape.javascript.JSObject"%>

<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.sql.mapperBean.SVip"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
	<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
	
<%

long id=-1;
String idStr=request.getParameter("vip_id");
JSONObject jb=new JSONObject();

if(idStr!=null)
{
try
{
id=Long.valueOf(idStr);
SVip sVip=SSVipManager.instance.getVipData(id);
if(sVip!=null)
{
jb.put("successFlag", true);
	jb.put("title", sVip.getMoney());
}
else
{
jb.put("successFlag", false);
	jb.put("title", "请输入正确的卡号");
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
else
	{
	jb.put("successFlag", false);
	jb.put("title", "请输入卡号");
	}
%>
<%=jb.toString() %>

