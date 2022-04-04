package javabootcamp.basic.conditions;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Check if the integer is Divisible by 1,2,3 and 4
//		int input;
//		System.out.println("Please enter a num: ");
//		input = scanner.nextInt();

		// Naive solution
//		if (input % 3 == 0 && input % 4 == 0)
//			System.out.println(input + " is divisible by 1, 2, 3 and 4");

		// Good solution
//		final int DIVISOR = 12;
//		String result = "";

//		if (input % DIVISOR != 0) {
//			result = "NOT ";
//		}

//		result = (input % DIVISOR == 0) ? "" : "NOT ";
//		System.out.println(input + " is " + result + "divisible by 2, 3 and 4");
//		System.out.println("Goodbye");

//		int numToCheck, startRange, endRange;
//		String res;
//
//		System.out.println("Enter first number: ");
//		numToCheck = scanner.nextInt();
//		System.out.println("Enter second number: ");
//		startRange = scanner.nextInt();
//		System.out.println("Enter third number: ");
//		endRange = scanner.nextInt();
//
//		// Swap if range is opposite
//		if (startRange > endRange) {
//			int tmp = endRange;
//			endRange = startRange;
//			startRange = tmp;
//		}
//
//		if (numToCheck < startRange)
//			res = "smaller than ";
//		else if (numToCheck > startRange && numToCheck < endRange)
//			res = "in ";
//		else
//			res = "greater than ";
//
//		System.out.println(numToCheck + " is " + res + "the range " + startRange + " to " + endRange);

		// Show the number of days in month
//		final int MIN_MONTH = 1, MAX_MONTH = 12, MIN_YEAR = 0, LEAP_YEAR = 4;
//		int month, year, res = 0;
//		boolean isLeapYear;
//		String nameOfMonth = "";
//
//		System.out.println("Year: ");
//		year = scanner.nextInt();
//		System.out.println("Month: ");
//		month = scanner.nextInt();
//
//		if (year > MIN_YEAR) {
//			isLeapYear = (year % LEAP_YEAR == 0) ? true : false;
//			if (month >= MIN_MONTH && month <= MAX_MONTH) {
//				switch (month) {
//				case 1:
//				case 3:
//				case 5:
//				case 7:
//				case 8:
//				case 11:
//				case 12:
//					res = 31;
//					break;
//
//				case 2:
//					res = (isLeapYear) ? 29 : 28;
//					break;
//
//				default:
//					res = 30;
//					break;
//				}
//
//				switch (month) {
//				case 1:
//					nameOfMonth = "January";
//					break;
//				case 2:
//					nameOfMonth = "February";
//					break;
//				case 3:
//					nameOfMonth = "March";
//					break;
//				case 4:
//					nameOfMonth = "April";
//					break;
//				case 5:
//					nameOfMonth = "May";
//					break;
//				case 6:
//					nameOfMonth = "June";
//					break;
//				case 7:
//					nameOfMonth = "July";
//					break;
//				case 8:
//					nameOfMonth = "August";
//					break;
//				case 9:
//					nameOfMonth = "September";
//					break;
//				case 10:
//					nameOfMonth = "October";
//					break;
//				case 11:
//					nameOfMonth = "Novenber";
//					break;
//				case 12:
//					nameOfMonth = "December";
//					break;
//				}
//
//				System.out.println(nameOfMonth + " " + year + " has " + res + " days");
//
//			} else
//				System.out.println("Invalid month value");
//		} else
//			System.out.println("Invalid year value");

		scanner.close();
	}

}
