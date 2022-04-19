package javabootcamp.oop.vendingmechineexercise.classes;

/**
 * 
 * @author Dana Grosman This class is abstract and describes a cold drink Cold
 *         drink can be apple juice, orange juice, cola or sprite
 */
public abstract class ColdDrink extends Drink {

	/**
	 * Initializes a newly created ColdDrink object
	 * 
	 * @param volume      - between 50cc to 200cc
	 * @param tempertaure - preferred drink temperature, ColdDrink temperature can
	 *                    be 2 to 5 degrees
	 * @param price       - drink price
	 */
	public ColdDrink(int volume, int tempertaure, float price) {
		super(volume, tempertaure, price);
	}
}
