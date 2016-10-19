
<%@page import="com.user.LandManager"%>
<%@page import="com.Config"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

<script src="../js/jquery-1.12.0.min.js"></script>
<style type="text/css">
.login_bg {
	width: 722px;
	height: 402px;
	
}

.login_input {
	display: block;
}

.login_input p {
	margin: 20px;
}

.login_input span {
	padding-right: 20px;
	color: #555;
}

.bottom {
	position: fixed;
	bottom: 0px;
}

input {
	background: #f8f8f8;
	line-height: 20px;
	border: 1px solid #aaa;
	border-radius: 1px;
	padding: 4px;
	font-family: "微软雅黑", "宋体";
	font-size: 14px;
	width: 200px;
}

.forgot {
	position: relative;
	left: 110px;
}

.forgot a {
	font-size: 12px;
	color: #0090ff !important;
}

.forgot a:hover {
	color: red !important;
}
</style>
</head>
<%

%>


<body>

	<div id="header">
		<div class="wrap clearfix">
			<div class="logo">
				<!-- <a href="index.html"><img src="img/dataface_admin_logo.png"></a> -->
			</div>
		</div>
	</div>
	<%
	
	%>
<%if(LandManager.instance.initFlag){ %>

	<div class="play_box">
		<div class="login_cen">
			<div style="background: #53A6E4; width: 100%; height: 30px;"></div>
			<div style="width: 100%; height: 50px;"></div>

			<center>
				<div class="login_bg">
					<div style="width: 100%; height: 120px;"></div>
					<form class="login_input" action="land_comit.jsp" method="post" >
						<p>
							<span>用户名</span><input type="text" name="name" />
						</p>
						<p>
							<span> 密码</span><input type="password" name="password" />
						</p>
						<p class="forgot">
							<a href="">忘记密码？</a>
						</p>
						<input type="submit" value="登录"
							style="background: #53A6E4; width: 100px; height: 40px; border: none; border-radius: 3px; color: #fff;">
					</form>
				</div>
			</center>

			<!-- 底部 -->
			<div class="bottom">
				<center>
					<div class="copyright">
						<div style="width: 100%; height: 17px;"></div>
						<div><%=Config.Version  %></div>
						<!-- <div class="tag">2012-2016 © LineOrange All Rights Reserved.</div> -->
					</div>
				</center>
			</div>

		</div>
	</div>
<% }else{ %>
<div>数据库暂未初始化成功，请5秒后刷新浏览器</div>
<% } %>
</body>
</html>