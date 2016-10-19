<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.DataReport"%>
<%@page import="java.util.Date"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.MoneyManager"%>
<%@page import="com.sql.mapperBean.TMonegChange"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
<body>
	<%
		try {
			
			
			float moneyTrue = Float.valueOf(request.getParameter("moneyTure"));
			float moneyNeed = Float.valueOf(request.getParameter("moneyNeed"));
			
			TMonegChange lastMoney = MoneyManager.instance.getMoneyLast();
			DataReport.instance.sendLandOutReport(LandManager.instance.landId, lastMoney, moneyNeed, moneyTrue);
			TMonegChange moneyIn = new TMonegChange();
			UserData userData = LandManager.instance.getUser(request);
			try {
				JSONObject jbTemp=new JSONObject(LandManager.instance.landId.getLandInfo());
				JSONArray jl=jbTemp.getJSONArray("onduty_list");
				moneyIn.setChangeUser(jl.toString());
			} catch (Exception e) {
				// TODO: handle exception
				moneyIn.setChangeUser(userData.user.getId());
			}
			
			moneyIn.setMoneyChangeType(2);
			moneyIn.setMoneyChangeTypeName(MoneyManager.instance.getMonetChangeTpye(2));
			moneyIn.setTime(new Date(System.currentTimeMillis()));
			moneyIn.setChangrFlight(new Date(System.currentTimeMillis()));
			moneyIn.setTip(LandManager.instance.landId.getLandInfo());
			moneyIn.setMoneyInit(lastMoney.getMoneyFinish());
			moneyIn.setMoneyChange(moneyNeed-lastMoney.getMoneyFinish());
			moneyIn.setMoneyFinish( moneyNeed);
			MoneyManager.instance.addMoneyChange(moneyIn);
			 lastMoney = MoneyManager.instance.getMoneyLast();
			//差异录入
			moneyIn.setChangeUser(userData.user.getId());
			moneyIn.setMoneyChangeType(3);
			moneyIn.setMoneyChangeTypeName(MoneyManager.instance.getMonetChangeTpye(3));
			moneyIn.setTime(new Date(System.currentTimeMillis()));
			moneyIn.setChangrFlight(new Date(System.currentTimeMillis()));
			moneyIn.setTip(LandManager.instance.landId.getLandInfo());
			try {
				JSONObject jb=new JSONObject(moneyIn.getTip());
				jb.put("tip", request.getParameter("tip"));
				moneyIn.setTip(jb.toString());
			} catch (Exception e) {
				// TODO: handle exception
			}
			moneyIn.setMoneyInit(lastMoney.getMoneyFinish());
			moneyIn.setMoneyChange(moneyTrue-moneyNeed);
			moneyIn.setMoneyFinish(lastMoney.getMoneyFinish() + moneyTrue-moneyNeed);
			MoneyManager.instance.addMoneyChange(moneyIn);
			LandManager.instance.unLand();
		} catch (Exception e) {
			e.printStackTrace();
	%>
	<script type="text/javascript">
		window.close();
	</script>
	<%
		response.sendRedirect("main2.jsp");
		}
	%>
	已退出登陆!
</body>
</html>