package com.unit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeManager {
	 private static   String[] webUrls = {"http://www.baidu.com",//
			   "http://www.taobao.com",
			   "http://www.ntsc.ac.cn",
			   "http://www.360.cn",
			   "http://www.beijing-time.org"
	   };



	  public static void init()
	  {
		  for(String url:webUrls)
		  {
			  try {
				  Date date=getWebsiteDatetime(url);
				  if(date!=null)
				  {
					  setDate(date); 
					  return ;
				  }
			} catch (Exception e) {
				// TODO: handle exception
			}
		  }
	  }
	    /**
	     * ��ȡָ����վ������ʱ��
	     * 
	     * @param webUrl
	     * @return
	     * @author SHANHY
	     * @throws IOException 
	     * @date   2015��11��27��
	     */
	    private static Date getWebsiteDatetime(String webUrl) throws IOException{
	      
	            URL url = new URL(webUrl);// ȡ����Դ����
	            URLConnection uc = url.openConnection();// �������Ӷ���
	            uc.connect();// ��������
	            long ld = uc.getDate();// ��ȡ��վ����ʱ��
	            Date date = new Date(ld);// ת��Ϊ��׼ʱ�����
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);// �������ʱ��
	            return date;
	    
	     
	    }
	    private static void setDate(Date date)
	    {
			 String osName = System.getProperty("os.name");  
			  String cmd = "";  
			  try {  
			      if (osName.matches("^(?i)Windows.*$")) {// Window ϵͳ  
			      // ��ʽ HH:mm:ss  
			    	   SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);// �������ʱ�� 
			      cmd = "  cmd /c time "+time.format(date);  
			      Runtime.getRuntime().exec(cmd);  
			      // ��ʽ��yyyy-MM-dd  
			      SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);// �������ʱ�� 
			      cmd = " cmd /c date "+dateF.format(date);  
			      Runtime.getRuntime().exec(cmd);  
			  } else {// Linux ϵͳ  
			     // ��ʽ��yyyyMMdd  
				  SimpleDateFormat dateF = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);// �������ʱ�� 
			     cmd = "  date -s "+dateF.format(date);  
			     Runtime.getRuntime().exec(cmd);  
			     // ��ʽ HH:mm:ss  
			     SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);// �������ʱ�� 
			     cmd = "  date -s "+time.format(date);  
			     Runtime.getRuntime().exec(cmd);  
			  }  
			  } catch (IOException e) {  
			      e.printStackTrace();  
			  }  
	    }
}
