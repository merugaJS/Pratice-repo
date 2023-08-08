package com.siddharatha;

import java.util.Scanner;

public class Grade_average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        int totalGrades = 0;
        int sumGrades = 0;
        
        System.out.println("Enter grades:");
        
        while (true) {
            int grade = input.nextInt();
            
            if (grade < 0) {
                break;
            }
            
            sumGrades = sumGrades + grade;
            totalGrades++;
            
            if (totalGrades == 6) {
            	break;
            }
            }
        
        
        if (totalGrades == 0) {
            System.out.println("No grades entered.");
        } else {
            double average =  sumGrades / totalGrades;
            System.out.println("Average grade: " + average);
        }
        
        input.close();
    }
}