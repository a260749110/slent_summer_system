package com.page.helper;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.data.DataHelper;
import com.sql.MyBatisManager;
import com.sql.mapper.TMenuChoiceMapper;
import com.sql.mapperXml.TMenuGroup;


public class MainPageHelper  extends PageHelperBase{
public  final static MainPageHelper instance=new MainPageHelper();
private MainPageHelper()
{
	
}

public Map<Integer, TMenuGroup> getGroupMap()
{	
	return DataHelper.instance.getGroupMap();}
}
