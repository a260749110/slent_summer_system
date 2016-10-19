package com.data;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.json.JSONObject;

import com.data.PayObj.Line;
import com.sql.MyBatisManager;
import com.sql.mapper.TMenuChoiceMapper;
import com.sql.mapper.TMenuGroupMapper;
import com.sql.mapper.TMenuLineMapper;
import com.sql.mapper.TMenuPaymentInfoMapper;
import com.sql.mapper.TNoahTitlesMapper;
import com.sql.mapper.TSilemtSummerSellInfoMapper;
import com.sql.mapper.TUserMapper;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TMenuLineExample;
import com.sql.mapperBean.TMenuPaymentInfo;
import com.sql.mapperBean.TMenuPaymentInfoExample;
import com.sql.mapperBean.TSilemtSummerSellInfo;
import com.sql.mapperBean.TSilemtSummerSellInfoExample;
import com.sql.mapperBean.TUser;
import com.sql.mapperBean.TUserExample;
import com.sql.mapperXml.TMenuChoice;
import com.sql.mapperXml.TMenuChoiceExample;
import com.sql.mapperXml.TMenuGroup;
import com.sql.mapperXml.TMenuGroupExample;
import com.sql.mapperXml.TNoahTitlesExample;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;
import com.user.LandManager;
import com.user.UserData;

public class DataHelper {
	public final static DataHelper instance = new DataHelper();

	private DataHelper() {
	}

	public static int cout = 0;

	public Map<Integer, TMenuGroup> getGroupMap() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuGroupMapper mapper = session.getMapper(TMenuGroupMapper.class);
		TMenuGroupExample example = new TMenuGroupExample();
		example.createCriteria().andIdGreaterThan(0);
		List<TMenuGroup> list = mapper.selectByExampleWithBLOBs(example);
		Map<Integer, TMenuGroup> result = new HashMap<Integer, TMenuGroup>();
		for (TMenuGroup group : list) {
			result.put(group.getId(), group);
		}
		session.close();
		return result;
	}

	public List<TMenuGroup> getGroupList() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuGroupMapper mapper = session.getMapper(TMenuGroupMapper.class);
		TMenuGroupExample example = new TMenuGroupExample();
		example.createCriteria().andIdGreaterThan(0);
		List<TMenuGroup> list = mapper.selectByExampleWithBLOBs(example);

		session.close();
		return list;
	}

	public boolean saveGroup(TMenuGroup group) {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuGroupMapper mapper=session.getMapper(TMenuGroupMapper.class);
		TMenuGroup gs=null;
		if (group.getId() > 0) {
			gs=mapper.selectByPrimaryKey(group.getId());
		}
		if(gs!=null)
		{
			mapper.updateByPrimaryKeyWithBLOBs(group);
			
		}
		else
		{
			//TMenuGroup tMenuGroup=new TMenuGroup();
			group.setId(null);
			mapper.insert(group);
		}
		session.commit();
		session.close();

		return false;
	}
	public List<TUser> getUserList()
	{
		SqlSession session = MyBatisManager.instance.getSession();
		TUserMapper mapper = session.getMapper(TUserMapper.class);
		TUserExample example = new TUserExample();
		example.createCriteria().andIdIsNotNull();
		List<TUser> list = mapper.selectByExample(example);

		session.close();
		return list;
	}
	public boolean testUser(String id)
	{
		if(id==null)
			return false;
		SqlSession session = MyBatisManager.instance.getSession();
		TUserMapper mapper = session.getMapper(TUserMapper.class);
		TUser user=mapper.selectByPrimaryKey(id);

		session.close();
		if(user==null)
		{
			return false;
		}
		return true;
	}
	public boolean saveUser(TUser user) {
		SqlSession session = MyBatisManager.instance.getSession();
		TUserMapper mapper=session.getMapper(TUserMapper.class);
		TUser gs=null;
		
			gs=mapper.selectByPrimaryKey(user.getId());
		
		if(gs!=null)
		{
			mapper.updateByPrimaryKeySelective(user);
			
		}
		else
		{
			//TMenuGroup tMenuGroup=new TMenuGroup();
			
			mapper.insert(user);
		}
		session.commit();
		session.close();

		return false;
	}
	public List<TSilemtSummerSellInfo> getSellInfosBySecond(int second)
	{
		SqlSession session=MyBatisManager.instance.getSession();
		TSilemtSummerSellInfoMapper mapper=session.getMapper(TSilemtSummerSellInfoMapper.class);
		TSilemtSummerSellInfoExample example=new TSilemtSummerSellInfoExample();
		Timestamp time=new Timestamp(System.currentTimeMillis());
		time.setSeconds(time.getSeconds()-second);
		example.createCriteria().andTimeGreaterThanOrEqualTo(time);
		List<TSilemtSummerSellInfo>  list =mapper.selectByExample(example);
		
		session.close();
		return list;
	}
	public List<TSilemtSummerSellInfo> getSellInfosByTime(Timestamp start,Timestamp end)
	{
		SqlSession session=MyBatisManager.instance.getSession();
		TSilemtSummerSellInfoMapper mapper=session.getMapper(TSilemtSummerSellInfoMapper.class);
		TSilemtSummerSellInfoExample example=new TSilemtSummerSellInfoExample();
		
		example.createCriteria().andTimeBetween(start, end);
		List<TSilemtSummerSellInfo>  list =mapper.selectByExample(example);
		
		session.close();
		return list;
	}
	public boolean saveChoice(TMenuChoice choice) {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuChoiceMapper mapper=session.getMapper(TMenuChoiceMapper.class);
		TMenuChoice gs=null;
		if (choice.getId() > 0) {
			gs=mapper.selectByPrimaryKey(choice.getId());
		}
		if(gs!=null)
		{
			mapper.updateByPrimaryKeyWithBLOBs(choice);
			
		}
		else
		{
			//TMenuGroup tMenuGroup=new TMenuGroup();
			choice.setId(null);
			mapper.insert(choice);
		}
		session.commit();
		session.close();

		return false;
	}
	
	public boolean savePayType(TMenuPaymentInfo payType) {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuPaymentInfoMapper mapper=session.getMapper(TMenuPaymentInfoMapper.class);
		TMenuPaymentInfo gs=null;
		if (payType.getId() > 0) {
			gs=mapper.selectByPrimaryKey(payType.getId());
		}
		if(gs!=null)
		{
			mapper.updateByPrimaryKeySelective(payType);
			
		}
		else
		{
			//TMenuGroup tMenuGroup=new TMenuGroup();
			payType.setId(null);
			mapper.insert(payType);
		}
		session.commit();
		session.close();

		return false;
	}
	
	
	public Map<Integer, TMenuLine> getLineMap() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuLineMapper mapper = session.getMapper(TMenuLineMapper.class);
		TMenuLineExample example = new TMenuLineExample();
		example.createCriteria().andIdGreaterThan(0);
		List<TMenuLine> list = mapper.selectByExample(example);
		Map<Integer, TMenuLine> result = new HashMap<Integer, TMenuLine>();
		for (TMenuLine line : list) {
			result.put(line.getId(), line);
		}
		session.close();
		return result;
	}

	public List<TMenuLine> getLineList() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuLineMapper mapper = session.getMapper(TMenuLineMapper.class);
		TMenuLineExample example = new TMenuLineExample();
		example.createCriteria().andIdGreaterThan(0);
		List<TMenuLine> list = mapper.selectByExample(example);

		session.close();
		return list;
	}

