/*
 * Created on 27 Feb, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.exception;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
	      System.out.println("Depositing $500...");
	      c.deposit(500.00);
	      try
	      {
	         System.out.println("\nWithdrawing $100...");
	         c.withdraw(100.00);
	         System.out.println("\nWithdrawing $600...");
	         c.withdraw(600.00);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"
	                                  + e.getAmount());
	         e.printStackTrace();
	      }
	}
}