package com.practice.dev.multithreading;
class SuperClass
{
	
}

class ThreadOnee extends  SuperClass implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 1; i<=5;i++)
		{
			System.out.println("Thread_One");
		}
	}
}

public class RunnableInterface 
{
	
	public static void main(String[] args) 
	{
		ThreadOnee t1= new ThreadOnee();
		Thread t = new Thread(t1);
		t.start();
		
	}
	

}
