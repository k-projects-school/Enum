package be.my_portfolio.casino;

public enum ChipColorValue {
	RED(1),
	GREEN(5),
	BLACK(10),
	GOLD(25);
	
	private int value;
	
	ChipColorValue(int value){
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
