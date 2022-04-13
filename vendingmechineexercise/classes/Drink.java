package javabootcamp.oop.vendingmechineexercise.classes;

import javabootcamp.oop.vendingmechineexercise.interfaces.Produceable;

public abstract class Drink implements Produceable {
	protected int volume;
	protected int temperature;
	protected float price;

	public Drink(int volume, int temperature, float price) {
		super();
		this.volume = volume;
		this.temperature = temperature;
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= 50 && volume <= 200)
			this.volume = volume;
		else
			this.volume = 50;
	}

	abstract void setTemperature(int temperature);
}
