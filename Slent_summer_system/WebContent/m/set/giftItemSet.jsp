<%@page import="com.page.PageHandler.EPageHandlerKey"%>
<%@page import="com.Config"%>
<%@page import="com.sql.mapperBean.TMenuLine"%>
<%@page import="com.vip.enumCells.EGiftType"%>
<%@page import="com.spring.service.impl.SqlService"%>
<%@page import="com.spring.sql.domain.SGiftItemPo"%>
<%@page import="java.util.List"%>
<%@page import="com.data.DataHelper"%>
<%@page import="com.sql.mapperXml.TMenuGroup"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("login.jsp");
		return;
	}
%>
<%
	UserData data = LandManager.instance.getUser(request);
	if (!data.permissions.contains("MONEY_GET") && (!data.permissions.contains("ALL"))) {
%>你并没有权限！<%
	return;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-1.12.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>礼物设置</title>
</head>
<body>
	<%
		List<SGiftItemPo> items = SqlService.getInstance().sGiftItemDao.getAll();
		List<TMenuLine> menuLine = DataHelper.instance.getLineList();
	%>
	<div>
		<%
			for (SGiftItemPo po : items) {
		%>
		<div>
			<span>id:</span><span name="id"><%=po.getId()%></span> <span>名字:</span><input
				type="text" value="<%=po.getName()%>" name="name"
				onchange="enabelSaveBtn(this)"> <span>類型:</span><select
				onchange="refreshType(this)" name="type">
				<%
					for (EGiftType giftType : EGiftType.values()) {
				%>
				<option value="<%=giftType.getType()%>"
					<%if (po.getType() == giftType.getType()) {%>
					<%="selected='selected'"%> <%}%>><%=giftType.getDesc()%></option>

				<%
					}
				%>
			</select> <span>有效期:</span><input onchange="enabelSaveBtn(this)"
				name="guarantee_period" value="<%=po.getGuaranteePeriod()%>"><span>天</span>
			<%
				EGiftType type = EGiftType.getByType(po.getType());
					JSONObject otherData = new JSONObject();
					try {
						otherData = new JSONObject(po.getOther());
					} catch (Exception e) {

					}
					switch (type) {
						case UKONW :
							break;
						case GIFT_REAL :
							break;
						case CUT_OFF :
							break;
						case GIFT_COMMODITY :
			%>
			<span name="type_span">赠送</span> <select
				onchange="enabelSaveBtn(this)" name="type_gift_commodity_select">
				<%
					for (TMenuLine line : menuLine) {
									if (line.getEnable()) {
				%>
				<option value="<%=line.getId()%>"><%=line.getnName() + "_" + line.getnPrice()%></option>
				<%
					}
								}
				%>
			</select>
			<button name="type_" onclick="addgift_commodity(this)">添加</button>
			<%
				break;
						case FULL_CUT :
							break;
						case INTEGRAL_RETURN :
			%>
			<span name="type_">数量：</span><input name="type_otherValue"
				value="<%=otherData.get("value")%>">
			<%
				break;
						default :
							break;
					}
			%>
			<button disabled="disabled" name='save_btn'>保存</button>
		</div>
		<hr style="border: 1px solid #cccccc; margin: 2px">
		<%
			}
		%>
	</div>

	<div style="text-align: center;">
		<button onclick="addGiftItem()">增加</button>
	</div>

	<script type="text/javascript">
		function addgift_commodity(obj) {
			var parent_div = $(obj).parent();

			var select = parent_div
					.children("select[name='type_gift_commodity_select']");

			$(
					"<input style='width: 10% ;border-color: red;' data-value='"
							+ select.val()
							+ "' name='type_gift_commodity_value' type='text' value='"
							+ select.find('option:selected').text()
							+ "' readonly='readonly'>"
							+ "<button name='type_' onclick='daleteCommodity(this);'>删除</button>")
					.insertAfter($(obj).prev().prev());
		}
		function refreshType(obj) {
			var parent_div = $(obj).parent();
			var select = $(obj).val();
			var btn = parent_div.children("button[name='save_btn']");

			parent_div.children("[name^='type_']").each(function(i, e) {
				$(e).remove()
			});

			switch (select) {
			case '1':
				$("<span name='type_'>数量：</span><input name='' value=''>")
						.insertAfter(btn.prev());
				break;
			case '2':
				break;
			default:
				alert(select);
				break;
			}

			enabelSaveBtn(obj)
		}

		function saveItem(obj)
		{
			var parent_div = $(obj).parent();
			
			
		}
		function daleteCommodity(obj) {
			//	alert("aa");
			enabelSaveBtn(obj);
			$(obj).prev().remove();
			$(obj).remove();

		}
		function enabelSaveBtn(obj) {
			var parent_div = $(obj).parent();

			var btn = parent_div.children("button[name='save_btn']");
			btn.removeAttr("disabled");
		}
		function addGiftItem()
		{
			var parameter ={
					key:'<%=EPageHandlerKey.ADD_NEW_GIFT_ITEM%>'
			};
		$.post('<%=Config.getHelperSrc(request)%>',parameter,function (d,e)
				{
			var data=eval('('+d+')');
			if(data.flag)
				{
				location.reload(true);
				}
			else
				{
				alert(data.msg);
				}
				});
		}
	</script>
</body>
</html>