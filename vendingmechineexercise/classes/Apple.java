package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

/**
 * 
 * @author Dana Grosman
 * 
 * This class describes an Apple juice
 */
public class Apple extends SoftDrink {
	protected final static int VOLUME = 120;
	protected final static int TEMPERTURE = 4;
	protected final static int PRICE = 15;
	
	/**
	 * Initializes a newly created Apple juice object
	 */
	public Apple() {
		super(VOLUME, TEMPERTURE, PRICE);
	}
	
	/**
	 * This method produce an apple juice when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading Apple juice.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
		
		VendingMachine.waterQtt -= VOLUME;
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Apple [machineOrPasteurized=" + machineOrPasteurized + ", volume=" + volume + ", temperature="
				+ temperature + ", price=" + price + ", getVolume()=" + getVolume() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
