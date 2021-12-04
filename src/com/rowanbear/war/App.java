package com.rowanbear.war;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		
		Deck exampleDeck = new Deck();
		
		exampleDeck.shuffle();
		
		Player playerOne = new Player();
		playerOne.name = "Lucy";
		playerOne.describe();
		
		
		Player playerTwo = new Player();
		playerTwo.name = "Tom";
		playerTwo.describe();
		
		// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		
		for (int i = 2; i < 54; i++) {
			if (i%2 == 0) {
				playerOne.draw(exampleDeck);
			} else {
				playerTwo.draw(exampleDeck);
			}
		}
		
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
		//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.

		
		for (int i = 2; i < 28; i++) {
			
		
			Card card1 = playerOne.flip();
			Card card2 = playerTwo.flip();
			
			if (card1.value > card2.value) {
				System.out.println(playerOne.name + " wins this round");
				playerOne.incrementScore();
			} else if (card1.value < card2.value) {
				System.out.println(playerTwo.name + " wins this round");
				playerTwo.incrementScore();
			} else if (card1.value == card2.value){
				System.out.println("Draw: Neither player wins this round.");
				
			}
		
		}
				
			//After the loop, compare the final score from each player.
			//Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
			
			System.out.println(playerOne.name + "'s score is: " + playerOne.score);
			
			System.out.println(playerTwo.name + "'s score is: " + playerTwo.score);

			
			if (playerOne.score > playerTwo.score) {
				System.out.println(playerOne.name + " Wins");
			} else if (playerOne.score < playerTwo.score) {
				System.out.println(playerTwo.name + " Wins");
			} else if (playerOne.score == playerTwo.score) {
				System.out.println("Draw");
			}
					
		
	}

}
