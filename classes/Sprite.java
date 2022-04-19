package javabootcamp.oop.vendingmechineexercise.classes;

/**
 * 
 * @author Dana Grosman
 *
 * This class describes Sprite drink
 */
public class Sprite extends SodaDrink {
	protected final static int VOLUME = 100;
	protected final static int TEMPERATURE = 2;
	protected final static int PRICE = 13;
	
	/**
	 * Initializes a newly created sprite object
	 */
	public Sprite() {
		super(VOLUME, TEMPERATURE, PRICE);
	}

	/**
	 * This method produce an sprite when the client chose that drink
	 */
	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println(this);
		System.out.println("Loading Sprite.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
	}

	/**
	 * This method returned the object as a string.
	 */
	@Override
	public String toString() {
		return "Sprite [canOrBottle=" + canOrBottle + ", volume=" + volume + ", temperature=" + temperature + ", price="
				+ price + ", getVolume()=" + getVolume() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
