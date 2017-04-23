/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Sabrina
 *
 */

import java.util.Scanner;

public class Program_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int x, y, z, result; //declare variables to store the integers and result
		
		System.out.print("Enter the first integer: "); //get first integer from user
		x = input.nextInt();
		
		System.out.print("Enter the second integer: "); //get second integer from user
		y = input.nextInt();
		
		System.out.print("Enter the third integer: "); //get third integer from user
		z = input.nextInt();
		
		result = x * y * z; //product of the 3 integers
		
		System.out.printf("Product is %d%n", result);

	}

}
