/*
 * Created on 7 Nov, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.excel;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import com.test.excel.Employee;
import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel {
	Employee employee = new Employee();
	String pk="1";
	String emp_code="000001";
	String month="2";
	String year="2011";
	String tax_code="12,9,13,16";
	String tax_value="120,90,130,160";

	ArrayList al = new ArrayList();

	//al.add

	private WritableCellFormat timesBoldUnderline;

	private WritableCellFormat times;

	private String inputFile;

	public void setOutputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public void write(Employee employee,ArrayList set) throws IOException, WriteException {
		File file = new File(inputFile);
		WorkbookSettings wbSettings = new WorkbookSettings();

		wbSettings.setLocale(new Locale("en", "EN"));

		WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
		workbook.createSheet("Perk Report", 0);
		WritableSheet excelSheet = workbook.getSheet(0);
		createLabel(excelSheet,employee,set);
		createContent(excelSheet,employee,set);

		workbook.write();
		workbook.close();
	}

	private void createLabel(WritableSheet sheet,Employee employee,ArrayList set) throws WriteException {
		// Lets create a times font
		WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
		// Define the cell format
		times = new WritableCellFormat(times10pt);
		// Lets automatically wrap the cells
		times.setWrap(true);

		// Create create a bold font with unterlines
		WritableFont times10ptBoldUnderline = new WritableFont(
				WritableFont.TIMES, 10, WritableFont.BOLD, false,
				UnderlineStyle.SINGLE);
		timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
		// Lets automatically wrap the cells
		timesBoldUnderline.setWrap(true);
		CellView cv = new CellView();
		cv.setFormat(times);
		cv.setFormat(timesBoldUnderline);
		//cv.setAutosize(true);
		
		addLabel(sheet, 0, 0, employee.getPK());
		addLabel(sheet, 1, 0, employee.getEMP_CODE());
		addLabel(sheet, 2, 0, employee.getMONTH());
		addLabel(sheet, 3, 0, employee.getYEAR());
		int k=set.size();
		k=k+4;
		int j = 0;
		for (int i = 4; i <k; i++) {			
			String st = (String) set.get(j);
			System.out.println(st);
			addLabel(sheet, i, 0, st);
			j++;
		}
	}

	private void createContent(WritableSheet sheet,Employee employee,ArrayList set) throws WriteException,
			RowsExceededException {
		// Write a few number
		System.out.println(employee.getPK());
		for (int i = 0; i < 1; i++) {
			// First column
			addLabel(sheet, 0, 1, employee.getPK());
			// Second column
			addLabel(sheet, 1, 1, employee.getEMP_CODE());
			addLabel(sheet, 2, 1, employee.getMONTH());
			addLabel(sheet, 3, 1, employee.getYEAR());
			
		}
		String str1=employee.getTAX_VALUE();
		int k=set.size();
		k=k+4;
		int j = 0;
		for (int i = 4; i <k; i++) {			
			String st = (String) set.get(j);
			System.out.println(st);
			addLabel(sheet, i, 1, st);
			j++;
		}/*
		// Lets calculate the sum of it
		StringBuffer buf = new StringBuffer();
		buf.append("SUM(A2:A10)");
		Formula f = new Formula(0, 10, buf.toString());
		sheet.addCell(f);
		buf = new StringBuffer();
		buf.append("SUM(B2:B10)");
		f = new Formula(1, 10, buf.toString());
		sheet.addCell(f);

		// Now a bit of text
		for (int i = 12; i < 20; i++) {
			// First column
			addLabel(sheet, 0, i, "Boring text " + i);
			// Second column
			addLabel(sheet, 1, i, "Another text");
		}*/
	}

	private void addCaption(WritableSheet sheet, int column, int row, String s)
			throws RowsExceededException, WriteException {
		Label label;
		label = new Label(column, row, s, timesBoldUnderline);
		sheet.addCell(label);
	}

	private void addNumber(WritableSheet sheet, int column, int row,
			double integer) throws WriteException, RowsExceededException {
		Number number;
		number = new Number(column, row, integer, times);
		sheet.addCell(number);
	}

	private void addLabel(WritableSheet sheet, int column, int row, String s)
			throws WriteException, RowsExceededException {
		Label label;
		label = new Label(column, row, s, times);
		sheet.addCell(label);
	}

	public static void main(String[] args) throws WriteException, IOException {
		WriteExcel test = new WriteExcel();
		test.setOutputFile("c:/Temp/lars.xls");
		Employee employee = new Employee();
		String pk="000001";
		String emp_code="Bose";
		String month="2";
		String year="2011";
		String tax_code="12,9,13,16";
		String tax_value="120,90,130,160";
		employee.setPK(pk);
		employee.setEMP_CODE(emp_code);
		employee.setMONTH(month);
		employee.setYEAR(year);
		employee.setTAX_CODE(tax_code);
		employee.setTAX_VALUE(tax_value);
		employee.setPK("000002");
		employee.setEMP_CODE("Kalyan");
		employee.setMONTH("2");
		employee.setYEAR("2011");
		employee.setTAX_CODE("9,13,16,15");
		employee.setTAX_VALUE("90,130,160,150");
		ArrayList set = new ArrayList();
		set.add("10");
		set.add("12");
		set.add("9");
		set.add("13");
		set.add("16");
		set.add("15");
		test.write(employee,set);
		System.out
				.println("Please check the result file under c:/temp/lars.xls ");
	}
}