package com.practice.dev.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoApp 
{
	public static void main(String[] args) 
	{
		List<String> l = Arrays.asList("Neha","Maya","Komal","Harshali","Disha");
		
		List<String> f=l.stream().filter(x->x.length()>4).collect(Collectors.toList());
		System.out.println("Filtered List : %s = "+f);
	}

}
