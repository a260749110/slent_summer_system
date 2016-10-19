<%@page import="com.data.DataHelper"%>
<%@page import="java.util.TreeSet"%>
<%@page import="com.sql.mapperBean.TMenuLine"%>
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
	resultJs.put("msg", "保存失败");

	try {
	
		int id=Integer.valueOf(request.getParameter("id"));
		String name=request.getParameter("name");
		float price=Float.valueOf(request.getParameter("price"));
		float price_vip=Float.valueOf(request.getParameter("price_vip"));
		int group=Integer.valueOf(request.getParameter("group"));
		String other_choice=request.getParameter("other_choice");
		boolean ticket_flag=Boolean.valueOf(request.getParameter("ticket_flag"));	
		boolean enable=Boolean.valueOf(request.getParameter("enable"));	
	
	TMenuLine line=new TMenuLine();
	
	line.setId(id);
	line.setnName(name);
	line.setCanOff(true);
	line.setIsCombo(false);
	line.setPriceVip(price_vip);
	line.setnPrice(price);
	line.setnGroupId(group);
	line.setTicketFlag(ticket_flag);
	line.setnUnit("份");
	line.setEnable(enable);
	String[] strs=other_choice.split("<_>");
	String choice_jsl="";
	TreeSet<String> set=new TreeSet<String>();
	for(String str:strs)
		{
		String temp=str.replaceAll("\\(.*\\)", "");
			if(set.contains(temp))
			continue;
			if(!choice_jsl.isEmpty())
			{
		
				choice_jsl+=",";
			}
			
			choice_jsl+=temp;
			set.add(temp);
		}
	line.setOtherChoice("["+choice_jsl+"]");
	DataHelper.instance.saveLine(line);
	resultJs.put("flag", true);
	resultJs.put("msg", "保存成功");
	} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}

%>
<%=resultJs.toString()%>