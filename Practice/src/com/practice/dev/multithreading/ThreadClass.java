package com.practice.dev.multithreading;
class ThreadOne extends Thread
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

class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i<=5;i++)
		{
			System.out.println("Thread_Two");
		}
	}
}
public class ThreadClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadOne t1= new ThreadOne();
		t1.start();

		ThreadTwo t2= new ThreadTwo();
		t2.start();
		
		
	}

}
