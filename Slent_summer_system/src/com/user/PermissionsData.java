package com.user;

import java.util.Map;
import java.util.TreeSet;

import com.sql.mapperXml.TOgBiPermissions;

public class PermissionsData {
	public TreeSet<String> permissions = new TreeSet<String>();
	public String name;

	public PermissionsData(TOgBiPermissions self,
			Map<String, TOgBiPermissions> allMap,
			Map<String, PermissionsData> finishMap) {
		name = self.getName();
		permissions.add(name);

		if (self.getInclude() == null) {
		} else {
			addPermission(self.getInclude(), allMap, finishMap);
		}
		finishMap.put(name, this);
	}

	private void addPermission(String include,
			Map<String, TOgBiPermissions> allMap,
			Map<String, PermissionsData> finishMap) {
		if (include == null)
			return;
		String[] perStrs;
		try {
			perStrs = include.split("&");
		} catch (Exception e) {
			// TODO: handle exceptio
			e.printStackTrace();
			return;
		}
		if (perStrs == null)
			return;
		for (String str : perStrs) {
			if(str.length()==0)
				continue;
			if (permissions.contains(str)) {
				continue;
			}
			permissions.add(str);
			if (finishMap.containsKey(str)) {
				PermissionsData pd = finishMap.get(str);
				for (String per : pd.permissions) {
					permissions.add(per);
				}
				continue;
			}

			TOgBiPermissions ogBiPermissions = allMap.get(str);
			if (ogBiPermissions == null)
				continue;
			addPermission(ogBiPermissions.getInclude(), allMap, finishMap);
		}
	}

}
