package javabootcamp.basic.methods;

import java.util.Iterator;
import java.util.Scanner;
import java.lang.Math;

public class Runner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		printNameAndAge();

//		int grade1, grade2, grade3;
//		System.out.print("Grade1: ");
//		grade1 = scanner.nextInt();
//		System.out.print("Grade2: ");
//		grade2 = scanner.nextInt();
//		System.out.print("Grade2: ");
//		grade3 = scanner.nextInt();
//		calcAvgGrades(grade1, grade2, grade3);

//		int num1, num2, num3;
//		System.out.print("Num1: ");
//		num1 = scanner.nextInt();
//		System.out.print("Num2: ");
//		num2 = scanner.nextInt();
//		System.out.print("Num3: ");
//		num3 = scanner.nextInt();
//		System.out.println("First call: " + getTheMaxNumber(num1, num2, num3));
//		System.out.println("Second call: " + getTheMaxNumber(num1, num2));

		// Calculate with Math class
//		float ans;
//		ans = (float) (10 * Math.sin((Math.PI / 4)));
//		System.out.println("1. 10*sinus(PI/4) = " + ans);
//		System.out.println("What is 120 degrees in radians? " + Math.toRadians(120));
//		System.out.println("𝑒2.5= " + Math.exp(2.5));

		// Init array with random numbers
//		int arr[];
//		int len = 10;
//		arr = initArrWithRandomIntegers(len);
//		printArr(arr);

		// calculate 2 arrays to one array
//		int[] arr1 = { 3, 2, 1 };
//		int[] arr2 = { 1, 2, 2, 1 };
//		sumTheCellsInArrays(arr1, arr2);
//		printArr(arr2);

		// Get 2 arrays and Connecting to one
		int[] arr1 = { 3, 2, 1 };
		int[] arr2 = { 1, 2, 2, 1 };
		printArr(arr1);
		printArr(arr2);

		int[] connectedArr = connect2ArraysTo1Array(arr1, arr2);
		printArr(connectedArr);

		// Chapter 6 Q1
//		int num;
//		System.out.println("Enter a number: ");
//		num = scanner.nextInt();
//		System.out.println("The new number is: " + increaseDigits(num));

		// Chapter 6 Q2
//		int num1, num2;
//		System.out.print("First number: ");
//		num1 = scanner.nextInt();
//		System.out.print("Second number: ");
//		num2 = scanner.nextInt();
//		System.out.println("combineNumbersByLowercaseDigits(): " + combineNumbersBySmallDigits(num1, num2));

		// Chapter 6 Q3
//		for (int element = 1; element <= 10000; element++)
//			if (isElaborateNumbers(element))
//				System.out.println(element + ": " + true);

		// Chapter 6 Q4
//		int[] numbers = { 25, 73, 55, 81, 451, 10 };
//		System.out.println("The number of elements in an array whose sum of digits is 10: "
//				+ numberOfElementsInArrayWithSum10(numbers, numbers.length));

		// Chapter 6 Q5
//		drawRhombus(3, '*');

		// Chapter 6 Q6
//		int[][] matrix = { { 2, 1, 5 }, { 6, 7, 3 }, { 0, 8, 0 } };
//		System.out.println(areRowsAndColumnsEqual(matrix));

		// Chapter 6 Q7
//		int[][] matrix = { { 2, 1, 5, 5, 1, 2 }, { 6, 7, 3, 3, 7, 6 }, { 0, 8, 0, 0, 8, 0 } };
//		System.out.println(isMirrorMatrix(matrix));

		// Chapter 6 Q8
//		int[] firstArr = { 9, 9, 9, 9 };
//		int[] secondArr = { 9, 7 };
//		int[] addArr = addArrays(firstArr, secondArr);
//		printArr(addArr);

		// Chapter 6 Q9
