package com.practice.dev.basics;

public class Palindrome {
	
	public static void main(String[] args) 
	{
		String str="madam";
		
		String newstr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newstr=newstr+str.charAt(i);
		}
		System.out.println(str.equals(newstr));
	}

}
