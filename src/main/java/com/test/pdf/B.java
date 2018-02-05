/*
 * Created on Aug 22, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class B extends A {
	public static void main(String str[]) {
		double sum = 0;
		String annualstr = "1,2,4,3,15";
		String annualamt = "126000,63000,3500,155880,10000";
		String examplimit = "800,800,800,800,800,800,800,800,800,800,800,800";
		String exmptiolimit = "9600";
		String exmptio = "4";
		int year = 2013;
		String doj = "2013-2-18";
		int month = 6;
		String[] annualstrarr = annualstr.split(",");
		String[] annualamtarr = annualamt.split(",");
		String[] exmpLimit = examplimit.split(",");

		double sumLimit = getLimit(examplimit, doj, annualstrarr, month, year);

		System.out.println("jjdsadl " + sumLimit);
		for(int i=0;i<annualstrarr.length ;i++  ){
			if(annualstrarr [i].equalsIgnoreCase( exmptio )){
				sum=sum + Double.parseDouble( annualamtarr [i]); 
			//System.out.println("value of sum"+sum);
			}
		}
		System.out.println("I am in exaption*** CONVEYANCE  exmptio" + exmptio);
		System.out.println("I am in exaption*** CONVEYANCE  exmptiolimit"
				+ exmptiolimit);
		double limit = Double.parseDouble(exmptiolimit);

		if (sum > sumLimit) {
			System.out.println("i am in case of sum > sumlimit");
			sum = sumLimit;
		} else {
			sum = sum + 0;
		}
		if (sum < 0) {
			sum = 0;
		}
		System.out.println("retun value" + sum);

	}

	public static double getLimit(String examplimit, String doj,
			String[] annualstrarr, int month2, int year) {
		// TODO Auto-generated method stub
		System.out.println("DOJ :: " + doj);
		String[] dojArr = doj.split("-");
		double sum = 0;
		int days = 0;
		if (Integer.parseInt(dojArr[0]) == year) {
			if (Integer.parseInt(dojArr[1]) == month2) {
				if (Integer.parseInt(dojArr[0]) % 4 == 0) {
					int leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,
							31 };
					int month = Integer.parseInt(dojArr[1]);
					days = leap[month - 1];
					sum = sum
							+ ((((days - Integer.parseInt(dojArr[2])) + 1) * 800) / days);
				} else {
					int nonleap[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
							30, 31 };
					int month = Integer.parseInt(dojArr[1]);
					days = nonleap[month - 1];
					sum = sum
							+ ((((days - Integer.parseInt(dojArr[2])) + 1) * 800) / days);
				}
				System.out.println(sum + " Value of Sum in IF ");
			} else {
				System.out.println("00000000");
				if (Integer.parseInt(dojArr[0]) % 4 == 0) {
					int leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,
							31 };
					int month = Integer.parseInt(dojArr[1]);
					days = leap[month - 1];
					sum = sum + ((days * 800) / days);
				} else {
					int nonleap[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
							30, 31 };
					int month = Integer.parseInt(dojArr[1]);
					days = nonleap[month - 1];
					sum = sum + ((days * 800) / days);
				}
				System.out.println(sum + " Value of Sum in IF ");
			}
		} else {

		}
		return sum;
		/*
		 * if (((Integer.parseInt(dojArr[0]) == year) && (Integer
		 * .parseInt(dojArr[1]) <= 3)) || (Integer.parseInt(dojArr[0]) < 2013)) {
		 * return 9600; } else { System.out.println("Date of Joining " +
		 * dojArr[1]); double sum = 0; int monthString =
		 * getProjectedMonth(dojArr[1]); for (int i = 0; i < monthString; i++) {
		 * System.out.println(sum + " Value of Sum"); if (i == 0) {
		 * 
		 * //int days = 0; if (Integer.parseInt(dojArr[0]) % 4 == 0) { int
		 * leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; int
		 * month = Integer.parseInt(dojArr[1]); days = leap[month - 1];
		 * System.out.println("No Of Working Days 1" + ((days -
		 * Integer.parseInt(dojArr[2])) + 1)); System.out.println("No Of Working
		 * Days 2" + ((days - Integer.parseInt(dojArr[2])) + 1) 800);
		 * System.out.println("No Of Working Days 3" + (((days -
		 * Integer.parseInt(dojArr[2])) + 1) * 800) / days); sum = sum +
		 * ((((days - Integer.parseInt(dojArr[2])) + 1) * 800) / days); } else {
		 * int nonleap[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 * int month = Integer.parseInt(dojArr[1]); days = nonleap[month - 1];
		 * sum = sum + ((((days - Integer.parseInt(dojArr[2])) + 1) * 800) /
		 * days); } System.out.println(sum + " Value of Sum in IF "); } else {
		 * //int days = 0; if (Integer.parseInt(dojArr[0]) % 4 == 0) { int
		 * leap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; int
		 * month = Integer.parseInt(dojArr[1]); sum = sum + 800; } else { int
		 * nonleap[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; int
		 * month = Integer.parseInt(dojArr[1]); days = nonleap[month - 1]; sum =
		 * sum + 800; } System.out.println(sum + " Value of Sum in ELSE "); } }
		 * return sum; } }
		 */

	}
}