package be.my_portfolio.casino;

public class CardDealer {
	Deck deck = new Deck();
	
	public void shuffleDeck() {
		this.deck.shuffle();
	}
	
	public void shuffleDeck(int times) {
		for (int i = 0; i < times; i++) {
			this.shuffleDeck();
		}
	}
	
	public Card[] dealCard(int amount) {
		Card[] cards = new Card[amount];
		for (int i = 0; i < amount; i++) {
			cards[i] = this.deck.getCard(i);
		}
		
		return cards;
	}
}
