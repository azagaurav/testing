/*
 * Created on 20 Sep, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.date;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparison {
	public static void main(String[] args) {
		try {
			Date date11 = new Date();
			String date22 = "31-03-2010";
			System.out.println("Date :: " + date11);
			
			Date date = returnSmallDate(date11, date22);
			int flag=returnDateFlag(date11, date22);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @param date11
	 * @param date22
	 * @return
	 */
	private static int returnDateFlag(Date date11, String date22)throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(date11);
		int flag=0;
		System.out.println("Date :::: "+date);
		Date date1 = sdf.parse(date);
		Date date2 = sdf.parse(date22);

		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
			return flag;
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
			return flag;
		} else if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is Greatter to Date2");
			return flag;
		}
		return flag;
	}

	public static Date returnSmallDate(Date date11, String date22)
			throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(date11);
		System.out.println("Date :::: "+date);
		Date date1 = sdf.parse(date);
		Date date2 = sdf.parse(date22);

		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
			return date1;
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
			return date1;
		} else if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is Greatter to Date2");
			return date1;
		}
		return date1;
	}
}