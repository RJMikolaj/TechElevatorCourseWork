package com.techelevator.PostageCalculator;

public class SPU implements DeliveryDriver {
	
	double weight;
	double distance;
	boolean fourDayGround;
	boolean twoDayBusiness;
	boolean nextDay;
	String name;
	private double spuRate;
	double rate = 0.00;
	
	public String getName() {
		return name;
	}
	
		double calculateRate;
	
		public double getCalculateRate() {
			return calculateRate + rate;
		}
		
		
	
	public SPU(double spuRate, String name) {
		this.spuRate = spuRate;
		this.name = name; }
	
	double spuRate(double weight, double distance) {
		
		if (fourDayGround) {
		rate = (weight * 0.0050) * distance; }
		else if (twoDayBusiness) {
		rate = (weight * 0.050) * distance; }
		else if (nextDay) {
		rate = (weight * 0.075) * distance; }
		return rate;
		
			
		}
	
	
	
	

}
