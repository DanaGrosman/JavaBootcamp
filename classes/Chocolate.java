package javabootcamp.oop.vendingmechineexercise.classes;

import java.util.Random;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

/**
 * 
 * @author Dana Grosman This class describes a hot chocolate drink
 */
public class Chocolate extends HotDrink {

	protected final static int VOLUME = 65;
	protected final static int TEMPERTURE = 83;
	protected final static int PRICE = 15;
	protected final static int NUM_OF_SPOONS = 1;
	protected boolean basedOfMilkOrWater; // true - milk, false - water

	/**
	 * Initializes a newly created hot chocolate object
	 */
	public Chocolate() {
		super(VOLUME, TEMPERTURE, PRICE, NUM_OF_SPOONS);
		setBasedOfMilkOrWater();
	}

	/**
	 * This method chose if the drink based of milk or water
	 */
	private void setBasedOfMilkOrWater() {
		Random randBase = new Random();
		int base = randBase.nextInt(2);

		this.basedOfMilkOrWater = (base == 1) ? true : false;
	}

	/**
	 * This method produce a hot chocolate when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading hot chocolate.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");

		if (basedOfMilkOrWater)
			VendingMachine.milkQtt -= VOLUME;
		else
			VendingMachine.waterQtt -= VOLUME;
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Chocolate [basedOfMilkOrWater=" + basedOfMilkOrWater + ", spoonsOfSuger=" + spoonsOfSuger + ", volume="
				+ volume + ", temperature=" + temperature + ", price=" + price + ", getVolume()=" + getVolume()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
