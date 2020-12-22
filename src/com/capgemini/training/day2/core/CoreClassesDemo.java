package com.capgemini.training.day2.core;

public class CoreClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("!!!Hello!!!");
		Object object = s1;
		System.out.println(object);
		System.out.println(object.hashCode());
		System.out.println(s1.hashCode());
		
		
		Class clas = s1.getClass();
		System.out.println(clas.getName());
		System.out.println(s1.getClass().getName());

	}
}
