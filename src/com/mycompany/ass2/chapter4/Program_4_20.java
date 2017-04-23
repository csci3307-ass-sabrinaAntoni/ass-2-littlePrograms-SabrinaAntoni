/**
 * 
 */
package com.mycompany.ass2.chapter4;

import java.util.Scanner;


/**
 * @author Sabrina
 *
 */
public class Program_4_20 {

	/**
	 * @param args
	 */
	
	private String name;
	private double hours;
	private double rate;
	
	public Program_4_20(String name, double hours, double rate)
	{
		name = "";
		hours = 0;
		rate = 0;	
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getGrossPay(double hours, double rate)
	{
		if (hours <=40)
			return rate * hours;
		else 
		{
			double extraHours = hours - 40;
			double basePay = 40 * rate;
			double timeAndHalf = rate * (1.5) * extraHours;
			double grossPay = basePay + timeAndHalf;
			return grossPay;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String employeeName;
		double hoursWorked;
		double hourlyRate;
		double totalPay1;
		double totalPay2;
		double totalPay3;
		
		Program_4_20 employee1 = new Program_4_20("", 0, 0);
		Program_4_20 employee2 = new Program_4_20("", 0, 0);
		Program_4_20 employee3 = new Program_4_20("", 0, 0);
		
		System.out.println("Enter the name of employee1: ");
		employeeName = input.nextLine();
		employee1.setName(employeeName);
		
		System.out.println("Enter the number of hours worked by employee1: ");
		hoursWorked = input.nextDouble();
		
		System.out.println("Enter the hourly pay rate for employee1: ");
		hourlyRate = input.nextDouble();
		input.nextLine();
		
		totalPay1 = employee1.getGrossPay(hoursWorked, hourlyRate);
		
		System.out.println("Enter the name of employee2: ");
		employeeName = input.nextLine();
		employee2.setName(employeeName);
		
		System.out.println("Enter the number of hours worked by employee2: ");
		hoursWorked = input.nextDouble();
		
		System.out.println("Enter the hourly pay rate for employee2: ");
		hourlyRate = input.nextDouble();
		input.nextLine();
		
		totalPay2 = employee2.getGrossPay(hoursWorked, hourlyRate);
		
		System.out.println("Enter the name of employee3: ");
		employeeName = input.nextLine();
		employee3.setName(employeeName);
		
		System.out.println("Enter the number of hours worked by employee3: ");
		hoursWorked = input.nextDouble();
		
		System.out.println("Enter the hourly pay rate for employee3: ");
		hourlyRate = input.nextDouble();
		
		totalPay3 = employee3.getGrossPay(hoursWorked, hourlyRate);
		
		System.out.printf("The gross pay for employee1 is: " + totalPay1);
		System.out.println();
		System.out.printf("The gross pay for employee2 is: " + totalPay2);
		System.out.println();
		System.out.printf("The gross pay for employee3 is: " + totalPay3);
		
		

	}

}
