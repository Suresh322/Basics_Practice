package com.practice.dev.collections;

import java.util.HashSet;
import java.util.Set;

public class IsEmpty 
{
	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<Integer>();
		s.add(new Integer(2));;
		s.add(new Integer(4));
		s.removeAll(s);
		System.out.println(s.isEmpty());
		
	}

}
