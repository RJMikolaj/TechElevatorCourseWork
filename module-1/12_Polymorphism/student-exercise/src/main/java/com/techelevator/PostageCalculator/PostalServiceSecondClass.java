package com.techelevator.PostageCalculator;

import java.awt.SecondaryLoop;
import java.security.Provider.Service;

public class PostalServiceSecondClass implements DeliveryDriver {

	public double secondClassPerMileRate;
	public int distance;
	double perMileCost = 0;

	public PostalServiceSecondClass(double calculateRate, String name) {
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
			perMileCost = distance * 0.0035;
		} else if (ounces > 3 && ounces < 8) {
			perMileCost = distance * 0.0040;
		} else if (ounces > 9 && ounces < 15) {
			perMileCost = distance * 0.0047;
		} else if (ounces > 16 && ounces < 48) {
			perMileCost = distance * .0195;
		} else if (ounces > 64 && ounces < 128) {
			perMileCost = distance * .0450;
		} else if (ounces >= 144) {
			perMileCost = distance * .0500;
		}
		return perMileCost;
	}

	@Override
	public Object addName() {
		return "Postal Service Second Class";
	}

}
