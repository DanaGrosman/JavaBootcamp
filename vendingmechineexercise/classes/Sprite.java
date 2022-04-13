package javabootcamp.oop.vendingmechineexercise.classes;

public class Sprite extends SodaDrink {

	public Sprite(int volume, int tempertire, float price, boolean canOrBotte) {
		super(volume, tempertire, price, canOrBotte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println("Loading Sprite.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
	}

}
