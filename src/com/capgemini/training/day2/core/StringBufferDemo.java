package com.capgemini.training.day2.core;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		StringBuffer sb1 = new StringBuffer(s1);
		
		sb1.append("welcome");
		System.out.println(sb1);
		
		//Stringbuffer -> String
		String s2 = sb1.toString();
		System.out.println(s2);
		
		sb1.insert(5, "Hi  ");
		System.out.println(sb1);
		
		sb1.delete(5, 8);
		System.out.println(sb1);

	}

}
