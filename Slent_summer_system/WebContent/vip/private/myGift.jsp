<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.HashMap"%>
<%@page import="javax.naming.ldap.HasControls"%>
<%@page import="java.util.Map"%>

<%@page import="com.spring.sql.domain.SGiftItemPo"%>
<%@page import="com.spring.service.impl.SqlService"%>
<%@page import="com.spring.sql.domain.SVipGiftPo"%>
<%@page import="java.util.List"%>
<%@page import="com.vip.VipManeger"%>
<%@page import="com.vip.VipInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>这都是我的  ✿✿ヽ(ﾟ▽ﾟ)ノ✿</title>
	<!-- links -->
	<jsp:include page="../layout/links.jsp"></jsp:include>
	<!-- //links -->
</head>
<%
	VipInfo vipInfo = VipManeger.instance.getVipInfo(request);
%>
<body class="bg">
	<!-- nav -->
	<jsp:include page="../layout/nav.jsp"></jsp:include>
	<!-- //nav -->
	<!-- logo -->
<jsp:include page="../layout/logo.jsp"></jsp:include>
	<!-- //logo -->
	<!-- banner -->
	
	
<div>
<%
SqlService.getInstance().sVipGiftDao.removeByTime();
List<SVipGiftPo> list=SqlService.getInstance().sVipGiftDao.findByVipId(vipInfo.sVip.getId());
Iterable<SGiftItemPo> giftList=SqlService.getInstance().sGiftItemDao.getAll();
Map<Integer,SGiftItemPo> giftMap=new HashMap();
SimpleDateFormat dateFormat=new SimpleDateFormat(" yy-MM-dd HH:mm:ss");
for(SGiftItemPo po:giftList)
{
	giftMap.put(po.getId(), po);
	}

%>
	<div class="title margin-top">
	<h3 class="page-header icon-subheading">  ♪♫♬~~这都是我的  ✿✿ヽ(ﾟ▽ﾟ)ノ✿</h3>
	</div>
	<%for(SVipGiftPo po:list){
		
		%>
	<div class="icon-box col-md-12 col-sm-4">
	<div><%=giftMap.get(po.getGiftId()).getName() %></div>
	<div>结束时间:<%=dateFormat.format(po.getEndDate() ) %></div>
	<div><%=(po.getUseFlag()<1)?"未兑换":"已兑换" %></div>
	</div>
		<% 
	} %>

	</div>
	</body>
	</html>