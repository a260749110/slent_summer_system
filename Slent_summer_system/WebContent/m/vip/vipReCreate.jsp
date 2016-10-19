<%@page import="org.json.JSONObject"%>
<%@page import="com.sql.mapperXml.TNoahTitlesWithBLOBs"%>
<%@page import="com.user.vip.SSVipManager"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TMenuPaymentInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../../js/jquery-1.12.0.min.js"></script>
<title>会员补办</title>
</head>
<%
	

if(LandManager.instance.testLand(request, response)<=0)
{
response.sendRedirect("login.jsp");
return;

}

%>
<body>
	<div>
		<b>卡号：</b><input type="text" name="vip_id" value=""> <b>密码:</b><input
			type="password" name="passw" value=""> <b>新卡号：</b><input
			type="text" name="new_id" value="">
		<button onclick="reCreate(this);">修改</button>
		<button  onclick="reCreateNoPassw(this);"  >免密码修改（密码框内密码为新密码）</button>
	</div>
	<hr
		style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
	<div>
		修改密码： <b>卡号：</b><input type="text" name="id_" value=""> <b>密码:</b><input
			type="password" name="old_passw" value=""> <b>新密码：</b><input
			type="password" name="new_passw" value="">
		<button onclick="resetPassw(this);">修改</button>
	</div>
	<div>
		<hr
			style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
		<b>卡号查询</b>
		<div>
			<b>名字：</b><input type="text" name="name" value=""> <b>电话号码：</b><input
				type="text" name="phone" value="">
			<button  onclick="selectByNameOrPhone(this);">查询</button>
			<div>
				<textarea id="showText" rows="20" cols="60"></textarea>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
function reCreate(obj)
{
	var parent_div=$(obj).parent();

	var id=parent_div.children("input[name='vip_id']").val();
	var passw=parent_div.children("input[name='passw']").val();
	var idNew=parent_div.children("input[name='new_id']").val();
	
		$.post(
			"vipReCreateHelper.jsp",
			{
				id:id,
				passw:passw,
				newId:idNew,
				type:"reCreate"
			},function (data,status)
			{
				var resultData=eval("("+data+")");
				if(resultData.flag)
			{
					alert(resultData.msg);
					
					
			}else
				{
				alert(resultData.msg);
				}
				
				
			}
			);
	}
function resetPassw(obj)
{
	var parent_div=$(obj).parent();

	var id=parent_div.children("input[name='id_']").val();
	var passw=parent_div.children("input[name='old_passw']").val();
	var passwNew=parent_div.children("input[name='new_passw']").val();
	
		$.post(
			"vipReCreateHelper.jsp",
			{
				id:id,
				passw:passw,
				passwNew:passwNew,
				type:"changePassw"
			},function (data,status)
			{
				var resultData=eval("("+data+")");
				if(resultData.flag)
			{
					alert(resultData.msg);
					
					
			}else
				{
				alert(resultData.msg);
				}
				
				
			}
			);
	}
	
function selectByNameOrPhone(obj)
{
	var parent_div=$(obj).parent();

	var name=parent_div.children("input[name='name']").val();
	var phone=parent_div.children("input[name='phone']").val();

	
		$.post(
			"vipReCreateHelper.jsp",
			{
				name:name,
				phone:phone,
				type:"selectByNameOrPhone"
			},function (data,status)
			{
				var resultData=eval("("+data+")");
				if(resultData.flag)
			{
					
					var resultList=resultData.msg;
					var str="";
				for(var i=0;i<resultList.length;i++)
			{
					str+=resultList[i]+"\r\n";
			}
					
					$("#showText").html(str);
					
			}else
				{
				alert(resultData.msg);
				}
				
				
			}
			);
	}
	
function reCreateNoPassw(obj)
{
	var parent_div=$(obj).parent();

	var id=parent_div.children("input[name='vip_id']").val();
	var passw=parent_div.children("input[name='passw']").val();
	var idNew=parent_div.children("input[name='new_id']").val();
	
		$.post(
			"vipReCreateHelper.jsp",
			{
				id:id,
				passw:passw,
				newId:idNew,
				type:"reCreateNoPassw"
			},function (data,status)
			{
				var resultData=eval("("+data+")");
				if(resultData.flag)
			{
					alert(resultData.msg);
					
					
			}else
				{
				alert(resultData.msg);
				}
				
				
			}
			);
	}
</script>
</html>