package com.practice.dev.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteraTor 
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
			
		Iterator<Object> ref=l.iterator();  //  THIS LINE OF CODES DEFINES 100%  ABSTRACTION 
		
		while(ref.hasNext())
		{
			Object obj =ref.next();
			System.out.println(obj);
			
		}
		
		System.out.println("LinkeList Size :"+l.size());
		
		
		ref.remove(); //Removes only  previously added Element
		
		System.out.println("LinkeList Size :"+l.size());//2
		
		
		
	}

}
