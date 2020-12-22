package com.capgemini.training.day2;

public class ComputerTester {

	public static void main(String[] args) {

		Computer myComputer = new Computer();
		
		/*without enum
		myComputer.setState(Computer.POWER_ON);
		myComputer.checkState();
		myComputer.setState(100);
		myComputer.checkState();
		*/
		myComputer.setState(ComputerState.ON);
		myComputer.checkState();
		
		//here we get error on compilation iteself for that we require enum
		//myComputer.setState(100);//error on this line at compiltion
		//myComputer.checkState();
	}

}
