package warcardgame.model;

public class Card {
	private final Rank rank;
	private final Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank rank() {
		return this.rank;
	}

	public Suit suit() {
		return this.suit;
	}

	public String toText() {
		return this.rank.code() + this.suit.code();
	}

	public String toString() {
		return this.rank + " of " + this.suit;
	}

}
