package com.data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Config;
import com.ly.ObjClone;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TMenuPaymentInfo;
import com.unit.Tool;

public class PayObj {
	public int payType=-1;
	public TMenuPaymentInfo payment;
	public long menuId=0;
	public Date time;
	public String bookNumber;
public	List<Line> payList=new ArrayList<>();
	public Map<String, Line> payMap=new HashMap<>();
	public ArrayList<String> ticket=null;
public	PayObj(Map<String, String[]> map)
{
	if(map==null)
		return;
	bookNumber=map.get("bookNumer")[0];
	time=new Date(System.currentTimeMillis());	
	menuId=MenuHelper.instance.getNextMenuId();
	Map<Integer, TMenuLine> lineMap=DataHelper.instance.getLineMap();
	try {
		
		payType=Integer.valueOf(map.get("payType")[0]);
		payment =DataHelper.instance.getPayInfo(payType);
		for(String key:map.keySet())
		{
			if(key.startsWith("data"))
			{
				//System.err.println(key);
				String dataId=key.replaceFirst("data\\[", "").replaceAll("\\].*", "");
				Line line=payMap.get(dataId);
				if(line==null)
				{
				//	System.err.println("new line "+dataId);
					line=new Line();
					payMap.put(dataId, line);
					payList.add(line);
				}
				if(key.matches("data\\[.*\\]\\[line\\]"))
				{
					
					
					TMenuLine lineTemp1=lineMap.get(Integer.valueOf(map.get(key)[0]));
					TMenuLine lineTemp=new TMenuLine();
					ObjClone.clone(lineTemp1, lineTemp);
					line.lineData=lineTemp;
				
				}
				if(key.matches("data\\[.*\\]\\[money\\]"))
				{
					
					//System.err.println(Float.valueOf(map.get(key)[0]));
					line.lineData.setnPrice(Float.valueOf(map.get(key)[0]));
				
				}
				if(key.matches("data\\[.*\\]\\[choices\\]\\[.*\\]\\[value\\]"))
				{
					
					line.choiceData+="                "+Tool.fillStringLast(Config.PRINT_FONT_COUNT-16, map.get(key)[0], '-')+"\r\n";
				}
				else
				{	
					
				}
			
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}

	
}
public ArrayList<String> getTick()
{
	if(ticket==null)
	{
		toPrintString();
	}
	return ticket;
	}
public String toPrintString()
{
	float all=0;
	if(ticket==null)
		ticket=new ArrayList<>();
	ticket.clear();
	StringBuffer sb=new StringBuffer();
sb.append("-----桌号:"
		+bookNumber+ "----------\r\n");
	int count=0;
	for(Line line :payList)
	{
		
		if(line.lineData!=null)
		{count++;
			String money=line.lineData.getnPrice().toString();
			
		sb.append(count+".  ").append(Tool.fillStringFirst(Config.PRINT_FONT_COUNT-6-money.getBytes().length, line.lineData.getnName(), '-')).append(money).append("\r\n");
		
		all+=line.lineData.getnPrice();
		if(line.lineData.getTicketFlag())
		{
			StringBuffer sbTick=new StringBuffer();
			sbTick.append("--------夏不语 ------- ").append("\r\n");
			sbTick.append("        桌号：").append(bookNumber).append("\r\n");
			sbTick.append("名称：").append(line.lineData.getnName()).append("\r\n");
			sbTick.append("其他要求：").append("\r\n");
			sbTick.append("  ").append(line.choiceData.replaceAll(" ", "").replaceAll("-", "").replaceAll("\r\n", "\r\n  ")).append("\r\n");
			ticket.add(sbTick.toString());
			}
		}
		else 
			System.err.println("error!");
		if(line.choiceData!=null)
		{
		sb.append(line.choiceData).append("\r\n");
		}
		}
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
sb.append(Tool.fillStringLast(Config.PRINT_FONT_COUNT, "总额："+all, ' ')).append("\r\n");
	sb.append((Tool.fillStringLast(Config.PRINT_FONT_COUNT, "支付方式："+payment.getnName(), ' '))).append("\r\n\r\n");
sb.append("单号：").append(menuId).append("\r\n").append(dateFormat.format(time)).append("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
	
return sb.toString();	
}
public float getAllMoney()
{
	float all=0;
	
	for(Line line :payList)
	{
		if(line.lineData!=null)
		{
			
	
		all+=line.lineData.getnPrice();
		}
		
		}
	return all;
	}

public static class Line
{
 public	TMenuLine lineData;
 public	String choiceData="";
	}
}
