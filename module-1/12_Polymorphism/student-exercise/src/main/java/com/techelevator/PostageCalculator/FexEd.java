package com.techelevator.PostageCalculator;

public class FexEd implements DeliveryDriver {
	
	public FexEd(double fexEdRate, String name) {
		this.fexEdRate = fexEdRate;
		this.name = name;
	}
	
	double calculateRate;

	
	public double getCalculateRate() {
		return fexEdRate;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFexEdRate() {
		return fexEdRate;
	}

	public void setFexEdRate(double fexEdRate) {
		this.fexEdRate = fexEdRate;
	}

	public double getRateOver500() {
		return rateOver500;
	}

	public void setRateOver500(double rateOver500) {
		this.rateOver500 = rateOver500;
	}

	public double getRateOver48() {
		return rateOver48;
	}

	public void setRateOver48(double rateOver48) {
		this.rateOver48 = rateOver48;
	}

	public double getBigAndFar() {
		return bigAndFar;
	}

	public void setBigAndFar(double bigAndFar) {
		this.bigAndFar = bigAndFar;
	}
	
	


	String name;
	
	public double fexEdRate = 20.00;
	
	public double rateOver500 = (fexEdRate + 5.00);
	
	public double rateOver48 = (fexEdRate + 3.00);
	
	public double bigAndFar = (fexEdRate + 8.00);
		
	

}
