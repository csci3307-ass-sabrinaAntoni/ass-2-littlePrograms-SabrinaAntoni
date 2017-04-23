/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int difference;
		int product;
		int quotient;
		
		System.out.print("Enter first integer: "); //prompt user to enter integer
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: "); //prompt user for another integer
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum); //display sum
		
		difference = number1 - number2;
		
		System.out.printf("Difference is %d%n", difference); //display difference
		
		product = number1 * number2; 
		
		System.out.printf("Product is %d%n", product); //display product
		
		quotient = number1 / number2;
		
		System.out.printf("Quotient is %d%n", quotient); //display quotient

	}

}
