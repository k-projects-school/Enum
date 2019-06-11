package be.my_portfolio.casino;

import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards = new Card[0];
	private static int amountOfSingleDecks = 6;

	Deck() {
		super();
		this.makeDeck();
	}

	private void makeDeck() {
		for (int i = 0; i < amountOfSingleDecks; i++) {
			for (SuitType suit : SuitType.values()) {
				for (Value value : Value.values()) {
					this.addCard(new Card(suit, value));
				}
			}
		}
	}

	private void addCard(Card card) {
		int oldLength = this.cards.length;
		this.cards = Arrays.copyOf(this.cards, oldLength + 1);
		this.cards[oldLength] = card;
	}

	public Card[] getDeck() {
		return this.cards;
	}

	/**
	 * @return the amountOfSingleDecks
	 */
	public static int getAmountOfSingleDecks() {
		return amountOfSingleDecks;
	}

	/**
	 * @param amountOfSingleDecks the amountOfSingleDecks to set
	 */
	public static void setAmountOfSingleDecks(int amountOfSingleDecks) {
		Deck.amountOfSingleDecks = amountOfSingleDecks;
	}

	public void shuffle() {
		Random rgen = new Random();

		for (int i = 0; i < this.cards.length; i++) {
			int randomPosition = rgen.nextInt(this.cards.length);
			Card temp = this.cards[i];
			this.cards[i] = this.cards[randomPosition];
			this.cards[randomPosition] = temp;
		}
	}

	public Card getCard(int position) {
		Card card = this.cards[position];
		this.removeCardFromDeck(card);
		return card;
	}

	private void removeCardFromDeck(Card card) {
		Card[] temp = Arrays.copyOf(this.cards, this.cards.length - 1);
		for (int i = 0; i < this.cards.length; i++) {
			if (this.cards[i] != card) {
				temp[i] = card;
			}
		}
		
		this.cards = temp;
	}
}
