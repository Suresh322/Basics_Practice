package com.practice.dev.collections;

import java.util.HashSet;
import java.util.Iterator;

public class ComParable 
{
	public static void main(String[] args) 
	{
		HashSet<Empp> hs = new HashSet<Empp>();
		Empp e1 = new Empp("SRS",15800,1);
		Empp e2 = new Empp("CSK",15800,3);
		Empp e6 = new Empp("CSK",15800,3);
		Empp e3 = new Empp("SID",15800,2);
		Empp e4 = new Empp("KKR",15800,5);
		Empp e5 = new Empp("LMN",15800,4);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		hs.add(null);
		hs.add(null);
		
		Iterator<Empp> ref = hs.iterator();
		while(ref.hasNext())
		{
			Object obj = ref.next();
			System.out.println(obj);
			
		}
		
	}

}
