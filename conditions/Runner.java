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
//					nameOfMonth = "November";
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

		// Chapter 3 Q3:
//		final int MIN_TRAVEL_TIME = 50, MIN_INNTRODUCTORT_TIME = 3;
//		int familyMember = -1, closeFriends = -1, travelTime = 0, checkAmount = 0, introducTime = 0;
//		boolean checkInfo = false;
//
//		while (!checkInfo) {
//			while (familyMember != 0 && familyMember != 1) {
//				System.out.println("Family member? type 1 - yes / 0 - no");
//				familyMember = scanner.nextInt();
//			}
//			while (closeFriends != 0 && closeFriends != 1) {
//				System.out.println("Close friends? type 1 - yes / 0 - no");
//				closeFriends = scanner.nextInt();
//			}
//
//			System.out.print("Travel time: ");
//			travelTime = scanner.nextInt();
//
//			System.out.print("Introductory time: ");
//			introducTime = scanner.nextInt();
//
//			checkInfo = true;
//		}
//
//		if (familyMember == 0) { // OTHER 250 || CLOSE FRIENDS 500
//			if (introducTime > MIN_INNTRODUCTORT_TIME)
//				checkAmount += 50;
//			if (travelTime > MIN_TRAVEL_TIME)
//				checkAmount -= 50;
//			if (closeFriends == 1)
//				checkAmount += 500;
//			else
//				checkAmount += 250;
//		} else // Family Member
//			checkAmount = 1000;
//
//		System.out.println("Check amount: " + checkAmount);

		// Chapter 3 Q7:
		final int MIN_TEST_GRADE = 54, MIN_AVERAGE_HOMEWORK = 80;
		int testGrade = 0, averageHomework = 0, exercisesNum = 0;
		float finalGrade = 0;
		float percentOfExerxises = 0.0f;
		
		System.out.println("Test grade: (0-100)");
		testGrade = scanner.nextInt();
		System.out.println("Average homework grades: (0-100)");
		averageHomework = scanner.nextInt();
		System.out.println("Exercises num: (0-8)");
		exercisesNum = scanner.nextInt();
		
		switch (exercisesNum) {
		case 5:
		case 6:
			if (testGrade > MIN_TEST_GRADE)
				percentOfExerxises = 0.2f;
			break;
		case 7:
		case 8:
			if (testGrade > averageHomework)
				break;
			if (testGrade <= MIN_TEST_GRADE)
				if (averageHomework >= MIN_AVERAGE_HOMEWORK)
					percentOfExerxises = 0.25f;
				else
					percentOfExerxises = 0.2f;
			else
				percentOfExerxises = 0.3f;
		}

		if (exercisesNum > 4)
			finalGrade = (float) ((averageHomework * percentOfExerxises) 
					+ (testGrade * (1 - percentOfExerxises)));

		System.out.println("Final grade: " + finalGrade);

		scanner.close();
	}

}
