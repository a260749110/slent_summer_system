package com;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;


public class Config {
	// 商用
//	public static String MybBatisConfig = "/conf_63.xml";
//
//	public static final String srcAD = "jdbc:mysql://115.29.170.63:3306/wmad?useUnicode=true&characterEncoding=UTF-8";
//	public static final String userAD = "wmad";
//	public static final String pasWAD = "orange.wmad";
//
//	public static final String srcCount = "jdbc:mysql://112.124.67.141:3306/wmcount?useUnicode=true&characterEncoding=UTF-8";
//	public static final String userCount = "wmcount";
//	public static final String pasWCount = "orange.wmcount";
//
//	public static String refreshNowSrc = "http://og.dataface.cn/wk/resetSim?id=all&ide=";
	// 测试
	// public static String MybBatisConfig = "/conf_local.xml";
	// public static final String srcAD =
	// "jdbc:mysql://112.124.67.141:3306/wimipay?useUnicode=true&characterEncoding=UTF-8";
	// public static final String userAD = "wimipay";
	// public static final String pasWAD= "!qaz@wsx";
	// public static final String srcCount =
	// "jdbc:mysql://112.124.67.141:3306/wimipay?useUnicode=true&characterEncoding=UTF-8";
	// public static final String userCount = "wimipay";
	// public static final String pasWCount = "!qaz@wsx";
	// public static String refreshNowSrc =
	// "http://112.124.67.141:9199/wk/resetSim?id=all&ide=";

//本地
//	 public static String MybBatisConfig = "/conf_local.xml";
	public static int PRINT_FONT_COUNT=32;
	 public static String MybBatisConfig = "/conf_local.xml";
	 public static String Version="1.03";
	 public static SimpleDateFormat DATEFORMAT=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 public static String getHelperSrc(HttpServletRequest request)
	 {
		 return request.getContextPath()+"/m/helper/helper.jsp";
	 }
//	 public static final String srcAD =
//	 "jdbc:mysql://112.124.67.141:3306/wimipay?useUnicode=true&characterEncoding=UTF-8";
//	 public static final String userAD = "wimipay";
//	 public static final String pasWAD= "!qaz@wsx";
//	 public static final String srcCount =
//	 "jdbc:mysql://112.124.67.141:3306/wimipay?useUnicode=true&characterEncoding=UTF-8";
//	 public static final String userCount = "wimipay";
//	 public static final String pasWCount = "!qaz@wsx";

}
