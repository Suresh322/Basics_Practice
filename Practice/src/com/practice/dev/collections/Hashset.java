package com.practice.dev.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
	public static void main(String[] args) 
	{
		HashSet<Emp> hs = new HashSet<Emp>();
		Emp e1 = new Emp("SRS",15800,1);
		Emp e2 = new Emp("CSK",15800,3);
		Emp e6 = new Emp("CSK",15800,3);
		Emp e3 = new Emp("SID",15800,2);
		Emp e4 = new Emp("KKR",15800,5);
		Emp e5 = new Emp("LMN",15800,4);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		hs.add(null);
		hs.add(null);
		
		Iterator<Emp> ref = hs.iterator();
		while(ref.hasNext())
		{
			Object obj = ref.next();
			System.out.println(obj);
			
		}
		
	}

}
