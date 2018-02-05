/*
 * Created on Jan 8, 2014
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.reimslip;

import java.sql.ResultSet;

import com.test.excel.ReadExcel;
import com.test.upload.MySQLAccess;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class CreateReimSlip {

	public static void main(String[] args) {
		try {
			System.out.println("Going to create PDF");
			String record = (new ReadExcel()).read();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}