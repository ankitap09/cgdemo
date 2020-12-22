package com.capgemini.training.day2.core;

public class TypeCast {

	public static void main(String[] args) {
		//casting between primitive types
		//implicit data conversion
		//lowertype -> higher type
		//char -> short -> int -> long ->float -> double
		int a =10 ;
		float f = a;
		System.out.println(f);

		//explicit data conversion
		//higher type -> lower type
		//leads to data loss
		//type casting
		byte b = 127;
		char ch = (char)b;
		int x = (int)2.5;
		System.out.println(x);

		//casting between reference type
		// casting can be done betwwen object of super class and sub class

		//upcasting : instance of sub class can be referenced by super class type
		//implicit conversion
		Object object = new String("Hwlloworld");
		System.out.println(object);


		//downcasting :instance of super class can be referenced by sub class type
		//explicit conversion : type casting
		//class cast exception is thrown at run time
		String s1 = (String)new Object();
		System.out.println(s1.length());


	}

}

/*public class TypeCast {

 

    public static void main(String[] args) {
        //casting between primitive types
        //implicit data conversion
        // lower-type->higher-type
        //char->short->int->long->float->double
        int a = 10;
        float f=a;
        System.out.println(f);
        //explicit data conversion
        //higher-type->lower-type
        //leads to data loss, hence explicitly be informed
        //by type casting        
        byte b= 127;
        char ch=(char)b;
        System.out.println(ch);
        int x= (int) 2.5;
        System.out.println(x);
        
        //casting between reference types
        //Casting can be done between objects of super class
        //and sub class
        
        //upcasting : instance of sub class can be referenced by super class type
        // implicit conversion
        Object object= new String("Hello Welcome");
        System.out.println(object);

 

        //down casting : instance of super class is assigned to reference variable
        //of sub class
        //explicit conversion: type casting
        //ClassCastException is thrown at runtime
        String s1= (String) new Object();
        System.out.println(s1.length());
        
        
        
    }

 

}*/