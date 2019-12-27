package com.practice.dev.collections;

public class Empp implements Comparable<Object>
{

	String name ;
	double sal;
	int id;
	
	public Empp(String name, double sal, int id)
	{
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emppp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
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
    	Empp e = (Empp)o;
    	return this.id==e.id;
   	
   }
	@Override
	public int compareTo(Object obj) 
	{
		Empp ref=(Empp)obj;
		return this.id-ref.id;
	}
	


}
