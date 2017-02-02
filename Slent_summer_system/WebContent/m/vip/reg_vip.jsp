<%@page import="org.json.JSONObject"%>
<%@page import="com.sql.mapperXml.TNoahTitlesWithBLOBs"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>办理会员</title>
<script src="../../js/jquery-1.12.0.min.js"></script>
<style type="text/css"> 
input{width: 100%} 

</style> 
</head>

<%

if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;

}

List<TMenuPaymentInfo> payList=DataHelper.instance.getPayInfoList();
TNoahTitlesWithBLOBs titlesWithBLOBs=DataHelper.instance.getTitleData("vip_discount_tip");
String str=null;
if(titlesWithBLOBs!=null)
{
	try{
		JSONObject jb=new JSONObject(titlesWithBLOBs.getnValue());
		str=jb.getString("first");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
%>

<body>
<div>
<form action="reg_vip_step2.jsp" id="form1" method="post" >
<table cellpadding="2px" border="1px" width="100%">
<tr>
<th>姓名</th><td><input name="vip_name" type="text" value=""></td>
<th>电话号码</th><td><input name="phone" type="text" value=""></td>
<th>性别</th><td><select name="sex"><option value="男">男 </option><option value="女">女</option> </select></td>
</tr>
<tr>
<th>年龄</th><td><input name="age"  type="text" value="0"></td> 
<th>推荐人</th><td><input name="referee" type="text" value=""></td>
<th>会员等级</th><td><input name="lvl" type="text" value="0"></td>
</tr>
<tr>
<th>账号</th><td><input name="vip_id" type="text" value=""></td> 
<th>密码</th><td><input name="vip_passw" type="password" value=""></td>
<th>重新输入密码</th><td><input  name="passwRepick" type="password" value=""></td>

</tr>
<tr>
<th>邮箱</th><td ><input name="mail" type="text" value=""style="width: 100%"></td> 
<th>QQ</th><td ><input name="vip_qq" type="text" value=""style="width: 100%"></td> 
<th>充值金额</th><td ><input name="first_money" type="text" value="0"style="width: 100%"></td> 
</tr>
</table>
 <div>
 <b>充值优惠：<%=str %></b>
 </div>
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

</form>
<div style="text-align: center;"><button onclick="reg();">申请</button></div>
</div>
<div style="text-align: right: ;">
<a href="vipReCreate.jsp">补卡</a>
</div>
</div>
<script type="text/javascript">
document.body.onkeydown=function (e){
    var currKey=0,evt=e||window.event;
    currKey=evt.keyCode||evt.which||evt.charCode;//支持IE、FF
    
 
    if(currKey==27||currKey==112||currKey==113||currKey==114||currKey==115||currKey==116||currKey==117)
    	{
    if(e.preventDefault) e.preventDefault();
    if(e.stopPropagation) e.stopPropagation();
}
};
$("input").keydown(function(){
if(event.keyCode==13)
	{
	var inputs = $("input"); // 获取表单中的所有输入框
    var idx = inputs.index(this); // 获取当前焦点输入框所处的位置
	if(idx<inputs.length)
	{
    inputs[idx+1].focus(); 
	}
    if(event.preventDefault) event.preventDefault();
    if(event.stopPropagation) event.stopPropagation();
	}
	});


function reg()
{
var passw=	$("input[name='vip_passw']").val();
var vip_id=	$("input[name='vip_id']").val();
var passwRepick=$("input[name='passwRepick']").val();
if(passw.length<=3)
	{
	alert("密码长度大于3");
	return;
	}
if(vip_id.length<=3)
{
alert("账号长度大于3");
return;
}
if(passw!=passwRepick)
{
alert("两次输入密码不一样");
return;
}
$("#form1").submit();
	}
</script>
</body>
</html>