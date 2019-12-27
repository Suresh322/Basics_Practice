package com.practice.dev.Inheritance;

 class Demo1
{
	int a = 123;
	static double b=24.65;
	Demo1()
	{
		System.out.println("I Am a Constructor");
	}
	public void test()
	{
		System.out.println("Test Method in Demo_Class");
	}
	
}

class Demo extends Demo1
{
	

}

 public class Test1
{
	 public static void main(String[] args) 
	{
		 Demo d = new Demo();
		 System.out.println(d.a);
		 System.out.println(Demo.b);
		 
		
	}
	
}
