package com.techelevator;

public class TriangleClassifier {
	
	public String classify(int sideOne, int sideTwo, int sideThree) {
		
		if (sideOne == sideTwo && sideOne == sideThree) {
			return "equilateral";
		}
		
		if ((sideOne == sideTwo && sideOne != sideThree) ||
				(sideOne == sideThree && sideOne != sideTwo) ||
				(sideTwo == sideThree && sideTwo != sideOne)) {
			return "isosceles";
		}
		
		return null;
	}
	

}