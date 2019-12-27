package com.practice.dev.collections;

public class Student 
{
	int id;
	String branch;
	
	public Student(int id, String branch) {
		super();
		this.id = id;
		this.branch = branch;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", branch=" + branch + "]";
	}
	

}
