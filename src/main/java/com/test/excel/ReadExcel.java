/*
 * Created on 21 Nov, 2011
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.ResultSet;

import com.test.reimslip.CreateReimSlipHelper;
import com.test.upload.MySQLAccess;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	private String inputFile;

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String read() throws IOException {
		String inputFile = "C:/Temp/sasa1.xls";
		File inputWorkbook = new File(inputFile);
		System.out.println(inputWorkbook);
		//System.out.println("String");
		Workbook w;
		String record = "";
		String recordTitle = "";
		String[] str = null;
		try {
			System.out.println("// Get the first sheet");
			w = Workbook.getWorkbook(inputWorkbook);
			//System.out.println("// Get the first sheet");
			Sheet sheet = w.getSheet(0);
			// Loop over first 10 column and lines
			StringBuffer buff = new StringBuffer();
int k=120;
			for (int j = 0; j <920 /* sheet.getRows() */; j++) {
				System.out.println("IIIIIII "+j);
				for (int i = 0; i < 45; i++) {
					System.out.println(" ::::::::::: "+i);
					Cell cell = sheet.getCell(i, j);
					if (j == 0) {
						recordTitle = recordTitle + "," + cell.getContents();
						//System.out.println("Record Title ::: ");
					} else {
						if (i == 0) {
							record = cell.getContents();
						} else {
							record = record + "," + cell.getContents();
						}
						
					}
					buff.append(cell.getContents());
					
				}
				System.out.println("Record ::: " + record);
				if(j!=0){
					String[] recArray = record.split(",");
					//System.out.println("EMPCODE :::: "+recArray[0]);
					if(j>=50){
					ResultSet rs = (new MySQLAccess()).getBulkmaster(recArray[0]);
					if (rs == null) {
						System.out.println("NULL");
					} else {
						while(rs.next()){
						System.out.println("NOT NULL ");
						(new CreateReimSlipHelper()).createReimbSlip(recArray, rs);
						}
					}
					}
				}
				//System.out.println("Record Number ::: " + k++);
				
			}
			/*
			 * Writer output = null; //String text = cell.getContents();
			 * //System.out.println("gggg " + buff.capacity()); File file = new
			 * File("c:/Temp/write.txt"); output = new BufferedWriter(new
			 * FileWriter(file)); //output.write(buff); output.close();
			 * //System.out.println("gggg" + text);
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
		return record;
	}

	public static void main(String[] args) throws IOException {
		ReadExcel test = new ReadExcel();
		//System.out.println("GGGG");
		test.setInputFile("C:/Temp/Reimbursement Slip Format.xls");
		test.read();
	}

}