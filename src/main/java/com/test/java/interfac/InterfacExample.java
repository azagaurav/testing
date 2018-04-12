/*
 * Created on 16 Nov, 2011
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
package com.test.java.interfac;

public class InterfacExample extends Variables {
	public float area(int i) {
		float j = i;
		return j;
	}

	public static void main(String[] args) {
		float i;
		i = mimpl.area(88);
		i = mimpl.area(2);
		System.out.println(i);
	}

}