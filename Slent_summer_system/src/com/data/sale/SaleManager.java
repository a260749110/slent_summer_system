package com.data.sale;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.data.DataHelper;
import com.sql.MyBatisManager;
import com.sql.mapper.TSilemtSummerSellInfoMapper;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TSilemtSummerSellInfo;
import com.sql.mapperBean.TSilemtSummerSellInfoExample;

public class SaleManager {
public static SaleManager instance=new SaleManager();
	private SaleManager()
{}
	public Map<Long, SaleData> getSaleInfo( int landId)
	{
		SqlSession session=MyBatisManager.instance.getSession();
		TSilemtSummerSellInfoMapper mapper=session.getMapper(TSilemtSummerSellInfoMapper.class);
		TSilemtSummerSellInfoExample example =new TSilemtSummerSellInfoExample();
		example.createCriteria().andUserIdEqualTo(landId);
		List<TSilemtSummerSellInfo> infos=mapper.selectByExample(example);
		Map<Integer, TMenuLine> lineMap=DataHelper.instance.getLineMap();
		SaleData cutOffSeal=new SaleData();
		cutOffSeal.payId=-3;
		cutOffSeal.saleType="折扣金额";
	
		Map<Long, SaleData> map=new HashMap<>();
		map.put(cutOffSeal.payId, cutOffSeal);
		if(infos!=null)
		{
			for(TSilemtSummerSellInfo info:infos)
			{
				if(info.getDeleteFlag())
					continue;
				TMenuLine line=lineMap.get(info.getSellId());
				if(line!=null)
				{
				if(line.getnPrice()>info.getMoneyTrue())
				{
					cutOffSeal.money+=line.getnPrice()-info.getMoneyTrue();
					
				}
				}
				SaleData data=map.get((long)info.getPayType());
				if(data==null)
				{
					data=new SaleData();
					data.money=0;
					data.payId=info.getPayType();
					data.saleType=info.getPayName();
					map.put((long)data.payId, data);
				}
				data.money+=info.getMoneyTrue();
	
			}
		}
		session.close();
		return map;
	}
}
