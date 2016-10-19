<%@page import="com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.sql.mapperXml.TMenuGroup"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.vip.VipPay.CutoffData"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.data.DataHelper"%>
<%@page import="javafx.scene.chart.PieChart.Data"%>
<%@page import="com.sql.mapperXml.TNoahTitlesWithBLOBs"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@page import="java.util.Map"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>会员策略修改</title>
</head>
<%
	
	
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}

%>
<%
UserData data=LandManager.instance.getUser(request);
if(!data.permissions.contains("MONEY_GET")&&(!data.permissions.contains("ALL")))
{
	%>你并没有权限！<%
	return ;}

%>
<%
	
Map<String,Float> firstMap=SSVipManager.instance.getFirstRecharge();
Map<String,Float> rechargeMap=SSVipManager.instance.getRecharge();
CutoffData cutoff = new CutoffData( DataHelper.instance.getTitleData("vip_cut_off"));
CutoffData	second_cutoff = new CutoffData( DataHelper.instance.getTitleData("vip_second_cutoff"));
String firstMsg="";
String reMsg="";
try {

TNoahTitlesWithBLOBs msgBloBs=DataHelper.instance.getTitleData("vip_discount_tip");
JSONObject jb=new JSONObject(msgBloBs.getnValue());
firstMsg=jb.getString("first");
reMsg=jb.getString("recharge");
}
catch(Exception e)
{
}
 Map<Integer, TMenuGroup> groupMap=DataHelper.instance.getGroupMap();
