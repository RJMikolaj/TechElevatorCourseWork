package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	
	// Celsius to Fahrenheit conversion formula is tf = tc * 1.8 + 32
	// Fahrenheit to Celsius conversion formula is tc = (tf - 32) / 1.8
	/* Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit. 
     Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
			*/
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Fahrenheit: ");
		float fahrenheit = (int) input.nextInt();
		float celsius = ((fahrenheit -32) / (float) 1.8);
		System.out.println( "Your temperature in Celsius is: " + (int)celsius);
		

	Scanner newInput = new Scanner(System.in);
	System.out.print("Enter a temperature in Celsius: ");
	float tc = (int) input.nextInt();
	float tf = ((tc * (float) 1.8) + 32);
	System.out.println("Your temperature in Farenheit is: " +(int) tf);
}}