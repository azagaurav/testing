/*
 * Created on 9 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.exception;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class CustomExceptionTest {

	public static void main(String[] args) throws Exception {
   
		int age = 0;
		if (age < 0) {
			throw new NegativeAgeException(age);
		} else {
			System.out.println("Age entered is " + age);
		}

	}

	static int getAge() {
		return -10;
	}
}