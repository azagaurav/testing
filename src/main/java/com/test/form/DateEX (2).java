/*
 * Created on 3 Sep, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.form;

import java.util.Date;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DateEX {

	public static void main(String[] args) {
		Date date2=new Date();
		Date date1=new Date(89,05,02);
		date1=date2;
		System.out.println("This is date : "+date1);
		System.out.println("This is date : "+date2);
	}
}
