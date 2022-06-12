package java6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	public List<String> cards = new ArrayList<String>();
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
			
	public void draw() {
		int cardPosition = cards.indexOf(0);
	    cards.remove(cardPosition);
	   
	}
}
