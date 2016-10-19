<%@page import="com.user.MoneyManager"%>
<%@page import="com.sql.mapperBean.TMoneyChangeType"%>
<%@page import="java.util.List"%>
<%@page import="com.user.PermissionsManager"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>提款</title>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}%>
</head>
<body>
<%
UserData data=LandManager.instance.getUser(request);
if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
{
	%>你并没有权限！<%
	return ;}
%>
<div> 提款人： <%=data.user.getName() %></div>
<div>
提款方式：
<%
List<TMoneyChangeType> types=MoneyManager.instance.getMoneyGetType();
%>
<form action="money_get_save.jsp"  method="post"><select name="changeType">
<%for(TMoneyChangeType type:types) {%>
<option value="<%=type.getMoneyChangeId()%>"><%=type.getMonetChangeType() %></option>
<%} %>
</select>
金额：<input type="text" name="money_get" value="">


<input type="submit" value="保存">
<input type="text" name="saveId" readonly="readonly"  style="visibility: hidden;" value="<%=MoneyManager.instance.getSaveId()  %> " >

<div>

</div>
<div >
<b style="vertical-align: top;">备注:</b><textarea name="tip" rows="20" cols="60"></textarea>
</div>
</form>

</div>
</body>


</html>