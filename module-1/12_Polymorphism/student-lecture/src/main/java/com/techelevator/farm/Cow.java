package com.techelevator.farm;

public class Cow extends FarmAnimal implements Sellable, Singable {

	public Cow() {
		super("Cow", "moo!");
	}
	
	@Override
	public int getPrice() {
		return 1500;
	}

}