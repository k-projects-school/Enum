package be.my_portfolio.casino;

public enum Value {
	ACE(1), 
	TWO(2),
	THREE(3),
	FOUR(4), 
	FIVE(5), 
	SIX(6), 
	SEVEN(7), 
	EIGHT(8), 
	NINE(9), 
	TEN(10), 
	JACK(10), 
	QUEEN(10), 
	KING(10);
	
	private int value;
	
	Value(int value){
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
