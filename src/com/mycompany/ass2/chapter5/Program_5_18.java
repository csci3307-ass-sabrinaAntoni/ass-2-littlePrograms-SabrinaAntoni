/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author Sabrina
 *
 */
public class Program_5_18 {

	/**
	 * @param args
	 */
	
	static double myPow(int base, int exp) {
		double result = 1.0;
		while (0 < exp)
		{
			result *= (double)base;
			exp--;
		}
		
		while (0 > exp)
		{
			result /= (double)base;
			exp++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int principle;
		int amount;
		int rate;
		int year;
		
		int dollars;
		int cents;
		
		principle = 1000;
		rate = 5;
		
		for (year = 1; year <= 10; year++)
		{
			amount = (int) (myPow(10, 3-2*year)*principle * myPow(100 + rate, year));
			if(5 <= (amount % 10))
			{
				amount += 10;
			}
			
			amount /=10;
			
			dollars = amount / 100;
			cents = amount % 100;
			
			if (cents < 10)
				System.out.printf("%4d%18d.0%d\n", year, dollars, cents);
			else
				System.out.printf("%4d%18d.%d\n", year, dollars, cents);
		}

	}

}
