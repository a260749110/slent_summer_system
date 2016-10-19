<%@page import="com.user.MoneyManager"%>
<%@page import="com.sql.mapperBean.TMonegChange"%>
<%@page import="com.sql.mapper.TMonegChangeMapper"%>
<%@page import="com.data.sale.SaleData"%>
<%@page import="java.util.Map"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.data.sale.SaleManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>交班</title>
</head>
<%
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;

}%>
<script src="../js/jquery-1.12.0.min.js"></script>
<body>

<div>
<table  border='1'cellspacing="1" cellpadding="1" >
<% Map<Long, SaleData> saleDataMap=SaleManager.instance.getSaleInfo(LandManager.instance.landId.getLandId()) ;
SaleData  caushData=null;
for(Long key:saleDataMap.keySet())
{
	SaleData data=saleDataMap.get(key);
	if(key==1)
		caushData=data;
	%><tr><td> <%=data.saleType %></td>
	<td><%=data.money %> </td> 
	</tr><%
	}

%>



</table>
</div>
<% TMonegChange lastMoney=MoneyManager.instance.getMoneyLast();
float caush=lastMoney.getMoneyFinish();

if(caushData!=null)
{
	caush+=caushData.money;
}
%>

<div>  应有现金 <%=caush %>   </div>
<div>

<form name="form" action="unLand.jsp"  method="post">
<input type="text" name="moneyNeed" value="<%=caush %>" style="visibility: hidden;">
 实际金钱：<input type="text" name="moneyTure" value="">
 <input type="button" value="交班" onclick="delall()">
<button onclick="window.close();"> 关闭</button>
<div >
<b style="vertical-align: top;">备注:</b><textarea name="tip" rows="20" cols="60"></textarea>
</div>
</form>
</div>
<script language="javascript">
	function delall(){
		if($("input[name='moneyTure']").val().length<=0)
			{
			alert("请输入实际金钱");
			return;
			}
		if(confirm('确定交班？交班后信息无法修改！')){
			this.form.action="unLand.jsp" //设置处理程序
			this.form.submit(); //提交表单
		}
	}
</script> 
</body>
</html>