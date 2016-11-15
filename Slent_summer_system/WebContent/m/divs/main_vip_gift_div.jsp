<%@page import="com.page.PageHandler.EPageHandlerKey"%>
<%@page import="com.user.UserData"%>
<%@page import="com.user.LandManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (LandManager.instance.testLand(request, response) <= 0) {
		response.sendRedirect("login.jsp");
		return;
	}

	UserData ud = LandManager.instance.getUser(request);
%>

<div id="vipGiftBlock"
	style="width: 100%; height: 85%; display: block; position: absolute; top: 15%; left: 0%; background-color: white; text-align: center;">
	<span>会员卡号：</span> <input type="text" id="vip_gift_id" value="" /> <span>密码：</span>
	<input type="password" id="vip_gift_pasw" value="" />
	<button onclick="showVipGift()">查询</button>
	<div style="width: 100% ; border:2px solid #d9d7d7;"  id="gifts">
														
	</div>
	<div>
		<a onclick="closeVipGiftDiv()">关闭</a>
	</div>
	<div>
		<script type="text/javascript">
		
		function vipGiftDivShow()
		{
			$("#vipGiftBlock").show();
			$("#gifts").html("");
			$("#vip_gift_id").val("");
			$("#vip_gift_pasw").val("");
			}
		function closeVipGiftDiv()
		{
			$("#vipGiftBlock").hide();
			}
		function showVipGift()
		{
			$.post("helper/helper.jsp",{key:'<%=EPageHandlerKey.VIP_GIFT_SELECT%>',
										id:$('#vip_gift_id').val(),
										passw:$('#vip_gift_pasw').val()},function (d,s)
					{
				var data=eval("("+d+")");
				
				if(!data.flag)
					{
					alert("false");
					alert(data.msg)
					return ;
					}
			
				var giftList=data.gifts;
				
				 addGiftItem(giftList);
					})
		}
		function addGiftItem( gifts)
		{
			
			for (var i = 0; i < gifts.length; i++) {
				var gift=gifts[i];
				var id=gift.id;
				var name=gift.name;
				var use="已使用";
				if(!gift.useFlag)
					{
					use="<button onclick='castGift("+id+",this)'>兑换</button>";
					}
				var parentdiv=('<div name="gitItem  ">'+id+':'+name+" "+use+'</div>');
				$('#gifts').append(parentdiv);
		
			
				
			}
		}
		function castGift(id,btn)
		{
			$(btn).html("已兑换");
			$(btn).attr("disabled","true");
		}
		</script>