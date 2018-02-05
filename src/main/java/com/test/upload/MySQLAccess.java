/*
 * Created on 13 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.upload;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.test.pdf.RotationAndColors;

public class MySQLAccess {
	private Connection connect = null;

	private Statement statement = null;

	private PreparedStatement preparedStatement = null;

	private ResultSet resultSet = null;

	String url = "jdbc:mysql://localhost:3306/";

	String dbName = "SAPECONS";

	String driver = "com.mysql.jdbc.Driver";

	String userName = "kbgr";

	String password = "wSsxRz6Z";

	public void readDataBase() throws Exception {
		try {
			System.out.println("1");
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(url + dbName, userName,
					password);
			System.out.println("2");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			FileInputStream fstream = new FileInputStream("D:/rebate.csv");
			// Result set get the result of the SQL query
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			System.out.println("3");
			//Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				String breakString[] = strLine.split(",");
				System.out.println(breakString[0]);
				//this is used for update csv file values in database
				String doo = "insert";
				if (doo.equalsIgnoreCase("update")) {
					int i = statement
							.executeUpdate("update `SAPECONS_trust2012-1013`.`form16data` set month='"
									+ breakString[1]
									+ "' where empcode='"
									+ breakString[0] + "'");
				}
				//this is used for insert csv file values in database
				if (doo.equalsIgnoreCase("insert")) {
					int i = statement
							.executeUpdate("insert into  `SAPIENTPF`.`hitorydata` values("
									+ breakString[0]
									+ ","
									+ breakString[1]
									+ ","
									+ breakString[2]
									+ ","
									+ breakString[3]
									+ ","
									+ breakString[4]
									+ ","
									+ breakString[5]
									+ ","
									+ breakString[6]
									+ ","
									+ breakString[7]
									+ ","
									+ breakString[8]
									+ ","
									+ breakString[9] + "," + breakString[10]

									+ ")");
				}
				// Print the content on the console
				//System.out.println(i+"456");
			}

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		// 	Now get some metadata from the database
		// Result set get the result of the SQL query

		System.out.println("The columns in the table are: ");

		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " "
					+ resultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String user = resultSet.getString("myuser");
			String website = resultSet.getString("webpage");
			String summery = resultSet.getString("summery");
			Date date = resultSet.getDate("datum");
			String comment = resultSet.getString("comments");
			System.out.println("User: " + user);
			System.out.println("Website: " + website);
			System.out.println("Summery: " + summery);
			System.out.println("Date: " + date);
			System.out.println("Comment: " + comment);
		}
	}

	// You need to close the resultSet
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	/**
	 *  
	 */
	public void printDataTable() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(url + dbName, userName,
					password);
			//System.out.println("2");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			String query = "select * from `VCUSTOMER`.`create_pay_slip`  where emp_code='STL11257'";
			ResultSet rs=null;
			//System.out.println("we");

			//System.out.println("::::");
			String codes = "";
			String empcode = "";
			int counter = 0;
			int i = 0;
			while (/* i <= 8700 */rs.next()) {
				//System.out.println("No of Pay Slips :::: "+i);
				//rs.next();
				RotationAndColors1 rac1 = new RotationAndColors1();
				//System.out.println(rs.getString("emp_Code")+" ::: "+i);
				//if (i > 8400) {
				System.out.println("No of Pay Slips :::: " + i);
				rac1.CreatePaySlip(rs, codes, empcode, counter);
				//}
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("EXCEPTION :::: " + e);
			e.printStackTrace();
		}
	}

	public ResultSet getBulkmaster(String empcode) {
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(url + dbName, userName,
					password);
			//System.out.println("2");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			String query = "select * from `SAPECONS`.`bulkmaster`  where empcode='000057'";
					//+ empcode.trim() + "'";
			rs = statement.executeQuery(query);
			System.out.println("we ::::: "+query);
			//rs = statement.executeQuery(query);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return rs;

	}
}

