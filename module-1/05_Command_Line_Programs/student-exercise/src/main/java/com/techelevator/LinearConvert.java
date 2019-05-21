package com.techelevator;
import java.util.Scanner;
public class LinearConvert {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a length in Meters: ");
			float meters = (int) input.nextInt();
			float feet = (meters * (float) 3.280899);
			System.out.println( "Your length in feet is: " + feet);
			

		Scanner newInput = new Scanner(System.in);
		System.out.print("Enter a length in feet: ");
		float lf = (int) input.nextInt();
		float lm = (lf * (float) 0.3048);
		System.out.println("Your length in meters is: " + lm);

	}

}
