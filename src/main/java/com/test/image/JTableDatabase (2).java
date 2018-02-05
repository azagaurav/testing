/*
 * Created on Apr 9, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.image;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class JTableDatabase {
	public static void main(String[] args) {

		Vector columnNames = new Vector();
		Vector data = new Vector();
		JPanel p = new JPanel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Name Success");
			Connection connect =DriverManager.getConnection ("jdbc:mysql://localhost:3306/sapient", "kbgr", "wSsxRz6Z");
			System.out.println("Connection Name Success");
			String sql = "Select * from bulkmaster";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			for (int i = 1; i <= columns; i++) {
				columnNames.addElement(md.getColumnName(i));
			}
			while (rs.next()) {
				Vector row = new Vector(columns);
				for (int i = 1; i <= columns; i++) {
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		JTable table = new JTable(data, columnNames);
		table.setSize(1000,1000);
		TableColumn col;
		//col.setResizable(true);
		for (int i = 0; i < table.getColumnCount(); i++) {
			col = table.getColumnModel().getColumn(i);
			col.setResizable(true);
		}
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(1000, 1000);
		p.add(scrollPane);
		JFrame f = new JFrame();		
		f.getContentPane().add(p);
		f.setSize(800, 400);
		f.setVisible(true);
	}
}