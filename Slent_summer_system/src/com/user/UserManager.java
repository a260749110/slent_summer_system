package com.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.data.DataHelper;
import com.sql.mapperBean.TUser;

public class UserManager {
	public final static UserManager instance = new UserManager();
	private Map<String, TUser> userMap;

	private UserManager() {
		
	}

	private void init() {
		userMap = new HashMap<String, TUser>();
		reflash();
	}
	public TUser getUser(String id)
	{
		return userMap.get(id);
	}
	public void reflash() {
		synchronized (instance) {
			if (userMap == null) {
				userMap = new HashMap<String, TUser>();
			}
			userMap.clear();
			List<TUser> list = DataHelper.instance.getUserList();
			for (TUser u : list) {
				userMap.put(u.getId(), u);
			}
		}
	}

	private void getUserList() {
		// TODO Auto-generated method stub

	}
}
