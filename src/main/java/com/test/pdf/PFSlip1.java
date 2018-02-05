/*
 * Created on 10 May, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class PFSlip1 {
	public static void main(String[] arg) {

		Font normalFont = FontFactory.getFont(FontFactory.TIMES, 10.0f);
		Font headingFont = FontFactory.getFont(FontFactory.TIMES_BOLD, 11.0f);
		Document docum = null;
		String logosize="60,40";
		int logo_align=2;
		float TableP[] = { 20f, 18f, 18f, 18f, 18f, 8f };
		float fTableP[] = { 100f };
		float sTableP[] = { 18f, 18f, 18f, 14f, 18f, 14f };
		float tTableP[] = { 6f, 94f };
		try {
			docum = new Document(PageSize.A4, 40, 40, 40, 40);
			PdfWriter.getInstance(docum,
					new FileOutputStream("D:\\PF_Slip.pdf"));
			docum.open();
			String lg="C:/logo/sapelogonew.gif";	
			Image gif = Image.getInstance(lg);
			gif.setAlignment( logo_align  );
			String[] logoarr=logosize.split(","); 
			//System.out.println("size" + logoarr[0] + "and" + logoarr[1] );
			gif.scaleAbsolute(Integer.parseInt(logoarr[0]) ,Integer.parseInt(logoarr[1]));
			docum.add(gif);
			String Label11="Provisional Provident Fund Statement";
			PdfPTable tablee=new PdfPTable(1);
						  
						 	
						   tablee.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
						 
							tablee.addCell(new Paragraph(Label11,normalFont));
										tablee.setWidthPercentage(100);		
										
			docum.add(tablee);
			PdfPTable tablesu = new PdfPTable(1);
			tablesu.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			tablesu.setWidthPercentage(100);
			String Label1 = "Sapient Consulting employees provident fund";
			String Label2 = "Tower A, Building 2, Sector 21 Dundahera, Old Delhi-Gurgaon Road";
			String Label22 = "gurgaon 122016, haryana,india";

			PdfPTable tables = new PdfPTable(1);

			tables.getDefaultCell().setBorder(0);
			tables.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);

			tables.addCell(new Paragraph(Label1.toUpperCase(), normalFont));
			tables.addCell(new Paragraph(Label2.toUpperCase(), normalFont));
			tables.addCell(new Paragraph(Label22.toUpperCase(), normalFont));

			tablesu.addCell(tables);

			docum.add(tablesu);

			String Label = "For Financial Year " + "2011" + "-" + "2012";
			PdfPTable tablee1 = new PdfPTable(1);

			tablee1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);

			tablee1.addCell(new Paragraph(Label, normalFont));
			tablee1.setWidthPercentage(100);

			docum.add(tablee1);
			String Labeln = "Employee Details";
			PdfPTable tablee2 = new PdfPTable(1);

			tablee2.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);

			tablee2.addCell(new Paragraph(Labeln, normalFont));
			tablee2.setWidthPercentage(100);

			docum.add(tablee2);
			float widthn[] = { 4f, 6f, 6f, 6f };
			PdfPTable table = new PdfPTable(widthn);
			PdfPTable table1 = new PdfPTable(widthn);
			PdfPTable tableupper = new PdfPTable(1);
			PdfPTable table2 = new PdfPTable(widthn);
			PdfPTable table3 = new PdfPTable(widthn);
			//docum.addHeader( "Danny","Danu");

			tableupper.setWidthPercentage(100);

			table.setWidthPercentage(100);
			table1.setWidthPercentage(100);
			table2.setWidthPercentage(100);
			table3.setWidthPercentage(100);
			table.getDefaultCell().setBorder(0);
			table1.getDefaultCell().setBorder(0);
			table2.getDefaultCell().setBorder(0);
			table3.getDefaultCell().setBorder(0);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(new Paragraph("Payroll ID", normalFont));
			table.getDefaultCell().setColspan(3);
			table.addCell(new Paragraph(":999999", normalFont));

			table1.addCell(new Paragraph("Emp Name", normalFont));
			table1.getDefaultCell().setColspan(3);
			table1.addCell(new Paragraph(":Gaurav", normalFont));

			table2.addCell(new Paragraph("PF Number", normalFont));
			table2.getDefaultCell().setColspan(3);
			table2.addCell(new Paragraph(":", normalFont));

			table3.addCell(new Paragraph("Date of Joining", normalFont));
			table3.getDefaultCell().setColspan(3);

			table3.addCell(new Paragraph(":", normalFont));
			tableupper.addCell(table);
			tableupper.addCell(table1);
			tableupper.addCell(table2);
			tableupper.addCell(table3);
			docum.add(tableupper);
			PdfPTable table4 = new PdfPTable(1);
			table4.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			table4.addCell(new Paragraph("Provident Fund Contribution",
					normalFont));
			table4.setWidthPercentage(100);
			docum.add(table4);
			PdfPTable sTable = new PdfPTable(sTableP);
			sTable.setWidthPercentage(100f);
			sTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			sTable.addCell(new Paragraph("Year & Month", normalFont));
			sTable.addCell(new Paragraph("Employee's Regular Contribution(1)",
					normalFont));
			sTable.addCell(new Paragraph("Employer's Regular Contribution(2)",
					normalFont));
			sTable.addCell(new Paragraph("Total (1+2)", normalFont));
			sTable.addCell(new Paragraph(
					"Employer's Regular Contribution to EPS(3)", normalFont));
			sTable.addCell(new Paragraph("Remarks", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 1st  April, "
					+ "2011", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph(
					"Balance transferred from other PF during the Year",
					normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			
			Calendar cal=new GregorianCalendar();
			int i=Calendar.DAY_OF_MONTH;			
			
			String month[] = { "Apr", "May", "June", "July", "Aug", "Sep",
					"Oct", "Nov", "Dec", "Jan", "Feb", "Mar" };
			String fyear = "2012-2013";
			String fy[] = fyear.split("-");
			System.out.println(month.length);
			switch (i) {
			case 5:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 6:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 7:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 8:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 9:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 10:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 11:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;				
			case 12:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[7] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 1:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[7] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[8] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;
			case 2:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[7] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[8] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[9] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
			case 3:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[7] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[8] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[9] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[10] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
			case 4:
				sTable.addCell(new Paragraph(month[0] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[1] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[2] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[3] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[4] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[5] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[6] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[7] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[8] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[9] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[10] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph(month[11] + "-" + fy[0], normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				sTable.addCell(new Paragraph("", normalFont));
				break;

			default:
				break;
			}
			
			
			sTable.addCell(new Paragraph("Total Contribution during the year", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("Total", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("Closing Balance", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			sTable.addCell(new Paragraph("", normalFont));
			docum.add(sTable);
			PdfPTable tTable = new PdfPTable(tTableP);
			tTable.setWidthPercentage(100);
			tTable.getDefaultCell().setBorderWidth(1.0f);			
			tTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);			
			
			String note1 = "The monthly contributions for a particular month represent the contribution "
					+ "out of payroll for the previous month i.e. Mar, 11 contribution will appear against Apr, 11.";
			String note2 = "Employer’s contribution is divided into two parts as P F and EPS.EPS is the contribution "
					+ "towards pension fund/scheme administered by regional provident fund commissioner (“RPFC”)."
					+ " The default contribution towards this scheme is 8.33% of basic salary, subject to maximum of "
					+ "Rs. 541/- per month and the balance amount is termed as PF e.g. if the basic salary is Rs. "
					+ "10000/- then deduction towards PF from your salary would be Rs. 1200/- and the same amount is "
					+ "contributed by your employer out of which Rs. 541/- is deposited as EPS and remaining Rs. "
					+ "659/- is deposited as PF.";
			String note3 = "Employees Pension Scheme (EPS) Contributions shown on col. 3 above are deposited with  RPFC, Gurgaon.";
			/*tTable.addCell(new Paragraph(note1, normalFont));
			tTable.addCell(new Paragraph("2.", normalFont));
			tTable.addCell(new Paragraph(note2, normalFont));
			tTable.addCell(new Paragraph("3.", normalFont));
			tTable.addCell(new Paragraph(note3, normalFont));
			docum.add(tTable);*/
			
			tTable.getDefaultCell().setBorder(0);
			tTable.addCell(new Paragraph("Notes:",normalFont));
			tTable.addCell(new Paragraph("",normalFont));	
			tTable.addCell(new Paragraph("1.",normalFont));
			tTable.addCell(new Paragraph(note1,normalFont));
			tTable.addCell(new Paragraph("2.",normalFont));
			tTable.addCell(new Paragraph(note2,normalFont));
			tTable.addCell(new Paragraph("3.",normalFont));
			tTable.addCell(new Paragraph(note3,normalFont));
			PdfPTable tableeno1=new PdfPTable(1);
			tableeno1.getDefaultCell().disableBorderSide(Rectangle.TOP);
			tableeno1.getDefaultCell().enableBorderSide(Rectangle.BOTTOM);
			tableeno1.addCell(tTable);
			tableeno1.setWidthPercentage(100);
			docum.add(tableeno1);

			System.out.println("PDF Ban Gaya");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (docum.isOpen()) {
				docum.close();
			}
		}
	}
}