public boolean saveLine(TMenuLine line) {
	SqlSession session = MyBatisManager.instance.getSession();
	TMenuLineMapper mapper=session.getMapper(TMenuLineMapper.class);
	TMenuLine gs=null;
	if (line.getId() > 0) {
		gs=mapper.selectByPrimaryKey(line.getId());
	}
	if(gs!=null)
	{
		mapper.updateByPrimaryKeySelective(line);		
	}
	else
	{
		//TMenuGroup tMenuGroup=new TMenuGroup();
		line.setId(null);
		mapper.insert(line);
	}
	session.commit();
	session.close();

	return true;
}

public boolean saveSellInfo(TSilemtSummerSellInfo sellInfo) {
	SqlSession session = MyBatisManager.instance.getSession();
	TSilemtSummerSellInfoMapper mapper=session.getMapper(TSilemtSummerSellInfoMapper.class);
	
		mapper.updateByPrimaryKeySelective(sellInfo);		

	session.commit();
	session.close();

	return true;
}
	public Map<Integer, TMenuChoice> getChoiceMap() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuChoiceMapper mapper = session.getMapper(TMenuChoiceMapper.class);
		TMenuChoiceExample example = new TMenuChoiceExample();

		List<TMenuChoice> list = mapper.selectByExampleWithBLOBs(example);
		Map<Integer, TMenuChoice> result = new HashMap<Integer, TMenuChoice>();
		for (TMenuChoice choice : list) {
			result.put(choice.getId(), choice);

		}
	
		session.close();
		return result;
	}
	
	public List< TMenuChoice> getChoiceList() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuChoiceMapper mapper = session.getMapper(TMenuChoiceMapper.class);
		TMenuChoiceExample example = new TMenuChoiceExample();

		List<TMenuChoice> list = mapper.selectByExampleWithBLOBs(example);
	
		session.close();
		return list;
	}
	public Map<Integer, MenuData> getMenuDataMap() {
		Map<Integer, TMenuGroup> groupMap = getGroupMap();
		Map<Integer, MenuData> menuMap = new HashMap<Integer, MenuData>();
		Map<Integer, TMenuLine> lineMap = getLineMap();
		Map<Integer, TMenuChoice> choiceMap = getChoiceMap();
		for (TMenuGroup group : groupMap.values()) {
			if (!group.getEnable())
				continue;
			MenuData data = new MenuData();
			data.group = group;
			data.lines = new HashMap<Integer, LineData>();
			menuMap.put(group.getId(), data);
		}
		for (TMenuLine line : lineMap.values()) {
			if (!line.getEnable())
				continue;
			MenuData menuData = menuMap.get(line.getnGroupId());
			if (menuData == null)
				continue;
			LineData lineData = new LineData();
			lineData.line = line;
			if (line.getOtherChoice() != null) {
				try {
					JSONArray array = new JSONArray(line.getOtherChoice());
					for (int i = 0; i < array.length(); i++) {
						ChoiceData choiceData = ChoiceData.createChoiceData(
								array.getInt(i), choiceMap);
						if (choiceData != null) {
							lineData.choiceMap.put(choiceData.choice.getId(),
									choiceData);
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					// e.printStackTrace();
				}
			}
			menuData.lines.put(lineData.line.getId(), lineData);
		}
		return menuMap;
	}

	public List<TMenuPaymentInfo> getPayInfoList() {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuPaymentInfoMapper mapper = session
				.getMapper(TMenuPaymentInfoMapper.class);
		TMenuPaymentInfoExample example = new TMenuPaymentInfoExample();
		example.createCriteria().andIdIsNotNull().andIdGreaterThanOrEqualTo(0);
		List<TMenuPaymentInfo> list = mapper.selectByExample(example);
		session.close();
		return list;
	}

	public TMenuPaymentInfo getPayInfo(int id) {
		SqlSession session = MyBatisManager.instance.getSession();
		TMenuPaymentInfoMapper mapper = session
				.getMapper(TMenuPaymentInfoMapper.class);

		TMenuPaymentInfo result = mapper.selectByPrimaryKey(id);
		session.close();
		return result;
	}

	public TNoahTitlesWithBLOBs getTitleData(String index) {
		SqlSession session = MyBatisManager.instance.getSession();
		TNoahTitlesMapper mapper = session.getMapper(TNoahTitlesMapper.class);

		TNoahTitlesExample example = new TNoahTitlesExample();
		example.createCriteria().andNIndexEqualTo(index);
		List<TNoahTitlesWithBLOBs> list = mapper
				.selectByExampleWithBLOBs(example);

		TNoahTitlesWithBLOBs result = null;
		if (list.size() != 0) {
			result = list.get(0);
		}
		session.close();
		return result;
	}

	public void saveSellInfo(PayObj payObj) {
		SqlSession session = MyBatisManager.instance.getSession();
		TSilemtSummerSellInfoMapper mapper = session
				.getMapper(TSilemtSummerSellInfoMapper.class);
		for (Line line : payObj.payList) {
			TSilemtSummerSellInfo info = new TSilemtSummerSellInfo();
			info.setDeleteFlag(false);
			info.setFlight(new Date(System.currentTimeMillis()));
			info.setTime(payObj.time);
			info.setMoneyTrue(line.lineData.getnPrice());
			info.setPayType(payObj.payType);
			info.setPayName(payObj.payment.getnName());
			info.setPayId(payObj.menuId);
			info.setSellId(line.lineData.getId());
			info.setSellName(line.lineData.getnName());
			info.setUserId(LandManager.instance.landId.getLandId());

			info.setUserName("GM");
			mapper.insertSelective(info);
		}

		session.commit();
		session.close();

	}

	public void saveTitleData(TNoahTitlesWithBLOBs data) {
		if (data.getnIndex() == null)
			return;
		SqlSession session = MyBatisManager.instance.getSession();
		TNoahTitlesMapper mapper = session.getMapper(TNoahTitlesMapper.class);

		TNoahTitlesExample example = new TNoahTitlesExample();
		example.createCriteria().andNIndexEqualTo(data.getnIndex());
		if (mapper.countByExample(example) <= 0) {
			mapper.insert(data);

		} else {

			mapper.updateByPrimaryKeySelective(data);

		}
		session.commit();
		session.close();

	}

	public static class MenuData {
		public TMenuGroup group;
		public Map<Integer, LineData> lines;

		public MenuData() {
		}
	}

	public static class LineData {
		public TMenuLine line;
		public Map<Integer, ChoiceData> choiceMap = new HashMap<Integer, DataHelper.ChoiceData>();

		public LineData() {
		}
	}

	public static class ChoiceData {
		public TMenuChoice choice;
		public String[] datas = {};

		public static ChoiceData createChoiceData(int choices,
				Map<Integer, TMenuChoice> map) {
			if (map == null)
				return null;
			TMenuChoice choice = map.get(choices);
			if (choice != null) {
				ChoiceData data = new ChoiceData(choice);
				return data;
			}
			return null;
		}

		public ChoiceData(TMenuChoice choice) {
			this.choice = choice;
			if (choice != null && choice.getnChoice() != null) {
				try {
					JSONArray array = new JSONArray(choice.getnChoice());
					datas = new String[array.length()];
					for (int i = 0; i < array.length(); i++) {
						datas[i] = array.getString(i);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

	}
}
