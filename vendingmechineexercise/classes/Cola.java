package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

/**
 * 
 * @author Dana Grosman
 * This class describes a Cola
 * 
 */
public class Cola extends SodaDrink {
	protected final static int VOLUME = 90;
	protected final static int TEMPERATURE = 2;
	protected final static int PRICE = 13;
	
	/**
	 * Initializes a newly created Cola object
	 */
	public Cola() {
		super(VOLUME, TEMPERATURE, PRICE);
	}

	/**
	 * This method produce a cola when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading Cola.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
		
		VendingMachine.waterQtt -= VOLUME;
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Cola [canOrBottle=" + canOrBottle + ", volume=" + volume + ", temperature=" + temperature + ", price="
				+ price + ", getVolume()=" + getVolume() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
