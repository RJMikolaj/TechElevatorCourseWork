package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {

	public boolean hasTrailer;
	public String name;

	public String getName() {
		return name;
	}

	public Car(boolean hasTrailer, String name) {
		super();
		this.hasTrailer = hasTrailer;
		this.name = name;
	}

	public boolean getHasTrailer() {
		return hasTrailer;
	}
	
	

	@Override
	public double calculateToll(int distance) {
		double carToll;
		if (hasTrailer) {
			carToll = (distance * 0.020) + 1.00;
		} else {
			carToll = (distance * 0.020);
		}
		return carToll;
	}

}
