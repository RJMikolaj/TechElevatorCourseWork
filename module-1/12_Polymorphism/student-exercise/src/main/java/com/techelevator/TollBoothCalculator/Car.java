package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {
	
	public boolean hasTrailer;
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public Car(boolean hasTrailer) {
		this.hasTrailer = true;
	}

}
