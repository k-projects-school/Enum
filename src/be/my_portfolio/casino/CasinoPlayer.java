package be.my_portfolio.casino;

import java.util.Arrays;

public class CasinoPlayer {
	private double money;
	private Chip[] chips = new Chip[0];
	private String name;

	CasinoPlayer(String name, double money) {
		this.setName(name);
		this.setMoney(money);
		//this.calculateChips();
	}

	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * @return the chips
	 */
	public Chip[] getChips() {
		return chips;
	}

	/**
	 * @param chips the chips to set
	 */
	public void setChips(Chip[] chips) {
		this.chips = chips;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	private void calculateChips() {
		double cash = this.money;
		while (cash > 0) {
			for (ChipColorValue chipColorValue : ChipColorValue.values()) {
				Chip chip = new Chip(chipColorValue);
				if ((cash - chip.getColor().getValue()) >= 0) {
					this.addChip(chip);
					cash -= chip.getColor().getValue();
				}
			}
		}

	}

	private void addChip(Chip chip) {
		int length = this.chips.length;
		this.chips = Arrays.copyOf(this.chips, length + 1);
		this.chips[length] = chip;
	}
}
