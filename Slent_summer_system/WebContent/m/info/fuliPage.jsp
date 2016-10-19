<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.sql.mapperBean.TSilemtSummerSellInfoExample"%>
<%@page import="java.sql.Date"%>
<%@page import="com.sql.mapper.TSilemtSummerSellInfoMapper"%>
<%@page import="com.sql.mapperBean.TSilemtSummerSellInfo"%>
<%@page import="com.sql.MyBatisManager"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>本月福利查看</title>
</head>
<body>
	<%
		
SqlSession sqlSession=MyBatisManager.instance.getSession(); 
TSilemtSummerSellInfoMapper infoMapper=sqlSession.getMapper(TSilemtSummerSellInfoMapper.class);
TSilemtSummerSellInfoExample example=new TSilemtSummerSellInfoExample();

Date date=new Date(System.currentTimeMillis());
date.setDate(1);

example.createCriteria().andFlightGreaterThanOrEqualTo(date);

List<TSilemtSummerSellInfo> resultList=infoMapper.selectByExample(example);



sqlSession.close();
Map<String,Float> resultMap=new HashMap();
if(resultList!=null)
{
for(TSilemtSummerSellInfo info:resultList)
{
	if(!info.getPayName().contains("福利"))
	continue;
	
	Float f=resultMap.get(info.getPayName());
	if(f==null)
	{
	f=0f;
	}
	
	f+=info.getMoneyTrue();
	resultMap.put(info.getPayName(), f);
}
}
 

	%>

<%for(String key:resultMap.keySet()) 
{%>

<div>
<%=key %>:<%=resultMap.get(key) %>
</div>
<%} %>
</body>
</html>