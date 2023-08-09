package com.subinita;

import java.util.Scanner;

public class MultiFunction {
void factorial()
{
	int fact = 1,i;
	int num = 6;
	for(i=1;i<=num;i++)
	{
	fact=fact*i;
	}
	System .out.print(fact);
}


public  void isLeapYear(int year)
{
    // flag to take a non-leap year by default
    boolean is_leap_year = false;

    // If year is divisible by 4
    if (year % 4 == 0) {
        is_leap_year = true;

        // To identify whether it is a
        // century year or not
        if (year % 100 == 0) {
            // Checking if year is divisible by 400
            // therefore century leap year
            if (year % 400 == 0)
                is_leap_year = true;
            else
                is_leap_year = false;
        }
    }

    // We land here when corresponding if fails
    // If year is not divisible by 4
    else

        // Flag dealing-  Non leap-year
        is_leap_year = false;

    if (!is_leap_year)
        System.out.println(year + " : Non Leap-year");
    else
        System.out.println(year + " : Leap-year");
}
			
			public  void calGradeAvg()
			{
				 
				 Scanner scanner = new Scanner(System.in);
			        int totalGrades = 0;
			        int numberOfGrades = 0;

			        System.out.println("Enter grades (enter a negative number to calculate the average):");

			        while (true) {
			            int grade = scanner.nextInt();

			            if (grade < 0) {
			                break;
			            }
			            totalGrades += grade;
			            numberOfGrades++;
			        }

			        if (numberOfGrades == 0) {
			            System.out.println("No grades entered. Cannot calculate the average.");
			        } else {
			            double average = (double) totalGrades / numberOfGrades;
			            System.out.println("Average grade: " + average);
			        }

			        scanner.close();	
			}
			}




