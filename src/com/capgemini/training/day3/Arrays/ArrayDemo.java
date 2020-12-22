package com.capgemini.training.day3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// accept number of students
		System.out.println("Enter number of students: ");
//		int size= scanner.nextInt();	
//		scanner.nextLine();//dummy nextLine method to clear KBD buffer
		
		int size = Integer.parseInt(scanner.nextLine());
		//allocate memory
		String names[]= new String[size];
		
		//accept names
		getName(names);
		
		//display names
		showArray(names);
		
		//sort names
		Arrays.sort(names);
		
		
		//display names
		System.out.println("After sorting..");
		for(String s: names) {
			System.out.println(s);
		}
	}
	public static void showArray(String[] names) {
		System.out.println("Before sorting..");
		for(String s: names) {
			System.out.println(s);
		}
	}
	public static void getName(String[] names) {
		//Accept names
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter name student: "+(i+1));
			names[i]= scanner.nextLine();			
		}
	}

}
