<%@page import="org.json.JSONObject"%>
<%@page import="com.data.DataHelper"%>
<%@page import="java.util.List"%>
<%@page import="com.data.PayObj.Line"%>
<%@page import="java.util.Map"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.user.UserData"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../../js/jquery-1.12.0.min.js"></script>
<title>修改支付方式</title>
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
 	List<TMenuPaymentInfo> payList=DataHelper.instance.getPayInfoList();
	%>
	<body>
	<div name="payBlock">
	<%for(TMenuPaymentInfo info:payList)
		{
			if(info.getId()<=0)
			continue;
			boolean canChangeFlag=true;
			try {
				JSONObject jbTemp=new JSONObject(info.getSelfData());
				canChangeFlag=jbTemp.getBoolean("canChange");
			} catch (Exception e) {
				// TODO: handle exception
			
			}
			%>
			<div>
			<b>id:</b><input type="text" style="width: 5%" readonly="readonly" name="id_" value="<%=info.getId()%>">
			<b>名字:</b><input onchange="change(this);" type="text"   style="width: 25%"  name="name_" value="<%=info.getnName()%>">
			<b>是否生效：</b><select onchange="change(this);" name="enable">
							<option  <%=(info.getEnable())?"selected='selected'":"" %> value="true">是</option>
							<option <%=(!info.getEnable())?"selected='selected'":"" %> value="false">否</option>
							</select>
							
				<b>允许改单：</b><select onchange="change(this);" name="canChange">
							<option <%=(canChangeFlag)?"selected='selected'":"" %> value="true">是</option>
							<option  <%=(!canChangeFlag)?"selected='selected'":"" %> value="false">否</option>
							</select>					
			<button name="save_btn"  onclick="save(this);" disabled="disabled">保存</button>
						<hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
			</div>

			<%
		}
	 %>
	</div>
	<div> 
	<button onclick="addLine();" >添加</button>
	</div>
	
		<div name="divCopy">
			<b>id:</b><input type="text" style="width: 5%" readonly="readonly" name="id_" value="-1">
			<b>名字:</b><input onchange="change(this);" type="text"   style="width: 25%"  name="name_" value="-">
		<b>是否生效：</b><select onchange="change(this);" name="enable">
							<option value="true">是</option>
							<option selected="selected" value="false">否</option>
							</select>
			<b>允许改单：</b><select onchange="change(this);" name="canChange">
							<option selected="selected" value="true">是</option>
							<option  value="false">否</option>
							</select>				
			<button name="save_btn"  onclick="save(this);" disabled="disabled">保存</button>
						<hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
			</div>
	</body>
	<script type="text/javascript">
	$(function(){$("div[name='divCopy']").hide();});
	function change(obj){
		var parent_div=$(obj).parent();

		var btn=parent_div.children("button[name='save_btn']");
		btn.removeAttr("disabled");

	}
	
	function addLine()
	{
		var clone_=$("div[name='divCopy']").clone(true);
		clone_.removeAttr("name")
		//alert(clone_.attr("name"));
		clone_.show();
		$("div[name='payBlock']").append(clone_);
	}
	function save(obj)
	{
		var parent_div=$(obj).parent();
		var btn=parent_div.children("button[name='save_btn']");
		var id=parent_div.children("input[name='id_']").val();
		var name=parent_div.children("input[name='name_']").val();
		var enable=parent_div.children("select[name='enable']").val();
		var canChange=parent_div.children("select[name='canChange']").val();
		btn;
		$.post(
		"payTypeSetSaveHelpert.jsp",
		{
			id:id,
			name:name,
			enable:enable,
			canChange:canChange
		}
		,function (data,status)
		{
			var resultData=eval("("+data+")");
			if(resultData.flag)
		{
				alert(resultData.msg);
				
				btn.attr("disabled","disabled");
				if(id=="-1"){window.location.reload(false)};
		}else
			{
			alert(resultData.msg);
			}
			
			
		}
		);
	}
	</script>
</html>