package be.my_portfolio.casino;

import java.util.Arrays;

public class Table {
	
	private final static int MAX_PLAYERS_ON_TABLE = 5;
	
	private Card[][] playerCards;
	private CasinoPlayer[] players;
	private CardDealer dealer = new CardDealer();
	private Card[] dealerCards;

	public Table(CasinoPlayer... players) {
		this.setPlayers(players);
	}

	/**
	 * @return the playerCards
	 */
	public Card[][] getPlayerCards() {
		return playerCards;
	}

	/**
	 * @param playerCards the playerCards to set
	 */
	public void setPlayerCards(Card[][] playerCards) {
		this.playerCards = playerCards;
	}

	/**
	 * @return the players
	 */
	public CasinoPlayer[] getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(CasinoPlayer[] players) {
		this.players = players;
	}

	/**
	 * @return the dealer
	 */
	public CardDealer getDealer() {
		return dealer;
	}

	/**
	 * @param dealer the dealer to set
	 */
	public void setDealer(CardDealer dealer) {
		this.dealer = dealer;
	}

	/**
	 * @return the dealerCards
	 */
	public Card[] getDealerCards() {
		return dealerCards;
	}

	/**
	 * @param dealerCards the dealerCards to set
	 */
	public void setDealerCards(Card... dealerCards) {
		this.dealerCards = dealerCards;
	}

	public void addPlayer(CasinoPlayer player) {
		if (this.players.length < MAX_PLAYERS_ON_TABLE) {
			int position = this.players.length;
			this.players = Arrays.copyOf(this.players, this.players.length + 1);
			this.players[position] = player;
		} else {
			System.out.println("Couldn't add " + player.getName() + ". Table is full!");
		}
	}

	public void startGame() {
		this.setDealerCards(this.dealer.dealCard(2));
		this.playerCards = new Card[this.players.length][2];
		int i = 0;
		for (CasinoPlayer player: this.players) {
			this.playerCards[i] = this.dealer.dealCard(2);
			System.out.println(player.getName() + "'s cards: " + Arrays.toString(this.playerCards[i]));
			i++;
		}
	}
}
