/*
 * Created on 27 Feb, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.exception;

import java.io.*;

public class CheckingAccount
{
   private double balance;
   private int number;
   public CheckingAccount(int number)
   {System.out.println("Amount"+number);
      this.number = number;
   }
   public void deposit(double amount)
   {System.out.println("amount"+amount);
      balance += amount;
      System.out.println(balance+"amount"+amount);
   }
   public void withdraw(double amount) throws
                              InsufficientFundsException
   {
      if(amount <= balance)
      {
         balance -= amount;
         System.out.println(balance+"amount"+amount);
      }
      else
      {System.out.println("I'm In ELSE");
         double needs = amount - balance;
         throw  new InsufficientFundsException(needs);
      }
   }
   public double getBalance()
   {
      return balance;
   }
   public int getNumber()
   {
      return number;
   }
}