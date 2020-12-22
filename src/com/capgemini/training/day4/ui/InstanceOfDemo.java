package com.capgemini.training.day4.ui;

import com.capgemini.training.day4.inheritance.A;
import com.capgemini.training.day4.inheritance.B;
import com.capgemini.training.day4.inheritance.C;

public class InstanceOfDemo {

	public static void main(String args[]) {
		//A aobj = null;
		A aobj = new A(1);
	
		checkInstanceOf(aobj);
		checkInstanceOf(new B(5,4));
		checkInstanceOf(new C(5,4));
	}

	private static void checkInstanceOf(A aobj) {
		// TODO Auto-generated method stub
		
		if(aobj instanceof B) {
			System.out.println("Instance of B");
		}
		else if(aobj instanceof C){
			System.out.println("Instance of C");
		}
		else if(aobj instanceof A) {
			System.out.println("Instance of A");
		}
		
	}
}
