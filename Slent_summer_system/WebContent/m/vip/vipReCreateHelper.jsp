<%@page import="org.json.JSONArray"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.SVip"%>
<%@page import="java.util.List"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.vip.SSVipManager"%>
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
%>
<%
	JSONObject resultJs=new JSONObject();
	resultJs.put("flag", false);
	resultJs.put("msg", "失败！");

%>
<%
	String type=request.getParameter("type");
	if(type.equals("reCreate"))
	{
		long id=Long.valueOf(request.getParameter("id"));
		String passw=request.getParameter("passw");
		long newId=Long.valueOf(request.getParameter("newId"));
		if(SSVipManager.instance.reCreateVip(id, newId, passw, true))
		{
		resultJs.put("flag", true);
		resultJs.put("msg", "成功");
		}
	}else
	if(type.equals("reCreateNoPassw"))
	{
	
		UserData data=LandManager.instance.getUser(request);
		if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
		{
				resultJs.put("flag", false);
				resultJs.put("msg", "失败，你没有权限！");
		}
		else{
				long id=Long.valueOf(request.getParameter("id"));
				String passw=request.getParameter("passw");
				long newId=Long.valueOf(request.getParameter("newId"));
				if(SSVipManager.instance.reCreateVip(id, newId, passw, false))
				{
					resultJs.put("flag", true);
					resultJs.put("msg", "成功");
				}
			}
	}else
	if(type.equals("changePassw"))
	{
	
	
				long id=Long.valueOf(request.getParameter("id"));
				String passw=request.getParameter("passw");
				String passwNew=request.getParameter("passwNew");
				if(SSVipManager.instance.changePassw(id, passw, passwNew))
				{
					resultJs.put("flag", true);
					resultJs.put("msg", "成功");
				}
			
	}
	else
	if(type.equals("selectByNameOrPhone"))
	{
	
	
			
				String name=request.getParameter("name");
				String phone=request.getParameter("phone");
				List<SVip> list=SSVipManager.instance.selectVipDataByNameOrPhone(name, phone);
				JSONArray jl=new JSONArray();
			for(SVip sVip:list)
			{
			jl.put(sVip.getId());
			}
				resultJs.put("flag", true);
			resultJs.put("msg", jl);	
			
	}
	

%>
<%=resultJs.toString()%>