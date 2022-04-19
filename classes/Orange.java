package javabootcamp.oop.vendingmechineexercise.classes;

/**
 * 
 * @author Dana Grosman
 *
 * This class describes an Orange juice
 */
public class Orange extends SoftDrink {
	protected final static int VOLUME = 80;
	protected final static int TEMPERTURE = 2;
	protected final static int PRICE = 12;
	
	/**
	 * Initializes a newly created orange juice object
	 */
	public Orange() {
		super(VOLUME, TEMPERTURE, PRICE);
	}

	/**
	 * This method produce a orange juice when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading Orange juice.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Orange [machineOrPasteurized=" + machineOrPasteurized + ", volume=" + volume + ", temperature="
				+ temperature + ", price=" + price + ", getVolume()=" + getVolume() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
