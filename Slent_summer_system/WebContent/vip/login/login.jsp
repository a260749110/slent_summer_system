<%@page import="com.vip.VipManeger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="application/xhtml+xml; charset=utf-8" />
<meta http-equiv="Cache-control" content="no-cache" />
<meta name="viewport"
	content="width=device-width; initial-scale=1.0;  minimum-scale=1.0; maximum-scale=1.0; user-scalable=no;" />
<meta name="MobileOptimized" content="240" />
<meta name="Iphone-content" content="320" />
<meta name="format-detection" content="telephone=no" />
<meta name="keywords" content="" />
<meta name="description" content="夏不语" />

<title>VIP登陆</title>



<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/forum.css" />
<link rel="stylesheet" type="text/css" href="css/portal.css" />
<!--//登录与注册页配色代码 -->
<style type="text/css">
body {
	background: #A4D853;
}

.login_s {
	padding: 18px 0px;
	background: url(images/login_bg3.jpg) repeat-x 50% 5px;
	background-size: auto 154px;
	overflow: hidden;
}

.ser a {
	color: #fff;
}

.ipc {
	border: none;
}
</style>
</head>
<body>
	<%
		VipManeger.instance.login(request, response,out);
	%>
	<div class="login_s">
		<div class="logo_in">
			<a href="javascript:void(0)">夏不语VIP</a>
		</div>
		<div class="login_ct">
			<div class="ipc lgs">
				<div class="lgst mbm">

					<span class="xg3">没有账号? 现在消费满25免费送会员卡哦！</span>
				</div>

				<form method="post" action="">
					<input type="hidden" name="formhash" id="formhash" value='aff87699' />
					<input type="hidden" name="referer" id="referer" value="" />
					<p>
						<span>VIP账号</span><input type="text" name="name"
							id="username_LWda3" />
					</p>
					<p>
						<span>密码</span><input type="password" name="passw"
							id="password3_LWda3" value='' />
					</p>



					<label style="display: none;"><input type="checkbox"
						name="cookietime" id="cookietime_LWda3" value="2592000"
						checked="checked" />自动登录</label>

					<div class="inbox mtn lgs_inp">
						<input type="submit" name="submit" id="submit" value="登录"
							class="ibt" /> <input type="reset" value="重填" class="ibt y" />
					</div>

				</form>
			</div>

			<script src="js/md5.js?Sk9" type="text/javascript" reload="1"></script>
		</div>
		<div class="ser">
			<a href="../home.jsp" class="z">返回首页</a>
		</div>
	</div>

	<script type="text/javascript">
		function mys(id) {
			return !id ? null : document.getElementById(id);
		}
		function openmys(tag, s) {
			if (tag.className || s) {
				tag.className = '';
			} else {
				tag.className = 'a';
			}
		}
	</script>
	<script type="text/javascript">
		var cpro_id = "u2671677";
	</script>

</body>
</html>