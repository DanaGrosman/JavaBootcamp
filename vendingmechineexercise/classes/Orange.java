package javabootcamp.oop.vendingmechineexercise.classes;

public class Orange extends SoftDrink {

	public Orange(int volume, int tempertire, float price, boolean machineOrPasteurized) {
		super(volume, tempertire, price, machineOrPasteurized);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void produce() {
		System.out.println("-----------------");
		System.out.println("Loading Orange juice.......");
		System.out.println("Ready! enjoy!");
		System.out.println("-----------------");
	}

}
