package com.practice.dev.Inheritance;

public class Simple 
{
	void msg()
	{
		System.out.println("Messging");
	}
}
class Imo extends Simple
{
	void videoCall()
	{
		System.out.println("Video_Calling");
	}  	
}
class Main
{
	public static void main(String[] args)
	{
		Imo o =  new Imo();
		o.msg();
		o.videoCall();
	}
}

