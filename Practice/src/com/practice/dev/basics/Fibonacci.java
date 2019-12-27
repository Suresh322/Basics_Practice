package com.practice.dev.basics;

import java.util.Scanner;

public class Fibonacci 
{

	private static Scanner s;

	public static void main(String[] args)
	{
		int a =0;
		int b=0;
		int c=1;
		s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=s.nextInt();
		System.out.println("Fibancci Series");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
					
		}
		

	}

}
