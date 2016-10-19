<%@page import="java.sql.Time"%>
<%@page import="com.sql.mapperBean.TUser"%>
<%@page import="com.data.DataHelper"%>
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

%>
<%
	JSONObject resultJb=new JSONObject();
	resultJb.put("flag", false);
	resultJb.put("msg", "注册失败！");
	
	try {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String passw=request.getParameter("passw");
		boolean enable= Boolean.valueOf( request.getParameter("enable"));
		if(DataHelper.instance.testUser(id))
		{
		resultJb.put("flag", false);
		resultJb.put("msg", "该账号已存在！");
		}
		else
		{
		TUser user=new TUser();
		user.setCreateTime(new Time(System.currentTimeMillis()));
		user.setId(id);
		user.setName(name);
		user.setPassw(passw);
		user.setEnable(enable);
		DataHelper.instance.saveUser(user);
		resultJb.put("flag", true);
		resultJb.put("msg", "新建成功");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
%>
<%=resultJb.toString()%>