%>
<body>
	<div>
		<div name="first_div">
			首充赠送：
			<%
				for(String key:firstMap.keySet()){
				if(!key.equals("other")) {
			%>
			<div>
				充：<input type="text" name="firstR" value="<%=
					key 
				%>"> 送：<input
					type="text" name="firstG" value="<%=
					firstMap.get(key)*100
				%>">%
			</div>
			<%
				} }
			%>


		</div>
		<button onclick="addFirstLine()">添加</button>
		<div>
			其他：<input name="firstOR" value="0" readonly="readonly"> 送：<input
				name="firstOG" value="<%=firstMap.get("other")*100%>">%
		</div>
		<div>
			首充提示：<input name='firstMsg' type="text" value="<%=
				firstMsg
			%>">
		</div>
	</div>

	<div>
		<hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
	</div>
	<div>

		<div name="recharge_div">
			充值优惠：
			<%
				for(String key:rechargeMap.keySet()){
	if(!key.equals("other")) {
			%>
			<div>
				充：<input type="text" name="normalR" value="<%=
					key 
				%>"> 送：<input
					type="text" name="normalG" value="<%=
					rechargeMap.get(key)
				%>">元
			</div>
			<%
				} }
			%>


		</div>
		<button onclick="addRechargeLine()">添加</button>
		<div>
			其他：<input name="normalOR" value="0" readonly="readonly"> 送：<input
				name="normalOG" value="<%=rechargeMap.get("other")*100%>">%
		</div>
		
	
		<div>
			充值提示：<input type="text" name="normalMsg" value="<%=
				reMsg
			%>">
		</div>
	</div>

	<div>
		<hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
	</div>
	<div>

		会员消费折扣:
		<div>
			折扣：<input name="cutoffRate" type="text" value="<%=cutoff.cutoff*100%>">%
		</div>
			<div>
		<b>生效菜品：</b>
		<%
		
		if(cutoff.allGroupFlag)
		{
			%>
			<input name="cutoffGroup" style="width: 10%;border-color: red;" readonly="readonly" value="-1(ALL)">
			<button onclick="deleSelet(this);">删除</button>
			<%
			
		}
		for(int key:cutoff.gorupTree)
			{
		
			%>
			<input name="cutoffGroup" readonly="readonly" style="width: 10%;border-color: red;" value="<%=key+"("+groupMap.get(key).getnName()+")"%>">
			<button onclick="deleSelet(this);">删除</button>
			<%
			}%>
			<select>
			<option value="-1(ALL)" >-1(ALL)</option>
			<%for(int key:groupMap.keySet())
				{
				%>
				<option value="<%=key+"("+groupMap.get(key).getnName()+")" %>" ><%=key+"("+groupMap.get(key).getnName()+")" %></option>
				<%
				
				}%>
			</select>
			<button onclick="addSelect(this);">添加</button>
		</div>
		
		<div>
			是否生效：<select name="cutoffFlag">
						<option value="true"  <%=(cutoff.enable)?"selected=\"selected\"":"" %> >是</option>
						<option value="false" <%=(!cutoff.enable)?"selected=\"selected\"":"" %>>否</option></select>
		</div>
		
		
		<div>
			打印提示：<input type="text" name="cutoffTip" value="<%=cutoff.tip%>">
		</div>
	</div>

	<div>
		<hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
	</div>
	<div>

		会员第二杯折扣:（注在会员折扣情况下该优惠无法享受）
		<div>
			折扣：<input name="secondCutoffRate" type="text" value="<%=second_cutoff.cutoff*100%>">%
		</div>
		<div>
		<b>生效菜品：</b>
		<%
		
		if(cutoff.allGroupFlag)
		{
			%>
			<input name="cutoffGroup" style="width: 10%;border-color: red;" readonly="readonly" value="-1(ALL)">
			<button onclick="deleSelet(this);">删除</button>
			<%
			
		}
		for(int key:second_cutoff.gorupTree)
			{
		
			%>
			<input name="secondCutoffGroup" readonly="readonly" style="width: 10%;border-color: red;" value="<%=key+"("+groupMap.get(key).getnName()+")"%>">
			<button onclick="deleSelet(this);">删除</button>
			<%
			}%>
			<select>
			<option value="-1(ALL)" >-1(ALL)</option>
			<%for(int key:groupMap.keySet())
				{
				%>
				<option value="<%=key+"("+groupMap.get(key).getnName()+")" %>" ><%=key+"("+groupMap.get(key).getnName()+")" %></option>
				<%
				
				}%>
			</select>
			<button onclick="addSecondSelect(this);">添加</button>
		</div>
		<div>
			是否生效：<select name="secondCutoffFlag">
						<option value="true"  <%=(second_cutoff.enable)?"selected=\"selected\"":"" %> >是</option>
						<option value="false" <%=(!second_cutoff.enable)?"selected=\"selected\"":"" %>>否</option></select>
		</div>
		<div>
			打印提示：<input type="text" name="secondCutoffTip" value="<%=second_cutoff.tip%>">
		</div>
	</div>
	<div>
		<button onclick="save()">保存</button>
	</div>
	<script type="text/javascript">
		function addFirstLine() {

			$("div[name='first_div']")
					.append(
							" <div>充：<input type='text' name='firstR' value='0'> 送：<input type='text' name='firstG' value='0'>%</div>");

		}
		function addRechargeLine() {

			$("div[name='recharge_div']")
					.append(
							" <div>充：<input type='text' name='normalR' value='0'> 送：<input type='text' name='normalG' value='0'>元</div>");

		}
		function deleSelet(obj)
		{
			$(obj).prev().remove();
			$(obj).remove();
		}
		function addSelect(obj)
		{
		
			$("<input name=\"cutoffGroup\" readonly=\"readonly\" style=\"width: 10%;border-color: red;\" value='"+$(obj).prev().val()+"'>"
					+"<button onclick=\"deleSelet(this);\">删除</button>").insertAfter($(obj).prev().prev());
			
		}
		function addSecondSelect(obj)
		{
		
			$("<input name=\"secondCutoffGroup\" readonly=\"readonly\" style=\"width: 10%;border-color: red;\" value='"+$(obj).prev().val()+"'>"
					+"<button onclick=\"deleSelet(this);\">删除</button>").insertAfter($(obj).prev().prev());
			
		}
		function save() {
			var firstR = "";
			var firstG = "";
			var firstOther = $("input[name='firstOG']").val();
			var firstMsg = $("input[name='firstMsg']").val();
			var normalR = "";
			var normalG = "";
			var normalOther = $("input[name='normalOG']").val();
			var normalMsg = $("input[name='normalMsg']").val();
			var cutoffRate= $("input[name='cutoffRate']").val();
			var cutoffFlag= $("select[name='cutoffFlag']").val();
			var cutoffTip= $("input[name='cutoffTip']").val();
			var cutoffGroup="";
			var secondCutoffRate= $("input[name='secondCutoffRate']").val();
			var secondCutoffFlag= $("select[name='secondCutoffFlag']").val();
			var secondCutoffTip= $("input[name='secondCutoffTip']").val();
			var secondCutoffGroup="";
			//alert(secondCutoffRate);
			$("input[name='firstR']").each(function(i, e) {

				if (firstR.length != 0) {
					firstR += "_";
				}
				firstR += ($(e).val());

			});
			$("input[name='firstG']").each(function(i, e) {
				if (firstG.length != 0) {
					firstG += "_";
				}
				firstG += ($(e).val());
			});
			$("input[name='normalR']").each(function(i, e) {
				if (normalR.length != 0) {
					normalR += "_";
				}
				normalR += ($(e).val());
			});
			$("input[name='normalG']").each(function(i, e) {
				if (normalG.length != 0) {
					normalG += "_";
				}
				normalG += ($(e).val());
			});
			$("input[name='cutoffGroup']").each(function(i, e) {

				if (cutoffGroup.length != 0) {
					cutoffGroup += "<_>";
				}
				cutoffGroup += ($(e).val());

			});
			$("input[name='secondCutoffGroup']").each(function(i, e) {

				if (secondCutoffGroup.length != 0) {
					secondCutoffGroup += "<_>";
				}
				secondCutoffGroup += ($(e).val());

			});
			//alert(secondCutoffGroup);
			$.post("VipSetSaveHelper.jsp", {
				firstR : firstR,
				firstG : firstG,
				normalR : normalR,
				normalG : normalG,
				firstOther : firstOther,
				firstMsg : firstMsg,
				normalOther : normalOther,
				normalMsg : normalMsg,
				cutoffRate:cutoffRate,
				cutoffFlag:cutoffFlag,
			 	cutoffTip:cutoffTip,
			 	cutoffGroup:cutoffGroup,
			 	secondCutoffRate:secondCutoffRate,
			 	secondCutoffFlag:secondCutoffFlag,
			 	secondCutoffTip:secondCutoffTip,
			 	secondCutoffGroup:secondCutoffGroup
			}, function(data, status) {
				var dataResult = eval('(' + data + ')');
				alert(dataResult.msg);
			});

		}
	</script>
</body>
</html>