//		int[][] matrix = { { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 1 }, { 0, 1, 0, 1 } };
//		System.out.println("max left-top rectangle is: " + max0Rectangle(matrix));

		scanner.close();
	}

	public static int[] connect2ArraysTo1Array(int[] arr1, int[] arr2) {
		int[] connectedArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0;

		for (; i < arr1.length; i++, j++)
			connectedArr[j] = arr1[i];

		for (i = 0; i < arr2.length; i++, j++)
			connectedArr[j] = arr2[i];

		return connectedArr;
	}

	public static int max0Rectangle(int[][] matrix) {
		int leftTopMatrixSize = 0, counter = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					counter++;
				} else {
					break;
				}
			}

			if (row > leftTopMatrixSize)
				break;

			if (row > 0)
				leftTopMatrixSize = counter < leftTopMatrixSize ? counter : leftTopMatrixSize;
			else
				leftTopMatrixSize = counter;

			counter = 0;
		}

		return leftTopMatrixSize;
	}

	public static void sumTheCellsInArrays(int[] arr1, int[] arr2) {
		int[] newArr, longArr = arr1, shortArr = arr2;

		// Find the long array
		if (longArr.length < shortArr.length) {
			longArr = arr2;
			shortArr = arr1;
		}
		newArr = new int[longArr.length];

		// Summarize arrays
		int i = 0;
		for (; i < shortArr.length; i++) {
			newArr[i] = arr1[i] + arr2[i];
		}

		// Add the rest of the max array
		for (; i < longArr.length; i++) {
			newArr[i] = longArr[i];
		}

		putArraySunInLongerArr(longArr, newArr);
	}

	public static void putArraySunInLongerArr(int[] maxArr, int[] newArr) {
		// deep copy
		for (int i = 0; i < maxArr.length; i++)
			maxArr[i] = newArr[i];
	}

	public static void printArr(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[arr.length - 1] + " ]");
	}

	public static int[] initArrWithRandomIntegers(int len) {
		int[] randomArr = new int[len];
		int max = 100, min = -100;
		for (int i = 0; i < len; i++)
			randomArr[i] = (int) ((Math.random() * (max - min + 1)) + min);
		return randomArr;
	}

	public static int[] addArrays(int[] firstArr, int[] secondArr) {
		int sum = 0, tmp = 0;
		int[] addArr, longArr = firstArr, shortArr = secondArr;
		if (firstArr.length < secondArr.length) {
			longArr = secondArr;
			shortArr = firstArr;
		}
		addArr = new int[longArr.length + 1];

		int shortArrIndex = shortArr.length - 1, longArrIndex = longArr.length - 1, addArrIndex = addArr.length - 1;
		for (; shortArrIndex >= 0; shortArrIndex--, longArrIndex--, addArrIndex--) {
			sum = longArr[longArrIndex] + secondArr[shortArrIndex];
			if (sum > 9) {
				addArr[addArrIndex] = sum % 10 + tmp;
				tmp = sum / 10;
			} else
				addArr[addArrIndex] = sum + tmp;
		}

		for (; addArrIndex > 0; addArrIndex--, longArrIndex--) {
			sum = longArr[longArrIndex] + tmp;
			if (sum > 9) {
				addArr[addArrIndex] = sum % 10;
				tmp = sum / 10;
			} else {
				addArr[addArrIndex] = sum;
				tmp = 0;
			}
		}

		addArr[0] = tmp;

		return addArr;
	}

	public static boolean isMirrorMatrix(int[][] matrix) {
		boolean isMirrorMatrix = true;
		for (int col = 0; col < matrix[0].length / 2; col++) {
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] != matrix[row][matrix[0].length - col - 1]) {
					isMirrorMatrix = false;
					break;
				}
			}
		}
		return isMirrorMatrix;
	}

	public static boolean areRowsAndColumnsEqual(int[][] matrix) {
		boolean res = true;
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sum1 += matrix[i][j];
				sum2 += matrix[j][i];
			}
			if (sum1 != sum2) {
				res = false;
				break;
			}
		}

		return res;
	}

	public static void drawRhombus(int num, char c) {
		int numOfSpace = 0, numOfChars = num;

		while (numOfChars > 0) {
			for (int i = 0; i < numOfChars; i++)
				System.out.print(c);
			for (int i = 0; i < numOfSpace; i++)
				System.out.print(" ");
			for (int i = 0; i < numOfChars; i++)
				System.out.print(c);
			numOfChars--;
			numOfSpace += 2;
			System.out.println();
		}

		numOfSpace -= 4;
		numOfChars += 2;

		while (numOfSpace >= 0) {
			for (int i = 0; i < numOfChars; i++)
				System.out.print(c);
			for (int i = 0; i < numOfSpace; i++)
				System.out.print(" ");
			for (int i = 0; i < numOfChars; i++)
				System.out.print(c);
			numOfSpace -= 2;
			numOfChars++;
			System.out.println();
		}
	}

	public static int numberOfElementsInArrayWithSum10(int[] numbers, int length) {
		int count = 0;

		for (int i = 0; i < length; i++)
			if (sumofDigitsInNumber(numbers[i]) == 10)
				count++;

		return count;
	}

	public static int sumofDigitsInNumber(int num) {
		int sum = 0;
		while (num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

	public static boolean isElaborateNumbers(int element) {
		boolean isElaborateNumber = false;
		int sum = 0;

		for (int i = 1; i <= (element / 2); i++) {
			if (element % i == 0)
				sum += i;
			if (sum > element)
				break;
		}

		isElaborateNumber = (sum == element) ? true : false;

		return isElaborateNumber;
	}

	public static int combineNumbersBySmallDigits(int num1, int num2) {
		int combinedNumber = 0, counter1 = 0, counter2 = 0, tmp, multi = 1, digit1, digit2;
		tmp = num1;
		while (tmp != 0) {
			counter1++;
			tmp /= 10;
			multi *= 10;
		}

		tmp = num2;
		while (tmp != 0) {
			counter2++;
			tmp /= 10;
		}
		multi /= 10;

		if (counter1 == counter2) {
			while (num1 != 0) {
				digit1 = num1 / multi;
				digit2 = num2 / multi;
				digit1 = digit1 > digit2 ? digit2 : digit1;
				combinedNumber += (digit1 * multi);
				num1 %= multi;
				num2 %= multi;
				multi /= 10;
			}

		} else
			combinedNumber = -1;

		return combinedNumber;
	}

	public static int increaseDigits(int num) {
		int newNum = 0, digit, multi = 1, tmp;
		tmp = num;
		while (tmp != 0) {
			tmp /= 10;
			multi *= 10;
		}

		multi /= 10;

		while (num != 0) {
			digit = num / multi;
			if (digit == 9)
				digit = 0;
			else
				digit += 1;
			newNum += (digit * multi);
			num %= multi;
			multi /= 10;
		}

		return newNum;
	}

	public static void printNameAndAge() {
		System.out.println("Dana Grosman, 29 :)");
	}

	public static void calcAvgGrades(int grade1, int grade2, int grade3) {
		System.out.printf("%.2f", (float) (grade1 + grade2 + grade3) / 3);
	}

	public static int getTheMaxNumber(int num1, int num2, int num3) {
		int max = num1;
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		return max;
	}

	public static int getTheMaxNumber(int num1, int num2) {
		int max = num1;
		if (max < num2)
			max = num2;
		return max;
	}

}
