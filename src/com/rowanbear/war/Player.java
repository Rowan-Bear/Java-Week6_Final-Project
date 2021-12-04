package com.rowanbear.war;

import java.util.ArrayList;

public class Player {

	ArrayList<Card> hand;
	
	int score;
	
	String name;
	
	public Player () {
		this.hand = new ArrayList<Card>();
		this.score = 0;
		this.name = "Default Name";
	}
	
	//getters and setters
	
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//methods
	
	
/*
 * describe - prints out info about player and calls describe method for each card in Hand List
 * 
 * flip - removes and returns the top card of the Hand
 * 
 * draw - takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field. 
 * 
 * incrementScore - adds a point to player's score field
 * 
 * 
 */

	public void describe() {
		System.out.println("This is " + this.name + ". \nThey have these cards in their hand: "); 
		for (Card card : this.hand) {
			card.describe();
		}
		
		System.out.println(name + "'s current score is: " + score);
		
		
	}
	
	//flip method also prints out what is happening to the console to make it more exciting, like a real game!
	
	public Card flip() {
		Card card = hand.get(0);
		hand.remove(hand.get(0));
		System.out.println("------------------------"); 
		card.describe();
		System.out.println(" is played by " + this.name + "\n------------------------");
		
		return card;
	}
	
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	
}
