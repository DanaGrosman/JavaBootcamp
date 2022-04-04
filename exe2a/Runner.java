package javabootcamp.basic.exe2a;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Chapter 2A Q1
//		final int MIN_AGE = 18;
//		int age;
//
//		System.out.println("Enter your age: ");
//		age = scanner.nextInt();
//		if (age >= MIN_AGE)
//			System.out.println("Adult");
//		else
//			System.out.println("Under age");

		// Chapter 2A Q3
//		int num;
//		String res;
//		System.out.println("Enter a number: ");
//		num = scanner.nextInt();
//
//		if (num % 10 == num / 10)
//			res = "";
//		else
//			res = " not";
//
//		System.out.println("Digits is" + res + " equals");

		// Chapter 2A Q5
		int num;
		String res;
		System.out.println("Enter a number: ");
		num = scanner.nextInt();

		if ((num / 10) + 1 == num % 10) {
			res = "Consecutive ";
		} else
			res = "Non-consecutive ";

		System.out.println(res + "digits");

		// Chapter 2A Q7
//		final float MIN_PRECENT = 0.15f;
//		int fuelTankSize, amountOfFuel;
//		float minOfFuel;
//		String res= "";
//		
//		System.out.println("Enter your fuel tank size: ");
//		fuelTankSize = scanner.nextInt();
//		
//		System.out.println("Enter amount of fuel: ");
//		amountOfFuel = scanner.nextInt();
//		
//		minOfFuel = fuelTankSize * MIN_PRECENT;
//		if (amountOfFuel > minOfFuel)
//			res = " don't";
//			
//	    System.out.println("You" + res + " need to refill your fuel tank");
//

		// Chapter 2A Q9
//		int yourDate, year, month, day;
//		System.out.println("Please enter your date: ");
//		yourDate = scanner.nextInt();
//		
//		year = yourDate % 10000;
//		yourDate /= 10000;
//		month = yourDate % 100;
//		day = yourDate / 100;
//		
//		System.out.println("The year is " + year 
//				+ ", the month is " + month 
//				+ ", and the day is " + day);

		scanner.close();
	}

}
