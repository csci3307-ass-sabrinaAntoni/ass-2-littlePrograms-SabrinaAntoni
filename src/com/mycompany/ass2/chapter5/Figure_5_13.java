/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Sabrina
 *
 */
public class Figure_5_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count;
		for (count = 1; count <= 10; count++)
		{
			if (count == 5)
				break;
			System.out.printf("%d ", count);
		}
		
		System.out.printf("%nBroke out of loop at count = %d%n", count);

	}

}
