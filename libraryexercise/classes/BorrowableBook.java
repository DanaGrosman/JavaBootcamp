package javabootcamp.oop.libraryexercise.classes;

import java.util.Random;

import javabootcamp.oop.libraryexercise.interfaces.Borrowable;

public class BorrowableBook extends ReadableBook implements Borrowable {
	protected int borrowingPeriod;

	public BorrowableBook(String name, Author author, int quantity, Genre genre, int borrowingPeriod) {
		super(name, author, quantity, genre);
		this.isBorrowable = true;
		this.borrowingPeriod = borrowingPeriod;
	}

	public int getBorrowingPeriod() {
		return borrowingPeriod;
	}

	@Override
	public boolean isBorrowable() {
		return isBorrowable;
	}

	@Override
	public void approach() {
		Random rand = new Random();
		int choice = rand.nextInt();

		if (choice % 2 == 0) { // Return or borrow
			int borrow = rand.nextInt();
			if (borrow % 2 == 0) { // Return the book
				setQuantity(getQuantity() + 1);
			} else { // Borrow the book
				if (getQuantity() > 0)
					setQuantity(getQuantity() - 1);
			}
			System.out.println("-------------------");
			System.out.println("There is " + getQuantity() + " available book for borrow.");
			System.out.println("-------------------");
		} else
			super.approach();
	}

	@Override
	public String toString() {
		return String.format("%s\nBorrowing Period: %d", super.toString(), borrowingPeriod);
	}
}
