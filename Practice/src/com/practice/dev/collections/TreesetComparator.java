package com.practice.dev.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetComparator 
{
	public static void main(String[] args) 
 {
		

	TreeSet<Emppp> hs = new TreeSet<Emppp>();
	
	Emppp e1 = new Emppp("SRS",15800,1);
	Emppp e2 = new Emppp("CSK",15500,3);
	Emppp e6 = new Emppp("CSK",15400,3);
	Emppp e3 = new Emppp("SID",15600,2);
	Emppp e4 = new Emppp("KKR",15900,5);
	Emppp e5 = new Emppp("LMN",15700,4);
	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	hs.add(e6);
	hs.add(null);
	hs.add(null);
	
	Iterator<Emppp> ref = hs.iterator();
	while(ref.hasNext())
	{
		Object obj = ref.next();
		System.out.println(obj);
		
	}
 }
}
