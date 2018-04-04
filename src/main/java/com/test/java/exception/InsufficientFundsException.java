/*
 * Created on 27 Feb, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.exception;

import java.io.*;

public class InsufficientFundsException extends Exception
{
   private double amount;
   public InsufficientFundsException(double amount)
   {
   	System.out.println("Going to set the Amount");
      this.amount = amount;
   } 
   public double getAmount()
   {
	System.out.println("Going to Return the Amount");
      return amount;
   }
}