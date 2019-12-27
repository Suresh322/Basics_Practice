package com.practice.dev.collections;

public class Trainer 
{
	String name;
	String skill;
	
	public Trainer(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	@Override
	public String toString() 
	{
		return "Trainer [name=" + name + ", skill=" + skill + "]";
	}
	

}
