package com.techelevator.PostageCalculator;

public class PostalServiceFirstClass implements DeliveryDriver {

	public double firstClassPerMileRate;
	public int distance;
	double perMileCost = 0;
	
	public PostalServiceFirstClass(double calculateRate, String name) {
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
	public String name;

	public double calculateRate(int ounces) {
		if (ounces <= 2) {
			perMileCost = distance * 0.035; }
			else if (ounces > 3 && ounces < 8) {
			perMileCost = distance * 0.040; }
			else if (ounces > 9 && ounces < 15) {
			perMileCost = distance * 0.047; }
			else if (ounces > 16 && ounces < 48) {
			perMileCost = distance * .195; }
			else if (ounces > 64 && ounces < 128) {
			perMileCost = distance * .450; }
			else if (ounces >= 144) {
			perMileCost = distance * .500; }
			return perMileCost; }
				
				
		
				
	}
			
			
		


