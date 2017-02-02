<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@page import="com.spring.sql.domain.TMenuLinePo"%>
<%@page import="com.spring.service.impl.SqlService"%>
<%@page import="com.spring.sql.domain.TMenuGroupPo"%>
<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="com.activity.data.SecondCutOffData"%>
<%@page import="com.activity.EActivityType"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.spring.service.dtoservice.DtoService"%>
<%@page import="com.spring.sql.dto.ActivityDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动配置</title>
<script language=javascript
	src="js/activity.js"></script>
<jsp:include page="/m/include/include.jsp"></jsp:include>
</head>
<body>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("../../login.jsp");
		return;
	}
%>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("../../login.jsp");
		return;
	}
%>
	<%
		UserData udata = LandManager.instance.getUser(request);
		if (!udata.permissions.contains("MONEY_GET") && (!udata.permissions.contains("ALL"))) {
	%>你并没有权限！<%
		return;
		}
	%>
	<%
		List<ActivityDto> dtos = DtoService.instance.getAllActity();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<TMenuGroupPo> groups=SqlService.getInstance().groupDao.getAll();
		List<TMenuLinePo> lines=SqlService.getInstance().lineDao.getAll();
	%>
	<div>
		<%
			for (ActivityDto dto : dtos) {
		%>
		<div>
			<span>id:<%=dto.getId()%></span> <span>描述：</span> <input type="text"
				id="desc_<%=dto.getId()%>" class="easyui-textbox"
				data-options="required:true" value="<%=dto.getDesc()%>"> <span>优先级：</span>
			<input type="text" id="priority_<%=dto.getId()%>"
				class="easyui-textbox" data-options="required:true"
				value="<%=dto.getPriority()%>">
				
				 <span>开始日期</span> <input
				type="text" id="startDate_<%=dto.getId()%>"
				class="easyui-datetimebox" data-options="required:true"
				value="<%=dateFormat.format(dto.getDateStart())%>">
				 <span>结束日期</span> <input
				type="text" id="endDate_<%=dto.getId()%>"
				class="easyui-datetimebox" data-options="required:true"
				value="<%=dateFormat.format(dto.getDateEnd())%>">
				 <span>生效时间:</span> <input
				type="text" id="startTime_<%=dto.getId()%>"
				class="easyui-textbox" data-options="required:true"
				value="<%=dto.getTimeStart()%>">
				<span>~</span> <input
				type="text" id="endTime_<%=dto.getId()%>"
				class="easyui-textbox" data-options="required:true"
				value="<%=dto.getTimeEnd()%>">
				<span>类型</span>
				<select id="type_<%=dto.getId()%>">
				<%
					for(EActivityType type:EActivityType.values())
					{
						%>
						<option value="<%=type.toString()%>" <%=(type.equals(dto.getType()))?"selected=\"selected\" ":""%> >
						<%=type.getDesc() %>
						</option>
						<%
					}
				%>
				</select>
				
				<span >
					 生效天（星期几）：
					</span>
					<input input type="text"
				id="weeks_<%=dto.getId()%>" class="easyui-textbox"
				readonly="readonly" value="<%=JSON.toJSONString(dto.getWeeks()).replaceAll("\\[", "").replaceAll("\\]", "")%>" >
				<select id="weekSelect_<%=dto.getId()%>">
				<%
				for(int i=1;i<8;i++)
				{
				
					
					%>
					<option value="<%=i%>"><%="星期"+i %>
					</option>
					<%
				}
				%>
		
				</select>	
				<button onclick="addWeek(<%=dto.getId()%>)">+</button>	
				<button  onclick="deleteWeek(<%=dto.getId()%>)"  >-</button>	
				
				
				<%
				if(dto.getType().equals(EActivityType.SecondCutOff))
				{
					SecondCutOffData data=null;
					if(dto.getOtherInfo() instanceof SecondCutOffData)
					{
						data=(SecondCutOffData)dto.getOtherInfo();
					}
					else
					{
						data=new SecondCutOffData();
					}
					%>
					<span >
					 生效组 ：
					</span>
					<input input type="text"
				id="groups_<%=dto.getId()%>" class="easyui-textbox"
				readonly="readonly" value="<%=JSON.toJSONString(data.getGroups()).replaceAll("\\[", "").replaceAll("\\]", "")%>" >
				<select id="groupSelect_<%=dto.getId()%>">
				<%
				for(TMenuGroupPo gpo:groups)
				{
					if(gpo.getEnable()==0)
						continue;
					
					%>
					<option value="<%=gpo.getId()%>"><%=gpo.getId()+":"+gpo.getNName() %>
					</option>
					<%
				}
				%>
		
				</select>	
				<button onclick="addGroup(<%=dto.getId()%>)">+</button>	
				<button  onclick="deleteGroup(<%=dto.getId()%>)"  >-</button>	
				
				<span >
					 生效单品：
					</span>
					<input input type="text"
				id="lines_<%=dto.getId()%>" class="easyui-textbox"
				readonly="readonly" value="<%=JSON.toJSONString(data.getLines()).replaceAll("\\[", "").replaceAll("\\]", "")%>" >
				<select id="lineSelect_<%=dto.getId()%>">
				<%
				for(TMenuLinePo lpo:lines)
				{
					if(lpo.getEnable()==0)
						continue;
					
					%>
					<option value="<%=lpo.getId()%>"><%=lpo.getId()+":"+lpo.getNName() %>
					</option>
					<%
				}
				%>
		
				</select>	
				<button onclick="addLine(<%=dto.getId()%>)">+</button>	
				<button  onclick="deleteLine(<%=dto.getId()%>)" >-</button>
				
				 <span>折扣：</span> <input type="text"
				id="cutOff_<%=dto.getId()%>" class="easyui-textbox"
				data-options="required:true" value="<%=data.getCutOff()%>">
				
					<%
				}
				
				%>
				
				<span>只对VIP生效：</span>
				<select id="vipOnly_<%=dto.getId()%>">
				<option value="1" <%=(dto.getOnlyVip())?"selected=\"selected\"":"" %>  >是</option>
				<option value="0" <%=(!dto.getOnlyVip())?"selected=\"selected\"":"" %>>否</option>
				</select>
				
				
				
				
				<span>是否生效：</span>
				<select id="enable_<%=dto.getId()%>">
				<option value="1" <%=(dto.getEnable())?"selected=\"selected\"":"" %>  >是</option>
				<option value="0" <%=(!dto.getEnable())?"selected=\"selected\"":"" %>>否</option>
				</select>				
				<button  onclick="saveAct(<%=dto.getId()%>)" >保存</button>
			<hr style="border: 1px solid #cccccc; margin: 2px">
		</div>
		<%
			}
		%>

	</div>


