<%@page import="com.user.vip.SSVipManager.RefereeGive"%>
<%@page import="com.sql.mapperBean.SVip"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperXml.TNoahTitlesWithBLOBs"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@page import="java.util.Map"%>
<%@page import="org.json.JSONObject"%>
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
	JSONObject jb=new JSONObject();
	try
		{
		long id=Long.valueOf(request.getParameter("id"));
		float money=Float.valueOf(request.getParameter("money"));

				TNoahTitlesWithBLOBs titlesWithBLOBs=DataHelper.instance.getTitleData("vip_recharge");
		
		JSONObject jbd=new JSONObject(titlesWithBLOBs.getnValue());
		
		Map<String,String> dataMap=SSVipManager.instance.tranceJsonobj2Map(jbd);
		

	String give=dataMap.get(((int)money)+"");
			
		float moneyGet=0f;
		
			
		if(give!=null)
		{
	
	moneyGet=Float.valueOf(give);
		
		}
		else 
		{
		String other=dataMap.get("other");
		
		if(other!=null)
		{
		
			float rate=Float.valueOf(other);
	
		moneyGet=money*rate;
		}
		}
		
		String payTypeStr=request.getParameter("payType");
		int payType=Integer.valueOf(payTypeStr);
		SVip sVip=SSVipManager.instance.getVipData(id);
		if(sVip==null)
		{
		jb.put("flag", false);
		jb.put("msg", "充值失败，请输入正确的账号");
		}
	else
	{
		sVip=SSVipManager.instance.rechargeVipMoney(sVip, money, moneyGet, payType);
		RefereeGive referee= SSVipManager.instance.giveVipRefree(sVip, money);
		
		
		jb.put("flag", true);
		String msg="充值成功，充值金额："+money+" ,赠送 ："+moneyGet+" ，余额："+sVip.getMoney();
		if(referee!=null)
		{
		msg+="\r\n 赠送："+referee.sVip.getId()+"  金额："+referee.money+"  余额"+referee.sVip.getMoney();
		}
		jb.put("msg",msg );
		}
		}
	catch(Exception e)
		{
		e.printStackTrace();
		jb.put("flag", false);
		jb.put("msg", "请输入正确的注册信息");
		}	
%>
<%=jb.toString() %>