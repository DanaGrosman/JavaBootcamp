package javabootcamp.basic.user_input;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Chapter 1 Q1: Calculate the circumference from give radius
//		System.out.println("Please enter a radius: ");
//		float radius = scanner.nextFloat();
//		float pi = 3.14f;
//		float circ = 2 * pi * radius;
//		System.out.printf("The Circumference is: %.2f", circ);

		// Chapter 1 Q2: Order toast
//		final int TOAST_PRICE = 12;
//		final int CHEAP_ADD_PRICE = 2;
//		final int EXPENSIVE_ADD_PRICE = 3;
//		int numOfCheapAdds, numOfExpensiceAdds;
//
//		System.out.println("How many cheap adds would you like?");
//		numOfCheapAdds = scanner.nextInt();
//		System.out.println("How many expensive adds would you like?");
//		numOfExpensiceAdds = scanner.nextInt();
//		
//		System.out.println("The toast price is: " + (TOAST_PRICE 
//				+ (numOfCheapAdds*CHEAP_ADD_PRICE) 
//				+ (numOfExpensiceAdds*EXPENSIVE_ADD_PRICE)));

		// Chapter 1 Q3: Calculating the cost of transporting furniture
//		final int MILE_PRICE = 5;
//		final int FLOOR_PRICE = 1;
//		final float TIP_PERCENT = 0.1f;
//		int furniturePrice, furnitureWeight, floor, mile, transportPrice;
//
//		System.out.println("Enter the price of the furniture: ");
//		furniturePrice = scanner.nextInt();
//		System.out.println("Enter the weight of the furniture: ");
//		furnitureWeight = scanner.nextInt();
//		System.out.println("Enter the floor: ");
//		floor = scanner.nextInt();
//		System.out.println("Enter the mile from the store: ");
//		mile = scanner.nextInt();
//
//		transportPrice = (int) (furniturePrice + (mile * MILE_PRICE) 
//				+ (furnitureWeight * FLOOR_PRICE * floor) + (furniturePrice * TIP_PERCENT));
//
//		System.out.println("The cost of transporting is: " + transportPrice);

		scanner.close();
	}

}
