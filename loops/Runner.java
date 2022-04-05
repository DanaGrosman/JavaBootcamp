package javabootcamp.basic.loops;

import java.util.Scanner;
import java.util.concurrent.RejectedExecutionHandler;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Check if number id Prime or not
//		int num;
//		String prime = "";
//		System.out.println("Please enter a number: ");
//		num = scanner.nextInt();
//
//		for (int i = 2; i < num; i++)
//			if (num % i == 0) {
//				prime = "not ";
//				break;
//			}
//		System.out.println(num + " is " + prime + "a prime number");

		// Create new number
//		int digit = 0, newNum = 0, power = 10;
//		System.out.println("Please enter a integer: ");
//		digit = scanner.nextInt();
//
//		// DO WHILE SOLUTION
//		do {
//			newNum *= 10;
//			newNum += digit;
//			digit = scanner.nextInt();
//		} while (digit >= 0);
//		
//		// WHILE LOOP SOLUTION
////		while (digit >= 0) {
////			newNum *= 10;
////			newNum += digit;
////			digit = scanner.nextInt();
////		}
//
//		System.out.println("The number is: " + newNum);

		// Create a product of numbers
//		int digit, product = 0, multi = 1;
//		System.out.println("Please enter a integer: ");
//
//		do {
//
//			digit = scanner.nextInt();
//			if (digit > 0) {
//				product = multi * digit;
//				multi = product;
//			}
//
//		} while (digit > 0);
//
//		System.out.println("Product is " + product);

		// Size of parts
//		final int FIXED = 1, REJECT = -1, PERFECT = 0;
//		int numOfParts, fixed = 0, reject = 0, perfect = 0, part;
//		System.out.print("Please enter the numbers of parts: ");
//		numOfParts = scanner.nextInt();
//
//		for (int i = 0; i < numOfParts; i++) {
//			System.out.print("Please enter part: ");
//			part = scanner.nextInt();
//			
//			if(part == FIXED)
//				fixed++;
//			else if (part == REJECT)
//				reject++;
//			else 
//				perfect++;
//		}
//
//		System.out.println("FIXED: " + fixed + ", REJECT: " + reject + ", PERFECT: " + perfect);

		// Chapter 4 Q2
//		int num, tmp, counter = 0, newNum = 0, multi = 1, digit = 0;
//		System.out.println("Enter a number:");
//		num = scanner.nextInt();
//		tmp = num;
//
//		while (num != 0) {
//			if (counter % 2 == 0) {
//				newNum += ((tmp % 10) * multi);
//				multi *= 10;
//			}
//			num /= 10;
//			tmp /= 10;
//			counter++;
//		}
//		
//		System.out.println("The new number is: " + newNum);

		// Chapter 4 Q4
//		int idNumber, sum = 0, checkDigit, counter = 8, tmp;
//
//		System.out.print("Your ID is: ");
//		idNumber = scanner.nextInt();
//
//		checkDigit = idNumber % 10;
//		idNumber /= 10;
//
//		while (idNumber != 0) {
//			tmp = idNumber % 10;
//			if (counter % 2 == 0) { // weight 2
//				tmp *= 2;
//				if (tmp > 9)
//					tmp = (tmp % 10) + (tmp / 10);
//			}
//			sum += tmp;
//			idNumber /= 10;
//			counter--;
//		}
//
//		tmp = ((sum / 10) + 1) * 10;
//		if (checkDigit == (tmp - sum))
//			System.out.println("ID is OK");
//		else
//			System.out.println("ID is not OK");

		// Chapter 4 Q6
//		int num, newNum, multi = 1, tmp;
//
//		System.out.println("Enter your number: ");
//		num = scanner.nextInt();
//		tmp = num;
//		newNum = num;
//
//		while (num != 0) {
//			num /= 10;
//			multi *= 10;
//		}
//
//		newNum *= multi;
//		multi /= 10;
//
//		while (tmp != 0) {
//			num += ((tmp % 10) * multi);
//			tmp /= 10;
//			multi /= 10;
//		}
//		
//		newNum += num;
//		System.out.println("Your new number is: " + newNum);

		// Chapter 4 Q8
//		int numerator, denominator, counter = 0;
//
//		for (denominator = 11; denominator < 100; denominator++) {
//			for (numerator = 10; numerator < denominator; numerator++) {
//				if (denominator % 10 == 0)
//					break;
//
//				if ((double) (numerator / 10) / (double) (denominator % 10) == (double) numerator / denominator) {
//					counter++;
//					System.out.println(numerator + "/" + denominator);
//				}
//			}
//		}
//
//		System.out.println("Counter: " + counter);

		// Chapter 4 Q10
//		int num, newNum, tmp, partLength, multi = 1, counter = 0;
//
//		System.out.print("Enter number: ");
//		num = scanner.nextInt();
//		tmp = num;
//		System.out.print("Enter part length: ");
//		partLength = scanner.nextInt();
//
//		while (tmp != 0) {
//			tmp /= 10;
//			counter++;
//			multi *= 10;
//		}
//
//		for (int i = 0; i < partLength; i++) {
//
//		}

		scanner.close();
	}

}
