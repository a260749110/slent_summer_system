package com.unit;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import com.data.DataHelper;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;

import netscape.javascript.JSObject;
import sun.security.action.GetBooleanSecurityPropertyAction;

public class Tool {
	public static JSONObject objToJsObj(Object obj) {
		try {
			
			JSONObject jb = new JSONObject();
			getSuperData(jb,obj);
			
			Field[] field = obj.getClass().getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
				// 获取属性的名字
				String name = field[i].getName();
				field[i].setAccessible(true);
				Object o=field[i].get(obj);
				if(o==null)
					continue;
				String str= field[i].get(obj).toString();
				if(str!=null)
				{
					try {
						JSONObject jsonObject=new JSONObject(str);
						if(jsonObject!=null)
						{	jb.put(name, jsonObject);
						continue;
							
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {
						JSONArray jsonObject=new JSONArray(str);
						if(jsonObject!=null)
						{	jb.put(name, jsonObject);
						continue;
							
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				jb.put(name, str);
				}
			
			}
			return jb;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	
	}
	@SuppressWarnings("unused")
	private static boolean getSuperData(JSONObject jb ,Object obj)
	{
	
		
		//System.err.println(obj.getClass().getSuperclass().getName());
		try {
			Field[] field = obj.getClass().getSuperclass().getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
				// 获取属性的名字
				String name = field[i].getName();
				
				field[i].setAccessible(true);
				Object o=field[i].get(obj);
				if(o==null)
					continue;
				String str= field[i].get(obj).toString();
			
				if(str!=null)
				{
					try {
						JSONObject jsonObject=new JSONObject(str);
						if(jsonObject!=null)
						{	jb.put(name, jsonObject);
						continue;
							
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {
						JSONArray jsonObject=new JSONArray(str);
						if(jsonObject!=null)
						{	jb.put(name, jsonObject);
						continue;
							
						}
					} catch (Exception e) {
						// TODO: handle exception
					
					}
				jb.put(name, str);
				}
			
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void printTick(String printStr)
	{

		  
    	
        //构建打印请求属性集  
        HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();  
        //设置打印格式，因为未确定类型，所以选择autosense  
        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;  
        //查找所有的可用的打印服务  
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);  
        //定位默认的打印服务  
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();  
        //显示打印对话框  
        
        PrintService service =null;
//         service = ServiceUI.printDialog(null, 200, 200, printService,   
//                defaultService, flavor, pras);  ServiceUI.printDialog(null, 200, 200, printService,   
//                defaultService, flavor, pras);  
        TNoahTitlesWithBLOBs printData=DataHelper.instance.getTitleData("print_ticket");
        String targetPrint  =null;
        if(printData!=null)
        	targetPrint=printData.getnValue();
        if(targetPrint!=null)
      for(PrintService ps:printService)
      {
    	  
    	  if(ps.getName().contains(targetPrint))
    	  {service=ps;
    	  
    	 break;}
    	  
      }
        
      if(service==null)
      {
    	  System.err.println(" print:"+printStr);
      }
        if(service != null){  
            try {  
            	String str=printStr;
            	ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());   
            	
                DocPrintJob job = service.createPrintJob(); //创建打印作业  
                
                DocAttributeSet das = new HashDocAttributeSet();  
                Doc doc = new SimpleDoc(in, flavor, das);  
                job.print(doc, pras);  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        else
        {
        	System.err.println(" print:"+printStr);}
	
	} 
	public static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static String getNowTimeStr()
	{
		return dateFormat.format(new Date(System.currentTimeMillis()));
	}
	public static void print(String printStr)
	{
		  
    	
        //构建打印请求属性集  
        HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();  
        //设置打印格式，因为未确定类型，所以选择autosense  
        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;  
        //查找所有的可用的打印服务  
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);  
        //定位默认的打印服务  
        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();  
        //显示打印对话框  
        
        PrintService service =null;
//         service = ServiceUI.printDialog(null, 200, 200, printService,   
//                defaultService, flavor, pras);  ServiceUI.printDialog(null, 200, 200, printService,   
//                defaultService, flavor, pras);  
        TNoahTitlesWithBLOBs printData=DataHelper.instance.getTitleData("print_name");
        String targetPrint  =null;
        if(printData!=null)
        	targetPrint=printData.getnValue();
        if(targetPrint!=null)
      for(PrintService ps:printService)
      {
    	  
    	  if(ps.getName().contains(targetPrint))
    	  {service=ps;
    	  
    	 break;}
    	  
      }
        
      if(service==null)
      {
    	 // System.err.println(" print:"+printStr);
      }
        if(service != null){  
            try {  
            	String str=printStr;
            	ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());   
            	
                DocPrintJob job = service.createPrintJob(); //创建打印作业  
                
                DocAttributeSet das = new HashDocAttributeSet();  
                Doc doc = new SimpleDoc(in, flavor, das);  
                job.print(doc, pras);  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        else
        {
        	System.err.println(" print:"+printStr);
        	}
        }
	public static String fillStringLast(int size,String str,char fill)
	{
		byte[] strChar=str.getBytes();
		if(strChar.length>=size)
			return str;
		System.err.println(strChar.length);
		char[] fillChars=new char[size-strChar.length];
		for(int i=0;i<fillChars.length;i++)
		{
			fillChars[i]=fill;
		}
		return str.replaceFirst("", new String(fillChars));
	}
	public static String fillStringFirst(int size,String str,char fill)
	{
		byte[] strChar=str.getBytes();
		if(strChar.length>=size)
			return str;
		System.err.println(strChar.length);
		char[] fillChars=new char[size-strChar.length];
		for(int i=0;i<fillChars.length;i++)
		{
			fillChars[i]=fill;
		}
		return str+new String(fillChars);
	}
	public static com.alibaba.fastjson.JSONObject httpPostToJS(HttpServletRequest request)
	{
		com.alibaba.fastjson.JSONObject js=new com.alibaba.fastjson.JSONObject();
		Map<String, String[]> maps=request.getParameterMap();
		for (String str:maps.keySet()) {
			js.put(str, maps.get(str)[0]);
		}
		return js;
	}
}
