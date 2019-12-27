package com.practice.dev.basics;

public class Program1 
{
	 int i = 10;
	 void disp()
	{
		System.out.println("This is an disp()");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("int i value is :"+new Program1().i);
		new Program1().disp();
		
		Test1 t = new Test1();
		t.sample1();
		System.out.println(Test1.d);
		Test1.d = 11.25;
		System.out.println(Test1.d);
		
		new Test2().sample2();
		
		
		
	}

}
