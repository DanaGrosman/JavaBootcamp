package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

public class Latte extends Coffee {

	protected final static int VOLUME = 150;
	protected final static int TEMPERTURE = 77;
	protected final static int PRICE = 22;
	protected final static int NUM_OF_SPOONS = 2;
	protected final static int NUM_OF_SHOTS = 1;

	public Latte() {
		super(VOLUME, TEMPERTURE, PRICE, NUM_OF_SPOONS);
	}

	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading hot latte.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");

		VendingMachine.waterQtt -= (NUM_OF_SHOTS * SHOT);
		VendingMachine.milkQtt -= (VOLUME - (NUM_OF_SHOTS * SHOT));
	}

	@Override
	public String toString() {
		return "Latte [numOfShots=" + NUM_OF_SHOTS + ", spoonsOfSuger=" + spoonsOfSuger + ", volume=" + volume
				+ ", temperature=" + temperature + ", price=" + price + "]";
	}
}
