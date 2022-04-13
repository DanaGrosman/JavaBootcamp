package javabootcamp.oop.vendingmechineexercise.classes;

public abstract class SodaDrink extends ColdDrink {

	protected boolean canOrBotte; // true - can, false - bottle
	
	public SodaDrink(int volume, int tempertire, float price, boolean canOrBotte) {
		super(volume, tempertire, price);
		setCanOrBotte(canOrBotte);
	}

	public void setCanOrBotte(boolean canOrBotte) {
		this.canOrBotte = canOrBotte;
	}
}
