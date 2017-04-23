/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Program_2_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		if (number1 > number2)
		{
			System.out.printf("%d is larger", number1);
		}
		else if (number1 < number2)
		{
			System.out.printf("%d is larger", number2);
		}
		else
			System.out.print("These numbers are equal");

	}

}
