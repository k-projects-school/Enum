package be.my_portfolio.casino;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Casino!");
		CasinoPlayer johan = new CasinoPlayer("Johan", 1000000);
		CasinoPlayer sarren = new CasinoPlayer("Sarren", 1000000);
		CasinoPlayer tai = new CasinoPlayer("Tai", 1000000);
		//CasinoPlayer pieter = new CasinoPlayer("Pieter", 1000000);
		//CasinoPlayer glen = new CasinoPlayer("Glen", 1000000);
		//System.out.println(glen);
		Table table = new Table(johan, sarren, tai);
//		table.addPlayer(pieter);
//		table.addPlayer(glen);
		
		table.startGame();
		
	}
}
