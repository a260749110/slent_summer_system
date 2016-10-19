package com.ly.time;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TimeTool {
	 public static String getWebsiteDatetime(String webUrl){
	        try {
	            URL url = new URL(webUrl);// 取得资源对象
	            URLConnection uc = url.openConnection();// 生成连接对象
	            uc.connect();// 发出连接
	            long ld = uc.getDate();// 读取网站日期时间
	            Date date = new Date(ld);// 转换为标准时间对象
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);// 输出北京时间
	            return sdf.format(date);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	 public static String getTime()
	 {
		 String result=getWebsiteDatetime("http://www.baidu.com");
		 if(result==null)
		 {
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
			 result=sdf.format(new Date(System.currentTimeMillis()));
		 }
		 
		 return result;
	 }
}
