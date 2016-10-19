<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.user.LandManager"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.mysql.jdbc.EscapeTokenizer"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperXml.TNoahTitlesWithBLOBs"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>会员充值</title>
<script src="../../js/jquery-1.12.0.min.js"></script>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");

return;
}%>

<body>
	<div>
		<table border="1px" cellpadding="1px" cellspacing="1px">
			<tr>
				<th>账号</th>
				<td><input type="text" value="" name="vipId"></td>
				<th>金额</th>
				<td><input type="text" value="" name="money"></td>
			</tr>
		</table>
					<% 
TNoahTitlesWithBLOBs titlesWithBLOBs=DataHelper.instance.getTitleData("vip_discount_tip");
String str=null;
if(titlesWithBLOBs!=null)
{
	try{
		JSONObject jb=new JSONObject(titlesWithBLOBs.getnValue());
		str=jb.getString("recharge");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

List<TMenuPaymentInfo> payList=DataHelper.instance.getPayInfoList();

 %>
 <div>
 <b>充值优惠：<%=str %></b>
 </div>
		<div>
	支付方式：<select name="payType">
	<%
	for(TMenuPaymentInfo info:payList)
	{
	if(info.getEnable()&&SSVipManager.instance.testCanRecharge(info))
	{
	%>
	<option value="<%=info.getId() %>" ><%=info.getnName() %></option>
	<%
	}
	}
	 %>
	
	</select>
			
			<button onclick="recharge()">充值</button>
		</div>
	</div>
</body>
<script type="text/javascript">
String.prototype.trim=function(){return this.replace(/(^\s+)|(\s+$)/g,'')};
function recharge()
{
	//alert($("select[name='payType']").val());
	$.post("vipRechargeHelper.jsp", {
		id :  $("input[name='vipId']").val(),
		money :  $("input[name='money']").val(),
		payType :  $("select[name='payType']").val()
		
	}, function(data, status) {
	
	
		var resultData=eval('('+data.trim()+')');
		if(resultData.flag==true)
			{
		window.close();
		alert( resultData.msg );
			}
		else
		{
			alert( resultData.msg );
		}
		
	});	
	
	}

</script>
</html>