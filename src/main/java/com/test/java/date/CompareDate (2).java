/*
 * Created on Jan 7, 2014
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
import java.util.*;
import java.text.SimpleDateFormat;


public class CompareDate {
	public static void main(String args[]) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = "2013-4-1";
			String endDate = "2014-3-31";
			String jonDate = "2013-10-10";
			Date startDate = sdf.parse(strDate);
			Date endsDate = sdf.parse(endDate);
			Date joinDate = sdf.parse(jonDate);
			String strConv="800,800,800,800,800,800,800,800,800,800,800,800";
			if (joinDate.compareTo(endsDate) <= 0
					&& joinDate.compareTo(startDate) >= 0) {				
				double limit=getLimit(jonDate);
				System.out.println("joinDate is within Financial Year "+limit);
			} else {
				double limit=9600;
				System.out.println("joinDate is out of Financial Year "+limit);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static double getLimit(String doj) {
		// TODO Auto-generated method stub
		System.out.println("DOJ :: " + doj);
		String[] dojArr = doj.split("-");
		System.out.println("year1 :::::: "+dojArr[0]);
		System.out.println("month1 :::::: "+dojArr[1]);
		System.out.println("date1 :::::: "+dojArr[2]);
		double sum = 0;
		int i=0;
		int days = getNoDays(doj);
		int noMonth=getNoMonth(doj);		
		sum=800*noMonth;
		System.out.println("SUM VALUE With Month :::::: "+sum);
		i=(days - Integer.parseInt(dojArr[2])) + 1;
		System.out.println("No of Days for calculation ::::: "+i);
		sum=sum+(i*800)/days;
		System.out.println("SUM VALUE With Days:::::: "+sum);
		return sum;
	}
	public static int getNoDays(String doj){
		int days=0;
		String[] dojArr = doj.split("-");
		int month = Integer.parseInt(dojArr[1]);
		if (Integer.parseInt(dojArr[0]) % 4 == 0) {
			int leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,31 };			
			days = leap[month - 1];			
		} else {
			int nonleap[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
					30, 31 };
			days = nonleap[month - 1];
		}
		System.out.println("No of Days ::::: "+days);
		return days;
	}
	public static int getNoMonth(String doj){
		String[] dojArr = doj.split("-");
		int noofmonths=0;
		if(Integer.parseInt(dojArr[1])>=4){
		noofmonths=(12-Integer.parseInt(dojArr[1]))+3;
		}else{
			noofmonths=3-Integer.parseInt(dojArr[1]);
		}
		System.out.println("No of Months ::::: "+noofmonths);
		return noofmonths;
	}
}