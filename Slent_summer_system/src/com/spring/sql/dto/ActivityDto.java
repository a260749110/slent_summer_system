package com.spring.sql.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.TreeSet;

import com.activity.ActivityOtherInfoBase;
import com.activity.EActivityType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.spring.sql.domain.TActivityPo;

public class ActivityDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;

	private Timestamp dateEnd;

	private Timestamp dateStart;

	private String desc;

	private boolean enable;

	private boolean onlyVip;
	@JSONField(serialize=false)
	private ActivityOtherInfoBase otherInfo;

	private float timeEnd;

	private float timeStart;

	private TreeSet<Integer> weeks;

	private EActivityType type;
	
	private String otherInfoStr;
	private int priority;

	public ActivityDto() {
	}

	public static ActivityDto formPo(TActivityPo po) {

		ActivityDto dto = new ActivityDto();
		dto.id = po.getId();
		dto.dateEnd = po.getDateEnd();
		dto.dateStart = po.getDateStart();
		dto.desc = po.getDesc();
		dto.enable = po.getEnable() == 1 ? true : false;
		dto.onlyVip = po.getOnlyVip() == 1 ? true : false;
		dto.timeEnd = po.getTimeEnd();
		dto.timeStart = po.getTimeStart();
		try {
			dto.type = EActivityType.valueOf(po.getType());
		} catch (Exception e) {
			dto.type = EActivityType.Unknow;
		}
	
		dto.priority = po.getPriority();
		dto.setWeeks(JSON.parseObject(po.getWeeks(), new TypeReference<TreeSet<Integer>>() {
		}));
		dto.otherInfo = JSON.parseObject(po.getOtherInfo(), dto.getType().getOtherInfoClass());
		return dto;
	}

	public static TActivityPo toPo(ActivityDto dto) {
		TActivityPo po = new TActivityPo();
		po.setId(dto.id);
		po.setDateEnd(dto.getDateEnd());
		po.setDateStart(dto.dateStart);
		po.setDesc(dto.getDesc());
		po.setEnable((byte) (dto.enable ? 1 : 0));
		po.setOnlyVip((byte) (dto.onlyVip ? 1 : 0));
		po.setTimeEnd(dto.getTimeEnd());
		po.setTimeStart(dto.timeStart);
		po.setType(dto.type.toString());
		po.setWeeks(JSON.toJSONString(dto.weeks));
		if(dto.otherInfo==null&&dto.otherInfoStr!=null)
		{
		po.setOtherInfo(dto.otherInfoStr);
		
		}
		po.setPriority(dto.priority);
		return po;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Timestamp dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Timestamp getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Timestamp dateStart) {
		this.dateStart = dateStart;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean getEnable() {
		return this.enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public boolean getOnlyVip() {
		return this.onlyVip;
	}

	public void setOnlyVip(boolean onlyVip) {
		this.onlyVip = onlyVip;
	}

	public ActivityOtherInfoBase getOtherInfo() {
		return this.otherInfo;
	}

	public void setOtherInfo(ActivityOtherInfoBase otherInfo) {
		this.otherInfo = otherInfo;
	}

	public float getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(float timeEnd) {
		this.timeEnd = timeEnd;
	}

	public float getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(float timeStart) {
		this.timeStart = timeStart;
	}

	public TreeSet<Integer> getWeeks() {
		return this.weeks;
	}

	public void setWeeks(TreeSet<Integer> weeks) {
		this.weeks = weeks;
	}

	public EActivityType getType() {
		return type;
	}

	public void setType(EActivityType type) {
		this.type = type;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getOtherInfoStr() {
		return otherInfoStr;
	}

	public void setOtherInfoStr(String otherInfoStr) {
		this.otherInfoStr = otherInfoStr;
	}
}
