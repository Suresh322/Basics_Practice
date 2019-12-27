package com.practice.dev.collections;

public class Emp 
{
	String name ;
	double sal;
	int id;
	
	public Emp(String name, double sal, int id)
	{
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}



	@Override
	public int hashCode()
	{
		System.out.println("Calling HashCode Method");
		return this.id;
	}
	
    @Override
   public boolean equals(Object o)
    {
    	System.out.println("Calling Equals Method");
    	Emp e = (Emp)o;
    	return this.id==e.id;
   	
   }
	

}
