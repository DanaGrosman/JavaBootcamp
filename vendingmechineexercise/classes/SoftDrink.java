package javabootcamp.oop.vendingmechineexercise.classes;

public abstract class SoftDrink extends ColdDrink {

	protected boolean machineOrPasteurized; // true - machine , false - pasteurized

	public SoftDrink(int volume, int tempertire, float price, boolean machineOrPasteurized) {
		super(volume, tempertire, price);
		setMachineOrPasteurized(machineOrPasteurized);
	}

	public void setMachineOrPasteurized(boolean machineOrPasteurized) {
		this.machineOrPasteurized = machineOrPasteurized;
	}

}
