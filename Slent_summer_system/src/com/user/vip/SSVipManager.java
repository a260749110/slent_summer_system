package com.user.vip;

import java.io.UnsupportedEncodingException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.CORBA.DATA_CONVERSION;

import sun.reflect.generics.tree.Tree;

import com.data.DataHelper;
import com.sql.MyBatisManager;
import com.sql.mapper.SVipMapper;
import com.sql.mapper.TSilemtSummerSellInfoMapper;
import com.sql.mapper.TUserMapper;
import com.sql.mapperBean.SVip;
import com.sql.mapperBean.SVipExample;
import com.sql.mapperBean.TMenuPaymentInfo;
import com.sql.mapperBean.TSilemtSummerSellInfo;
import com.sql.mapperBean.TUser;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;
import com.user.LandManager;
import com.user.MoneyManager;

public class SSVipManager {
	public static final SSVipManager instance = new SSVipManager();

	private SSVipManager() {
	}

	public int regVip(HttpServletResponse response, HttpServletRequest request) {
		if (request == null || response == null)
			return -1;
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		SqlSession session = null;
		try {

			String name = request.getParameter("vip_name");
			String phone = request.getParameter("phone");
			String sex = request.getParameter("sex");

			String vip_passw = request.getParameter("vip_passw");
			String mail = request.getParameter("mail");

			String vip_qq = request.getParameter("vip_qq");
			String sage = (request.getParameter("age"));
			String sreferee = (request.getParameter("referee"));
			String slvl = (request.getParameter("lvl"));
			String svip_id = (request.getParameter("vip_id"));
			String sfirst_money = (request.getParameter("first_money"));
			String spayType = (request.getParameter("payType"));
			System.err.println(spayType);
			int age = (sage != null && !sage.isEmpty()) ? Integer
					.valueOf(request.getParameter("age")) : 0;
			long referee = (sreferee != null && !sreferee.isEmpty()) ? Long
					.valueOf(request.getParameter("referee")) : 0;
			int lvl = (slvl != null && !slvl.isEmpty()) ? Integer
					.valueOf(request.getParameter("lvl")) : 0;
			long vip_id = (svip_id != null && !svip_id.isEmpty()) ? Long
					.valueOf(request.getParameter("vip_id")) : 0;
			float first_money = (sfirst_money != null && !sfirst_money
					.isEmpty()) ? Float.valueOf(request
					.getParameter("first_money")) : 0;
			int payType = Integer.valueOf(spayType);
			session = MyBatisManager.instance.getSession();
			SVipMapper mapper = session.getMapper(SVipMapper.class);
			SVip msVip = mapper.selectByPrimaryKey(vip_id);

			if (msVip != null)
				return -3;
			msVip = new SVip();
			msVip.setId(vip_id);
			msVip.setName(name);
			msVip.setCutOff(1.0f);
			msVip.setHistory(0f);
			msVip.setLvl(lvl);
			msVip.setPassW(vip_passw);
			float first_give = 0;
			try {
				String fg = DataHelper.instance.getTitleData("vip_create_give")
						.getnValue();
				first_give = trancefromGive(fg, (int) first_money);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			msVip.setMoney(first_money + first_give * first_money);
			JSONObject jb = new JSONObject();
			jb.put("qq", vip_qq);
			jb.put("mail", mail);
			msVip.setOther(jb.toString());
			msVip.setPhone(phone);
			msVip.setReferee(referee);
			msVip.setSex(sex);
			msVip.setAge(age);
			mapper.insert(msVip);
			saveVipRefreeMoneyInfo(msVip, payType, first_money);

			giveVipRefree(msVip, first_money);
			session.commit();
			session.close();
			session = null;
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -2;
		} finally {
			if (session != null) {
				session.commit();
				session.close();
			}
		}

	}

	public Map<String, Float> getFirstRecharge() {
		Map<String, Float> result = new HashMap<>();
		result.put("other", 0f);
		try {
			TNoahTitlesWithBLOBs fBloBs = DataHelper.instance
					.getTitleData("vip_create_give");
			JSONObject jb = new JSONObject(fBloBs.getnValue());
			Map<String, String> map = tranceJsonobj2Map(jb);
			for (String str : map.keySet()) {
				result.put(str, Float.valueOf(map.get(str)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	public Map<String, Float> getRecharge() {
		Map<String, Float> result = new HashMap<>();
		result.put("other", 0f);
		try {
			TNoahTitlesWithBLOBs fBloBs = DataHelper.instance
					.getTitleData("vip_recharge");
			JSONObject jb = new JSONObject(fBloBs.getnValue());
			Map<String, String> map = tranceJsonobj2Map(jb);
			for (String str : map.keySet()) {
				result.put(str, Float.valueOf(map.get(str)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	public JSONObject saveVIPConfig(HttpServletRequest request,
			HttpServletResponse response) {
		JSONObject result = new JSONObject();
		result.put("flag", false);
		result.put("msg", "保存失败！");
		if (request == null || response == null) {
			result.put("flag", false);
			result.put("msg", "保存失败！");
			return result;
		}
		try {
			String[] firstR=request.getParameter("firstR").split("_");
			String[]firstG=request.getParameter("firstG").split("_");
			String firstOther=request.getParameter("firstOther");
			String firstMsg=request.getParameter("firstMsg");
			String[] normalR=request.getParameter("normalR").split("_");
			String[] normalG=request.getParameter("normalG").split("_");
			String normalOther=request.getParameter("normalOther");
			String normalMsg=request.getParameter("normalMsg");
			String	cutoffRate=request.getParameter("cutoffRate");
			String cutoffFlag=request.getParameter("cutoffFlag");
			String	cutoffTip=request.getParameter("cutoffTip");
			String	cutoffGroup=request.getParameter("cutoffGroup");
			String	secondCutoffRate=request.getParameter("secondCutoffRate");
			String	secondCutoffFlag=request.getParameter("secondCutoffFlag");
			String	secondCutoffTip=request.getParameter("secondCutoffTip");
			String secondCutoffGroup=request.getParameter("secondCutoffGroup");
			
			 JSONObject firstObj=new JSONObject();
			 JSONObject normalObj=new JSONObject();
			for(int i=0; i<firstR.length;i++)
			{
				if(!firstR[i].equals("0"))
				{
					System.err.println( firstG[i]);
					float data=Float.valueOf(  firstG[i])/100;
					if(data>=0)
					{
					
						
						firstObj.put(firstR[i], data);
					}
				}
			}
			firstObj.put("other", Float.valueOf(firstOther)/100);
			for(int i=0; i<normalR.length;i++)
			{
				if(!normalR[i].equals("0"))
				{
					float data=Float.valueOf(  normalG[i]);
					if(data>=0)
					{
						normalObj.put(normalR[i], data);
						
					}
				}
			}
			
			normalObj.put("other", Float.valueOf(normalOther)/100);
			
			TNoahTitlesWithBLOBs cutoffBloBs=DataHelper.instance.getTitleData("vip_cut_off");
			TNoahTitlesWithBLOBs secondBloBs=DataHelper.instance.getTitleData("vip_second_cutoff");
	
			JSONObject cutoffJsonObject=new JSONObject(cutoffBloBs.getnValue());
			JSONObject secondCutoffJsonObject=new JSONObject(secondBloBs.getnValue());
			cutoffJsonObject.put("enable", Boolean.valueOf(cutoffFlag));
			cutoffJsonObject.put("cutoff", Float.valueOf(cutoffRate)/100);
	
			try{
				System.err.println(cutoffGroup);
				String[] cutoffGroups=cutoffGroup.split("<_>");
				JSONArray jl=new JSONArray();
				TreeSet<Integer> tempSet=new TreeSet<>();
				for(String str:cutoffGroups)
				{
					int temp= Integer.valueOf(str.replaceAll("\\(.*\\)", ""));
					if(tempSet.contains(temp))
					{continue;}
					jl.put(temp);
					tempSet.add(temp);
				}
				cutoffJsonObject.put("group", jl);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			cutoffBloBs.setnTip(cutoffTip);
			cutoffBloBs.setnValue(cutoffJsonObject.toString());
			
			
			secondCutoffJsonObject.put("enable", Boolean.valueOf(secondCutoffFlag));
			secondCutoffJsonObject.put("cutoff", Float.valueOf(secondCutoffRate)/100);
			try{
			
				String[] cutoffGroups=secondCutoffGroup.split("<_>");
				JSONArray jl=new JSONArray();
				TreeSet<Integer> tempSet=new TreeSet<>();
				for(String str:cutoffGroups)
				{
					int temp= Integer.valueOf(str.replaceAll("\\(.*\\)", ""));
					if(tempSet.contains(temp))
					{continue;}
					jl.put(temp);
					tempSet.add(temp);
				}
				secondCutoffJsonObject.put("group", jl);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			secondBloBs.setnTip(secondCutoffTip);
			secondBloBs.setnValue(secondCutoffJsonObject.toString());
			
			TNoahTitlesWithBLOBs firsBloBs=DataHelper.instance.getTitleData("vip_create_give");
			TNoahTitlesWithBLOBs normalBloBs=DataHelper.instance.getTitleData("vip_recharge");
			TNoahTitlesWithBLOBs msg=DataHelper.instance.getTitleData("vip_discount_tip");
			
			firsBloBs.setnValue(firstObj.toString());
			normalBloBs.setnValue(normalObj.toString());
			
			JSONObject jb=new JSONObject(msg.getnValue());
			jb.put("first", firstMsg);
			jb.put("recharge", normalMsg);
			msg.setnValue(jb.toString());
			DataHelper.instance.saveTitleData(firsBloBs);
			DataHelper.instance.saveTitleData(normalBloBs);
			
			DataHelper.instance.saveTitleData(msg);
			DataHelper.instance.saveTitleData(cutoffBloBs);

			DataHelper.instance.saveTitleData(secondBloBs);

			result.put("flag", true);
			result.put("msg", "保存成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
		return result;
	}

	
	public SVip getVipData(Long id) {
		SVip result = null;
		SqlSession session = MyBatisManager.instance.getSession();
		SVipMapper mapper = session.getMapper(SVipMapper.class);
		result = mapper.selectByPrimaryKey(id);
		session.close();
		return result;
	}

	public float trancefromGive(String config, int money) {

		double give = 0;
		JSONObject jb = null;
		try {

			Map<String, String> dataMap = tranceJsonobj2Map(new JSONObject(
					config));
			String giveStr = dataMap.get(money + "");
			if (giveStr == null) {
				giveStr = dataMap.get("other");
			}
			if (giveStr != null) {
				give = Float.valueOf(giveStr);
			}
			return (float) give;
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		}

		return 0f;
	}

	public boolean testCanRecharge(TMenuPaymentInfo info) {
		try {

			JSONObject jb = new JSONObject(info.getSelfData());

			if (jb.getBoolean("canRecharge"))
				return true;

		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
		}

		return false;
	}

	public void useMoney(SVip sVip, float money) {
		if (sVip == null)
			return;
		SqlSession session = MyBatisManager.instance.getSession();
		SVipMapper mapper = session.getMapper(SVipMapper.class);
		sVip.setMoney(sVip.getMoney() - money);
		sVip.setHistory(sVip.getHistory() + money);
		mapper.updateByPrimaryKey(sVip);
		session.commit();
		session.close();
	}

	public SVip rechargeVipMoney(SVip sVip, float money, float give, int payType) {

		if (sVip == null)
			return sVip;
		SqlSession session = MyBatisManager.instance.getSession();
		SVipMapper sVipMapper = session.getMapper(SVipMapper.class);

		sVip.setMoney(sVip.getMoney() + money + give);

		sVipMapper.updateByPrimaryKey(sVip);

		saveVipRefreeMoneyInfo(sVip, payType, money);
		session.commit();
		session.close();
		return sVip;
	}

	public void saveVipRefreeMoneyInfo(SVip sVip, int payType, float money) {
		SqlSession session = MyBatisManager.instance.getSession();
		TSilemtSummerSellInfoMapper sellInfoMapper = session
				.getMapper(TSilemtSummerSellInfoMapper.class);
		TSilemtSummerSellInfo sellInfo = new TSilemtSummerSellInfo();

		TMenuPaymentInfo paymentInfo = DataHelper.instance.getPayInfo(payType);
		sellInfo.setFlight(new Date(System.currentTimeMillis()));
		sellInfo.setMoneyTrue(money);
		sellInfo.setSellId(-1);
		sellInfo.setSellName("VIP充值");
		sellInfo.setPayId((long) payType);
		sellInfo.setPayType(payType);
		sellInfo.setDeleteFlag(false);
		if (paymentInfo != null) {
			sellInfo.setPayName(paymentInfo.getnName());
		} else {
			sellInfo.setPayName(payType + "");
		}

		sellInfo.setTime(new Time(System.currentTimeMillis()));
		sellInfo.setUserId(LandManager.instance.landId.getLandId());
		sellInfo.setUserName("GM");

		sellInfoMapper.insert(sellInfo);
		session.commit();
		session.close();

	}

	public boolean reCreateVip(long id,long newId,String passw,boolean needPassw)
	{
		
		SqlSession session=MyBatisManager.instance.getSession();
		SVipMapper mapper=session.getMapper(SVipMapper.class);
		SVip vipOld=mapper.selectByPrimaryKey(id);
		if(vipOld==null||(needPassw==true&&!vipOld.getPassW().equals(passw)))
		{
			session.close();
			return false;
		}
		SVip vipNew=mapper.selectByPrimaryKey(newId);
		if(vipNew!=null)
		{
			session.close();
			return false;	
		}
		vipNew=new SVip();
		vipNew.setId(newId);
		vipNew.setPassW(passw);
		vipNew.setName(vipOld.getName());
		vipNew.setAge(vipOld.getAge());
		vipNew.setPhone(vipOld.getPhone());
		vipNew.setCutOff(vipOld.getCutOff());
		vipNew.setHistory(vipOld.getHistory());
		vipNew.setLvl(vipOld.getLvl());
		vipNew.setMoney(vipOld.getMoney());
		vipNew.setOther(vipOld.getOther());
		vipNew.setSex(vipOld.getSex());
		vipNew.setTime(vipOld.getTime());
		if(vipOld.getReferee()!=vipOld.getId())
		{
		vipNew.setReferee(vipOld.getReferee());
		}
		else
		{
			vipNew.setReferee(vipNew.getId());
		}
		mapper.insertSelective(vipNew);
		vipOld.setMoney(0f);
		vipOld.setHistory(0f);
		mapper.updateByPrimaryKeySelective(vipOld);
		
		SVipExample example =new SVipExample();
		example.createCriteria().andRefereeEqualTo(vipOld.getId());
		List<SVip> tempNextLine=mapper.selectByExample(example);
		if(tempNextLine!=null)
		{
			for (SVip sVip:tempNextLine) {
				sVip.setReferee(vipNew.getId());
				mapper.updateByPrimaryKeyWithBLOBs(sVip);
			}
			
		}
		session.commit();
		session.close();
		return true;
	}
	public boolean changePassw(long id,String passw,String passwNew)
	{
		
		if(passw==null||passwNew==null)
			return false;
		SqlSession session=MyBatisManager.instance.getSession();
		SVipMapper mapper=session.getMapper(SVipMapper.class);
		SVip vipOld=mapper.selectByPrimaryKey(id);
		if(vipOld==null||!vipOld.getPassW().equals(passw))
		{
			session.close();return false;
		}
		vipOld.setPassW(passwNew);
		mapper.updateByPrimaryKeyWithBLOBs(vipOld);
		session.commit();
		session.close();
		return true;
	}
	public List<SVip> selectVipDataByNameOrPhone(String name,String phone)
	{
		
		SqlSession session=MyBatisManager.instance.getSession();
		SVipMapper mapper=session.getMapper(SVipMapper.class);
		SVipExample example=new SVipExample();
		example.createCriteria().andNameEqualTo(name);
		example.or().andPhoneEqualTo(phone);
		List<SVip> list=mapper.selectByExampleWithBLOBs(example);
		session.commit();
		session.close();
		return list;
	}
	public RefereeGive giveVipRefree(SVip sVip, float money) {

		if (sVip.getReferee() == sVip.getId())
			return null;
		RefereeGive give = null;
		SVip referee = null;
		SqlSession session = MyBatisManager.instance.getSession();
		SVipMapper sVipMapper = session.getMapper(SVipMapper.class);

		referee = sVipMapper.selectByPrimaryKey(sVip.getReferee());

		float rate = 0f;
		try {
			TNoahTitlesWithBLOBs bloBs = DataHelper.instance
					.getTitleData("referee_raye");
			JSONObject jb = new JSONObject(bloBs.getnValue());
			rate = (float) jb.getDouble("value");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (referee != null) {
			referee.setMoney(referee.getMoney() + money * rate);
			sVipMapper.updateByPrimaryKey(referee);
			give = new RefereeGive();
			give.sVip = referee;
			give.money = money * rate;
		}

		session.commit();
		session.close();
		return give;
	}

	public Map<String, String> tranceJsonobj2Map(JSONObject jb) {

		Map<String, String> map = new HashMap<String, String>();

		try {
			String[] keys = jb.getNames(jb);
			for (String k : keys) {
				map.put(k, jb.get(k) + "");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return map;
	}

	public class VipRechargeData
	{
		public String key;
		public float value=0;
	}
	public class RefereeGive {

		public SVip sVip;
		public float money;
	}
}
