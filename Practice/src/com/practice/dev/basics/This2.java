package com.practice.dev.basics;

public class This2 
{
	This2()
	{
		System.out.println("Execute NO");
	}
	This2(int a)
	{
		System.out.println("Execute YES");
	}
	
	public static void main(String[] args) 
	{
		new This2(1);
	}


}
