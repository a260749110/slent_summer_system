package com.activity;

import com.activity.data.SecondCutOffData;
import com.activity.impl.SecibdCutOffService;

public enum EActivityType {
	Unknow(ActivityOtherInfoBase.class, null,"未知"),
	SecondCutOff(SecondCutOffData.class, new SecibdCutOffService(),"第二杯折扣"),
	;
	private Class<? extends ActivityOtherInfoBase> otherInfoClass;
	private IActivityService activityService;
	private String desc;
	EActivityType(Class<? extends ActivityOtherInfoBase> classType, IActivityService activityService,String desc) {
		this.otherInfoClass = classType;
		this.activityService = activityService;
		this.desc = desc;
	}

	public Class<? extends ActivityOtherInfoBase> getOtherInfoClass() {
		return otherInfoClass;
	}


	public IActivityService getActivityService() {
		return activityService;
	}

	public void setActivityService(IActivityService activityService) {
		this.activityService = activityService;
	}

	public String getDesc() {
		return desc;
	}


	}