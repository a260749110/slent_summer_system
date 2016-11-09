package com.vip;

import java.util.Date;

import org.json.JSONObject;

import com.sql.mapperBean.SVip;
import com.vip.cells.VipOtherMsgCell;

public class VipInfo {
	public SVip sVip;
	public boolean isLogin = false;
	public boolean signFlag = false;
	public int signCount=0;
	public VipOtherMsgCell cell;
	public static String SIGN_TIME="signTime";
	public static String SIGN_COUNT="signCount";
	public VipInfo(SVip sVip) {
		this.sVip = sVip;
		if (sVip != null) {
			isLogin = true;

			try {
				if (sVip.getOther() != null) {
					JSONObject otherObj = new JSONObject(sVip.getOther());
					cell=new VipOtherMsgCell(otherObj);
					Long signTime=otherObj.getLong(SIGN_TIME);
					if(signTime!=null)
					{
						Date d=new Date(signTime);
						Date now =new Date(System.currentTimeMillis());
						System.err.println( d.getDate()+" "+now.getDate());
						if(d.getDate()<now.getDate())
						{
							signFlag=false;
						}
						else
						{
							signFlag=true;
						}
						signCount=otherObj.getInt(SIGN_COUNT);
					}
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}
	public void reflash()
	{
		if (sVip != null) {
			isLogin = true;
		}
		sVip.setOther(cell.toJSONObjectStr());
		if (sVip != null) {
			isLogin = true;

			try {
				if (sVip.getOther() != null) {
					JSONObject otherObj = new JSONObject(sVip.getOther());
					cell=new VipOtherMsgCell(otherObj);
					Long signTime=otherObj.getLong(SIGN_TIME);
					if(signTime!=null)
					{
						Date d=new Date(signTime);
						Date now =new Date(System.currentTimeMillis());
						System.err.println( d.getDate()+" "+now.getDate());
						if(d.getDate()<now.getDate())
						{
							signFlag=false;
						}
						else
						{
							signFlag=true;
						}
						signCount=otherObj.getInt(SIGN_COUNT);
					}
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
	}
}
