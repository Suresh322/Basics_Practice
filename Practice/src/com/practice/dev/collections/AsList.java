package com.practice.dev.collections;

import java.util.Arrays;
import java.util.List;

public class AsList 
{
	public static void main(String[] args) 
	{
		List<String> values = Arrays.asList("a","b","c","d");
		String join =values.parallelStream().reduce((a, b)->a.concat(b).toUpperCase()).get();
		System.out.println(join);
		
	}
	

}
