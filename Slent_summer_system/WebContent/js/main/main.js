$(function()
		{

	$.post("divs/main_vip_gift_div.jsp","",function (d,s)
			{
		$("body").append(d);
		$("#vipGiftBlock").hide();
			})
	
		})
		
