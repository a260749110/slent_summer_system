package com.user;

import java.nio.channels.SeekableByteChannel;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.page.manager.PageManager;
import com.page.manager.PageManager.PageData;
import com.sql.MyBatisManager;
import com.sql.mapper.TOgBiPermissionsMapper;
import com.sql.mapperXml.TOgBiPermissions;
import com.sql.mapperXml.TOgBiPermissionsExample;

/*
 * 权限中心
 */
public class PermissionsManager {
	private Logger logger = Logger.getLogger(this.getClass());
	public final static PermissionsManager instance = new PermissionsManager();
	private Map<String, PermissionsData> permissionsMap;

	private Timer refreshTimer = new Timer();

	private PermissionsManager() {
	}

	public void init() {
		permissionsMap = new HashMap<String, PermissionsData>();
		SqlSession session = MyBatisManager.instance.getSession();
		TOgBiPermissionsMapper biPermissionsMapper = session
				.getMapper(TOgBiPermissionsMapper.class);
		TOgBiPermissionsExample biPermissionsExample = new TOgBiPermissionsExample();
		biPermissionsExample.createCriteria().andNameIsNotNull();
		List<TOgBiPermissions> list = biPermissionsMapper
				.selectByExampleWithBLOBs(biPermissionsExample);
		if (list != null) {
			logger.info("ls:" + list.toString());
			Map<String, TOgBiPermissions> allMap = new HashMap<String, TOgBiPermissions>(
					list.size());
			for (TOgBiPermissions biPermissions : list) {
				allMap.put(biPermissions.getName(), biPermissions);
			}
			logger.info("allMap:" + list.size());
			for (TOgBiPermissions biPermissions : list) {
				new PermissionsData(biPermissions, allMap, permissionsMap);
			}
			logger.info("size:" + permissionsMap.size());
			for (PermissionsData pd : permissionsMap.values()) {
				logger.info("per:" + pd.name + pd.permissions.toString());
			}
		} else {
			logger.error("没有权限信息，请检查数据库！");
		}
		session.close();
		refreshTimer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				refresh();

			}
		}, 10 * 60 * 1000L, 10 * 60 * 1000L);
	}

	public void refresh() {
		Map<String, PermissionsData> newMap = new HashMap<String, PermissionsData>();
		SqlSession session = MyBatisManager.instance.getSession();
		TOgBiPermissionsMapper biPermissionsMapper = session
				.getMapper(TOgBiPermissionsMapper.class);
		TOgBiPermissionsExample biPermissionsExample = new TOgBiPermissionsExample();
		biPermissionsExample.createCriteria().andNameIsNotNull();
		List<TOgBiPermissions> list = biPermissionsMapper
				.selectByExampleWithBLOBs(biPermissionsExample);
		if (list != null) {
			logger.info("ls:" + list.toString());
			Map<String, TOgBiPermissions> allMap = new HashMap<String, TOgBiPermissions>(
					list.size());
			for (TOgBiPermissions biPermissions : list) {
				allMap.put(biPermissions.getName(), biPermissions);
			}
			logger.info("allMap:" + list.size());
			for (TOgBiPermissions biPermissions : list) {
				new PermissionsData(biPermissions, allMap, newMap);
			}
			logger.info("size:" + newMap.size());
			for (PermissionsData pd : newMap.values()) {
				logger.info("per:" + pd.name + pd.permissions.toString());
			}
		} else {
			logger.error("没有权限信息，请检查数据库！");
		}
		session.close();
		this.permissionsMap = newMap;

	}

	public TreeSet<String> getPermissions(String[] permissions) {
		if (permissions == null || permissions.length <= 0) {
			return null;
		}

		TreeSet<String> result = new TreeSet<String>();

		for (String str : permissions) {
			PermissionsData permissionsData = permissionsMap.get(str);
			if (str.equals("ALL")) {
				result.add(str);
			}
			if (permissionsData != null) {
				result.addAll(permissionsData.permissions);
			}
		}
		return result;
	}

//	public boolean testPerission(String page, UserData user) {
//		if(user==null)
//			return false;
//		PageData pageData=PageManager.instance.getPageData(page);
//		if(pageData==null)
//		return true;
//		
//	TreeSet<String> pageSet=pageData.permissions;
//	TreeSet<String> userSet=user.getPermissions();;
//	if(userSet.contains("ALL"))
//		return true;
//	
//	return userSet.containsAll(pageSet);
//	
//	}

	public boolean testPerission(String perission) {
		if(perission==null)
			return false;
		PermissionsData data = permissionsMap.get(perission);
		if (data != null)

			return true;
		return false;
	}
}
