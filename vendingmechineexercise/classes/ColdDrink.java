package javabootcamp.oop.vendingmechineexercise.classes;

public abstract class ColdDrink extends Drink{

	public ColdDrink(int volume, int tempertire, float price) {
		super(volume, tempertire, price);
	}

	@Override
	void setTemperature(int temperature) {
		if (temperature >= 2 && temperature <= 5)
			this.temperature = temperature;
		else
			this.temperature = 2;		
	}
}
