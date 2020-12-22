package com.capgemini.training.day2;
import java.util.Scanner;

import static java.lang.Math.*;

public class StaticImport {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Enter radius of circle :");
		int r = sc.nextInt();
		//without static import
		//double area = Math.PI*r*r;
		
		//with static import
		double area= PI*r*r;
		System.out.println("Area of circle :"+ area);
	}

}