</body>


<script type="text/javascript">
	function saveAct(id) {
		
		var otherInfo;
		if($("#type_"+id).val()=='<%=EActivityType.SecondCutOff%>')
			{
			var line=$("#lines_"+id).textbox("getValue").split(",");
			var group=$("#groups_"+id).textbox("getValue").split(",");
			var lines=[];
			var groups=[];
			for(var i=0;i<line.length;i++)
				{
					var strl=line[i];
					if(strl.length!=0)
				{
						lines.push(parseInt(strl));
				}
				}
			for(var i=0;i<group.length;i++)
			{
				var strl=group[i];
				if(strl.length!=0)
			{
					groups.push(parseInt(strl));
			}
			}
			otherInfo={
					cutOff:$("#cutOff_"+id).textbox("getValue"),
					lines:lines,
					groups:groups
			}
			
			}
		$.post("save.jsp", {
			id:id,
			otherInfoStr:JSON.stringify(otherInfo),
			dateStart:$("#startDate_"+id).textbox("getValue"),
			dateEnd:$("#endDate_"+id).textbox("getValue"),
			desc:$("#desc_"+id).textbox("getValue"),
			enable:$("#enable_"+id).val(),
			onlyVip:$("#vipOnly_"+id).val(),
			timeEnd:$("#endTime_"+id).textbox("getValue"),
			timeStart:$("#startTime_"+id).textbox("getValue"),
			weeks:'['+$("#weeks_"+id).textbox("getValue")+']',
			type:$("#type_"+id).val(),
			priority:$("#priority_"+id).textbox("getValue"),
		}, function(d, s) {
			alert(d);
		});

	}
</script>
</html>