package javabootcamp.oop.vendingmechineexercise.classes;

import java.util.Random;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

/**
 * 
 * @author Dana Grosman 
 * This class describes a Espresso drink
 *
 */
public class Espresso extends Coffee {
	protected final static int VOLUME = 50;
	protected final static int TEMPERTURE = 90;
	protected final static int PRICE = 11;
	protected final static int NUM_OF_SPOONS = 0;

	protected int numOfShots;

	/**
	 * Initializes a newly created espresso object
	 */
	public Espresso() {
		super(VOLUME, TEMPERTURE, PRICE, NUM_OF_SPOONS);
		setNumOfShots();
	}

	/**
	 * This method random number of espresso shots between 1 to 3
	 */
	protected void setNumOfShots() {
		Random randNumOfShots = new Random();
		this.numOfShots = randNumOfShots.nextInt(3) + 1;
	}

	/**
	 * This method produce a espersso when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading hot espresso.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");

		VendingMachine.waterQtt -= (numOfShots * SHOT);
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Espresso [numOfShots=" + numOfShots + ", spoonsOfSuger=" + spoonsOfSuger + ", volume=" + volume
				+ ", temperature=" + temperature + ", price=" + price + "]";
	}

}
