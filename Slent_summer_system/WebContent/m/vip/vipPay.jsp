<%@page import="com.user.vip.VipPay"%>
<%@page import="com.data.PayObj"%>
<%@page import="java.util.Map"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>

<%
Map<String,String[]> map=request.getParameterMap();
for(String str:map.keySet())
{
	System.err.println(str+map.get(str)[0]);
	}
VipPay payObj=new VipPay(map);
String keyId=payObj.getKey();
request.getSession().putValue(keyId, payObj);

%>
{"test":"a","keyId":"<%=keyId %>","vipPrice":<%=payObj.allMoney %>}