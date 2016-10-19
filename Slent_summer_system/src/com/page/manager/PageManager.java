package com.page.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;

import org.apache.ibatis.session.SqlSession;

import com.Config;
import com.sql.MyBatisManager;
import com.sql.bean.TOgBiJspPageInfo;
import com.sql.bean.TOgBiJspPageInfoExample;
import com.sql.bean.TOgBiJspPageInfoWithBLOBs;
import com.sql.mapper.TOgBiJspPageInfoMapper;
import com.user.PermissionsManager;

public class PageManager {
	public static PageManager instance = new PageManager();
	private Map<String,PageData> pageDataMap=new HashMap<String, PageManager.PageData>();
	private PageManager() {
	}
	private Timer timer=new Timer();
	
	public void init() {
		refresh();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					refresh();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 30000,30000);
	}

	private void refresh() {
		System.err.println("refresh page data");
		SqlSession session = MyBatisManager.instance.getSession();
		TOgBiJspPageInfoMapper mapper=session.getMapper(TOgBiJspPageInfoMapper.class);
		TOgBiJspPageInfoExample example=new TOgBiJspPageInfoExample();
		example.createCriteria().andPangeUriIsNotNull();
		List<TOgBiJspPageInfoWithBLOBs> pageInfos=mapper.selectByExampleWithBLOBs(example);
		Map<String,PageData> newMap=new HashMap<String, PageManager.PageData>();

		if(pageInfos!=null)
		{
			for(TOgBiJspPageInfoWithBLOBs page:pageInfos)
			{
				PageData pageData=new PageData(page);
			if (pageData.uri!=null) {
				newMap.put(pageData.uri, pageData);
			}
				
			}
			pageDataMap=newMap;
		}
		session.close();
	}
	public PageData getPageData(String uri)
	{
		if(uri==null)
			return null;
		if (pageDataMap!=null) {
			return pageDataMap.get(uri);
		}
		return null;
	}
	public static class PageData
	{
		public TreeSet<String> permissions=new TreeSet<String>();
		public String uri;
		public PageData(TOgBiJspPageInfoWithBLOBs biJspPageInfo)
		{
			
			if(biJspPageInfo!=null)
			{
				uri=biJspPageInfo.getPangeUri();
				String str=biJspPageInfo.getPersissions();
				if(str!=null)
				{
					String[] strs=str.split("&");
					for (String per:strs) {
						if(PermissionsManager.instance.testPerission(per))
						{
							permissions.add(per);
						}
					}
				}
			}
		}
	}
}
