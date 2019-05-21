package com.techelevator;

import java.util.Scanner;

public class EarthToSunWeightConverter {

	/*
	 * Command line programs usually follow this work flow:   Take Data, Calculate Data, Give Results
	 * 
	 * How can we do each of these steps?
	 */
	public static void main(String[] args) {
		
		int sunGravity = 28;
<<<<<<< HEAD

=======
		
>>>>>>> 0014bcbb0cf2d78a653424565293694b3b73767d
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Earth Weight: ");
		String userInput = in.nextLine();
		
		int weightOnEarth = Integer.parseInt(userInput);
		
		int weightOnTheSun = weightOnEarth * sunGravity;
		
		System.out.printf("%-15s  %-15s", "Earth (lbs)", "Sun (lbs)");
<<<<<<< HEAD
		System.out.println("\n----------------------");
		System.out.printf("%-15s  %-15s", weightOnEarth, weightOnTheSun);
		System.out.println("Weight on Sun: " + weightOnTheSun);
		
		
=======
		System.out.println("\n--------------------------------------");
		System.out.printf("%-15s  %-15s", weightOnEarth, weightOnTheSun);
		
		

>>>>>>> 0014bcbb0cf2d78a653424565293694b3b73767d
	}

}
