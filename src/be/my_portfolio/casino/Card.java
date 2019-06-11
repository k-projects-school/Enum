package be.my_portfolio.casino;

public class Card {
	private SuitType suit;
	private Value number;
	
	Card(SuitType suit, Value number){
		this.suit = suit;
		this.number = number;
	}
	
	/**
	 * @return the suit
	 */
	public SuitType getSuit() {
		return suit;
	}
	
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(SuitType suit) {
		this.suit = suit;
	}
	
	/**
	 * @return the number
	 */
	public Value getNumber() {
		return number;
	}
	
	/**
	 * @param number the number to set
	 */
	public void setNumber(Value number) {
		this.number = number;
	}
}
