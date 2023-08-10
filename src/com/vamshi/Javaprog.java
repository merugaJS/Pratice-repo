package com.vamshi;

import java.util.Scanner;

public class Javaprog {

	public double averagegrade() {
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
		return average;

	}
	
	public long factorial() {

	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter a positive integer: ");
	    int num = scanner.nextInt();

	    long fact = 1;
	    for(int i = 1; i <= num; ++i) {
	      fact *= i;
	    }

	   return fact; 
	

}
	public boolean CheckLeapYear(){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		boolean isLeapYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}
	return isLeapYear;
}
}
