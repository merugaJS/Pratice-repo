package com.siddharatha;

import java.util.Scanner;

public class Leap_year {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the year to check for leap year:");
		
		int year = input.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
				System.out.println("the year " + year + " is a leap year.");
		else System.out.println("the year " + year + " is not a leap year");
		
		input.close();
		
		
	}
}
