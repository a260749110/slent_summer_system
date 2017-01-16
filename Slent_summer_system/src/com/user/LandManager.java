package com.user;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.json.JSONObject;

import com.ly.time.TimeTool;
import com.sql.MyBatisManager;
import com.sql.mapper.TLandIdMapper;
import com.sql.mapper.TUserMapper;
import com.sql.mapperBean.TLandId;
import com.sql.mapperBean.TLandInfo;
import com.sql.mapperBean.TUser;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import com.unit.TimeManager;


public class LandManager {
	public static LandManager instance = new LandManager();
	public TLandId landId=null;
	public TLandInfo landInfo=null;
	public boolean initFlag=false;
	public TreeSet<String> onDutyTree=new TreeSet<String>();
	public Random random=new Random();
	public boolean isNewLand=false;
	int maxLandId=0;
	private Map<String,UserData> landUser=new HashMap<>();
	private LandManager() {
	};
	public void init()
	{
		if(initFlag)
		{
			return;
			
		}
		SqlSession session=MyBatisManager.instance.getSession();
		TLandIdMapper landIdMapper=session.getMapper(TLandIdMapper.class);
		landId =landIdMapper.selectMax();
		
		if(landId==null)
		{
			initFlag=true;
		return;
		}
		maxLandId=landId.getLandId();
		if(landId.getIsClose())
		{
			landId=null;
		}
		else {
			
		}
		session.close();
		initFlag=true;
	}
	
	public boolean testOnduty(String id)
	{
		return onDutyTree.contains(id);
	}
	public void initOnduty()
	{
		onDutyTree.clear();
		try {
			JSONObject jb=new JSONObject(landId.getLandInfo());
			JSONArray dutyList=jb.getJSONArray("onduty_list");
			for(int i=0;i<dutyList.length();i++)
			{
				JSONObject jbonduty=dutyList.getJSONObject(i);
				
				onDutyTree.add(jbonduty.getString("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public void addOnduty(String str)
	{
		try {
			JSONObject landData=new JSONObject(landId.getLandInfo());
			JSONArray dutyList=null;
			try {
				
				dutyList=landData.getJSONArray("onduty_list");
			} catch (Exception e) {
				// TODO: handle exception
				dutyList=new JSONArray();
			}
			JSONObject jb=new JSONObject();
			jb.put("id", str);
			jb.put("time", TimeTool.getTime());
			dutyList.put(jb);
			landData.put("onduty_list", dutyList);
			landId.setLandInfo(landData.toString());
			updateLandId();
			initOnduty();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public int land(String name,String passw,HttpServletRequest request)
	{
		
		TimeManager.init();
		
		SqlSession session=MyBatisManager.instance.getSession();
		TUserMapper mapper=session.getMapper(TUserMapper.class);
		TUser tUser=mapper.selectByPrimaryKey(name);
		
			
		session.close();
		if(tUser==null)
		return -1;
	if(tUser.getEnable()==false||!tUser.getPassw().equals(passw))
		return -1;
	boolean creatFlag=false;
	if(landId==null)
	{
		createLandId();
		creatFlag=true;
	}
	UserData userData=new UserData(tUser,landId.getLandId());
	landUser.put(userData.user.getId(), userData);
	try {
		JSONObject jb=new JSONObject(landId.getLandInfo());
		JSONArray jl=jb.getJSONArray("land_list");
		JSONObject newjb=new JSONObject();
		newjb.put("name:", userData.user.getId());
		newjb.put("time:", new Date().toString());
		jl.put(newjb);
		jb.put("land_list", jl);
		landId.setLandInfo(jb.toString());
	} catch (Exception e) {
		// TODO: handle exception
	}
	updateLandId();
	initOnduty();
	request.getSession().putValue("user", userData);
	if(creatFlag)
		return 2;
		return 1;
	}

	public int eixt(String id)
	{
		return 0;
	}
	
	private void updateLandId()
	{
		SqlSession session=MyBatisManager.instance.getSession();
		TLandIdMapper landIdMapper=session.getMapper(TLandIdMapper.class);
		landIdMapper.updateByPrimaryKeySelective(landId);

		session.commit();
		landId =landIdMapper.selectMax();
		session.close();
	}
	
private void createLandId()
{
	landId=new TLandId();
	isNewLand=true;
	landId.setFlight(new Date(System.currentTimeMillis()));
	landId.setLandId(++maxLandId);
	landId.setIsClose(false);
	JSONObject jb=new JSONObject() ;
	jb.put("land_list", new JSONArray());
	jb.put("landId", landId.getLandId());
	landId.setLandInfo(jb.toString());
	landId.setLandTime(new Date(System.currentTimeMillis()));
SqlSession session=MyBatisManager.instance.getSession();
TLandIdMapper landIdMapper=session.getMapper(TLandIdMapper.class);
	
landIdMapper.insert(landId);

session.commit();
landId =landIdMapper.selectMax();

System.err.println("a "+landId.getId());
session.close();
}
public int testLand(HttpServletRequest request,HttpServletResponse response)
{
	try {
		request.setCharacterEncoding("utf-8");
	} catch (UnsupportedEncodingException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	if(landId==null)
	return -1;
	Object obj_temp=request.getSession().getAttribute("user");
	if(obj_temp==null)
		return -1;
	try {
		UserData data=(UserData) obj_temp;
		if(	!landUser.containsKey( data.user.getId()))
			return -1;
	} catch (Exception e) {
		// TODO: handle exception
		return -1;
	}
	

	return 1;
	}
public String getOnlandId()
{
	StringBuffer str=new StringBuffer();
	for (UserData data:landUser.values()) {
		str.append(data.user.getName());
	}
return str.toString();	
}
public void unLand()
{
	landId.setIsClose(true);
	landId.setEndTime(new Date(System.currentTimeMillis()));
	SqlSession session=MyBatisManager.instance.getSession();
	TLandIdMapper mapper=session.getMapper(TLandIdMapper.class);
	mapper.updateByPrimaryKey(landId);
	
	session.commit();
	landId=null;
	landUser.clear();
	isNewLand=false;
	
	session.close();
}
public UserData getUser(HttpServletRequest request)
{
	if(request==null)
		return null;
	Object obj_temp=request.getSession().getAttribute("user");
	if(obj_temp==null)
		return null;
	try {
		UserData data=(UserData) obj_temp;
		if(	!landUser.containsKey( data.user.getId()))
			return null;
		return data;
	} catch (Exception e) {
		// TODO: handle exception
	
	}
	return null;}
}
