<%@page import="com.data.ENoahTitlesKey"%>
<%@page import="com.data.DataHelper"%>
<%@page import="javax.activation.DataHandler"%>
<%@page import="javax.sound.midi.MidiDevice.Info"%>
<%@page import="com.vip.VipManeger"%>
<%@page import="com.vip.VipInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>会员抽奖</title>
<!-- links -->
<jsp:include page="../layout/links.jsp"></jsp:include>
<!-- //links -->
<link rel="stylesheet" type="text/css" href="PrizeDraw1/css/main.css">
<jsp:include page="PrizeDraw1/mainJs.jsp"></jsp:include>


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
	<!-- banner -->



	<div>
	<h4 class="myIntegral" id="myIntegral">我的积分：<%=((long)(vipInfo.sVip.getHistory()*100)) %></h4> 
	 
	<h4 class="needIntegral">每次抽需要积分：<%=DataHelper.instance.getTitleData(ENoahTitlesKey.prize_draw1_use.getKey()).getnValue()%></h4>
	</div>


	<div class="turnplate_box" style="left: auto;right: auto;">
		<canvas id="myCanvas" width="300px" height="300px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas01" width="200px" height="200px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas03" width="200px" height="200px">抱歉！浏览器不支持。</canvas>
		<canvas id="myCanvas02" width="150px" height="150px">抱歉！浏览器不支持。</canvas>
		<button id="tupBtn" class="turnplatw_btn"></button>
	</div>
	<!-- 更改系统默认弹窗 -->
	
	<script type="text/javascript">
		window.alert = function(str) {
			var shield = document.createElement("DIV");
			shield.id = "shield";
			shield.style.position = "absolute";
			shield.style.left = "50%";
			shield.style.top = "50%";
			shield.style.width = "280px";
			shield.style.height = "150px";
			shield.style.marginLeft = "-140px";
			shield.style.marginTop = "-110px";
			shield.style.zIndex = "25";
			var alertFram = document.createElement("DIV");
			alertFram.id = "alertFram";
			alertFram.style.position = "absolute";
			alertFram.style.width = "280px";
			alertFram.style.height = "150px";
			alertFram.style.left = "50%";
			alertFram.style.top = "50%";
			alertFram.style.marginLeft = "-140px";
			alertFram.style.marginTop = "-110px";
			alertFram.style.textAlign = "center";
			alertFram.style.lineHeight = "150px";
			alertFram.style.zIndex = "300";
			strHtml = "<ul style=\"list-style:none;margin:0px;padding:0px;width:100%\">\n";
			strHtml += " <li style=\"background:#005a4e;text-align:left;padding-left:20px;font-size:14px;font-weight:bold;height:25px;line-height:25px;border:1px solid #F9CADE;color:white\">[中奖提醒]</li>\n";
			strHtml += " <li style=\"background:#1b725c;text-align:center;font-size:12px;height:95px;line-height:95px;border-left:1px solid #F9CADE;border-right:1px solid #F9CADE;color:#DCC722\">"
					+ str + "</li>\n";
			strHtml += " <li style=\"background:#005a4e;text-align:center;font-weight:bold;height:30px;line-height:25px; border:1px solid #F9CADE;\"><input type=\"button\" value=\"确 定\" onclick=\"doOk()\" style=\"width:80px;height:20px;background:#626262;color:white;border:1px solid white;font-size:14px;line-height:20px;outline:none;margin-top: 4px\"/></li>\n";
			strHtml += "</ul>\n";
			alertFram.innerHTML = strHtml;
			document.body.appendChild(alertFram);
			document.body.appendChild(shield);
			this.doOk = function() {
				alertFram.style.display = "none";
				shield.style.display = "none";
			}
			alertFram.focus();
			document.body.onselectstart = function() {
				return false;
			};
		}
	</script>

</body>
</html>