package com.user;

import java.util.Random;
import java.util.TreeSet;

import com.sql.mapperBean.TUser;

public class UserData {
	public TUser user;
	public TreeSet<String> permissions;
	public int landId=0;
	
public UserData (TUser user,int landId)
{
	if(user!=null)
	{
	this.user=user;
	this.landId=landId;
	if(user.getPermission()!=null)
	{
		String[] per=user.getPermission().split("&");
	permissions=PermissionsManager.instance.getPermissions(per);
	}
	}
	}
}
