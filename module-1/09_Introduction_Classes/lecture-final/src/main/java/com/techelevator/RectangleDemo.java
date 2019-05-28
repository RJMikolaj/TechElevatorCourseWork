package com.techelevator;

public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(20, 10);
<<<<<<< HEAD
		Rectangle rect2 = new Rectangle(8, -15);
		
=======
		Rectangle rect2 = new Rectangle(20, 10);
>>>>>>> 4165fd5e27f7b365c0fa995bfbd01fed917402b0
		
		System.out.println(rect1.isLargerThan(rect2));
		rect1.isLargerThan(20, 40);
		
<<<<<<< HEAD
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println("== " +(rect1 == rect2));
		System.out.println("equals() " + (rect1.equals(rect2)));
		
		

=======
	
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println("== " + (rect1 == rect2));
		System.out.println("equals() " + (rect1.equals(rect2)));
		
		
>>>>>>> 4165fd5e27f7b365c0fa995bfbd01fed917402b0
	}

}
