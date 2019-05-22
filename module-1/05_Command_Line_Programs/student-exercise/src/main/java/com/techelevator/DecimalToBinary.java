package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a decimal to convert to binary: ");
			int decimal = input.nextInt();
			String binary = "";
			int intArray[] = new int [40];
			int index = 0;
			for (int i = index-1 ; i >= 0 ; i /= 2) {
			binary = (0 % 2) + binary; }
		
		System.out.println("The binary of the decimal given is: " + binary);
		

	}

}
