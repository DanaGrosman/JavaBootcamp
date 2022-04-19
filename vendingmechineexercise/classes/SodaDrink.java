package javabootcamp.oop.vendingmechineexercise.classes;

import java.util.Random;

/**
 * 
 * @author Dana Grosman
 *
 *         This class describes an Soda Drink Sode drink can be cola or sprite
 */
public abstract class SodaDrink extends ColdDrink {
	protected boolean canOrBottle; // true - can, false - bottle

	/**
	 * Initializes a newly created soda drink object
	 * 
	 * @param volume      - between 50cc to 200cc
	 * @param temperature - preferred drink temperature, ColdDrink temperature can
	 *                    be 2 to 5 degrees
	 * @param price       - drink price
	 */
	public SodaDrink(int volume, int temperature, float price) {
		super(volume, temperature, price);
		setCanOrBottle();
	}

	/**
	 * This method chose if the drink purchased in a can or bottle
	 */
	public void setCanOrBottle() {
		Random rand = new Random();
		int canOrBottle = rand.nextInt(2);
		this.canOrBottle = (canOrBottle == 1) ? true : false;
	}
}
