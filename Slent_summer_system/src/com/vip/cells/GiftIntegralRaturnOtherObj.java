package com.vip.cells;

import org.json.JSONObject;

import com.unit.AutoJSONObjectBase;
import com.unit.JSONTools;

public class GiftIntegralRaturnOtherObj extends AutoJSONObjectBase{
private Long value;
public GiftIntegralRaturnOtherObj(JSONObject jb)
{
	JSONTools.fillObjFromJSON(this, jb);
}
public GiftIntegralRaturnOtherObj()
{}
public Long getValue() {
	return value;
}

public void setValue(Long value) {
	this.value = value;
}
}
