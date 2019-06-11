package be.my_portfolio.enumeration;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public enum Planet {
	// The planets in our solar system
	MERCURY(0.330, 57.9),
	VENUS(4.87, 108.2),
	EARTH(5.97, 149.6),
	MOON(0.073, 0.384){
		@Override
		public void setDistanceFromSun(double distanceFromSun) {
			double earthDistance = EARTH.getDistanceFromSun();
			double distance = distanceFromSun * Math.pow(10, 6);
			this.distanceFromSun = earthDistance - distance;
		}
		
		@Override
		public String toString() {
			return "The " + name().toLowerCase() + " is " + f.format(getDistanceFromSun()) + "km from the Sun (if it's directly placed between the earth and the sun) and weighs " + f.format(getMass()) + "kg";
		}
	},
	MARS(0.642, 227.9),
	JUPITER(1898, 778.6),
	SATURN(568, 1433.5),
	URANUS(86.8, 2872.5),
	NEPTUNE(102, 4495.1),
	PLUTO(0.0146, 5906.4);
	// End planets
	
	// Properties
	public double mass, distanceFromSun;
	private static NumberFormat f = new DecimalFormat("#0.00");
	
	/**
	 * Constructor.
	 * 
	 * The parameters must be added as referred by <a>https://nssdc.gsfc.nasa.gov/planetary/factsheet/</a>
	 * 
	 * @param mass - The mass of the planet.
	 * @param distanceFromSun - The distance from the sun (in case of the moon, the distance from earth)
	 */
	Planet(double mass, double distanceFromSun){
		setMass(mass);
		setDistanceFromSun(distanceFromSun);
	}

	/**
	 * @return the mass
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * @param mass the mass to set
	 */
	public void setMass(double mass) {
		this.mass = mass * Math.pow(10, 24);
	}

	/**
	 * @return the distanceFromSun
	 */
	public double getDistanceFromSun() {
		return distanceFromSun;
	}

	/**
	 * @param distanceFromSun the distanceFromSun to set
	 */
	public void setDistanceFromSun(double distanceFromSun) {
		this.distanceFromSun = distanceFromSun * Math.pow(10, 6);
	}
	
	@Override
	public String toString() {
		return "The " + name().toLowerCase() + " is " + f.format(getDistanceFromSun()) + "km from the Sun and weighs " + f.format(getMass()) + "kg";
	}
}
