/*
 * Created on Jan 9, 2014
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.loop;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
				System.out.print("TR :::: TD ");
			} else {
				System.out.println("TD :::: TR");
			}
		}
	}
}