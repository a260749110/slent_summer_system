<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	
	
	if(LandManager.instance.testLand(request, response)<=0)
	{
		response.sendRedirect("login.jsp");
		return;
	}

	%>
	<%
	UserData data=LandManager.instance.getUser(request);
	if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
	{
	%>你并没有权限！<%
	return ;}
 	JSONObject jb=new JSONObject();
	jb.put("flag",false);
	jb.put("msg", "保存失败");
	try {
		int id=Integer.valueOf(request.getParameter("id"));
		String name=request.getParameter("name");
		boolean enable=Boolean.valueOf(request.getParameter("enable"));
		boolean canChange=Boolean.valueOf(request.getParameter("canChange"));
		TMenuPaymentInfo info=null;
			JSONObject jsTemp=null;
		if(id<=0)
		{
		info=new TMenuPaymentInfo();
		}
		else
		{
		info= DataHelper.instance.getPayInfo(id);
		}
		try {
		jsTemp=new JSONObject(info.getSelfData());
		} catch (Exception e) {
				jsTemp=new JSONObject();
		}
		jsTemp.put("canChange", canChange);
		info.setId(id);
		info.setnName(name);
		info.setEnable(enable);
		info.setSelfData(jsTemp.toString());
		DataHelper.instance.savePayType(info);
	jb.put("flag",true);
	jb.put("msg", "保存成功！");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	%>
	<%=
	jb.toString()
	%>