package com.capgemini.training.day4.inheritance;

public class B extends A {
	private int y;
	
	
	public B() {
		super();
	}
	public B(int y) {
		super();
		//super(y);
		this.y = y;
	}
	
	public B(int x,int y) {
		//super();
		//call 1-arg constructor
		super(x);
		this.y = y;
		
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println(this.y);
	}
	
	
	
}
