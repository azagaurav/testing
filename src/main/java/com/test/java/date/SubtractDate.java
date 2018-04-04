/*
 * Created on 3 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class SubtractDate {

	public static void main(String[] arg) throws ParseException {		
		Date currentDate = new Date();
		String JoinDate = "23-oct-2009";
		DateFormat frmt = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = (Date) frmt.parse("7-jan-2008");
		Date date2=(Date) frmt.parse(JoinDate);
		long mdate = (date2.getTime() - date.getTime())
				/ (1000 * 60 * 60 * 24);
		System.out.println(mdate);
		long i = (mdate) / 365;
		System.out.println(i+" day");
		long j = i / 4;		
		System.out.println((mdate - j) );
		System.out.println(((mdate - j)% 365)/30);		
	}

}