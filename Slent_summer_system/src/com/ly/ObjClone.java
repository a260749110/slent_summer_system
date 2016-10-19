package com.ly;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class ObjClone {
public static <T> void clone(T from,T to) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
{
	
	 Field[] field = from.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组  
     for(int j=0 ; j<field.length ; j++){ 
    	 
    	 String name = field[j].getName();
    	 field[j].setAccessible(true);
    	 field[j].set(to, field[j].get(from));
    	// System.err.println("clone:"+name+":"+field[j].get(to));
     
     }
	return ;}
}
