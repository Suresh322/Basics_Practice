package com.practice.dev.Polymorphism;

class Parent
{
	public void bike()
	{
		System.out.println("Parent Bike");
	}
}
class Child extends Parent
{
	public void bike()
	{
		System.out.println("Child Bike");
	}
}
public class OverRiding 
{
     public static void main(String[] args) 
     {
//    	 Parent p = new Parent();
//    	 p.bike();
    	 
    	 Parent p = new Child();
    	 p.bike();
    	 
    	 

		
	 }
}
