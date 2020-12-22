package com.capgemini.training.day3.Arrays;

public class WrapperClassDemo {
	public static void main(String[] args) {
		//Integer i=null;
		//int x=i;
		//throws null pointer exception
		//System.out.println(x);
		//comile time error
		//int y=null;
		
		//primitive
		boolean b=true;
		b=false;
		//wrapper class
		Boolean bool=true;
		bool=false;
		bool=null;
		
	
		//long empid= 1800965L;
		//introduced in java 7
		long empid=180_096_5L;
		System.out.println(empid);
		System.out.println("------------");
		//converting string object to Integer
		Integer iobj=Integer.valueOf("123");
		System.out.println(iobj);
		Integer x1=Integer.parseInt("123");
		System.out.println(x1);
	
		
	
	
	}
	
}