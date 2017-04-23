/**
 * 
 */
package com.mycompany.ass2.chapter5;

import java.util.Scanner;

/**
 * @author Sabrina
 *
 */
public class Figure_5_30 {

	/**
	 * @param args
	 */
	
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	// constructor
	public Figure_5_30(int accountNumber, String makeAndModel)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getAccuntNumber()
	{
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel()
	{
		return makeAndModel;
	}
	
	public String setState(String state)
	{
		String result = "";
		if (state.equals("CT") || state.equals("MA") || state.equals("ME")
				|| state.equals("NH") || state.equals("NJ") || state.equals("NY")
				|| state.equals("PA") || state.equals("VT"))
		{
			this.state = state;
			result = "OK";
		}
		else
			{
			System.out.println("Error. You did not enter a Northeast state.");
			this.state = "N/A";
			}
		
		return result;
	}
	
	public String getState()
	{
		return state;
	}
	
	public boolean isNoFaultState() // predicate method returns whether the state has no-fault insurance
	{
		boolean noFaultState;
		switch(getState())
		{
		case "MA" : case "NJ" : case "NY": case "PA" :
			noFaultState = true;
			break;
		default:
			noFaultState = false;
		break;
		}
		
		return noFaultState;
	}
	public static void main(String[] args) {
		int accountNumber = 0;
		String makeAndModel = "";
		String state = "";
		boolean faultState;
		
		Scanner input = new Scanner(System.in);
		while (accountNumber!= -1)
		{
			System.out.print("Please enter the customer number (enter -1 to quit)");
			accountNumber = input.nextInt();
			if(accountNumber == -1)
				break;
			System.out.print("Please enter the vehicle:");
			input.nextLine();
			makeAndModel = input.nextLine();
			System.out.print("Please enter the State:");
			state = input.next();
			
			Figure_5_30 CarPolicy = new Figure_5_30(accountNumber, makeAndModel);
			CarPolicy.setState(state);
			
			faultState = CarPolicy.isNoFaultState();
			
			if (faultState == true)
			{
				System.out.print("This state has no-fault insurance");
				System.out.println();
			}
			else
				System.out.println("This state does not have no-fault insurance");
			
			System.out.printf("The account number is: %d", accountNumber);
			System.out.println();
			System.out.printf("The Make and Model is: %s%n", makeAndModel);
			System.out.println();
			System.out.printf("The state is: %s%n", state);
		}

	}

}
