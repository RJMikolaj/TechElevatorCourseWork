package com.techelevator;
<<<<<<< HEAD
=======

>>>>>>> 4165fd5e27f7b365c0fa995bfbd01fed917402b0
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Rectangle> walls = new ArrayList<Rectangle>();
		
<<<<<<< HEAD
		
=======
>>>>>>> 4165fd5e27f7b365c0fa995bfbd01fed917402b0
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				
				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
				System.out.print("Enter wall width >>> ");
				int width = Integer.parseInt(scan.nextLine());

				Rectangle wall = new Rectangle(width, height);
				walls.add(wall);
				System.out.println("Added "+ wall);
				
				Rectangle wall = new Rectangle(width, height);
				walls.add(wall);
				System.out.println("Added " + wall);
				
			} else if(userChoice.equals("2")) {
				
<<<<<<< HEAD
				int totalArea = 0;
				int count = 1;
				for (Rectangle wall : walls) {
				}
				
				// Here we need to sum up the areas of all walls that have been entered
				System.out.println("Wall 1: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
				System.out.println("Wall 2: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
				System.out.println("Wall 3: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
				System.out.println("Wall 4: 10x15 - 150 square feet"); // PROTOTYPE ONLY!!!
				
				int totalArea = 600; // PROTOTYPE ONLY!!!
=======
				int totalArea = 0; 
				int count = 1;
				for (Rectangle wall : walls) {
					totalArea += wall.getArea();
					System.out.println("Wall " + count + ": " + wall);
					count++;
				}
>>>>>>> 4165fd5e27f7b365c0fa995bfbd01fed917402b0
				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
