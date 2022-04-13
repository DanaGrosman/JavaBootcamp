package javabootcamp.oop.libraryexercise.runner;

import javabootcamp.oop.libraryexercise.classes.Author;
import javabootcamp.oop.libraryexercise.classes.Book;
import javabootcamp.oop.libraryexercise.classes.Book.Genre;
import javabootcamp.oop.libraryexercise.classes.BorrowableBook;
import javabootcamp.oop.libraryexercise.classes.PruchableBook;
import javabootcamp.oop.libraryexercise.classes.ReadableBook;

public class Runner {

	public static void main(String[] args) {
		Author author = new Author("j.k. rolling", 'F');
		Book book = new ReadableBook("Harry Potter", author, 3, Genre.NOVAL);
		System.out.println(book);
		book.approach();
		
		Author author2 = new Author("George R. R. Martin", ' ');
		Book book2 = new BorrowableBook("Game of Thrones", author2, 1, Genre.NOVAL, 12);
		System.out.println(book2);
		book2.approach();
		book2.approach();
		
		Author author3 = new Author("Grandma", 'F');
		Book book3 = new PruchableBook("Moroccan food", author3, 3, Genre.COOK, 5, 70);
		System.out.println(book3);
		book3.approach();
		book3.approach();
		book3.approach();
	}
}
