package com.practice.dev.Polymorphism;

class A
{
	public void test()
	{
		System.out.println("Test()");
	}
	public void test(int a)
	{
		System.out.println("Test(int a)");
	}
	
	public void test(int a ,int b)
	{
		System.out.println("Test(int a,int b)");
	}	
}
public class OverLoading 
{
	  public static void main(String[] args)
	  {
		  
		  A a = new A();
	      a.test();
	      a.test(10);
	      a.test(10,20);
	   
	  }

}
