package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class FruitTree {
	
	public String typeOfFruit;
	public int startingPiecesOfFruit;
	
	public String getTypeOfFruit(String typeOfFruit) {
		return typeOfFruit;
		
	}
	
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		
		Map<String, Integer> getTypeOfFruit = new HashMap<String, Integer>();
		getTypeOfFruit.put("Banana", 5);
		getTypeOfFruit.put("Apple", 10);
		

		
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		return true;
	}
	
	

}
