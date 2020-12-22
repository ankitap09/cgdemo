package com.capgemini.training.day1;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello wolrd");
		Integer i1 = new Integer(100);
		String s1 = new String("aaa");
		checkType(i1);
		checkType(s1);

	}

	private static void checkType(Object o) {
		if(o instanceof Integer) {
			System.out.println(o+" is type of integer");
		}
		else if(o instanceof String) {
			System.out.println(o+" is type of String");
		}
		else {
			System.out.println(o+" is  not type of Object");
		}
	}

}


