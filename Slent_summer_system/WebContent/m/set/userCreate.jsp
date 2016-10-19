<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新建操作员</title>
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
<body>
	<div>
	<div><b>id:</b><input type="text" value="" name="id_"></div>
	<div><b>名字:</b><input type="text" value="" name="name_"></div>
	<div><b>密码:</b><input type="text" value="" name="passw"></div>
	<div><b>是否生效:</b>
		<select name="enable">
			<option value="true">是</option>
			<option value="false" selected="selected">否</option>
		</select>
	</div>
	<button  onclick="save();">保存</button>
	</div>
</body>
<script type="text/javascript">
function save()
{
	
	var id=$("input[name='id_']").val();
	var name=$("input[name='name_']").val();
	var passw=$("input[name='passw']").val();
	var enable=$("select[name='enable']").val();
	
	if(passw.length<3)
		{
		alert("密码必须大于3位");
		return;
		}
	$.post(
			"userCreateSaveHelper.jsp",
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
					
					window.close();
				
			}else
				{
				alert(resultData.msg);
				}
				
				
			}
			);
	
	}

</script>
</html>