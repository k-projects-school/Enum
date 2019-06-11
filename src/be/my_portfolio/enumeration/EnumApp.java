package be.my_portfolio.enumeration;

public class EnumApp {

	public static void main(String[] args) {
		System.out.println("All the days static:");
		// Create the day variables and print them
		Day monday = Day.MONDAY;
		System.out.println(monday);
		Day thuesday = Day.THUESDAY;
		System.out.println(thuesday);
		Day wednesday = Day.WEDNESDAY;
		System.out.println(wednesday);
		Day thursday = Day.THURSDAY;
		System.out.println(thursday);
		Day friday = Day.FRIDAY;
		System.out.println(friday);
		Day saturday = Day.SATURDAY;
		System.out.println(saturday);
		Day sunday = Day.SUNDAY;
		System.out.println(sunday);
		
		printLine();
		
		System.out.println("All the days in for loop:");
		// Print all the days in the Day enum.
		for(Day day: Day.values()) {
			System.out.println(day);
		}
		
		printLine();
		
		// Create a Coin array
		Coin[] coins = new Coin[6];
		// Add coins to the array
		coins[0] = Coin.FIFTY_CENT;
		coins[1] = Coin.FIVE_CENT;
		coins[2] = Coin.ONE_EURO;
		coins[3] = Coin.TWENTY_CENT;
		coins[4] = Coin.TEN_CENT;
		coins[5] = Coin.TWO_EURO;
		// Print the total value of the array
		System.out.println("De totale value van de array is: " + getTotalValue(coins) + " cent.");
		
		printLine();
		
		System.out.println("All the planets static:");
		// Create the planet variables and print them.
		Planet mercury = Planet.MERCURY;
		System.out.println(mercury);
		Planet venus = Planet.VENUS;
		System.out.println(venus);
		Planet earth = Planet.EARTH;
		System.out.println(earth);
		Planet moon = Planet.MOON;
		System.out.println(moon);
		Planet mars = Planet.MARS;
		System.out.println(mars);
		Planet jupiter = Planet.JUPITER;
		System.out.println(jupiter);
		Planet saturn = Planet.SATURN;
		System.out.println(saturn);
		Planet uranus = Planet.URANUS;
		System.out.println(uranus);
		Planet neptune = Planet.NEPTUNE;
		System.out.println(neptune);
		Planet pluto = Planet.PLUTO;
		System.out.println(pluto);
		
		printLine();
		
		System.out.println("All the planets in for loop:");
		for (Planet planet: Planet.values()) {
			System.out.println(planet);
		}
		
		printLine();
	}
	
	/**
	 * Get the total value of a Coin array.
	 * 
	 * @param coins
	 * @return the total value
	 */
	private static int getTotalValue(Coin[] coins) {
		// Variable to store the total value
		int total = 0;
		// Loop through the Coin array
		for (Coin coin: coins) {
			// Add the value of the current element to the total.
			total += coin.getValue();
		}
		
		// Return the total value
		return total;
	}

	/**
	 * Print a line.
	 */
	public static void printLine() {
		System.out.println("------------------------");
	}

}
