package com.data;

import java.util.HashMap;
import java.util.Map;

public class PayManager {
	public int idNow=0;
	public static PayManager instance=new PayManager();
	private PayManager()
	{
		
	}
//	public void ub
	
 public 	Map<Integer, PayItem> map=new HashMap<>();
	public static class PayItem{
			int id=0;
			int  bookNunber=0;
			
}
	
}
