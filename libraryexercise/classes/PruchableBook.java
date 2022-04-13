package javabootcamp.oop.libraryexercise.classes;

import java.util.Random;

import javabootcamp.oop.libraryexercise.interfaces.Pruchable;

public class PruchableBook extends BorrowableBook implements Pruchable {
	protected int price;

	public PruchableBook(String name, Author author, int quantity, Genre genre, int borrowingPeriod, int price) {
		super(name, author, quantity, genre, borrowingPeriod);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean isPruchable() {
		return isPruchable;
	}

	@Override
	public void approach() {
		Random rand = new Random();
		int choice = rand.nextInt();

		if (choice % 2 == 0) { // Purchase
			if (getQuantity() > 0) { 
				setQuantity(getQuantity() - 1);
			}
			System.out.println("-------------------");
			System.out.println("There is " + getQuantity() + " available book for purchase.");
			System.out.println("-------------------");
		} else
			super.approach();
	}

	@Override
	public String toString() {
		return String.format("%s\nPrice: %d", super.toString(), price);
	}
}
