package com.user;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.Config;
import com.sql.MyBatisManager;
import com.sql.mapper.TMonegChangeMapper;
import com.sql.mapperBean.TMonegChange;
import com.sql.mapperBean.TMonegChangeExample;

public class MonthDataManager {
public static MonthDataManager instance=new MonthDataManager();
	private MonthDataManager()
{
		

}
	public void outData()
	{
		Timestamp tempTime=new Timestamp(System.currentTimeMillis());
		MonthReport report=new MonthReport(tempTime.getMonth());
		try {
			report.init();
			report.out();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		List<TMonegChange> dataList=	 getMoneyChangeManeger(tempTime.getMonth());
//		
//		Map<String,Map<String, MonthData>> payMap=new HashMap<String, Map<String,MonthData>>();
//		
//		for(TMonegChange data:dataList)
//		{
//			Map<String, MonthData> useData=payMap.get(data.getMoneyChangeTypeName());
//			if(useData==null)
//			{
//				useData=new HashMap<>();
//				payMap.put(data.getMoneyChangeTypeName(), useData);
//			}
//			MonthData mouthData=useData.get(data.getChangeUser());
//			if(mouthData==null)
//			{
//				mouthData=new MonthData();
//				useData.put(data.getChangeUser(), mouthData);
//			}
//			mouthData.money+=data.getMoneyChange();
//			
//		}
//		
//		for(String key1:payMap.keySet())
//		{
//			for(String k2:payMap.get(key1).keySet())
//			{
//				MonthData mouthData=payMap.get(key1).get(k2);
//				System.err.println(key1+"  "+k2+"  "+mouthData.money );
//			}
//		}
//		
	}
	
	
public List<TMonegChange> getMoneyChangeManeger(int month)
{
	
	SqlSession session =MyBatisManager.instance.getSession();
	TMonegChangeMapper changeMapper =session.getMapper(TMonegChangeMapper.class);
	
	TMonegChangeExample example=new TMonegChangeExample();
	Timestamp dateStart=new Timestamp(System.currentTimeMillis());
	Timestamp dateEnd=new Timestamp(System.currentTimeMillis());
	dateStart.setHours(7);
	dateStart.setDate(1);
	dateStart.setMonth(month-1);
	
	dateEnd.setHours(7);
	dateEnd.setDate(1);
	dateEnd.setMonth(month);
System.err.println(Config.DATEFORMAT.format(dateEnd));
	example.createCriteria().andTimeBetween(dateStart, dateEnd);
	List<TMonegChange> list=changeMapper.selectByExampleWithBLOBs(example);
	
	System.err.println(list.size());
	session.close();
return list;	
}


}
