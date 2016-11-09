package com.unit;

import org.json.JSONObject;

public class PageHelperBaseObject extends AutoJSONObjectBase{
	public PageHelperBaseObject(JSONObject jb) {
		super(jb);
		// TODO Auto-generated constructor stub
	}
	public PageHelperBaseObject()
	{}

	private boolean flag = false;
	private StringBuffer msg = new StringBuffer();

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public StringBuffer getMsg() {
	
		return msg;
	}

}
