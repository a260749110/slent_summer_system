package com.vip;

import javax.servlet.http.HttpServletRequest;

import com.sql.mapperBean.SVip;
import com.vip.common.ESessionData;

public class VipManeger {
public static VipManeger instance=new VipManeger();
private VipManeger ()
{}
public VipInfo getVipInfo(HttpServletRequest request)
{
	VipInfo result=(VipInfo) request.getSession().getAttribute(ESessionData.VIP_INFO.getCode());
	if(result==null)
	{
		result=new VipInfo(new SVip());
		result.sVip.setId(000000l);
		result.sVip.setName("test");
	}
	return result;
}
}
