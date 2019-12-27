package com.practice.dev.basics;

public class Test4 
{ 
	 int k   ;
	static int m ;
	 int i =20;
	 int j =30;
     int add(int i, int j)
   {
	    return k = i+j; 
	   
   }
     
    public static void main(String[] args) 
    {
		Test4 t = new Test4();
		System.out.println(t.add(25,35));
		System.out.println(t.k);
		//sSystem.out.println(t.m); // Still Works
		System.out.println(Test4.m);
	}
}
