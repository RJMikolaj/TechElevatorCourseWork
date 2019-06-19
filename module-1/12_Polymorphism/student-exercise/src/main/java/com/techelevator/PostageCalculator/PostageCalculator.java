package com.techelevator.PostageCalculator;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import com.techelevator.Currency;
import com.techelevator.TollBoothCalculator.Vehicle;

public class PostageCalculator {

	public static void main(String[] args) {
		
		PostalServiceFirstClass postalService1 = new PostalServiceFirstClass(0.0, "First Class");
		PostalServiceSecondClass postalService2 = new PostalServiceSecondClass(0.0, "Second Class");
		PostalServiceThirdClass postalService3 = new PostalServiceThirdClass(0.0, "Third Class");
		FexEd fexEd1 = new FexEd(0.0, "Fex Ed");
		SPU spu1 = new SPU(0.0, "SPU");
		
		List <DeliveryDriver> deliveryMethod = new ArrayList<DeliveryDriver>();
		
		deliveryMethod.add(postalService1);
		deliveryMethod.add(postalService2);
		deliveryMethod.add(postalService3);
		deliveryMethod.add(fexEd1);
		deliveryMethod.add(spu1);
		
		Scanner scan = new Scanner(System.in);
		while (true) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.printf("Please Enter the Weight of the Package: ");
		
		int weightInput = userInput.nextInt(); 
		
		// if (userInput > 0 ^ userInput < 100000) {
		//	for (String poundsOrOuncesInput = userInput.nextLine()) {
		//		System.out.printf("Is this weight in (P) Pounds or (O) Ounces?: ");
		}
		}
			
	//	}

		
		String poundsOrOuncesInput = userInput.nextLine();
		
		System.out.printf("How far will it be traveling? ");
		
		String howFarInput = userInput.nextLine();
		
		System.out.printf("%-25s %-25s", "Delivery Method", "Cost");
		
		for (DeliveryDriver delivery : deliveryMethod) {
		System.out.println();
		int randomNum = (int) (Math.random() * ((999-1) + 1) + 1);
		System.out.printf("%-25s %-25s", delivery.addName(), randomNum, ((PostalServiceFirstClass) delivery).calculateRate(randomNum));
		System.out.println();
		
			
		
		
	

	}

}
}
