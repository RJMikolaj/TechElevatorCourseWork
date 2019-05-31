package com.techelevator.farm;

public final class Cat extends FarmAnimal{

	public Cat() {
		super("Cat", "Meow");
	}
	
	public Cat(boolean sleeping) {
		this();
		if (sleeping) {
			super.sleep();
		}
	}

}
