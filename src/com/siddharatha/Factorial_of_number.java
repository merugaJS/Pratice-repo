package com.siddharatha;

import java.util.Scanner;

public class Factorial_of_number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number to calculate factorial:");

		long factorial = 1;

		int n = input.nextInt();

		if (n < 0) {

			n = Math.abs(n);
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + n + " is " + factorial);
		}

		else if (n == 0) {
			;
			System.out.println("The factorial of 0 is 1");
		} else {
			n = Math.abs(n);
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + n + " is " + factorial);

		}
		input.close();
	}

}