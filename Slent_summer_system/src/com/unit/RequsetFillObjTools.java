package com.unit;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

public class RequsetFillObjTools {
	public static void fillObj(HttpServletRequest request, Object object) {
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private static void fillObjNoDept(HttpServletRequest request, Object object) {
		try {

			Field[] field = object.getClass().getDeclaredFields();
			for (int i = 0; i < field.length; i++) {
				String name = field[i].getName();
				field[i].setAccessible(true);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
