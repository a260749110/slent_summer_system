<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TUser"%>
<%@page import="javax.swing.text.StyledEditorKit.BoldAction"%>
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
	JSONObject resultJs=new JSONObject();
	resultJs.put("flag", false);
	resultJs.put("msg", "修改失败");
	try {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String passw=request.getParameter("passw");
		boolean enable=Boolean.valueOf(request.getParameter("enable"));
		
		TUser user=new TUser();
		user.setId(id);
		user.setName(name);
		user.setEnable(enable);
		if(passw!=null&&passw.length()>3)
		user.setPassw(passw);
		DataHelper.instance.saveUser(user);
		resultJs.put("flag", true);
	resultJs.put("msg", "修改成功");
	} catch (Exception e) {
		// TODO: handle exception
		
		e.printStackTrace();
	}
	
	%>
	<%=resultJs.toString()%>