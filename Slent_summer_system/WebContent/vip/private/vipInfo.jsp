<%@page import="com.vip.VipManeger"%>
<%@page import="com.vip.VipInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	VipInfo info = VipManeger.instance.getVipInfo(request);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><%=info.sVip.getName()%>的信息</title>
<!-- links -->
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- //links -->
</head>
<%
	VipInfo vipInfo = VipManeger.instance.getVipInfo(request);
%>
<body class="bg">
	<!-- nav -->
	<jsp:include page="../layout/nav.jsp"></jsp:include>
	<!-- //nav -->
	<!-- logo -->
	<jsp:include page="../layout/logo.jsp"></jsp:include>
	<!-- //logo -->
	<!-- Location -->
	<div class="menu">
		<div class="container">
			<h3 class="agileits_head w3_agileits_head">
				VIP 信息<i class="fa fa-map-marker" aria-hidden="true"></i>
			</h3>
			<div class="agile_contact_grids">
				<div class="w3_agile_contact_grid">
				<div class="div_qiandao">
					<h4>每日签到，签到送积分哦！</h4>
					
					<%if(! vipInfo.signFlag) 
					{
						%>
						<button class="btn_qiandao" onclick="sign()" id="sign">(=ﾟωﾟ)ノ我要签到</button>
						<%	
						}
					else
					{
						%>
					<button class="btn_qiandao" id="signed" disabled="disabled">
						(๑• . •๑)<br>额,今天没啥干了！
					</button>
						<%	
					}%>
				</div>	
			

					<script type="text/javascript">
						function sign() {
				 			$.post("helper/vipSignHelper.jsp", "", function(d,
									s) {
								var data=eval("("+d+")");
							
								if(data.flag)
									{
									location.reload(false);
									}
							})
						}
					</script>

					<!--
					<div class="agileinfo_mail_grids">
						<div class="agileits_w3layouts_contact_grid">
							<p><i class="fa fa-map-marker" aria-hidden="true"></i></p>
						</div>
						<!--  
						<div class="agileits_w3layouts_contact_gridr">
							<p><span>Address</span>1900 Pico Blvd, Santa Monica, NYC 83412</p>
						</div>
						
						<div class="clearfix"></div>
					</div>
				-->

				</div>
				<div class="w3_agile_contact_grid1">
					<h4>个人信息</h4>
					<form action="#" method="post">
						<h4>
							姓名：<%=vipInfo.sVip.getName()%></h4>
						<h4>
							卡内余额：<%=vipInfo.sVip.getMoney()%></h4>
						<h4>
							积分：<%=(long) (vipInfo.sVip.getHistory() * 100)%></h4>
						<textarea name="Message" placeholder="(　　´　・ω・　｀　　) 你不留言盯着我干嘛"
							required=""></textarea>
						<input type="submit" value="保存">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>

	<!-- Location -->




</body>
</html>