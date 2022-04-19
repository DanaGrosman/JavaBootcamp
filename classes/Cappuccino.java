package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

/**
 * This class describes an Cappuccino drink
 * @author Dana Grosman
 *
 */
public class Cappuccino extends Coffee {

	protected final static int VOLUME = 110;
	protected final static int TEMPERTURE = 90;
	protected final static int PRICE = 16;
	protected final static int NUM_OF_SPOONS = 1;
	protected final static int NUM_OF_SHOTS = 2;

	/**
	 * Initializes a newly created Cappuccino object
	 */
	public Cappuccino() {
		super(VOLUME, TEMPERTURE, PRICE, NUM_OF_SPOONS);
	}

	/**
	 * This method produce a Cappuccino when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading hot cappuccino.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
		
		VendingMachine.waterQtt -= (NUM_OF_SHOTS * SHOT);
		VendingMachine.milkQtt -= (VOLUME - (NUM_OF_SHOTS * SHOT));
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Cappuccino [numOfShots=" + NUM_OF_SHOTS + ", spoonsOfSuger=" + spoonsOfSuger + ", volume=" + volume
				+ ", temperature=" + temperature + ", price=" + price + "]";
	}
}
