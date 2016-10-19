<%@page import="com.sql.mapperXml.TMenuChoice"%>
<%@page import="com.sql.mapperXml.TMenuGroup"%>
<%@page import="com.data.DataHelper"%>
<%@page import="java.util.List"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>选项配置</title>
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

	List<TMenuChoice> choices=DataHelper.instance.getChoiceList();
%>
<body>
	<div name='group_div'>
	<%for(int i=0;i<choices.size();i++){
	TMenuChoice choice=choices.get(i);
	 %>
	<div style='width: 100%'>
	id:	<input name='id_' style='width: 5%'  value='<%=choice.getId()%>' readonly='readonly'>
	name:<input onchange='change(this);' name='name_' value='<%=choice.getName()%>' style='width: 20%' >
	配置（用英文 "," 隔开）:<input  onchange='change(this);' style='width: 40%' name='value_' value='<%=choice.getnChoice().replaceAll("[\\[\"\\]]", "")%>' >
	<button name="save_btn" onclick="save(this);" disabled="disabled">保存</button>
	</div>
	 <hr style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
	<%} %>
	
	</div>
	<div>
	<button onclick="add()">
	添加
	</button></div>
	<script type="text/javascript">
	

	
	function add()
	{
		$("div[name='group_div']").append(
				"<div style='width: 100%'>"
			+"	id:	<input name='id_' style='width: 5%'  value='-1' readonly='readonly'>"
			+"	name:<input onchange='change(this);' name='name_' value='-' style='width: 20%' >"
			+"	配置（用英文 \",\" 隔开）:<input onchange='change(this);' style='width: 40%' name='value_' value='' >"
			+"	<button name='save_btn' onclick='save(this);'  disabled='disabled'>保存</button>"
			+"	</div>"
			+"	 <hr style=\"height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;\">"

		);
		
	}
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
		var name=parent_div.children("input[name='name_']").val();
		var value=parent_div.children("input[name='value_']").val();
		btn;
		$.post(
		"otherSetSaveHelper.jsp",
		{
			id:id,
			name:name,
			value:value
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
</body>
</html>