package com.capgemini.training.day2;


//Manager Class

public class BoxManager {
	public double calculateVolume(Box box) {
		return box.getWidth()*box.getDepth()*box.getHeight();
	}

}
