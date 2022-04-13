package javabootcamp.oop.libraryexercise.classes;

import javabootcamp.oop.libraryexercise.interfaces.Readable;

public abstract class Book implements Readable {
	protected String title;
	protected Author author;
	protected int quantity;
	protected Genre genre;
	protected boolean isReadable;
	protected boolean isBorrowable;
	protected boolean isPruchable;

	public Book(String title, Author author, int quantity, Genre genre) {
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.genre = genre;
		this.isReadable = true;
		this.isBorrowable = false;
		this.isPruchable = false;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public abstract void approach();

	@Override
	public String toString() {
		return String.format(
				"Title: %s, %sGender: %s, Quantity: %d, isReadable: %b, isBorrowable: %b, isPruchable: %b", title,
				author.toString(), genre.name(), quantity, isReadable, isBorrowable, isPruchable);
	}

	public static enum Genre {
		COOK(1), NOVAL(2), DICTIONARY(3);

		int code;

		Genre(int code) {
			this.code = code;
		}
	}
}
