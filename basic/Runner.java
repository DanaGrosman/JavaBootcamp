package javabootcamp.oop.basic;

public class Runner {

	public static void main(String[] args) {
		Clock clock = new Clock(100);
		Clock clock2 = new Clock();
		Clock clock3 = new Clock(2, 20);
		clock.printTime();
		System.out.println();
		clock2.printTime();
		System.out.println();
		clock3.printTime();
		System.out.println();
	}

}