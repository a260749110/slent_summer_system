<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.data.DataHelper.ChoiceData"%>
<%@page import="com.unit.Tool"%>
<%@page import="com.data.DataHelper.LineData"%>

<%@page import="com.data.DataHelper"%>
<%@page import="com.data.DataHelper.MenuData"%>
<%@page import="java.util.Map"%>
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
<script src="../js/lib.js"></script>
<script src="silent_summer.js"></script>


<link href="main.css" rel="stylesheet" type="text/css" />

<script>
	function tick() {
	
	
	}
	window.onload = tick;
</script>
</head>
<%
	if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}

UserData ud=LandManager.instance.getUser(request);
%>


<body>
	<%
		try {
	%>
	<%
		Map<Integer,MenuData> menuMap=DataHelper.instance.getMenuDataMap();
		List<TMenuPaymentInfo> payList=DataHelper.instance.getPayInfoList();
	%>
	<script type="text/javascript">
var menuMap=new Map();

<%for (MenuData data:menuMap.values())
{%>
	var group_<%=data.group.getId()%>={
			name:"<%=data.group.getnName()%>",
			id:"<%=data.group.getId()%>",
			lines:new Map()
	};	

	<%for(LineData line:data.lines.values())
	{%>
		var lineData=<%=Tool.objToJsObj(line.line)%>;
		lineData.choice=[];
		<%for(ChoiceData choiceData:line.choiceMap.values())
		{%>
			var c_temp=[];
			
			<%for(String str:  choiceData.datas)
			{%>
				
				c_temp.push('<%=str%>');
				<%}%>
			lineData.choice[lineData.choice.length]=c_temp;
		
			<%}%>
	
		group_<%=data.group.getId()%>.lines.put(<%=line.line.getId()%>, lineData);
		
		<%}%>
	menuMap.put('<%=data.group.getId()%>', group_<%=data.group.getId()%>
		);
	<%}%>
		
	</script>

	<div class="bg" align="center">
		<div id="wrap">
			<div id="left">
				<p>已点</p>

				<ol id='selected' data-test="aa">


				</ol>
			</div>
			<div id="center">
				<p>菜品</p>

				<%
					for(MenuData group:menuMap.values())
							{
				%>

				<input style="background-color: white;" class="button1"
					name="group_<%=group.group.getId()%>" type="button" id="btn1"
					value="<%=group.group.getnName()%>"
					data-gid="<%=group.group.getId()%>"
					onclick="selectGroup('<%=group.group.getId()%>')" />

				<%
					}
				%>


			</div>

			<div id="right">
				<div style="height: 100%; display: none;"">
					<div class="rignt_top">
						<p>名称</p>

					</div>


					<div id="rignt_btm  ">
						<input class="button_btm" name="" type="button" value="提交!" />
					</div>

					<div id="rignt_btm_btm">
						<input class="button_btm_btm" name="" type="button" value="选择" />
					</div>
				</div>
				<%
					for (MenuData data:menuMap.values())
						{
				%>
				<div style="height: 100%; display: none;"
					name="group_line_<%=data.group.getId()%>">
					<div class="rignt_top">
						<p>名称</p>
						<%
							for(LineData lineData:data.lines.values())
								 {
						%>
						<input style="background-color: white;" type="button"
							name="line_<%=lineData.line.getId()%>"
							value="<%=lineData.line.getnName()%>"
							onclick="selectLine('<%=data.group.getId()%>','<%=lineData.line.getId()%>')">
						<%
							}
						%>
					</div>

					<%
						for(LineData lineData:data.lines.values())
							 {
					%>
					<div name="line_choice_<%=lineData.line.getId()%>"
						style="display: none; height: 100%;">
						<div class="rignt_btm">
							<%
								for(ChoiceData choiceData:lineData.choiceMap.values())
										 {
											 for(int i=0;i<choiceData.datas.length;i++)
											 {
												 String str=choiceData.datas[i];
							%>

							<input class="button_choice"
								name="choice_<%=data.group.getId()+"_"+lineData.line.getId()+"_"+choiceData.choice.getId()+"_"+i%>"
								type="button" value="<%=str%>"
								onclick="selectChoice('<%=data.group.getId()%>','<%=lineData.line.getId()%>','<%=choiceData.choice.getId()%>','<%=i%>','<%=str%>')" />

							<%
								}
										 }
							%>
						</div>

						<div class="rignt_btm_btm">
							<input class="button_btm_btm" name="" type="button" value="选择"
								onclick="selectAdd()" />
						</div>
					</div>
					<%
						}
					%>

				</div>
				<%
					}
				%>
			</div>
		</div>
	</div>
	<div class="pay" id="payItem" >
	<%if(!LandManager.instance.testOnduty(ud.user.getName())) {%>
	<div style=" position:absolute; left: 10px" >

	登陆人：<%=ud.user.getName() %> <input class="button1" name=""
				type="button" value="签到" onclick="onDuty('<%=ud.user.getName() %>')" />
</div>
	<%
	} %>
		<div style="text-align: right;" >
	
		<input
				class="button1" name="cutoff" type="button" value="打折"
				onclick="showCutoff()" />
			金额:<input name="amount" type="text" value="0000.00" size="10"
				maxlength="7" readonly /><input class="button1" name=""
				type="button" value="收款" onclick="sendOrder()" /> <input
				class="button1" name="vip_pay" type="button" value="会员支付"
				onclick="sendVIPOrder()" />
				 <input
			class="button1" name="" type="button" value="改单" onclick="window.open('set/changeSellInfo.jsp','big','fullscreen=yes')"  />
		</div>
	</div>
	<div class="foot" id="footItem">
		<input class="button3" type="button" value="办理会员"
			onclick="window.open('vip/reg_vip.jsp','big','fullscreen=yes')" /> <input
			class="button1" name="" type="button" value="会员充值" onclick="window.open('vip/vipRecharge.jsp','big','fullscreen=yes')"  /> 
			 <input
			class="button1" name="" type="button" value="设置页面" onclick="window.open('set/menu_set.jsp','big','fullscreen=yes')"  />
			<input
			class="button1" name="" type="button" value="会员办理"
			style="display: none;" disabled="disabled" /> 
			<input class="button1"
			name="" type="button" value="交班"
			onclick="window.open('land_out.jsp','big','fullscreen=yes')" /> 
			<input
			class="button1" name="" type="button" value="提款"
			onclick="window.open('money_get.jsp','big','fullscreen=yes')" />
		<div class="time">
			操作员：<span id="Clock"><%=LandManager.instance.getOnlandId()%></span>
		</div>
		<div class="clear"></div>
		<div id="payBlock"
			style="width: 100%; height: 85%; display: block; position: absolute; top: 15%; left: 0%; background-color: white; text-align: center;">
			<div style="width: 100%; height: 20%"></div>

			<div
				style="white-space: nowrap; background-color: gray; text-align: left; margin-left: 5%; margin-right: 5%; padding-left: 10%; width: 80%; color: #fff;">
				<label>金额:</label> <input style="" name="need_money" type="text"
					value="0000.00" size="10" maxlength="7" readonly /> <label
					style="margin-left: 50px; color: #fff;">收款</label> <input
					type="text" id="i_pay_get" name="pay_get" value="0"
					onchange="give_change()" style="width: 10%"> <label
					style="margin-left: 50px; color: #fff;">找零</label> <input
					type="text" name="change_money" value="0" readonly="readonly"
					style="width: 10%"> <label
					style="margin-left: 50px; color: #fff;">餐牌号：</label> <input
				 id="i_bookNumber" 	type="text" name="bookNumber" value=""
					style="width: 10%">
			</div>
			<div style="width: 100%; height: 10%;"></div>

			<div style="width: 90%; margin-left: 5%; border-color: gray;">
				<%
					for(TMenuPaymentInfo info:payList)
					{
					if(!info.getEnable()||info.getId()<=0)
					continue;
				%>
				<button
					style="width: 15%; height: 10%; margin-top: 1%; font-size: 14px;"
					onclick="pay('<%=info.getId()%>')">
					<%=info.getnName()%>
				</button>
				<%
					}
				%>
			</div>
			<div style="width: 100%; text-align: center; padding-top: 10px;">
				<button onclick="hidePay()">关闭</button>
			</div>
		</div>


		<div id="vipPayBlock"
			style="width: 100%; height: 85%; display: block; position: absolute; top: 15%; left: 0%; background-color: white; text-align: center;">
			<div>
				应支付金额： <input style="" name="need_money" type="text" value="0000.00"
		
		
					size="10" maxlength="7"  readonly="readonly" />
					餐牌号： <input
					id="i_bookNumber" type="text" name="vip_bookNumber" value=""
					>
		
			打折后金额<input style="" name="cutoff_true_money" type="text" value="0000.00"
			size="10" maxlength="7"  readonly="readonly" />
				</div>
	<div>
	
	<div> 会员卡号: <input style="" name="vip_id" type="text" value=""
			size="10" maxlength="7" onkeydown="queryMoney()" onchange="onVipIdChange()"  />
			余额: <input style="" name="vip_money" type="text" value=""
			size="10" maxlength="7"   readonly="readonly"/>
			密码：<input style="" name="vip_passW" type="password" value=""
			size="10" maxlength="70" onkeydown="passWEnter()" /> 
	</div>
			<button name="vip_pay_btn" onclick="vipPay()">确定消费</button>
			<button onclick="closeVIPBlock()">关闭</button>
		</div>
		</div>
		
		
			<div id="cutOffBock"
			style="width: 100%; height: 85%; display: block; position: absolute; top: 15%; left: 0%; background-color: white; text-align: center;">
			<div>
				<button onclick="addCutoff('50');">半价</button>
				<input  id="otherCutoff" name="otherCutoff"  value="" type="text" >%
				<button onclick="addCutoffOther();">其他折扣</button>
				</div>
				<div>
				<button onclick="hideCutoff();">关闭</button>
				</div>
	</div>
	</div>

	<script language="javascript">
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

		window.onload = function() {

			for (var i = 0; i < n_onWindowsLoadCb.length; i++) {

				n_onWindowsLoadCb[i]();
			}
		};

		n_onWindowsChangCb.push(function() {
			var temp = $(window).height() - $('#payItem').height()
					- $('#footItem').height();

			$('#wrap').height(temp - 32);

			$("#n_selected").height($('body').height());
		});
	</script>
	<script type="text/javascript">
	String.prototype.trim=function(){return this.replace(/(^\s+)|(\s+$)/g,'')};
		var selectedGrop = -1;
		var selectedLine = -1;
		var selectedChoice = [];
		var vip_Key;
		function selectGroup(index) {
			$("input[name*='group_']").css("background-color", "white");
			$("input[name='group_" + index + "']").css("background-color",
					"gray");
			$("input[name*='choice_']").css("background-color", "gray");
			$("div[name*='group_line_']").hide();
			$("div[name='group_line_" + index + "']").show();
			selectedGrop = index;
			selectedLine = -1;
			selectedChoice = [];

		}
		function selectLine(index_g, index_l) {

			$("input[name*='line']").css("background-color", "white");
			$("input[name='line_" + index_l + "']").css("background-color",
					"gray");
			$("input[name*='choice_']").css("background-color", "gray");
			$("div[name*='line_choice_']").hide();
			$("div[name='line_choice_" + index_l + "']").show();
			selectedLine = index_l;
			selectedChoice = [];

		}
		function selectChoice(index_g, index_l, index_c, index_select, value) {
			$(
					"input[name*='choice_" + index_g + "_" + index_l + "_"
							+ index_c + "_" + "']").css("background-color",
					"gray");
			$(
					"input[name='choice_" + index_g + "_" + index_l + "_"
							+ index_c + "_" + index_select + "']").css(
					"background-color", "green");
			for (var i = 0; i < selectedChoice.length; i++) {
				if (selectedChoice[i].id == index_c) {
					selectedChoice[i] = {
						id : index_c,
						value : value
					}
					return;
				}

			}

			{

				selectedChoice.push({
					id : index_c,
					value : value
				})
			}
			countMoney();
		}
		
		
		function	showCutoff()
		{
			if($("li[name='selectLi']").size()==0)
				return ;
			$("#cutOffBock").show();
		}
		function	hideCutoff()
		{
		
			$("#cutOffBock").hide();
		}
	function 	addCutoffOther()
	{
	
		addCutoff($("#otherCutoff").val());
	}
		function addCutoff(x)
		{
			$("#cutOffBock").hide();
	
		if($("li[name='selectLi']").size()==0)
			return ;
			var tempx=x;
			var tempLi=$("li[name='selectLi']")[$("li[name='selectLi']").size()-1];
		
			if($(tempLi).data("cutOff")!=undefined)

				{
				tempx=x/$(tempLi).data("cutOff")
				}
		var	choice_temp=$(tempLi).data("choice");
		var choice='';
			
			for (var i = 0; i < choice_temp.length; i++) {
				choice += choice_temp[i].value;
				choice += " "
			}
			
			$(tempLi).find("div").html(
					$(tempLi).data("nName") + ":" + ($(tempLi).data("money")*tempx/100) + "(" + choice + ")"+"折扣："+x+"%");
			
			
			$(tempLi).data({
				nName:$(tempLi).data("nName"),
				group : $(tempLi).data("group"),
				line : $(tempLi).data("line"),
				choice :$(tempLi).data("choice"),
				money: ($(tempLi).data("money")*tempx/100),
				cutOff:x
			});
			
			countMoney();
			
		}
		
		function selectAdd() {

			var li = document.createElement("li");
			$(li).addClass("item");
			$(li).data({
				name : "a",
				id : "tr"
			});
			var line_name = document.createElement("div");
			var temp = menuMap.get(selectedGrop).lines.get(selectedLine);
			var choice = "";
			var choice_temp = [];
			$.extend(choice_temp, selectedChoice);
			for (var i = 0; i < choice_temp.length; i++) {
				choice += choice_temp[i].value;
				choice += " "
			}

			$(line_name).html(
					temp.nName + ":" + temp.nPrice + "(" + choice + ")");
			$(line_name).addClass("slelce_name");
			$(line_name).appendTo(li);

			var deleteBtn = document.createElement("button");
			$(deleteBtn).html("删除");
			$(deleteBtn).addClass("btnAdd");

			$(deleteBtn).click(function(x) {
				$(this).parent('li').remove();
				countMoney();
			});

			$(deleteBtn).appendTo(li);
			$(li).attr("name", "selectLi");
			$(li).appendTo($("#selected"));
			$(li).data("name", temp.nName);
			$(li).data("money", temp.nPrice);

			$(li).data({
				nName:temp.nName,
				group : selectGroup,
				line : selectedLine,
				choice : choice_temp,
				money: temp.nPrice,
				
			});

			countMoney();
		}
		$(function() {
			$("#payBlock").hide();
			$("#vipPayBlock").hide();
			
			$("#cutOffBock").hide();
		})

		function sendVIPOrder() {

			if ($("li[name='selectLi']").size() > 0) {
				$("input[name='pay_get']").val("");

				$("input[name='change_money']").val(0);
				$("input[name='vip_id']").val("");
			
				$("input[name='vip_money']").val("");
				$("input[name='vip_passW']").val("");
				$("input[name='vip_bookNumber']").val("");
				$("#vipPayBlock").show();
				$("button[name='vip_pay_btn']").attr("disabled", "disabled"); 
				$("input[name='vip_bookNumber']").focus();
			} else {
				return;
			}

			var postData = [];
		
			$("li[name='selectLi']").each(function(i, e) {
				var tempE = {};

				tempE.group = $(e).data().group;
				tempE.line = $(e).data().line;
				tempE.choices = $(e).data().choice;
				tempE.money=$(e).data().money;
				postData.push(tempE);

			});

			$.post("vip/vipPay.jsp", {
				data : postData,
				payType : 0,
				bookNumer : $("input[name='vip_bookNumber']").val()
			}, function(data, status) {
				//	alert("Data: " + data + "nStatus: " + status);
				//	alert( data.trim() );
				var tempData=eval('(' + data.trim() + ')');
					vip_Key=tempData.keyId;
				//	alert(vip_Key);
				//alert("a"+eval('(' + data.trim() + ')').test);
				$("input[name='cutoff_true_money']").val(tempData.vipPrice);
			});

			//document.getElementById("i_pay_get").focus(); 
			// alert("ss");
		}
		function closeVIPBlock() {
			$("#vipPayBlock").hide();
		}
		function sendOrder() {

			if ($("li[name='selectLi']").size() > 0) {
				$("input[name='pay_get']").val("");

				$("input[name='change_money']").val(0);
				$("#payBlock").show();
			}
			document.getElementById("i_pay_get").focus();
			// alert("ss");
		}
		function countMoney() {

			var all = 0;
			$("li[name='selectLi']").each(function(i, e) {

				all += parseFloat($(e).data('money'));
			})

			$("input[name='amount']").val(all);
			$("input[name='need_money']").val(all);

		}
		function give_change() {
			$("input[name='pay_get']").val(
					parseFloat($("input[name='pay_get']").val()));

			$("input[name='change_money']").val(
					parseFloat($("input[name='pay_get']").val())
							- parseFloat($("input[name='need_money']").val()));

			document.getElementById("i_bookNumber").focus();
		}
		function hidePay() {
			$("#payBlock").hide();
		}
		function pay(x) {
			if (($("input[name='bookNumber']").val().length) <= 0) {
				alert("请输入桌号");
				return;
			}

			var postData = [];
			var t = {
				a : "ss",
				b : 1
			};
			$("li[name='selectLi']").each(function(i, e) {
				var tempE = {};

				tempE.group = $(e).data().group;
				tempE.line = $(e).data().line;
				tempE.choices = $(e).data().choice;
				tempE.money=$(e).data().money;
				postData.push(tempE);

			});

			$.post("sendOrder.jsp", {
				data : postData,
				payType : x,
				bookNumer : $("input[name='bookNumber']").val()
			}, function(data, status) {
		
				location.reload();

			});
			$("li[name='selectLi']").remove();
			$("input[name='bookNumber']").val("");
			$("#payBlock").hide();
		}
		function onVipIdChange()//查询会员金额
		{
			
			$.post("vip/vipQuery.jsp",{"vip_id":$("input[name='vip_id']").val()},function(data,status)
					{
				
				resultData=eval('('+data.trim()+')');
			
				$("input[name='vip_money']").val(resultData.title);
				
				if(resultData.successFlag==true)
					{
					$("input[name='vip_passW']").focus();
					$("button[name='vip_pay_btn']").removeAttr("disabled"); 
					}
				else
					{
					$("button[name='vip_pay_btn']").attr("disabled","disabled"); 
					}
			
					}
			
			);
			
		}
		function queryMoney()//查询会员金额
		{
			if(event.keyCode==13)
				{
				$.post("vip/vipQuery.jsp",{"vip_id":$("input[name='vip_id']").val()},function(data,status)
						{
					
					resultData=eval('('+data.trim()+')');
				
					$("input[name='vip_money']").val(resultData.title);
					
					if(resultData.successFlag==true)
						{
						$("input[name='vip_passW']").focus();
						$("button[name='vip_pay_btn']").removeAttr("disabled"); 
						}
					else
						{
						$("button[name='vip_pay_btn']").attr("disabled","disabled"); 
						}
				
						}
				
				)
				}
		}
		function onDuty(str)
		{
			
			$.post("onduty.jsp",{
			},function (data,status){
				
				window.location.reload(false);
			}
		);
		}
		var payFlag=false;
		function vipPay()//会员支付
		{
		
			if (($("input[name='vip_bookNumber']").val().length) <= 0) {
				alert("请输入桌号");
				return;
			}
			if(payFlag)
			{
			return ;
			}
			else
				{
			payFlag=true;
				}
			$.post("vip/vipPayOrder.jsp",{"vip_id":$("input[name='vip_id']").val(),
				"vip_passW":$("input[name='vip_passW']").val(),
				"vip_key":vip_Key,
				"bookNum":$("input[name='vip_bookNumber']").val()
			},
			function (data,status)
			{
				payFlag=false;
				var dataJs=eval('('+data.trim()+')');
				if(dataJs.flag!=true)
					{
					alert(dataJs.msg);
					}
				else
					{
					closeVIPBlock();
					location.reload(true);
					$("li[name='selectLi']").remove();
					}
			});
			
		}
	function	passWEnter()
	{
	
		if(event.keyCode==13)
			{
			//vipPay();
			}
			
	}
		
	</script>

	<%
		} catch (Throwable t) {
			t.printStackTrace();
		}
	%>
</body>

</html>