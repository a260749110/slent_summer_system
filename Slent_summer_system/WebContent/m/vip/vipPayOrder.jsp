<%@page import="com.unit.PrintTicketTool"%>
<%@page import="com.data.DataHelper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.unit.Tool"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.user.vip.VipPay"%>
<%@page import="com.sql.mapperBean.SVip"%>
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
JSONObject resultJs=new JSONObject();
String vip_id=request.getParameter("vip_id");
String vip_passW=request.getParameter("vip_passW");
String vip_key=request.getParameter("vip_key");
String bookNum=request.getParameter("bookNum");
System.err.println(vip_id+"  "+vip_key+" "+bookNum+"  "+vip_passW);

Object object=request.getSession().getAttribute(vip_key);
VipPay vipPay=null;
if(object!=null &&object instanceof VipPay)
{
	vipPay=(VipPay)object;

	try
	{
	vipPay.pb.bookNumber=bookNum;
		long id=Long.valueOf(vip_id);
		SVip sVip=SSVipManager.instance.getVipData(id);
		if(sVip==null)
		{
				resultJs.put("flag", false);
				resultJs.put("msg", "账号错误");
		}
		else{
		if(!sVip.getPassW().equals(vip_passW))
			{
				resultJs.put("flag", false);
				resultJs.put("msg", "密码错误");
			}
			else{
		
				if(sVip.getMoney()<	vipPay.allMoney)
				{
					resultJs.put("flag", false);
				resultJs.put("msg", "金钱不足");
				}
				else
				{
					resultJs.put("flag", true);
					resultJs.put("msg", "消费成功");
					
					ArrayList<String> tickets=vipPay.pb.getTick();

		DataHelper.instance.saveSellInfo(vipPay.pb);
		SSVipManager.instance.useMoney(sVip, vipPay.allMoney);
		int i=0;
		for(String ticket:tickets){
			i++;if(i>3)
			{
				i=0;
		
			}
	PrintTicketTool.print(ticket);
	}
					
					
					Tool.print("--------------夏不语------------\r\n"+"wifi:xby2016512"+
"\r\n"+vipPay.getCutoffData()+"\r\n\r\n\r\n");
					
					
				}
			}
		}
		}
	catch(Exception e)
	{
	e.printStackTrace();
	resultJs.put("flag", false);
	resultJs.put("msg", "请填写正确信息");
	}

}
else
{
resultJs.put("flag", false);
resultJs.put("msg", "未知错误");
}

%>
<%=resultJs.toString()%>