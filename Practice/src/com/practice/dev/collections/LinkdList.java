package com.practice.dev.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkdList 
{
	public static void main(String[] args) 
	
	{  
		ArrayList <Object> al = new ArrayList<Object>();
		Employee e1 = new Employee("Sai Kavya",15800);
		Employee e2= new Employee("Sid",15800);
		Employee e3 = new Employee("Sahana",15800);
		al.add(e1);  
		al.add(e2);
		al.add(e3);
		
		LinkedList<Object> ll= new LinkedList<Object>(al);
	// or 	ll.addAll(al);     // It is used to insert the specified collection elements in the invoking collection
		
		Student mech = new Student(101,"Mech");
		Employee sur = new Employee("Suresh",15800);
		Trainer tra = new Trainer ("Suyash","J2EE");
		
		ll.add(mech);
		ll.add(sur);
		ll.add(tra);
		
		
		System.out.println("LinkeList Size :"+ll.size());
		
		for(int i=0;i<ll.size();i++)
		{
			Object obj = ll.get(i);
			System.out.println(obj);
		}
	
		
		
	}

}
