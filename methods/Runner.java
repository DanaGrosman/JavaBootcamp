package javabootcamp.basic.methods;

import java.util.Scanner;

public class Runner {

	public static void printNameAndAge() {
		System.out.println("Dana Grosman, 29 :)");
	}
	
	public static float calcAvgGrades() {
		Scanner scanner = new Scanner(System.in);
		float average=0;
		int grade;
		
		System.out.println("Your grades is: ");
		for(int i=0; i< 3; i++) {
			grade = scanner.nextInt();
			average += grade;
		}
		
		scanner.close();
		return average/3;
	}
	public static void main(String[] args) {
		
		printNameAndAge();
		System.out.printf("%.2f", calcAvgGrades());

	}

}
