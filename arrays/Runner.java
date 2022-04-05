package javabootcamp.basic.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// PRINT ARRAYS
//		int[][] arr = { { 1, -2, 3 }, { -4, -5, 6, 9 }, { 7 } };

		// FOR LOOP
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j< arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		// FOR EACH LOOP
//		for (int[] row : arr) {
//			for (int element : row) {
//				System.out.print(element + " ");
//			}
//			System.out.println();
//		}

		// DEEP COPY ARRAYS
//		int[] originalArr = { 5, -1, -2 };
//		int[] copyArr = new int[originalArr.length];
//
//		for (int i = 0; i < originalArr.length; i++)
//			copyArr[i] = (originalArr[i] * originalArr[i]);
//
//		System.out.println("originalArr: ");
//		for (int i = 0; i < originalArr.length; i++)
//			System.out.print(originalArr[i] + " ");
//
//		System.out.println();
//		
//		System.out.println("copyArr: ");
//		for (int i = 0; i < copyArr.length; i++)
//			System.out.print(copyArr[i] + " ");

		// Chapter 5 Q1
//		String res = " ";
//		int[] arr1 = new int[5];
//		int[] arr2 = new int[5];
//
//		System.out.println("arr1: ");
//		for (int i = 0; i < arr1.length; i++)
//			arr1[i] = scanner.nextInt();
//
//		System.out.println("arr2: ");
//		for (int j = 0; j < arr2.length; j++)
//			arr2[j] = scanner.nextInt();
//
//		for (int k = 0; k < arr1.length; k++)
//			if (arr1[k] != arr2[4 - k]) {
//				res = " NOT ";
//				break;
//			}
//
//		System.out.println("The arrays are" + res + "reverse");

		// Chapter 5 Q3
//		int[] arr = new int[10];
//		
//		System.out.print("Enter first element: ");
//		arr[0] = scanner.nextInt();
//		System.out.print("Enter second element: ");
//		arr[1]= scanner.nextInt();
//		
//		for(int i = 2; i< arr.length;i++) 
//			arr[i]=arr[i-2]+arr[i-1];
//		
//		for(int i = 0; i<arr.length; i++)
//			System.out.print(arr[i]+ ", ");

		// Chapter 5 Q5
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		boolean res = true;

		System.out.println("arr1: ");
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = scanner.nextInt();

		System.out.println("arr2: ");
		for (int j = 0; j < arr2.length; j++)
			arr2[j] = scanner.nextInt();

		if (res && (arr1[arr1.length - 1] != arr2[0]))
			res = false;
		
		else {
			for (int k = 1; k < arr1.length - 1; k++) {
				if (arr1[k] != arr2[k + 1]) {
					res = false;
					break;
				}
			}
		}

		System.out.println(res);

		// Chapter 5 Q7
//		int[] arr1 = new int[5];
//		int[] arr2 = new int[5];
//		int[] arr3 = new int[5];
//		int counter = 0;
//
//		System.out.println("arr1: ");
//		for (int i = 0; i < arr1.length; i++)
//			arr1[i] = scanner.nextInt();
//
//		System.out.println("arr2: ");
//		for (int j = 0; j < arr2.length; j++)
//			arr2[j] = scanner.nextInt();
//
//		for (int index1 = 0; index1 < arr1.length; index1++) {
//			for (int index2 = 0; index2 < arr2.length; index2++) {
//				
//				if(arr1[index1]<arr2[index2])
//					break;
//				
//				if (arr1[index1] == arr2[index2]) {
//					arr3[counter] = arr1[index1];
//					counter++;
//					break;
//				}
//			}
//		}
//		
//		System.out.println("The elemnts in arr3: ");
//		for (int index3 = 0; index3 < counter; index3++)
//			System.out.print(arr3[index3] + " ");
//		System.out.println();
//		System.out.println("There is " + (counter) + " elements");

		// Chapter 5 Q9
//		int[] arr1 = new int[3];
//		int[] arr2 = new int[3];
//		int sum1 = 0, sum2 = 0;
//		boolean isTwinsArrs = true;
//
//		System.out.println("arr1: ");
//		for (int i = 0; i < arr1.length; i++)
//			arr1[i] = scanner.nextInt();
//
//		System.out.println("arr2: ");
//		for (int j = 0; j < arr2.length; j++)
//			arr2[j] = scanner.nextInt();
//		
//		for (int i = 0; i < arr1.length; i++) {
//
//			while (arr1[i] != 0) {
//				sum1 += arr1[i] % 10;
//				arr1[i] /= 10;
//			}
//			while (arr2[i] != 0) {
//				sum2 += arr2[i] % 10;
//				arr2[i] /= 10;
//			}
//
//			if (sum1 != sum2) {
//				isTwinsArrs = false;
//				break;
//			}
//		}
//		System.out.println("Twins arrays: " + isTwinsArrs);

		// Chapter 5 Q11
		int[][] matrix = new int[10][10];
		int rows, cols, maxNum;

		do {
			System.out.println("Enter rows: ");
			rows = scanner.nextInt();
		} while (rows < 1 || rows > 10);

		do {
			System.out.println("Enter cols: ");
			cols = scanner.nextInt();
		} while (cols < 1 || cols > 10);

		System.out.print("Enter " + (rows * cols) + " elements: ");
		for (int row = 0; row < rows; row++)
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = scanner.nextInt();

			}

		scanner.close();
	}

}
