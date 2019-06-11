package be.my_portfolio.casino;

public class Chip {
	private ChipColorValue color;
	
	Chip(ChipColorValue color){
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public ChipColorValue getColor() {
		return color;
	}
}
