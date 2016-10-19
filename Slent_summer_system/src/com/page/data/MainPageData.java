package com.page.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import com.sql.MyBatisManager;
import com.sql.mapper.TMenuChoiceMapper;
import com.sql.mapper.TMenuGroupMapper;
import com.sql.mapper.TMenuLineMapper;
import com.sql.mapper.TNoahTitlesMapper;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TMenuLineExample;
import com.sql.mapperXml.TMenuChoice;
import com.sql.mapperXml.TMenuChoiceExample;
import com.sql.mapperXml.TMenuGroup;
import com.sql.mapperXml.TMenuGroupExample;
import com.sql.mapperXml.TNoahTitlesExample;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;
import com.unit.Tool;

public class MainPageData {
	private Logger logger = Logger.getLogger(MainPageData.class);
	public String mainTitle = "诺亚系统！";
	public List<TMenuGroup> groupList;
	public Map<Integer, TMenuGroup> groupMap;
	public List<TMenuLine> lineList;
	public Map<Integer, TMenuLine> lineMap;
	public Map<Integer, List<TMenuLine>> groupLineMap;
	public List<TMenuChoice> choiceList;
	public Map<Integer,TMenuChoice> choiceMap;
	public MainPageData() {
		init();
	}

	private void init() {
		SqlSession session = MyBatisManager.instance.getSession();
		
		//choice
		TMenuChoiceMapper choiceMapper = session
				.getMapper(TMenuChoiceMapper.class);
		TMenuChoiceExample choiceExample = new TMenuChoiceExample();
		choiceExample.createCriteria().andIdIsNotNull();
		choiceList = choiceMapper.selectByExampleWithBLOBs(choiceExample);
		choiceMap=new HashMap<Integer,TMenuChoice>();
		if(choiceList!=null)
		for(TMenuChoice choice:choiceList)
		{
			choiceMap.put(choice.getId(), choice);
		}
		//title
		TNoahTitlesExample titleExample = new TNoahTitlesExample();

		TNoahTitlesMapper titleMapper = session
				.getMapper(TNoahTitlesMapper.class);

		TNoahTitlesExample titlesExample = new TNoahTitlesExample();

		titlesExample.createCriteria().andNIndexEqualTo("mainTitle");
		List<TNoahTitlesWithBLOBs> testList = titleMapper
				.selectByExampleWithBLOBs(titleExample);
		if (testList != null && testList.size() == 1) {
			mainTitle = testList.get(0).getnValue();
		}

		TMenuGroupMapper groupMapper = session
				.getMapper(TMenuGroupMapper.class);
		TMenuGroupExample groupExample = new TMenuGroupExample();
		groupExample.createCriteria().andIdIsNotNull();
		groupList = groupMapper.selectByExampleWithBLOBs(groupExample);
		groupMap = new HashMap<Integer, TMenuGroup>();
		for (TMenuGroup group : groupList) {
			groupMap.put(group.getId(), group);

		}
		TMenuLineMapper lineMapper = session.getMapper(TMenuLineMapper.class);
		TMenuLineExample lineExample = new TMenuLineExample();
		lineExample.createCriteria().andIdIsNotNull();
		lineList = lineMapper.selectByExample(lineExample);
		lineMap = new HashMap<Integer, TMenuLine>();
		groupLineMap = new HashMap<Integer, List<TMenuLine>>();
		for (TMenuLine line : lineList) {

			lineMap.put(line.getId(), line);

			List<TMenuLine> templ = groupLineMap.get(line
					.getnGroupId());
			if (templ == null) {
				templ = new ArrayList<TMenuLine>();
				groupLineMap.put(line.getnGroupId(), templ);
			}
			initChoice(line);
			templ.add(line);

		}

	}

	private void initChoice(TMenuLine line) {
		try {
			JSONObject jbResult=new JSONObject();
			JSONObject jb=new JSONObject(line.getOtherChoice());
			JSONArray jl=jb.getJSONArray("id");
			JSONArray jlResult=new JSONArray();
			for(int i=0;i<jl.length();i++)
			{
				TMenuChoice choice=choiceMap.get(jl.get(i));
				if(choice!=null)
				{
					jlResult.put(Tool.objToJsObj(choice));
				}
			}
			jbResult.put("id", jlResult);
			jbResult.put("private", jb.getJSONArray("private"));
			line.setOtherChoice(jbResult.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public String getLineJSArryFromGroup(int id) {
		JSONArray jl = new JSONArray();

		List<TMenuLine> list = groupLineMap.get(id);
		if (list != null)
			for (TMenuLine line : list) {
				JSONObject jb=Tool.objToJsObj(line);
				String str=jb.getString("otherChoice");
				
				jb.put("otherChoice", new JSONObject(str));
				jl.put(jb);
			}

		return jl.toString();
	}

	public String getAllChoiceJSArryFromGroup() {
		JSONArray jl = new JSONArray();
		
		if (choiceList != null) {
			for (TMenuChoice choice : choiceList) {
				jl.put(Tool.objToJsObj(choice));
			}
		}

		return jl.toString();
	}
}
