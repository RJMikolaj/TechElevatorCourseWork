package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	public double getAveragePricePerItem() {
		return (totalAmountOwed / totalNumberOfItems);
	}
	
	private boolean isEmpty = true;
	
	public double addItems (int numberOfItems, double pricePerItem) {
		return (totalAmountOwed = (pricePerItem * numberOfItems));
	}
	
	private void empty(int numberOfItems, double pricePerItem) {
		if (totalNumberOfItems == 0 && totalAmountOwed == 0.00);
		
	}

	

	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	
	
	
}
