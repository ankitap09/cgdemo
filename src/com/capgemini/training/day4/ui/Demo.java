package com.capgemini.training.day4.ui;

import com.capgemini.training.day4.inheritance.B;
import com.capgemini.training.day4.pack.C;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bobj = new B();
		System.out.println(bobj.getX()+" "+bobj.getX());
		
		
		B bobj1 = new B(5);
		System.out.println(bobj1.getX()+" "+bobj1.getY());
		
		B bobj2 = new B(5,10);
		System.out.println(bobj2.getX()+" "+bobj2.getY());
		
		C bobj3 = new C();
		bobj3.showData();
	}

}
