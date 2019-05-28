package com.techelevator.games.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Collection of Cards
	private List<Card> cards = new ArrayList<Card>();
	
<<<<<<< HEAD
	private final static String[] suits = new String[] {"s", "s", "d", "h" };
	private final static String[] ranks = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	// When constructed, build a deck
=======
	private final static String[] suits = new String[] {"c", "s", "d", "h" };
	private final static String[] ranks = new String[] { "A", "2", "3", "4", "5", "6","7","8","9", "T", "J", "Q", "K"};
	
	// When constructed build a deck
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	public Deck() {
		for (String suit : suits) {
			for (String rank : ranks) {
				Card currentCard = new Card(rank, suit);
				cards.add(currentCard);
<<<<<<< HEAD
				}
		}
		
	}

=======
			}
		}
	}
	
	
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	// shuffle
	public void shuffle() {
		Collections.shuffle(cards);
	}
<<<<<<< HEAD
	
	// draw/ deal
=======
	// draw/deal
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	public Card deal() {
		if (cards.size() > 0) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
<<<<<<< HEAD
	// red-add card
=======
	// Re-add card
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
	public void placeCardBackInDeck(Card card) {
		cards.add(card);
	}
	
	// Delegate Method
	public int size() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		this.flip();
<<<<<<< HEAD
		String deckAsString =  "Deck [cards" + cards + "]";
=======
		String deckAsString = "Deck [cards=" + cards + "]"; 
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
		this.flip();
		return deckAsString;
	}
	
	private void flip() {
		for (Card playingCard : cards) {
			playingCard.flip();
		}
	}
<<<<<<< HEAD


		
	}
	
	


=======
}
>>>>>>> 89a0196bd108257f046b636fadb168b1d857868e
