package javabootcamp.oop.vendingmechineexercise.classes;

import java.util.Random;

import javabootcamp.oop.vendingmechineexercise.runner.Runner.VendingMachine;

public class Chocolate extends HotDrink {

	protected final static int VOLUME = 65;
	protected final static int TEMPERTURE = 83;
	protected final static int PRICE = 15;
	protected final static int NUM_OF_SPOONS = 1;

	protected boolean basedOfMilkOrWater; // true - milk, false - water

	public Chocolate() {
		super(VOLUME, TEMPERTURE, PRICE, NUM_OF_SPOONS);
		setBasedOfMilkOrWater();
	}

	private void setBasedOfMilkOrWater() {
		Random randBase = new Random();
		int base = randBase.nextInt(2);

		this.basedOfMilkOrWater = (base == 1) ? true : false;
	}

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

	@Override
	public String toString() {
		return "Chocolate [basedOfMilkOrWater=" + basedOfMilkOrWater + ", spoonsOfSuger=" + spoonsOfSuger + ", volume="
				+ volume + ", temperature=" + temperature + ", price=" + price + "]";
	}
}
