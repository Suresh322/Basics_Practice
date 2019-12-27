package com.practice.dev.collections;

import java.util.ArrayList;

public class Arrylist 
{
	public static void main(String[] args) 
	{
		ArrayList <Object> a = new ArrayList<Object>(20);
		System.out.println(a.isEmpty());
		Student s = new Student(101,"Mech");
		Student eee= new Student(103,"EEE");
		Student c = new Student(102,"CSE");
		Employee e = new Employee("Suresh",15800);
		Employee e1 = new Employee("Sai Kavya",15800);
		Employee e2= new Employee("Sid",15800);
		Employee e3 = new Employee("Sahana",15800);
		Trainer t = new Trainer ("Suyash","J2EE");
		
		
		System.out.println("Intial Size of an ArrayList = "+ a.size());
		a.add(s);
		a.add(e);
		a.add(t);
		a.add(eee);
		System.out.println(a.isEmpty());    // It checks if collection is empty & return boolean
		System.out.println(a.contains(c));  // It is used to search an element & return boolean
		System.out.println(a.get(2));  
		a.remove(eee);                      // It is used to delete an element from the collection
		a.add(e1);  
		a.add(e2);
		a.add(e3);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		Object [] objarray= a.toArray();  // Converting Collections into Array
		for(Object obj:objarray)
		{
			System.out.println(obj);
		}
		
		
		// Remove the element From Object
		
		a.remove(e3);
		
		
		
		
		
		
		for(int i=0;i<a.size();i++)
		{;
			Object o=a.get(i);
			System.out.println(o);
		}
		
		System.out.println("Final Size of an ArrayList = "+a.size());
		
		for(int i=0;i<a.size();i++)
		{
			Object o = a.get(i);
			if(o instanceof Student)
			{
			Student s1 = (Student)o;
			System.out.println(s1.id);
			System.out.println(s1.branch);
			}
			else
			{
				System.out.println("false");
			}
			
				
					
		}
	
				
	}
	

}
