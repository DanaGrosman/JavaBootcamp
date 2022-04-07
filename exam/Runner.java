package javabootcamp.basic.exam;

public class Runner {

	public static void main(String[] args) {
		// WEEK 1 EXAM

		// Question 1
		// JRE is an installation package that necessary to run JAVA applications.
		// JRE include the JVM - Responsible for compilation and running the code.
		// JDK is the development environment - used for develop JAVA applications.
		// JDK include JRE (and JRE include JVM).

		// Question 2
		// First JVM takes the code file (that ending with .java) and compiles
		// him to bytecode files (that ending with .class).
		// JVM run and Compiles the code and run it in JVM.
		// After that we can see the OUTPUT.

		// Question 3
		System.out.println("Question 3: ");
		int num = 123454321;
		String isPali = checkIfTheNumberIsPalindrome(num) ? " " : " not ";
		System.out.printf("The number %d is%sa palindrome \n", num, isPali);

		// Question 4
		System.out.println("Question 4: ");
		int[] firstArr = { 7, 8, -4 }, secondArr = { -5, 7, 3, 2 }, connectedArr;
		connectedArr = new int[firstArr.length + secondArr.length + 2];
		connectedArr = concatArraysAndSumarizeTheElemntes(firstArr, secondArr);
		printArr(connectedArr);
	}

	public static void printArr(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[arr.length - 1] + " ]");
	}

	public static int[] concatArraysAndSumarizeTheElemntes(int[] firstArr, int[] secondArr) {
		int firstArrSum = 0, secondArrSum = 0;
		int[] connectedArr = new int[firstArr.length + secondArr.length + 2];
		int[] largerArr = firstArr, smallerArr = secondArr;
		int largerArrIndex = 0, connectedArrIndex = 0;

		// Summarize the arrays and check who has the smaller sum
		firstArrSum = sumElementsInArray(firstArr);
		secondArrSum = sumElementsInArray(secondArr);

		if (secondArrSum > firstArrSum) {
			largerArr = secondArr;
			smallerArr = firstArr;
		}

		// Copy the elements to connected array
		for (; connectedArrIndex < smallerArr.length; connectedArrIndex++) {
			connectedArr[connectedArrIndex] = smallerArr[connectedArrIndex];
		}

		for (; largerArrIndex < largerArr.length; largerArrIndex++, connectedArrIndex++) {
			connectedArr[connectedArrIndex] = largerArr[largerArrIndex];
		}

		connectedArr[connectedArrIndex] = firstArrSum + secondArrSum;
		connectedArr[++connectedArrIndex] = Math.abs(firstArrSum - secondArrSum);

		return connectedArr;
	}

	public static int sumElementsInArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	public static boolean checkIfTheNumberIsPalindrome(int num) {
		boolean isPalindrome = true;
		int reversedNum = 0, tmp, digit;
		tmp = num;

		// Get reversed number
		while (tmp != 0) {
			digit = tmp % 10;
			tmp /= 10;
			reversedNum *= 10;
			reversedNum += digit;
		}

		// Check if reversed number equals to original number
		isPalindrome = reversedNum == num ? true : false;

		return isPalindrome;
	}

}
