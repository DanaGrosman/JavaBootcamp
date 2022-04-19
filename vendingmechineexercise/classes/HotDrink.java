package javabootcamp.oop.vendingmechineexercise.classes;

/**
 * 
 * @author Dana Grosman This class is abstract and describes a cold drink Hot
 *         drink can be hot chocolate, hot capuccino, espresso or latte
 * 
 */
public abstract class HotDrink extends Drink {

	protected int spoonsOfSuger;

	/**
	 * Initializes a newly created hot drink object
	 * 
	 * @param volume        - between 50cc to 200cc
	 * @param temperature   - preferred drink temperature, HotDrink temperature can
	 *                      be 60 to 90 degrees
	 * @param price         - drink price
	 * @param spoonsOfSuger - number of spoons of sugar
	 */
	public HotDrink(int volume, int temperature, float price, int spoonsOfSuger) {
		super(volume, temperature, price);
		setSpoonsOfSuger(spoonsOfSuger);
	}

	/**
	 * This method random spoons of sugar
	 * 
	 * @param spoonsOfSuger - between 0 to 5 spoons of sugar
	 */
	private void setSpoonsOfSuger(int spoonsOfSuger) {
		if (spoonsOfSuger >= 0 && spoonsOfSuger <= 5)
			this.spoonsOfSuger = spoonsOfSuger;
		else
			this.spoonsOfSuger = 0;
	}
}
