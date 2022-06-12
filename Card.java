package java6CodingAssignment;

public class Card {
	
	private int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	private String[] name = {"Diamonds", "Hearts", "Spades", "Clubs"};
	
	private String card = (value + " of " + name);
	
	private String describe() {
		return card;
	}

	
	public int[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		this.value = value;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

}



