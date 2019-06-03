package com.techelevator.TollBoothCalculator;

import java.util.List;

import java.util.ArrayList;

public class TollCalculator {

	public static void main(String[] args) {

		Car carWithoutTrailer = new Car(false, "Car Without Trailer");
		Car carWithTrailer = new Car(true, "Car With Trailer");
		Truck truckWithFourAxles = new Truck(4, "Truck with Four Axles");
		Truck truckWithSixAxles = new Truck(6, "Truck with Six Axles");
		Truck truckWithEightOrMoreAxles = new Truck(8, "Truck with Eight Axles");
		Tank justATankNoBigDeal = new Tank(0, "A Tank");

		List<Vehicle> vehicleToll = new ArrayList<Vehicle>();

		vehicleToll.add(carWithoutTrailer);
		vehicleToll.add(carWithTrailer);
		vehicleToll.add(truckWithFourAxles);
		vehicleToll.add(truckWithSixAxles);
		vehicleToll.add(truckWithEightOrMoreAxles);
		vehicleToll.add(justATankNoBigDeal);

		System.out.printf("%-25s %-25s %-15s", "Vehicle", "Distance Traveled", "Toll $");

		for (Vehicle vehiclePayingTolls : vehicleToll) {
			System.out.println();
			int randomNum = (int) (Math.random() * ((80 - 20) + 1) + 20);
			System.out.printf("%-25s %-25s %-15s", vehiclePayingTolls, randomNum, vehiclePayingTolls.calculateToll(randomNum));
			System.out.println();
		}

	}

}
