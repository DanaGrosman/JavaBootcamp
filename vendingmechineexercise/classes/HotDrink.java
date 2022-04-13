package javabootcamp.oop.vendingmechineexercise.classes;

public abstract class HotDrink extends Drink {

	protected int spoonsOfSuger;

	public HotDrink(int volume, int tempertire, float price, int spoonsOfSuger) {
		super(volume, tempertire, price);
		setSpoonsOfSuger(spoonsOfSuger);
	}

	private void setSpoonsOfSuger(int spoonsOfSuger) {
		if (spoonsOfSuger >= 0 && spoonsOfSuger <= 5)
			this.spoonsOfSuger = spoonsOfSuger;
		else
			this.spoonsOfSuger = 0;
	}

	@Override
	void setTemperature(int temperature) {
		if (temperature >= 60 && temperature <= 90)
			this.temperature = temperature;
		else
			this.temperature = 60;
	}
}
