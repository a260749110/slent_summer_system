<%@page import="com.sql.mapperXml.TMenuChoice"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.TrueLiteral"%>
<%@page import="com.sql.mapperXml.TMenuGroup"%>
<%@page import="java.util.Map"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperBean.TMenuLine"%>
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
<title>菜单配置</title>
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
	<div name="set_div" >
		<%
		List<TMenuLine>  lineList=DataHelper.instance.getLineList();
		
		 Map<Integer,TMenuGroup> groupMap=DataHelper.instance.getGroupMap();
		 
		 Map<Integer,TMenuChoice> choiceMap=DataHelper.instance.getChoiceMap();
		for(TMenuLine line:lineList)
		{
		if(line.getId()>0)
		{
		
		%>
		<div > 
		id：<input type="text" name="id_" value="<%=line.getId()%>" readonly="readonly" style="width: 8%">
		<b>name:</b><input  type="text" name="name_" onchange="change(this);" value="<%=line.getnName()%>" style="width: 20% ;background-color: gray;">
		<b>价格:</b><input type="text" name="price" onchange="change(this);" value="<%=line.getnPrice()   %>" style="width: 10%"  >
		<b>会员价格：</b><input type="text" name="price_vip" onchange="change(this);" value="<%=	line.getPriceVip() %>" style="width: 10%"  >
		<b>菜品：</b><select name="group" onchange="change(this);">
		<%
		for(Integer key:groupMap.keySet())
		{
		TMenuGroup group=groupMap.get(key);
		if(group.getId()<0)
		continue;
		boolean selectedFalg=false;
		if(group.getId()==line.getnGroupId())
		selectedFalg=true;
		 %>
		 <option  value="<%=key %>" <%=(selectedFalg)?"selected='selected'":"" %> ><%=key %>(<%=group.getnName() %>)</option>
		 <%
		 }
		  %>
		</select>
		
		<b>详细选项：</b>
		<%
		if(line.getOtherChoice()!=null&&!line.getOtherChoice().isEmpty())
		{
		JSONArray choiceJl=new JSONArray(line.getOtherChoice());
	
		for(int j=0;j<choiceJl.length();j++)
		{
		int choiceKey=choiceJl.getInt(j);
			TMenuChoice choiceData=choiceMap.get(choiceKey);
			
		%>
		<input style="width: 10%;border-color: red;" name="other_choice" type="text" value="<%=choiceKey%>(<%=choiceData.getName() %>)" readonly="readonly">
		<button onclick="daleteChoice(this);">删除</button>
		<%
		
		}
		}
		%> 
		<select name="choice_select">
		<%
		for(TMenuChoice choice: choiceMap.values())
		{
		%>
		<option value="<%=choice.getId()%>"><%=choice.getId()+"("+choice.getName()+")" %></option>
		<%
		}
		%>
		</select>
		<button onclick="addChoice(this);" >添加</button>
		<%
		 %>
		
		<b>是否打印贴纸：</b><select name="ticket_flag" onchange="change(this);">
		<option  value="true"   <%=(line.getTicketFlag())?"selected='selected'":"" %> >是</option>
		<option value="false"  <%=(!line.getTicketFlag())?"selected='selected'":"" %> >否</option>
		</select>
		<b>生效</b>：<select name="enable" onchange="change(this);">
		<option  value="true"   <%=(line.getEnable())?"selected='selected'":"" %> >是</option>
		<option value="false"  <%=(!line.getEnable())?"selected='selected'":"" %> >否</option>
		</select>
		
		<button onclick="save(this);" name="save_btn" disabled="disabled">保存</button>
		</div>
		
		
		<hr style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
		<%
		}
		}
		 %>
	</div>
	<div> 
	<button onclick="addLine();" >添加</button>
	</div>
	<div name="divCopy">
	<div > 
		id：<input type="text" name="id_" value="-1" readonly="readonly" style="width: 8%">
		<b>name:</b><input  type="text" name="name_" onchange="change(this);" value="-" style="width: 20% ;background-color: gray;">
		<b>价格:</b><input type="text" name="price" onchange="change(this);" value="0" style="width: 10%"  >
		<b>会员价格：</b><input type="text" name="price_vip" onchange="change(this);" value="0" style="width: 10%"  >
		<b>菜品：</b><select name="group" onchange="change(this);">
		<%
		for(Integer key:groupMap.keySet())
		{
		TMenuGroup group=groupMap.get(key);
		if(group.getId()<0)
		continue;
		boolean selectedFalg=false;
	
		 %>
		 <option  value="<%=key %>" <%=(selectedFalg)?"selected='selected'":"" %> ><%=key %>(<%=group.getnName() %>)</option>
		 <%
		 }
		  %>
		</select>
		
		<b>详细选项：</b>
		
		
		<select name="choice_select">
		<%
		for(TMenuChoice choice: choiceMap.values())
		{
		%>
		<option value="<%=choice.getId()%>"><%=choice.getId()+"("+choice.getName()+")" %></option>
		<%
		}
		%>
		</select>
		<button onclick="addChoice(this);" >添加</button>
		
		
		<b>是否打印贴纸：</b><select name="ticket_flag" onchange="change(this);">
		<option  value="true"  >是</option>
		<option value="false"  selected="selected">否</option>
		</select>
		<b>生效</b>：<select name="enable" onchange="change(this);">
		<option  value="true"  >是</option>
		<option value="false" selected="selected" >否</option>
		</select>
		
		<button onclick="save(this);" name="save_btn" disabled="disabled">保存</button>
		</div>
		
		
		<hr style='height: 10px; color: green; width: 100%; border: none; border-top: 2px dotted green;'>
	
	</div>
	<script type="text/javascript">
	$(function()
			{
			$("div[name='divCopy']").hide();
			}	
			);
	function addLine()
	{
		var clone_=$("div[name='divCopy']").clone(true);
		clone_.removeAttr("name")
		alert(clone_.attr("name"));
		clone_.show();
		$("div[name='set_div']").append(clone_);
	}
	function addChoice(obj)
	{
		change(obj);
		var parent_div=$(obj).parent();

		var select=parent_div.children("select[name='choice_select']");
	
		$("<input style='width: 10% ;border-color: red;' name='other_choice' type='text' value='"+select.find('option:selected').text()+"' readonly='readonly'>"
			+"<button onclick='daleteChoice(this);'>删除</button>"	
		).insertAfter($(obj).prev().prev());
		
	//	alert(select.find('option:selected').text());
	}
	function change(obj){
		var parent_div=$(obj).parent();

		var btn=parent_div.children("button[name='save_btn']");
		btn.removeAttr("disabled");

	}
	function daleteChoice(obj)
	{
	//	alert("aa");
	change(obj);
		$(obj).prev().remove();
		$(obj).remove();
	}
	
	function save(obj)
	{
		var parent_div=$(obj).parent();
		var btn=parent_div.children("button[name='save_btn']");
		var id=parent_div.children("input[name='id_']").val();
		var name=parent_div.children("input[name='name_']").val();
		var price=parent_div.children("input[name='price']").val();
		var price_vip=parent_div.children("input[name='price_vip']").val();
		var group=parent_div.children("select[name='group']").val();
		var other_choice="";
		var ticket_flag=parent_div.children("select[name='ticket_flag']").val();			
		var enable=parent_div.children("select[name='enable']").val();
		
		//var enable_flag=parent_div.children("select[name='enable_flag']").val();
		
		
		parent_div.children("input[name='other_choice']").each(function(i,e){
			if(i!=0)
				{
				other_choice+='<_>';
				}
			other_choice+=$(e).val();
			//alert($(e).val());
		});
		
		//alert(other_choice);
		btn;
		$.post(
		"lineSetSaveHelper.jsp",
		{
			id:id,
			name:name,
			price:price,
			price_vip:price_vip,
			group:group,
			other_choice:other_choice,
			ticket_flag:ticket_flag,
			enable:enable
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