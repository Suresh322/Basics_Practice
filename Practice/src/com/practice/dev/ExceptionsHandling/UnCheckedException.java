package com.practice.dev.ExceptionsHandling;


public class UnCheckedException 
{
	public static void main(String[] args) 
	{
		try 
		{
			new Demo11().test1();
		} 
		
		catch (ArithmeticException e) 
		{
          System.out.println("Exception Handled: "+ e);
		}
		
	}

}

class Demo33
{
	 void test3()
	{
		System.out.println("Executing test3()");
		int i =1/0;
		System.out.println(i);
	}
}

class Demo22
{
	void test2() 
	{
		System.out.println("Executing test2()");
		new Demo33().test3();

	}
}
class Demo11
{
	void test1() 
	{
		System.out.println("Executing test1()");
		new Demo22().test2();

	}
}