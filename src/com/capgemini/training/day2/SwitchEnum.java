package com.capgemini.training.day2;

public class SwitchEnum {
	
enum Choice{
	Choice1,Choice2,Choice3
}

	public static void main(String[] args) {
		Choice ch = Choice.Choice1;
		switch(ch) {
		case Choice1 :System.out.println("choice1 is selected");
		              break;
		case Choice2 :System.out.println("choice2 is selected");
		              break;
		case Choice3 :System.out.println("choice3 is selected");
		              break;
		             
		}

	}

}
