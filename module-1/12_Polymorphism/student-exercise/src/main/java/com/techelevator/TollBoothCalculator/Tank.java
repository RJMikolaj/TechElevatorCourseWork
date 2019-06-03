package com.techelevator.TollBoothCalculator;

public class Tank implements Vehicle {

	public boolean isTank;
	public String name;
	
	public Tank(int tankToll, String name) {
		this.name = name; }
	
	public String getName() {
		return name; }

	@Override
	public double calculateToll(int distance) {
		int tankToll = 0;
		return tankToll;
	}

}
