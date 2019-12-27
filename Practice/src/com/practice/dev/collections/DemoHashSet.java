package com.practice.dev.collections;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("java"); 
		hs.add("mava");
		hs.add("kova");
		hs.add("JAVA");
		hs.add("lava");
		hs.add(null);
		hs.add(null);   //  add():boolean  eliminates the Duplication by Overriding hashCode() and equals()
		
		Iterator<String> ref = hs.iterator();
		while(ref.hasNext())
		{
			Object obj = ref.next();
			System.out.println(obj);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
