package com.practice.dev.collections;

public class Employee 
{
	String name;
	double sal;
	
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}	

}
