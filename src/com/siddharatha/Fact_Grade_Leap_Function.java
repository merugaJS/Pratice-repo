package com.siddharatha;

import java.util.Scanner;

public class Fact_Grade_Leap_Function {

	public double Grade_Average() {
		Scanner input = new Scanner(System.in);

		double totalGrades = 0;
		double sumGrades = 0;

		System.out.println("Enter grades:");

		while (true) {
			float grade = input.nextFloat();

			if (grade < 0) {
				break;
			}

			sumGrades = sumGrades + grade;
			totalGrades++;

			if (totalGrades == 6) {
				break;
			}
		}

		double average =(sumGrades / totalGrades);
		return average;

	}

	public double factorial_of_num() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number to calculate factorial:");

		double factorial = 1;

		int n = input.nextInt();

		if (n < 0) {

			n = Math.abs(n);
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			/* System.out.println("Factorial of " + n + " is " + factorial); */
		}

		else if (n == 0) {
			;
			System.out.println("The factorial of 0 is 1");
		} else {
			n = Math.abs(n);
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			/* System.out.println("Factorial of " + n + " is " + factorial); */

		}
		input.close();
		return factorial;
	}

	public boolean checkforleapyear() {

		Scanner input = new Scanner(System.in);

		System.out.println("Input the year to check for leap year:");

		int year = input.nextInt();

		boolean leapyear = false;

		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))

			leapyear = true;

		/* System.out.println("the year " + year + " is a leap year."); */
		else

			leapyear = false;

		/* System.out.println("the year " + year + " is not a leap year"); */

		input.close();

		return leapyear;
	}

}