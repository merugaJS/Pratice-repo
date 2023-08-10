package com.subinita;

import java.util.Scanner;
public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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