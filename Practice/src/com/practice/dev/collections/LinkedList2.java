package com.practice.dev.collections;

import java.util.LinkedList;

public class LinkedList2
{
	public static void main(String[] args) 
	{
		
	LinkedList<Object> l = new LinkedList <Object>();
	Student mech = new Student(101,"Mech");
	Employee sur = new Employee("Suresh",15800);
	Trainer tra = new Trainer ("Suyash","J2EE");
	l.add(mech);
	l.add(sur);
	l.add(tra);
	
	System.out.println("LinkeList Size :"+l.size());
	
	for(int i=0;i<l.size();i++)
	{
		Object obj = l.get(i);
		System.out.println(obj);
	}

	
	boolean b=l.removeAll(l); // returns boolean -> It is used to delete all the elements of the specified collection from the invoking collection
	System.out.println(b);  
	//l.clear();         // returns void ->same as Above lines (It removes the total number of elements from the collection)
	System.out.println("LinkeList Size :"+l.size());

	
	
	
	}
	
	

}
