package com.rowanbear.war;

import java.util.ArrayList;

import java.util.Collections;

public class Deck {

	ArrayList<Card> cards;	
	
	public Deck() {
					
	this.cards = new ArrayList<Card>();
				
		
					//creates ArrayList [2, ... 15]
					ArrayList<Integer> cardValue = new ArrayList<Integer>();
					for (int i = 2; i < 15; i++) {
						cardValue.add(i);
					}
					
					//In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	
					
					//to make hearts cards
					for (Integer i : cardValue) {
							Card card = new Card(i, " Of Hearts" );
							cards.add(card);
					}
					
					//to make spade cards
					for (Integer i : cardValue) {
						Card card = new Card(i, " Of Spades" );
						cards.add(card);
				}
					
					//to make diamond cards
					for (Integer i : cardValue) {
						Card card = new Card(i, " Of Diamonds" );
						cards.add(card);
				}
					
					//to make clubs cards
					for (Integer i : cardValue) {
						Card card = new Card(i, " Of Clubs" );
						cards.add(card);
				}
					
					
							
		
	}
	
	//methods
	
/*
 * shuffle (randomizes the order of the cards)
 * 
 * draw (removes and returns the top card of the Cards field)

 */
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	public Card draw() {
		
		return cards.remove(0);
		
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
 
}
