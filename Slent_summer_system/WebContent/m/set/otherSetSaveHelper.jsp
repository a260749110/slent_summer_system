<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperXml.TMenuChoice"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
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
	
JSONObject jb=new JSONObject();
jb.put("flag",false);
jb.put("msg", "保存失败");


	try{
	
	int id=Integer.valueOf(request.getParameter("id"));
	String name=(request.getParameter("name"));
	String value=(request.getParameter("value"));
	
	TMenuChoice choice=new TMenuChoice();
	choice.setId(id);
	choice.setName(name);
	choice.setnChoice("["+value+"]");
	DataHelper.instance.saveChoice(choice);
	
	jb.put("flag",true);
	jb.put("msg", "保存成功");
	}
	catch(Exception e)
	{
	e.printStackTrace();

	}



%>
<%=
	jb.toString()
%>