package java6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<Card> cards = new ArrayList<Card>();
	
	public Deck() {		
				
		for(int i =2; i <=14; i++) {
			String cardFullName = i + " of Hearts";
			if(i == 11) {
				cardFullName = "Jack of Hearts";
			} else if (i == 12){
				cardFullName = "Queen of Hearts";
			} else if (i == 13){
				cardFullName = "King of Hearts";
			} else if (i == 14){
				cardFullName = "Ace of Hearts";
			}
			Card card = new Card(i, cardFullName);
			cards.add(card);			
		}
		for(int i =2; i <=14; i++) {
			String cardFullName = i + " of Diamonds";
			if(i == 11) {
				cardFullName = "Jack of Diamonds";
			} else if (i == 12){
				cardFullName = "Queen of Diamonds";
			} else if (i == 13){
				cardFullName = "King of Diamonds";
			} else if (i == 14){
				cardFullName = "Ace of Diamonds";
			}
			Card card = new Card(i, cardFullName);
			cards.add(card);			
		}
		for(int i =2; i <=14; i++) {
			String cardFullName = i + " of Spades";
			if(i == 11) {
				cardFullName = "Jack of Spades";
			} else if (i == 12){
				cardFullName = "Queen of Spades";
			} else if (i == 13){
				cardFullName = "King of Spades";
			} else if (i == 14){
				cardFullName = "Ace of Spades";
			}
			Card card = new Card(i, cardFullName);
			cards.add(card);			
		}
		for(int i =2; i <=14; i++) {
			String cardFullName = i + " of Clubs";
			if(i == 11) {
				cardFullName = "Jack of Clubs";
			} else if (i == 12){
				cardFullName = "Queen of Clubs";
			} else if (i == 13){
				cardFullName = "King of Clubs";
			} else if (i == 14){
				cardFullName = "Ace of Clubs";
			}
			Card card = new Card(i, cardFullName);
			cards.add(card);			
		}
				
	}
		
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
			
	public Card draw() {
		Card drawnCard = cards.get(0);
		cards.remove(0);
		return drawnCard;	   
	}
	
	public void describe() {
		for (Card card:cards) {
			card.describe();
		}
	}
}
