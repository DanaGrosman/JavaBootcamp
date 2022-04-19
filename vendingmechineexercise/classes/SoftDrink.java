package javabootcamp.oop.vendingmechineexercise.classes;

import java.util.Random;

/**
 * 
 * @author Dana Grosman
 *
 *         This abstract class describes a soft drink Soft drink can be apple or
 *         orange juice
 */
public abstract class SoftDrink extends ColdDrink {
	protected boolean machineOrPasteurized; // true - machine , false - pasteurized

	/**
	 * Initializes a newly created soft drink object
	 * 
	 * @param volume     - between 50cc to 200cc
	 * @param temperture - preferred drink temperature, Soft Drink is cold drink,
	 *                   temperature of cold drink can be 2 to 5 degrees
	 * @param price      - drink price
	 */
	public SoftDrink(int volume, int temperture, float price) {
		super(volume, temperture, price);
		setMachineOrPasteurized();
	}

	/**
	 * This method chose if the drink squeezed by the machine or pasteurized
	 */
	public void setMachineOrPasteurized() {
		Random rand = new Random();
		int machineOrPasteurized = rand.nextInt(2);
		if (machineOrPasteurized == 1)
			this.machineOrPasteurized = true;
		else
			this.machineOrPasteurized = false;
	}
}
