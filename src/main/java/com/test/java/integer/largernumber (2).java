/*
 * Created on 9 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.integer;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
class largernumber {
	public static void main(String[] args) {
		int empbasic = 5000, ta_with_I = 70, c = 3000;
		int finalValue = 0;
		if (empbasic > ta_with_I) {
			if (empbasic > c) {
				finalValue = empbasic;
			} else {
				if (c > ta_with_I) {
					finalValue = c;
				} else {
					finalValue = ta_with_I;
				}
			}
		}
		System.out.println(finalValue);
	}
}