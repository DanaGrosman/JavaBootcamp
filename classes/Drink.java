package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.interfaces.Produceable;

/**
 * 
 * @author Dana Grosman
 *
 * This abstract class describe Drink
 */
public abstract class Drink implements Produceable {
	protected int volume;
	protected int temperature;
	protected float price;

	/**
	 * Initializes a newly created coffee object
	 * 
	 * @param volume - between 50cc to 200cc
	 * @param temperature - preferred drink temperature
	 * @param price - drink price
	 */
	public Drink(int volume, int temperature, float price) {
		this.volume = volume;
		this.temperature = temperature;
		this.price = price;
	}

	/**
	 * 
	 * @return volume (int)
	 */
	public int getVolume() {
		return volume;
	}
}
