<%@page import="org.json.JSONObject"%>
<%@page import="java.util.Date"%>
<%@page import="com.user.MoneyManager"%>
<%@page import="com.sql.mapperBean.TMonegChange"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
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
UserData data=LandManager.instance.getUser(request);
if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
{
	%>你并没有权限！<%
	return ;}

%>

<%
Integer saveId=Integer.valueOf(request.getParameter("saveId").trim());
if(!MoneyManager.instance.canSave(saveId))
{
	%>
	<div>保存失败</div>
	<%
	return ;}
try{
int changeType	=Integer.valueOf( request.getParameter("changeType") ) ;
float money_get	= Float.valueOf(request.getParameter("money_get") );
TMonegChange lastMoney = MoneyManager.instance.getMoneyLast();
TMonegChange moneyIn = new TMonegChange();
UserData userData = LandManager.instance.getUser(request);
moneyIn.setChangeUser(userData.user.getId());
moneyIn.setMoneyChangeType(changeType);
moneyIn.setMoneyChangeTypeName(MoneyManager.instance.getMonetChangeTpye(changeType));
moneyIn.setTime(new Date(System.currentTimeMillis()));
moneyIn.setChangrFlight(new Date(System.currentTimeMillis()));
moneyIn.setTip(LandManager.instance.landId.getLandInfo());
try {
	JSONObject jb=new JSONObject(moneyIn.getTip());
	System.err.print( request.getParameter("tip"));
	jb.put("tip", request.getParameter("tip"));
	moneyIn.setTip(jb.toString());
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
moneyIn.setMoneyInit(lastMoney.getMoneyFinish());
moneyIn.setMoneyChange(money_get);
moneyIn.setMoneyFinish(lastMoney.getMoneyFinish() - money_get);

MoneyManager.instance.addMoneyChange(moneyIn);
MoneyManager.instance.removeSaveId(saveId);
%>
<div>成功</div>
<%
}
catch(Exception e){
	%>
	<div>保存失败</div>
	<%
}%>
<script type="text/javascript">

</script>
</body>
</html>