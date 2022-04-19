package javabootcamp.oop.vendingmechineexercise.classes;

/**
 * 
 * @author Dana Grosman
 * 
 * This abstract class describes a coffee drink
 * Coffee can be espresso, cappuccino or latte
 * 
 */
public abstract class Coffee extends HotDrink {

	public final static int SHOT = 50;

	/**
	 * Initializes a newly created coffee object
	 * 
	 * @param volume - between 50cc to 200cc
	 * @param temperture - preferred drink temperature, coffee temperature can be 60 to 90 degrees
	 * @param price - drink price
	 * @param spoonsOfSuger - coffee can be served with 0 to 5 spoons of sugar
	 */
	public Coffee(int volume, int temperature, float price, int spoonsOfSuger) {
		super(volume, temperature, price, spoonsOfSuger);
	}
}
