package com.capgemini.training.day4.inheritance;

public class A {
	//private int x;
	protected int x;
	public A() {
		System.out.println("The super class default constructor");
	}
	
	
	public A(int x) {
		super();
		this.x = x;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	public void showData() {
		System.out.println(this.x);
	}
	
	
}
