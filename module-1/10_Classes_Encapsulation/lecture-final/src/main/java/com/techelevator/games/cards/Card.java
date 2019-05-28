package com.techelevator.games.cards;

public class Card {
<<<<<<< HEAD
	
	private String rank;
	private String suit;
	private boolean faceUp = false;
	
=======

	private String rank;
	private String suit;
	private boolean faceUp = false;

>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
	@Override
	public String toString() {
		if (faceUp) {
<<<<<<< HEAD
		return rank + suit;
	} else {
		return "##";
	}
	
	}
	}
	
	
	// set rank and suit in the Constructor only 
=======
			return rank + suit;
		} else {
			return "##";
		}
	}
}
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
