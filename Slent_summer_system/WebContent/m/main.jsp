<%@page import="com.sql.mapperXml.TMenuGroup"%>
<%@page import="com.page.data.MainPageData"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>诺亚系统</title>
<script src="../js/jquery-1.12.0.min.js"></script>
<script src="main.js"></script>

<link href="main.css" rel="stylesheet" type="text/css" />

<script>
	function tick() {
		var years, months, days, hours, minutes, seconds;
		var intYears, intMonths, intDays, intHours, intMinutes, intSeconds;
		var today;
		today = new Date(); //系统当前时间
		intYears = today.getFullYear(); //得到年份
		intMonths = today.getMonth() + 1; //得到月份
		intDays = today.getDate(); //得到日期
		intHours = today.getHours(); //得到小时 
		intMinutes = today.getMinutes(); //得到分钟
		intSeconds = today.getSeconds(); //得到秒钟
		years = intYears + "-";

		if (intMonths < 10) {
			months = "0" + intMonths + "-";
		} else {
			months = intMonths + "-";
		}
		if (intDays < 10) {
			days = "0" + intDays + " ";
		} else {
			days = intDays + " ";
		}
		if (intHours == 0) {
			hours = "00:";
		} else if (intHours < 10) {
			hours = "0" + intHours + ":";
		} else {
			hours = intHours + ":";
		}
		if (intMinutes < 10) {
			minutes = "0" + intMinutes + ":";
		} else {
			minutes = intMinutes + ":";
		}
		if (intSeconds < 10) {
			seconds = "0" + intSeconds + " ";
		} else {
			seconds = intSeconds + " ";
		}
		timeString = years + months + days + hours + minutes + seconds;
		Clock.innerHTML = timeString;
		window.setTimeout("tick();", 1000);
	}
	window.onload = tick;
</script>
</head>

<body>
	<%
		try {
	%>
	<%
		MainPageData mainPageData = (MainPageData) request.getSession()
		.getAttribute("MainPageData");
		if (mainPageData == null) {
			mainPageData = new MainPageData();
			request.getSession().putValue("MainPageData", mainPageData);
		}
	%>


	<div class="bg" align="center">
		<div id="wrap">
			<div id="left">
				<p>已点</p>

				<ol>
					<li class="item">
						<button id="add" class="btnAdd">添加</button>

						<button id="delete" class="btnAdd">删除</button>
					</li>
				</ol>
			</div>
			<div id="center">
				<p>菜品</p>
			
				<%
					for(TMenuGroup group:mainPageData.groupList)
						if(group.getEnable())
						{
				%>

				<input class="button1" name="nBtnCp" type="button" id="btn1"
					value="<%=group.getnName()%>" data-gid="<%=group.getId()%>" />

				<%
					}
				%>
					<script type="text/javascript">
				var n_group=[];
					<%
					for(TMenuGroup group:mainPageData.groupList)
						if(group.getEnable())
						{
				%>
				n_group.push({
					"id":<%=group.getId()%>,
					"data":<%=mainPageData.getLineJSArryFromGroup(group.getId())%>
				});
				<%}%>
				
					
				</script>

			</div>
			<div id="right">
            <div id="rignt_top">
				<p>名称</p>
				 
			</div>
			<div id="rignt_btm">
				<input class="button_btm" name="" type="button" value="提交!" /> 
			</div>
				<div id="rignt_btm_btm">
				<input class="button_btm_btm" name="" type="button" value="提交!!!" /> 
			</div>
            </div>
		</div>
	</div>
	<div class="pay" id="payItem" align="right">
		<div>
			金额:<input name="amount" type="text" value="0000.00" size="10"
				maxlength="7" readonly /><input class="button1" name=""
				type="submit" value="收款" />
		</div>
	</div>
	<div class="foot" id="footItem">
		<input class="button3" type="submit" value="点餐" /> <input
			class="button1" name="" type="submit" value="清单" /> <input
			class="button1" name="" type="submit" value="会员办理" /> <input
			class="button1" name="" type="submit" value="交班" /> <input
			class="button1" name="" type="submit" value="营业额" />
		<div class="time">
			时间：<span id="Clock"></span>
		</div>
		<div class="clear"></div>
		<script language="javascript">
		var n_choice=<%=mainPageData.getAllChoiceJSArryFromGroup()%>;
			var n_onWindowsChangCb = [];// 页面大小改变回调函数队列；
			var n_onWindowsLoadCb = [];
			function windowsChangCB(obj) {

				for (var i = 0; i < n_onWindowsChangCb.length; i++) {
					n_onWindowsChangCb[i]();
				}

			}
			n_onWindowsLoadCb.push(window.onload);
			n_onWindowsLoadCb.push(function() {
				window.onresize = windowsChangCB;
				windowsChangCB();
			});
			n_onWindowsLoadCb.push(init);
			window.onload = function() {

				for (var i = 0; i < n_onWindowsLoadCb.length; i++) {

					n_onWindowsLoadCb[i]();
				}
			};

			n_onWindowsChangCb.push(function() {
				var temp = $(window).height() - $('#payItem').height()
						- $('#footItem').height();

				$('#wrap').height(temp - 160);

				$("#n_selected").height($('body').height());
			});
		</script>
	</div>
	<%
		} catch (Throwable t) {
		t.printStackTrace();
			}
	%>
</body>
</html>