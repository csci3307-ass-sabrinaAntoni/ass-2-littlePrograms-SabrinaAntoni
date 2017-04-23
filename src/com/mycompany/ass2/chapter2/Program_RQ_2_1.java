/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author Sabrina
 *
 */
public class Program_RQ_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 5.5;
		double num2 = 2.5;
		double num3 = 1.3;
		double num4 = 3.0;
		double num5 = 31.5;
		double num6 = 1.5;
		double result1;
		double result2;
		
		result1 = num1 * num2 - (num3 * num4);
		result2 = num5 - num6;
		
		System.out.print("The result of " + num1 + " * " + num2 + " - " + num3 + " * " + num4 + " is: " + result1);
		System.out.print("\n");
		System.out.printf("The result of " + num5 + " - " + num6 + " is: " + result2);

	}

}
