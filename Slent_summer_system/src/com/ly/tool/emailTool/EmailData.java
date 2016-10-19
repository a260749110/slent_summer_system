package com.ly.tool.emailTool;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailData {
public List<String> addrs=new ArrayList<>();
public String title="";
public String data;
public Map<String,File> files=new HashMap<>();
public EmailData(String str)
{
	if(str==null)
		return ;
String[] strs=str.split(";");
for(String addr:strs)
{
	addrs.add(addr);
	}
}
}
