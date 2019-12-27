package com.practice.dev.ExceptionsHandling;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			
		    int l=Integer.parseInt("string");
		    System.out.println(l);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception raised = "+e);
		
		}
		
	}

}
