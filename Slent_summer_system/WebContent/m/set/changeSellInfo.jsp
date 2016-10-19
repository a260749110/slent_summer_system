<%@page import="org.json.JSONObject"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="com.data.DataHelper"%>
<%@page import="javafx.scene.chart.PieChart.Data"%>
<%@page import="java.util.List"%>
<%@page import="com.sql.mapperBean.TSilemtSummerSellInfo"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改数据</title>
</head>
<%
	
	
if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;
}

List<TSilemtSummerSellInfo> sellInfo=DataHelper.instance.getSellInfosBySecond(3600);

List<TMenuPaymentInfo> payInfo=DataHelper.instance.getPayInfoList();
%>
<body>
	<div>
	<%for(TSilemtSummerSellInfo info:sellInfo)
	{
	if(info.getPayType()<=0)
	continue;
	%>
	<div>
	<b>id:</b><input type="text" style="width: 8%" name="id_" readonly="readonly" value="<%=info.getId()%>">
	<b>名称:</b><input type="text" style="width: 8%" name="" readonly="readonly" value="<%=info.getSellName()%>">
	<b>支付方式：</b><select  onchange="change(this);" name="payType">
					<%
					for(TMenuPaymentInfo info2:payInfo)
					{
					
					boolean canChangeFlag=true;
				try {
				JSONObject jbTemp=new JSONObject(info2.getSelfData());
				canChangeFlag=jbTemp.getBoolean("canChange");
				} catch (Exception e) {
				// TODO: handle exception
			
				}
					
					if(!info2.getEnable()||info2.getId()<=0||!canChangeFlag)
						{
						continue;
						}
						%>
						<option  <%=(info.getPayType()==info2.getId())?"selected='selected'":"" %>  value="<%=info2.getId() %>"><%=info2.getnName() %></option>
						<% 
						
					}
					 %>
					</select>
		<b>是否删除：</b><select onchange="change(this);" name="delete_flag">
						<option value="true"  <%=(info.getDeleteFlag())?"selected='selected'":"" %>>是</option>
						<option value="false" <%=(!info.getDeleteFlag())?"selected='selected'":"" %>>否</option>
						</select>
		<b>时间:</b><%=info.getTime().toString() %>
						<button name="save_btn" onclick="save(this);" disabled="disabled">保存</button>		
	</div>
	<hr style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
	
	<%
	} %>
	</div>
	<script type="text/javascript">
	
	function change(obj){
		var parent_div=$(obj).parent();

		var btn=parent_div.children("button[name='save_btn']");
		btn.removeAttr("disabled");

	}
	function save(obj)
	{
		var parent_div=$(obj).parent();
		var btn=parent_div.children("button[name='save_btn']");
		var id=parent_div.children("input[name='id_']").val();
		var payType=parent_div.children("select[name='payType']").val();
		var deleteFlag=parent_div.children("select[name='delete_flag']").val();
		
		btn;
		$.post(
		"changeSellInfoSaveHelper.jsp",
		{
			id:id,
			payType:payType,
			deleteFlag:deleteFlag
		}
		,function (data,status)
		{
			var resultData=eval("("+data+")");
			if(resultData.flag)
		{
				alert(resultData.msg);
				
				btn.attr("disabled","disabled");
				
		}else
			{
			alert(resultData.msg);
			}
			
			
		}
		);
	}
	</script>
</body>
</html>