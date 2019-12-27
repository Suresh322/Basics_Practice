package com.practice.dev.ExceptionsHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsKeyword 
{
	void disp() throws IOException,SQLException
	{
		
		System.out.println("Disp method ");
		
	}

}

class Main
{
	public static void main(String[] args) 
	{
		try
		{
			new ThrowsKeyword().disp();
		}
		catch(IOException i)
		{
			System.out.println("IOException Handled:"+i);
		}
		
		catch(SQLException s)
		{
			System.out.println("IOException Handled:"+s);
		}
		
	}
}
