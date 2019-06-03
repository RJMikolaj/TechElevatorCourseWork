package com.techelevator.PostageCalculator;

public class PostalServiceThirdClass implements DeliveryDriver {
	
	double perMileCost = 0;
	
	public PostalServiceThirdClass(double calculateRate, String name) {
		this.calculateRate = calculateRate;
		this.name = name; 
		}
	
	public String getName() {
		return name;
	}
	
	public double getCalculateRate() {
		return perMileCost;
		}
	
	public double calculateRate;
	public int distance;
	public String name;

	public double calculateRate(int ounces) {
		if (ounces <= 2) {
			perMileCost = distance * 0.0020; }
			else if (ounces > 3 && ounces < 8) {
			perMileCost = distance * 0.0022; }
			else if (ounces > 9 && ounces < 15) {
			perMileCost = distance * 0.0024; }
			else if (ounces > 16 && ounces < 48) {
			perMileCost = distance * 0.0150; }
			else if (ounces > 64 && ounces < 128) {
			perMileCost = distance * 0.0160; }
			else if (ounces >= 144) {
			perMileCost = distance * 0.0170; }
			return perMileCost; }

}
