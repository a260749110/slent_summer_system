package com.unit;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONTools {
	public static JSONObject objToJsObj(Object obj) {
		try {

			JSONObject jb = new JSONObject();

			Class tempClass = obj.getClass();
			while (tempClass != null && !tempClass.toString().startsWith("class java.lang")) {
				getJSONData(jb, obj);
				tempClass = tempClass.getSuperclass();
			}

			return jb;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	public static void fillObjFromJSON(Object toObj, JSONObject fromJSON) {
		if (toObj == null || fromJSON == null)
			return;
		Class tempClass = toObj.getClass();
		
		while (tempClass != null && !tempClass.toString().startsWith("class java.lang")) {
			fillObjFromJSONFun(toObj,fromJSON);
			tempClass=tempClass.getSuperclass();
		}

	}

	private static void fillObjFromJSONFun(Object obj, JSONObject fromJSON) {

		try {
			Field[] field = obj.getClass().getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
				String name = field[i].getName();

				field[i].setAccessible(true);
				if (field[i].getType().toString().startsWith("class java.lang")) {
					try {
						if(field[i].getType()==Long.class)
						{
							field[i].set(obj, (long)(fromJSON.getLong(name)));
							continue;
						}
						field[i].set(obj, field[i].getType().cast(fromJSON.get(name)));

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					continue;
				}
			

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}


	private static void fillListFromJSONList(Field field,List list, JSONArray jl) {
		try {

			// Field fiel=list.getClass().getg

			Type type = field.getGenericType();
			if (type!=null) {
			
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private static List fillListFromJSONListByType(Type type, JSONArray jl) {
		try {

			// Field fiel=list.getClass().getg

			List list=new ArrayList();
			if (type!=null) {
			//Object obj=
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	private static Type getParameterizedType(Type t)
	{
		try {
			 if (ParameterizedType.class.isAssignableFrom(t.getClass())) {              
		            for (Type t1:((ParameterizedType)t).getActualTypeArguments()) {   
		            	
		            return t1;
		            }          
		                   
		        }  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	@SuppressWarnings("unused")
	private static boolean getJSONData(JSONObject jb, Object obj) {

		// System.err.println(obj.getClass().getSuperclass().getName());

		try {
			Field[] field = obj.getClass().getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
				// 获取属性的名字
				String name = field[i].getName();

				field[i].setAccessible(true);
				Object o = field[i].get(obj);
				try {
					if (jb.get(name) != null)
						continue;
				} catch (Exception e) {
					// TODO: handle exception
				}

				if (o == null) {
					jb.put(name, "");
					continue;
				}
				if (o instanceof List) {
					List list = (List) o;
					JSONArray jl = new JSONArray();
					for (Object listObj : list) {
						if (listObj.getClass().toString().startsWith("class java.lang")) {
							jl.put(listObj);
							continue;
						}
						jl.put(objToJsObj(listObj));
					}
					continue;
				}
			//	System.err.println(o.getClass());
				if (o.getClass().toString().startsWith("class java.lang")) {
					jb.put(name, o);
					continue;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			return false;
		}
		return true;
	}
}
