<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperXml.TMenuGroup"%>
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

<title>组配置</title>
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
List<TMenuGroup> groups=DataHelper.instance.getGroupList();
%>
<body>
	<div name="group_div">
		
	组配置:
	<%
	for(int i=0;i<groups.size();i++)
	{
	TMenuGroup group=groups.get(i);
	 %>
	 <div > 
	 id：	<input style="width: 10%"  type="text" name="id_" value="<%=group.getId()%>" readonly="readonly">
	 	 名字：	<input style="width: 40%" onchange="change(this);"  type="text" name="name_" value="<%=group.getnName()%>">
	 	 	 是否生效：<select name="enable_flag" onchange="change(this);">
	 	 	 		<option value="true"  <%=(group.getEnable())?"selected=\"selected\"":"" %> >是</option>
						<option value="false" <%=(!group.getEnable())?"selected=\"selected\"":"" %>>否</option>
	 	 	 		</select>
	 	 	 <button name="save_btn" onclick="save(this);" disabled="disabled">保存</button>
	 	 	 
	 </div>
	 <hr
			style="height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;">
	 <%} %>
	</div>
	<div>
	<button onclick="add()">
	添加
	</button>
	
	</div>
	<script type="text/javascript">
	
	function add()
	{
		$("div[name='group_div']").append("<div > "
	+" id：	<input style=\"width: 10%\"  type=\"text\" name=\"id_\" value=\"-1\" readonly=\"readonly\">"
	 +"	 名字：	<input style=\"width: 40%\" onchange=\"change(this);\"  type=\"text\" name=\"name_\" value=\"-\">"
	 	 	+"是否生效：<select name=\"enable_flag\" onchange=\"change(this);\">"
	 	 	 +	"	<option value=\"true\"  selected='selected' >是</option>"
	+"				<option value=\"false\">否</option>	"
	+" 	 	 		</select>"
	 +"	 	 <button name=\"save_btn\" onclick=\"save(this);\" disabled=\"disabled\">保存</button>"
	 	 	 
	+"</div>");
		
		$("div[name='group_div']").append("<hr style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>");
		
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
		var enable_flag=parent_div.children("select[name='enable_flag']").val();
		btn;
		$.post(
		"groupSaveHelper.jsp",
		{
			id:id,
			name:name,
			enable:enable_flag
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