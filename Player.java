package java6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();	

	private String playerName;
	
	private int score;
	
	public Player(String name) {
		this.playerName = name;
		this.score = 0;			
	}
			
	public void describe() {
		System.out.println(this.getPlayerName());
		System.out.println(this.getScore() + "\n");
		for (Card card:hand) {
		card.describe();
		}
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {		
	    return hand.remove(0);
	}
		
	public void incrementScore() {
		score = score + 1;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
}
