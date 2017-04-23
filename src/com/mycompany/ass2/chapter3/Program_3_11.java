/**
 * 
 */
package com.mycompany.ass2.chapter3;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Program_3_11 {

	/**
	 * @param args
	 */
	
	private String name;
	private double balance;
	
	public Program_3_11(String name, double balance)
	{
		this.name = name;
		
		if (balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount)
	{
		if (withdrawalAmount > balance)
		{
			System.out.println("Withdrawal amount exceeded account balance.");
		}
		else
		{
			balance = balance - withdrawalAmount;
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {
		Program_3_11 account1 = new Program_3_11("Jane Green", 50.00);
		Program_3_11 account2 = new Program_3_11("John Blue", -7.53);
		
		//display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account 1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account 2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		// Ask user if they want to withdrawal any money
		System.out.print("Enter withdrawal amount for account1: ");
		double withdrawalAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawalAmount);
		account1.withdrawal(withdrawalAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");
		withdrawalAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawalAmount);
		account2.withdrawal(withdrawalAmount);
		
		//display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

	}

}
