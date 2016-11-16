<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>配置菜单</title>
</head>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<body>
	<%
		UserData data = LandManager.instance.getUser(request);
		if (!data.permissions.contains("MONEY_GET") && (!data.permissions.contains("ALL"))) {
	%>你并没有权限！<%
		return;
		}
	%>
	<div style="width: 100%; background-color: aqua;">
		<label>配置</label>
		<button onclick="sendMouthData()">发送月报</button>
	</div>
	<div>
		<table width="100%">
			<tr>

			</tr>
		</table>
	</div>
	<div>
		<table>
			<tr>
				<th><a href="VIPSet.jsp">VIP策略配置</a></th>
			</tr>
			<tr>
				<th><a href="groupSet.jsp">菜品配置</a></th>
			</tr>
			<th><a href="otherSet.jsp">选项配置</a></th>

			<tr>
				<th><a href="lineSet.jsp">菜单配置</a></th>
			</tr>
			<tr>
				<th><a href="userCreate.jsp">新建操作员</a></th>
			</tr>
			<tr>
				<th><a href="userSet.jsp">修改操作员</a></th>

			</tr>
			<tr>
				<th><a href="payTypeSet.jsp">修改支付方式</a></th>

			</tr>
			<th>
			<a href="../info/fuliPage.jsp">福利查看</a></th>
			<tr>
			<th><a href="giftItemSet.jsp">奖品设置</a></th>
			</tr>
			<tr>
				<th><a href="../info/fuliPage.jsp">福利查看</a></th>

			</tr>
		</table>
	</div>
</body>
<script type="text/javascript">
	function sendMouthData() {
		alert("a");
		$.post("mouthDataOutHelper.jsp", {
			id : 1,
			money : 1

		}, function(data, status) {

			alert(data.trim());

		});
	}
</script>
</html>