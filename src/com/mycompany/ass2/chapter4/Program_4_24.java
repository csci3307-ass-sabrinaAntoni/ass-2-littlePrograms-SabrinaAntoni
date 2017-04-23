/**
 * 
 */
package com.mycompany.ass2.chapter4;
import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Program_4_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initializing variables in declarations
		int passes = 0;
		int failures = 0; 
		int studentCounter = 1;
		
		//process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			boolean isValid = true;
			
			while (isValid)
			{
				if(result == 1)
				{
					passes = passes + 1;
					isValid = false;
				}
				
				else if (result == 2)
				{
					failures = failures + 1;
					isValid = false;
				}
				
				else
				{
					System.out.println("Invalid Input.\nPlease enter a 1 for pass or 2 for fail)");
					result = input.nextInt();
					isValid = true;
				}
				
			}
			
			studentCounter = studentCounter + 1;
			
			System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
			
			if (passes > 8)
				System.out.println("Bonus to instructor!");

		}

	}

}
