package com.capgemini.training.day3.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArraysUtil {

	public static void main(String[] args) {
		String a[]= {"Java 8","Spring 5","JPA 2","React JS"};
		String b[]= {"Java 8","Spring 5","JPA 2"};
		System.out.println(Arrays.equals(a, b));
		Arrays.sort(a);
		System.out.println("-----------------");
		for(String str:a)
		System.out.println(str);
		System.out.println("-------------------");
		System.out.println(Arrays.binarySearch(a, "React JS"));
	
		System.out.println("--------------------------");
        List<String> myList= Arrays.asList(a);
        //Stream API
        myList.stream().forEach(System.out::println);
		
	
	}

}