package com.capgemini.training.day2;

public class Computer {
	//public static final int POWER_OFF=0;
	//public static final int POWER_ON=1;
	//public static final int POWER_SUSPEND=2;
	
	//private int state;
	
	private ComputerState state;
	public Computer() {
		
	}
	
/*
	public Computer(int state) {
		super();
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	*/
	
	public Computer(ComputerState state) {
		super();
		this.state = state;
	}

	public ComputerState getState() {
		return state;
	}

	public void setState(ComputerState state) {
		this.state = state;
	}

	public void checkState() {
		switch(state) {
		case OFF :System.out.println("OFF State");break;
		case ON :System.out.println("On State");break;
		case SUSPEND :System.out.println("Hibernate State");break;
		default:System.out.println("Invalid State");
		}
	}
	
	

}
