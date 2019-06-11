package be.my_portfolio.casino;

public enum SuitType {
	CLUBS,
	DIAMONDS,
	SPADES,
	HEARTS;
	
	public String toString() {
		return name().toLowerCase();
	}
}
