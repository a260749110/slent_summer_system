package com.unit;

import org.json.JSONObject;

public class AutoJSONObjectBase {
	public AutoJSONObjectBase(JSONObject jb)
	{
		JSONTools.fillObjFromJSON(this, jb);
	}
	public AutoJSONObjectBase()
	{}
	public JSONObject toJSONObject()
	{
		return JSONTools.objToJsObj(this);
		}
	public String toJSONObjectStr()
	{
		return JSONTools.objToJsObj(this).toString();
		}
}
