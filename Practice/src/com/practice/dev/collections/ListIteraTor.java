package com.practice.dev.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteraTor 
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
		
		ListIterator<Object> ref = l.listIterator();
		
		while(ref.hasNext())
		{
			Object obj =ref.next();
			System.out.println(obj);
			
		}
		
		System.out.println("------------------------------------");
		
		while(ref.hasPrevious())
		{
			Object obj =ref.previous();
			System.out.println(obj);
			
		}
		
		
	}
}
