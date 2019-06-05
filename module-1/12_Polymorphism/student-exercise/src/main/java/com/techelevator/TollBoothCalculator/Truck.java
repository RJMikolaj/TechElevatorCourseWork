package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {

	public int numberOfAxles;
	public String name;

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public Truck(int numberOfAxles, String name) {
		super();
		this.numberOfAxles = numberOfAxles;
		this.name = name;
	}



	@Override
	public double calculateToll(int distance) {
	
		double truckToll = 0;
		if (numberOfAxles == 4) {
			truckToll = distance * .040;
		} else if (numberOfAxles == 6) {
			truckToll = distance * .045;
		} else if (numberOfAxles >= 8) {
			truckToll = distance * 0.48;
		}

		return truckToll;
	}

	@Override
	public Object addName() {
		// TODO Auto-generated method stub
		return "Truck";
	}

}
