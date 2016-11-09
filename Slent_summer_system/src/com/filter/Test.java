package com.filter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test {
	
	List<List<A>> list;
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, ClassNotFoundException {
		// TODO Auto-generated method stub
		A a=new A();
		System.err.println(a.getClass());
		System.err.println(a.getClass().getSuperclass());
		System.err.println(	List.class.isAssignableFrom(ArrayList.class));
	
		   Type t = Test.class.getDeclaredField("list").getGenericType();  
		  System.err.println(t);
	      t=getParameterizedType(t);
	      System.err.println(t);
	      t=getParameterizedType(t);
	      System.err.println(t);
	      t=getParameterizedType(t);
	      System.err.println(t);
	    	List<A> Mylist=new ArrayList<A>();	
	    	
	   JSONArray jl=new JSONArray();
	   JSONObject jb=new JSONObject();
	   jb.put("a", "a");
	   jl.put(jb);
System.err.println(jl.get(0 ) instanceof JSONObject);
Integer b=1;
System.err.println(b.getClass().isPrimitive());
//	    System.err.println(method.getReturnType().getName());
//	    		Mylist.getClass().f
//	   
//
//	        System.err.println(Mylist.getClass().getType);
//	     
	        System.err.println("end");
		ArrayList.class.isAssignableFrom(List.class);
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
	
	public static Type[] getParameterizedTypes(Object object) {
	    Type superclassType = object.getClass().getGenericSuperclass();
	    if (!ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
	        return null;
	    }
	    return ((ParameterizedType)superclassType).getActualTypeArguments();
	}
 static public class A
{
	int a=0;
	}
}
