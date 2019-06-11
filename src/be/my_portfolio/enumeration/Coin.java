package be.my_portfolio.enumeration;

public enum Coin {
	ONE_CENT(1),
	TWO_CENT(2),
	FIVE_CENT(5),
	TEN_CENT(10),
	TWENTY_CENT(20),
	FIFTY_CENT(50),
	ONE_EURO(100),
	TWO_EURO(200);
	
	Coin(int value){
		this.value = value;
	}
	
	private int value;
	
	public int getValue() {
		return this.value;
	};
}
