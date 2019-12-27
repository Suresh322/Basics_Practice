package com.practice.dev.collections;

public class StringTest 
{
	public static void main(String[] args) 
	{
		String name = new String("aravind");
		
		String rname=name.replace('a','*');
		System.out.println(rname);
		
		String sname=rname.substring(2,4);
		System.out.println(sname);
		
		int n=sname.indexOf('i');
		System.out.println(n);
		
	}

}
