package com.practice.dev.basics;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo
{
  public static void main(String [] args)
{
  Supplier<String> s=()->"WELCOME";
  Predicate<String>p=(str1)->str1.length()>10;
  System.out.println(p.test(s.get()));
}
}