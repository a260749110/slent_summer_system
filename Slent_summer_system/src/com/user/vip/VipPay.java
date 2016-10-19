package com.user.vip;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONObject;

import com.Config;
import com.data.DataHelper;
import com.data.PayObj;
import com.data.PayObj.Line;
import com.sql.mapperBean.SVip;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperXml.TNoahTitlesKey;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;
import com.unit.Tool;

public class VipPay {
	private CutoffData second_cutoff=null;
	private CutoffData cutoff=null;
	public PayObj pb;
	public SVip vipData=null;
	public float allMoney=0;
	private Map<Line, VipLine> lineTranceFormMap=new HashMap<>();
	public static int sessid=0;
public VipPay(Map<String, String[]> map)
{
	 pb=new PayObj(map);

	init();
	
	Map<Integer, List<VipLine>> transformData=new HashMap<Integer, List<VipLine>>();
	for(Line line:pb.payList)
	{
	List<VipLine> data=transformData.get(line.lineData.getId());
	if(data==null)
	{
		data=new ArrayList<VipLine>();
		
	transformData.put(line.lineData.getId(), data);
	}
	VipLine vipLine=new VipLine();
	vipLine.line=line.lineData;
	data.add(vipLine);
	Calendar cal = Calendar.getInstance();
	cal.setTime(new Time(System.currentTimeMillis()));

	if(second_cutoff.enable&&((second_cutoff.allGroupFlag||second_cutoff.gorupTree.contains(line.lineData.getnGroupId()))
			||(second_cutoff.allLineFlag||second_cutoff.lineTree.contains(line.lineData.getId()))))
	{
	if(data.size()%2==0)
	{
		if(second_cutoff.allWeekFlag||second_cutoff.weekTree.contains(cal.get(Calendar.DAY_OF_WEEK)-1))
		{
			if((second_cutoff.allGroupFlag||second_cutoff.gorupTree.contains(line.lineData.getnGroupId()))
					||(second_cutoff.allLineFlag||second_cutoff.lineTree.contains(line.lineData.getId())))
			{
				vipLine.secoendCutoffStr=second_cutoff.tip+second_cutoff.cutoff*100+"%";
				vipLine.vipPrice=(vipLine.line.getnPrice()*second_cutoff.cutoff);
				line.lineData.setnPrice(vipLine.vipPrice);
				
				allMoney+=vipLine.vipPrice;
			}
		}
		
	}
	else
	{
		allMoney+=vipLine.line.getnPrice();
	}
	}
	else if(cutoff.enable&&(cutoff.allWeekFlag||cutoff.weekTree.contains(cal.get(Calendar.DAY_OF_WEEK)-1)))
	{
		if((cutoff.allGroupFlag||cutoff.gorupTree.contains(line.lineData.getnGroupId()))
				||(cutoff.allLineFlag||cutoff.lineTree.contains(line.lineData.getId())))
		{
			vipLine.secoendCutoffStr=second_cutoff.tip+cutoff.cutoff*100+"%";
			vipLine.vipPrice=(vipLine.line.getnPrice()*cutoff.cutoff);
			line.lineData.setnPrice(vipLine.vipPrice);
			allMoney+=vipLine.vipPrice;
			
		}else
		{
			allMoney+=vipLine.line.getnPrice();
		}
	}
	else 
	{
		if(vipLine.line.getPriceVip()>0)
		{
			vipLine.vipPrice=vipLine.line.getPriceVip();
			vipLine.line.setnPrice(vipLine.vipPrice);
			allMoney+=vipLine.line.getPriceVip();
		}
		else
		{
		allMoney+=vipLine.line.getnPrice();
		}
	}
	
	
	lineTranceFormMap.put(line, vipLine);
	}
	
//System.err.println(getCutoffData());
	}
public String getKey()
{
	return "Vip_pay"+(sessid++);}
public String getCutoffData()
{

	float all=0;
	if(pb.ticket==null)
		pb.ticket=new ArrayList<>();
		pb.ticket.clear();
	StringBuffer sb=new StringBuffer();
sb.append("-----桌号:"
		+pb.bookNumber+ "----------\r\n");
	int count=0;

	for(Line line :pb.payList)
	{
		boolean cutoffFlag=false;
		if(line.lineData!=null)
		{count++;
			String money=line.lineData.getnPrice().toString();
			
		sb.append(count+".  ").append(Tool.fillStringFirst(Config.PRINT_FONT_COUNT-6-money.getBytes().length, line.lineData.getnName(), '-')).append(money).append("\r\n");
		VipLine vipLine=lineTranceFormMap.get(line);
		if(vipLine!=null)
		{
			if (!vipLine.secoendCutoffStr.isEmpty()) {
				sb.append(vipLine.secoendCutoffStr).append("      ").append(vipLine.vipPrice).append("\r\n");
				cutoffFlag=true;
			}
			else
			if (!vipLine.cutoffStr.isEmpty()) {
				sb.append(vipLine.cutoffStr).append("      ").append(vipLine.vipPrice).append("\r\n");
				cutoffFlag=true;
			}
		}
		float price=line.lineData.getnPrice();
		if(cutoffFlag||vipLine.line.getPriceVip()>0)
		{
			price=vipLine.vipPrice;
		}
		all+=price;
		if(line.lineData.getTicketFlag())
		{
			StringBuffer sbTick=new StringBuffer();
			sbTick.append("--------夏不语 ------- ").append("\r\n");
			sbTick.append("        桌号：").append(pb.bookNumber).append("\r\n");
			sbTick.append("名称：").append(line.lineData.getnName()).append("\r\n");
			sbTick.append("其他要求：").append("\r\n");
			sbTick.append("  ").append(line.choiceData.replaceAll(" ", "").replaceAll("-", "").replaceAll("\r\n", "\r\n  ")).append("\r\n");
			System.err.println(sbTick+"!!");
			pb.ticket.add(sbTick.toString());
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
	sb.append((Tool.fillStringLast(Config.PRINT_FONT_COUNT, "支付方式：VIP支付", ' '))).append("\r\n\r\n");
sb.append("单号：").append(pb.menuId).append("\r\n").append(dateFormat.format(pb.time)).append("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
	
return sb.toString();	

	}
private void init()
{
	cutoff = new CutoffData( DataHelper.instance.getTitleData("vip_cut_off"));
	second_cutoff = new CutoffData( DataHelper.instance.getTitleData("vip_second_cutoff"));

}






public static class VipLine
{
	public  TMenuLine line=null;
	public String secoendCutoffStr="";
	public String cutoffStr="";
	public float vipPrice=0;
	public VipLine()
	{}
	}
public static  class CutoffData
{
	public boolean allGroupFlag=false;
	public boolean allLineFlag=false;
	public boolean allWeekFlag=false;
	public boolean enable =true;
	public TreeSet<Integer> gorupTree=new TreeSet<>();
	public TreeSet<Integer> lineTree=new TreeSet<>();
	public TreeSet<Integer> weekTree=new TreeSet<>();
	public float cutoff=1;
	public String tip="";
	public CutoffData(TNoahTitlesWithBLOBs info)
	{
		try {
			JSONObject js=new JSONObject(info.getnValue());
			enable=js.getBoolean("enable");
			tip=info.getnTip();
			
			JSONArray groupJsList=js.getJSONArray("group");
			JSONArray lineJsList=js.getJSONArray("line");
			JSONArray weekJsList=js.getJSONArray("week");
			cutoff=(float) js.getDouble("cutoff");
		for(int i=0;i<groupJsList.length();i++)
		{
			int temp=groupJsList.getInt(i);
			if(temp==-1)
			{
				allGroupFlag=true;
				
			}
			else
			{
			gorupTree.add(temp);
			}
			}
	
		for(int i=0;i<lineJsList.length();i++)
		{
			int temp=lineJsList.getInt(i);
			if(temp==-1)
			{
				allLineFlag=true;
				
			}
			else
			{
				lineTree.add(temp);
			}
		
		}
		for(int i=0;i<weekJsList.length();i++)
		{
			int temp=weekJsList.getInt(i);
			if(temp==-1)
			{
				allWeekFlag=true;
			
			}
			else
			{
			weekTree.add(temp);
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	
	}
}
