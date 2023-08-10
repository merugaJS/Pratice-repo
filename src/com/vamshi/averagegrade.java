package com.vamshi;

import java.util.Scanner;

public class averagegrade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		int count = 0;

		while (true) {
			System.out.print("Enter grade (negative to quit): ");
			double grade = scanner.nextDouble();

			if (grade < 0) {
				break;
			}

			sum += grade;
			count++;
		}

		double average = sum / count;
		System.out.println("Average grade: " + average);

	}

}
