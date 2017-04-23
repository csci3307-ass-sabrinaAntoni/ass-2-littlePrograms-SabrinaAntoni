/**
 * 
 */
package com.mycompany.ass2.chapter4;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Figure_4_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//initialization phase
		int total = 0; //initialize sum of grades entered by the user
		int gradeCounter = 1; //initialize # of grade to be entered next
		
		//processing phase uses counter-controlled repetition
		while (gradeCounter <= 10) //loop 10 times
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt(); 
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
		
		//termination phase
		int average = total / 10;
		
		// display total and averages of grades
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);

	}

}
