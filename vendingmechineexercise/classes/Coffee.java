package javabootcamp.oop.vendingmechineexercise.classes;

public abstract class Coffee extends HotDrink {

	public final static int SHOT = 50;

	public Coffee(int volume, int tempertire, float price, int spoonsOfSuger) {
		super(volume, tempertire, price, spoonsOfSuger);
	}

	protected void setOfVolume(int numOfShots) {
		this.volume = numOfShots * SHOT;
	}
}
