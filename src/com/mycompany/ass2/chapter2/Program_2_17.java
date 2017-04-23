/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Program_2_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int sum;
		int average;
		int product;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		
		System.out.printf("The sum is %d", sum);
		System.out.print("\n");
		
		average = sum / 3;
		
		System.out.printf("The average is %d", average);
		System.out.print("\n");
		
		product = number1 * number2 * number3;
		
		System.out.printf("The product is %d", product);
		System.out.print("\n");
		
		if (number1 < number2 && number1 < number3)
		{
			System.out.printf("%d is the smallest number", number1);
			System.out.print("\n");
		}
			
		
		else if (number2 < number1 && number2 < number3)
		{
			System.out.printf("%d is the smallest number", number2);
			System.out.print("\n");
		}
					
		else if (number3 < number1 && number3 < number2)
		{
			System.out.printf("%d is the smallest number", number3);
			System.out.print("\n");
		}
			
		if (number1 > number2 && number1 > number3)
		{
			System.out.printf("%d is the largest number", number1);
			System.out.print("\n");
		}
		
		else if (number2 > number1 && number2 > number3)
		{
			System.out.printf("%d is the largest number", number2);
			System.out.print("\n");
		}
			
		else if (number3 > number1 && number3 > number2)
		{
			System.out.printf("%d is the largest number", number3);
			System.out.print("\n");
		}
			
		
		

	}

}
