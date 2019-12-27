package com.practice.dev.Inheritance;

class Message //Hierarchical Inheritance
{

	public void msg()
	{
		System.out.println("Message");
	}
	
}

class FB extends Message
{
	public void timeline()
	{
		System.out.println("FB_Timeline");
	}
}
class Hike extends Message
{
	public void timeline()
	{
		System.out.println("Hike_Timeline");
	}

}

 public class Hierarchical
{
	 public static void main(String[] args) 
	{
		 Hike d = new Hike();
		 d.msg();
		 d.timeline();	
		 
		 System.out.println();
		 
		 FB f = new FB();
		 f.msg();
		 f.timeline();
	}
	
}