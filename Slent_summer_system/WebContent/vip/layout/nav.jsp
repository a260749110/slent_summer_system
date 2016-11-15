<%@page import="com.vip.VipManeger"%>
<%@page import="com.vip.VipInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	VipInfo vipInfo = VipManeger.instance.getVipInfo(request);
%>
<div class="nav_main">
	<div class="overlay"></div>
	<div class="mobile-side-menu">
		<ul>
			<li
				<%=(request.getServletPath().contains("home.jsp")) ? "class='active'" : ""%>><a
				href="<%=request.getContextPath() + "/vip/"%>home.jsp"><i
					class="fa fa-home" aria-hidden="true"></i>首页</a></li>
			<li><a href="menu.html"><i class="fa fa-compass"
					aria-hidden="true"></i>Our Food</a></li>
			<li><a href="blog.html"><i class="fa fa-picture-o"
					aria-hidden="true"></i>Blog</a></li>
			<li><a href="team.html"><i class="fa fa-users"
					aria-hidden="true"></i>Our Chef</a></li>
			<%
				if (vipInfo.isLogin) {
			%>
			<li
				<%=(request.getServletPath().contains("private/vipInfo.jsp")) ? "class='active'" : ""%>><a
				href="<%=request.getContextPath() + "/vip/"%>private/vipInfo.jsp"><i
					class="fa fa-dashcube" aria-hidden="true"></i>会员信息</a></li>
			<li  <%=(request.getServletPath().contains("private/vipPrizeDraw.jsp")) ? "class='active'" : ""%>><a
				href="<%=request.getContextPath() + "/vip/"%>private/vipPrizeDraw.jsp"><i
					class="fa fa-compass" aria-hidden="true"></i>积分抽奖</a></li>
			<li <%=(request.getServletPath().contains("private/myGift.jsp")) ? "class='active'" : ""%>><a
				href="<%=request.getContextPath() + "/vip/"%>private/myGift.jsp"><i
					class="fa fa-snapchat" aria-hidden="true"></i>我的奖品</a></li>
					
			<%
				}
			%>
			<li><a href="icons.html"><i class="fa fa-random"
					aria-hidden="true"></i>Web Icons</a></li>
			<li><a href="contact.html"><i class="fa fa-map-marker"
					aria-hidden="true"></i>Location</a></li>
			<li><a href="sign-in.html"><i class="fa fa-sign-in"
					aria-hidden="true"></i>Sign In</a></li>
		</ul>
	</div>
	<div class="navbar">
		<div class="agile_container">
			<div class="w3_agile_nav_main_left">
				<div class="toggleMenu">
					<a href="#"> Menu </a>
				</div>
			</div>
			<div class="w3_agile_nav_main_right">

				<ul class="wthree_social_icons">
					<li><a href="javascript:void(0);" class="w3_agileits_facebook"><i
							class="fa fa-gittip" aria-hidden="true"></i></a></li>
					<%
						if (vipInfo.isLogin) {
					%>
					<li>尊贵的VIP：<%=vipInfo.sVip.getName()%>
					</li>
					<%
						} else {
					%>
					<li><a style="background: none;"
						href="<%=request.getContextPath() + "/vip/"%>login/login.jsp">登陆</a></li>
					<%
						}
					%>


				</ul>


			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<script type="text/javascript"
	src="<%=request.getContextPath() + "/vip/"%>js/slide-from-top.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.mobile-side-menu').slideFromTop({
			menuBtn : $('.toggleMenu'),
			navbar : $('.navbar'),
			menuSpeed : 500,
			bodyOverlay : $('.overlay')
		});
	});
</script>