package com.capgemini.training.day4.inheritance;

public class C extends A{
	private int z;
	
	public C() {
		
	}
	
	public C(int z) {
		this.z =z;
	}

	public C(int x,int z) {
		super(x);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
	}
	
	
}
