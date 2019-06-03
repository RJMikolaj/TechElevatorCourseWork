package com.techelevator.PostageCalculator;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import com.techelevator.TollBoothCalculator.Vehicle;

public class PostageCalculator {

	public static void main(String[] args) {
		
		PostalServiceFirstClass postalService1 = new PostalServiceFirstClass(1, "First Class");
		PostalServiceSecondClass postalService2 = new PostalServiceSecondClass(2, "Second Class");
		PostalServiceThirdClass postalService3 = new PostalServiceThirdClass(2, "Third Class");
		FexEd fexEd1 = new FexEd(2.00, "Fex Ed");
		SPU spu1 = new SPU(8.00, "SPU");
		
		List <DeliveryDriver> deliveryMethod = new ArrayList<DeliveryDriver>();
		
		deliveryMethod.add(postalService1);
		deliveryMethod.add(postalService2);
		deliveryMethod.add(postalService3);
		deliveryMethod.add(fexEd1);
		deliveryMethod.add(spu1);
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.printf("Please Enter the Weight of the Package: ");
		
		String weightInput = userInput.nextLine();
		
		System.out.printf("Please Enter P for Pounds or O for Ounces: ");
		
		String poundsOrOuncesInput = userInput.nextLine();
		
		System.out.printf("How far will it be traveling? ");
		
		String howFarInput = userInput.nextLine();
		
		System.out.printf("%-25s %-25s", "Delivery Method", "Cost");
		
		for (DeliveryDriver delivery : deliveryMethod) {
		System.out.println();
		int randomNum = (int) (Math.random() * (9.9999));
		System.out.printf("%-25s %-25s", delivery, randomNum, ((PostalServiceFirstClass) delivery).calculateRate(randomNum));
		System.out.println();
		
		
	

	}

}
}