package com.practice.dev.collections;

import java.util.Comparator;

public class Emppp implements Comparator<Object>
{

	String name ;
	double sal;
	int id;
	
	public Emppp(String name, double sal, int id)
	{
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	@Override
	public String toString() 
	{
		return "Emppp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}


//	@Override
//	public int compare(Object o1, Object o2) 
//	{
//		Emppp e1=(Emppp)o1;
//		Emppp e2=(Emppp)o2;
//		
//		return e1.id-e2.id;
//	}
	
	@Override
	public int compare(Object o1, Object o2) 
	{
		Emppp e1=(Emppp)o1;
		Emppp e2=(Emppp)o2;
		
		return (int)((e1.sal-e2.sal)*1000);
	}
	
	

}
