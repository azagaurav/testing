/*
 * Created on 23 May, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.date;

import java.util.StringTokenizer;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class CheckYaer {
	public double checkvalidforarrear(String s1, String s2, String s3) {
		int[] start = new int[5];
		int[] end = new int[5];
		int[] end2 = new int[5];
		int scount = -1;
		int ecount = -1;
		int kcount = -1;
		if (s1.equals("0000-00-00")) {

		}
		StringTokenizer st = new StringTokenizer(s1, "-");
		while (st.hasMoreTokens()) {

			String res = st.nextToken();
			start[++scount] = Integer.parseInt(res);
		}
		StringTokenizer ed = new StringTokenizer(s2, "-");
		while (ed.hasMoreTokens()) {

			String res = ed.nextToken();
			end[++ecount] = Integer.parseInt(res);
		}
		StringTokenizer ed1 = new StringTokenizer(s3, "-");
		while (ed1.hasMoreTokens()) {

			String res = ed1.nextToken();
			end2[++kcount] = Integer.parseInt(res);
		}

		int year = start[0];
		int month = start[1];
		int day = start[2];

		int year1 = end[0];
		int month1 = end[1];
		int day1 = end[2];

		int year2 = end2[0];
		int month2 = end2[1];
		int day2 = end2[2];

		if (year == year1 && year1 == year2) {

			if (month < month1 && month1 < month2) {
				return 1;
			}
			if (month == month1 && month1 <= month2) {
				if (day < day1) {
					return 1;
				}
			}
			if (month < month1 && month1 == month2) {
				if (day2 != 1) {
					return 1;
				}
			}

			return 0;
		}
		if (year < year1 && year1 == year2) {
			if (month1 < month2) {
				return 1;
			}
			if (month1 == month2) {
				if (day2 != 1) {
					return 1;
				}
			}
			return 0;
		}
		if (year < year1 && year1 < year2) {
			return 1;
		}
		if (year == year1 && year1 < year2) {
			if (month < month1) {
				return 1;
			}
			if (month == month1) {
				if (day < day1) {
					return 1;
				}
			}
			return 0;
		}

		return 0;
	}

	public static void main(String[] args) {
	}
}