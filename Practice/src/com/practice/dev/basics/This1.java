package com.practice.dev.basics;

public class This1 
{   
	int a = 20;
	This1()
	{
		System.out.print("A ");
		System.out.print("B ");
	}
	This1(int a)
	{
		this();
		System.out.print("C ");
		System.out.print("D ");	
	}
	This1(int a,int b)
	{   
		
		this(10);
		System.out.print("E ");
		System.out.println("F");	
	}
	
	
	
	public static void main(String[] args) 
	{
		This1 t = new This1(10,20);
		System.out.println("a = "+t.a);
		
		
	}
	
}
