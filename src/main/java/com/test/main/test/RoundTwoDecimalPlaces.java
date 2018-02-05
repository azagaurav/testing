/*
 * Created on 31 Mar, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RoundTwoDecimalPlaces{
	  public static void main(String[] args) {
	  float num =12322.954165f;
	  long i=Math.round(123234.74238423);
	  float round = Round(num,1);
	  System.out.println("Rounded data: " + i);
	  }

	  public static int Round(float Rval, int Rpl) {
	  int p = (int)Math.pow(1,Rpl);
	  Rval = Rval * p;
	  int tmp = Math.round(Rval);
	  return (int)tmp/p;
	  }
	}
