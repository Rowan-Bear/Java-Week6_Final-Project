package com.rowanbear.war;

public class Card {
	//I used the field "suit" instead of just calling it "name"
 Integer value;
 String suit;
	
		public Card() {}
 
 		public Card(Integer value, String suit) {
		this.suit = suit;
		this.value = value;
	}

//getters and setters
 		
	public Integer getValue() {
		return value;
	}





	public void setValue(Integer value) {
		this.value = value;
	}





	public String getSuit() {
		return suit;
	}





	public void setSuit(String suit) {
		this.suit = suit;
	}



//methods
	
	/*
	 * describe (prints out information about a card)
	 */

	public void describe() {
		
		if (value < 11) {
			System.out.println(value + suit);
//			if the card is referred to with a name instead of a value
		} else if (value == 11) {
			System.out.println("Jack" + suit);
		} else if (value == 12) {
			System.out.println("Queen" + suit);
		} else if (value == 13) {
			System.out.println("King" + suit);
		} else if ( value == 14) {
			System.out.println("Ace" + suit);
		}
			
		
		
		
		
		
		
	}
	
}


