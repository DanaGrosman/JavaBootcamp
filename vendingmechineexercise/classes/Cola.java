package javabootcamp.oop.vendingmechineexercise.classes;

public class Cola extends SodaDrink {

	public Cola(int volume, int tempertire, float price, boolean canOrBotte) {
		super(volume, tempertire, price, canOrBotte);
	}

	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println("Loading Cola.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
	}

}
