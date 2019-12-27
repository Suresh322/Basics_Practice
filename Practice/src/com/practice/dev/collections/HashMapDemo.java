package com.practice.dev.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(101, "CG");
		map.put(102, "DG");
		map.put(103, "EG");
		Set<Entry<Integer,String>> set = map.entrySet();
		
		Object[] arr = set.toArray();
		for(Object val:arr)
		{
			System.out.println(val);
		}
		
		
		
		
		
	}

}
