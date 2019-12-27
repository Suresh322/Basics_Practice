package com.practice.dev.basics;

public class This4 
{
	public static void main(String[] args) 
	{
		This3 t1 = new This3();
		System.out.println("a ="+ t1.a);
		t1.test(10);
		System.out.println("t1 ="+t1);
		This3 t2 = new This3();
		System.out.println("a ="+ t2.a);
		t1.test(20);
		System.out.println("t1 ="+t2);
		
	}

}
