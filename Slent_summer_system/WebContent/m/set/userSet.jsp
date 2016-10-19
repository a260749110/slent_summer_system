<%@page import="com.data.DataHelper"%>
<%@page import="java.util.List"%>
<%@page import="com.sql.mapperBean.TUser"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>操作员修改</title>
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

	List<TUser> userList=DataHelper.instance.getUserList();

	%>
<body>
	<div>
		<%
			
		for(TUser user:userList)
		{
		if(user.getPermission()!=null&&!user.getPermission().isEmpty()&&user.getPermission().contains("ALL"))
		continue;
		
		%>
		<div>
		<b>账号：</b><input type="text" name="id_" readonly="readonly" value="<%=user.getId() %>" >
		<b>名字：</b><input  type="text" name="name_" value="<%=user.getName() %>" readonly="readonly"  >
		<b>新密码：</b><input onchange='change(this);' type="text" name="passw" value=""  >
		<b>是否生效：</b><select onchange='change(this);' name="enable">
						<option value="true"  <%=(user.getEnable())?" selected='selected'":"" %> >是</option>
						<option value="false" <%=(!user.getEnable())?" selected='selected'":"" %>>否</option>
						</select>
					 <button name="save_btn" onclick="save(this);" disabled="disabled">保存</button>
		</div>
		
		<hr style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
		<%
		}
 
		%>
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
		var name=parent_div.children("input[name='name_']").val();
		var passw=parent_div.children("input[name='passw']").val();
		var enable=parent_div.children("select[name='enable']").val();
		btn;
		$.post(
		"userSetSaveHelper.jsp",
		{
			id:id,
			name:name,
			enable:enable,
			passw:passw
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