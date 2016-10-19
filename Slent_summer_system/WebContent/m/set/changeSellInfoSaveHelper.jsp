<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="java.util.Map"%>
<%@page import="com.sql.mapperBean.TSilemtSummerSellInfo"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	
	
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}

	JSONObject resultJs=new JSONObject();
	resultJs.put("flag", false);
	resultJs.put("msg", "保存失败");



%>
<%
try {


	int id=Integer.valueOf(request.getParameter("id"));
	int payType=Integer.valueOf(request.getParameter("payType"));
	boolean	deleteFlag=Boolean.valueOf(request.getParameter("deleteFlag"));
	TSilemtSummerSellInfo info=new TSilemtSummerSellInfo();
	info.setId(id);
	info.setPayType(payType);
	info.setPayName(DataHelper.instance.getPayInfo(payType).getnName());
	info.setDeleteFlag(deleteFlag);
	DataHelper.instance.saveSellInfo(info);
	resultJs.put("flag", true);
	resultJs.put("msg", "保存成功！");
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}

 %>
<%=resultJs.toString()%>