package javabootcamp.oop.libraryexercise.classes;

public class ReadableBook extends Book {
	public ReadableBook(String name, Author author, int quantity, Genre genre) {
		super(name, author, quantity, genre);
	}

	@Override
	public void approach() {
		if (getQuantity() > 0) {
			setQuantity(getQuantity() - 1);
		}

		System.out.println("-------------------");
		System.out.println("There is " + getQuantity() + " available book for reading.");
		System.out.println("-------------------");
	}

	@Override
	public boolean isReadable() {
		return isReadable;
	}
}
