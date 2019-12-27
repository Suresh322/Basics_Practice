package com.practice.dev.ExceptionsHandling;

import java.io.IOException;

public class CheckedException 
{
	public static void main(String[] args) 
	{
		try 
		{
			new Demo1().test1();
		} 
		
		catch (IOException e) 
		{
          System.out.println("Exception Handled: "+ e);
		}
		
	}

}

class Demo3
{
	 void test3() throws IOException
	{
		System.out.println("Executing test3()");
		new IOException();
	}
}

class Demo2
{
	void test2() throws IOException
	{
		System.out.println("Executing test2()");
		new Demo3().test3();

	}
}
class Demo1
{
	void test1() throws IOException
	{
		System.out.println("Executing test1()");
		new Demo2().test2();

	}
}