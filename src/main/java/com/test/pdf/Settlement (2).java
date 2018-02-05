/*
 * Created on 12 Mar, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.awt.Color;
import java.io.FileOutputStream;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Settlement {

	public static void main(String[] args) {
		System.out.println("PDF");
		// TODO Auto-generated method stub
		Document docum = null;
		try {
			Font normalFont = FontFactory.getFont(FontFactory.TIMES, 10.0f);
			Font headingFont = FontFactory.getFont(FontFactory.TIMES_BOLD,
					11.0f);
			//Table Widths Description
			float TableP[] = { 100f };
			float fTableP[] = { 3f, 35f, 62f };
			float sTableP[] = { 3f, 43f, 27f, 27f };
			float tTableP[] = { 3f, 47f, 50f };

			docum = new Document(PageSize.A4, 40, 40, 40, 40);
			PdfWriter.getInstance(docum, new FileOutputStream(
					"D:\\Settlement.pdf"));
			docum.open();

			//			 When no parameters are passed, the default leading = 16
			Phrase phrase0 = new Phrase();
			Phrase phrase1 = new Phrase("this is a phrase", FontFactory.getFont(
					FontFactory.HELVETICA, 25, Font.UNDERLINE, new Color(
							255, 0, 0)));
			
			PdfPTable borderTable = new PdfPTable(1);
			borderTable.setWidthPercentage(100f);
			borderTable.getDefaultCell().setFixedHeight(800);
			borderTable.getDefaultCell().setBorderWidth(2.0f);
			borderTable.getDefaultCell().setPadding(3);

			PdfPTable table = new PdfPTable(TableP);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setBorderWidth(0.0f);
			table.addCell(new Paragraph("(Annexure-K)", headingFont));
			table.addCell(new Paragraph(
					"SAPIENT CONSULTING EMPLOYEES PROVIDENT FUND TRUST",
					headingFont));
			table.addCell(new Paragraph(
					"Transfer/Settlement Certificate of P.F. Account",
					normalFont));

			PdfPTable fTable = new PdfPTable(fTableP);
			fTable.getDefaultCell().setBorderWidth(0.0f);
			fTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			fTable.addCell(new Paragraph(""));
			fTable.addCell(new Paragraph("Employee No", normalFont));
			fTable.addCell(new Paragraph("9999"));
			fTable.addCell(new Paragraph(""));
			fTable.addCell(new Paragraph("Date of receipt of Application",
					normalFont));
			fTable.addCell(new Paragraph("01-03-2012"));
			fTable.addCell(new Paragraph("1", normalFont));
			fTable.addCell(new Paragraph("Name of the Subscriber", normalFont));
			fTable.addCell(new Paragraph("Ankit Gupta", headingFont));
			fTable.addCell(new Paragraph("2", normalFont));
			fTable.addCell(new Paragraph("Name of Father / Husband ",
					normalFont));
			fTable.addCell(new Paragraph("Mahabir Parsad Gupta", headingFont));
			fTable.addCell(new Paragraph("3", normalFont));
			fTable.addCell(new Paragraph("Gender", normalFont));
			fTable.addCell(new Paragraph("Male", headingFont));
			fTable.addCell(new Paragraph("4", normalFont));
			fTable.addCell(new Paragraph("Date of Birth", normalFont));
			fTable.addCell(new Paragraph("01-01-1990", headingFont));
			fTable.addCell(new Paragraph("5", normalFont));
			fTable
					.addCell(new Paragraph(
							"Name and address of Faxtory/ Establishment in which previously Employed",
							normalFont));
			String str = "SAPIENT CONSULTING PRIVATE LIMITED UNITECH INFOSPACE, 4TH & 5TH FLOOR TOWER A, BUILDING 2 SECTOR 21 OLD-DELHI GURGAON ROAD, DUNDAHERA, GURGAON - 122 016, HARYANA, ";
			fTable.addCell(new Paragraph(str, headingFont));
			fTable.addCell(new Paragraph("6", normalFont));
			fTable.addCell(new Paragraph(
					"Date of Joining in Factory/Establishment", normalFont));

			fTable.addCell(new Paragraph("14-06-2010", headingFont));
			fTable.addCell(new Paragraph("7", normalFont));
			fTable.addCell(new Paragraph("Date of Membership  in PF ",
					normalFont));
			fTable.addCell(new Paragraph("14-06-2010", headingFont));
			fTable.addCell(new Paragraph("8", normalFont));
			fTable.addCell(new Paragraph("Date of Membership  in FPF ",
					normalFont));
			fTable.addCell(new Paragraph("14-06-2010", headingFont));
			fTable.addCell(new Paragraph("9", normalFont));
			fTable.addCell(new Paragraph("Date of Leaving :", normalFont));
			fTable.addCell(new Paragraph("12-08-2011", headingFont));
			fTable.addCell(new Paragraph("10", normalFont));
			fTable
					.addCell(new Paragraph(
							"P .F. Account No. from which transfer is made",
							normalFont));
			fTable.addCell(new Paragraph("HR/GGN/30659/278", headingFont));
			fTable.addCell(new Paragraph("11", normalFont));
			fTable.addCell(new Paragraph(
					"FPF Account No. from which transfer is made", normalFont));
			fTable.addCell(new Paragraph("HR/GGN/30659/278", headingFont));
			fTable.addCell(new Paragraph("12", normalFont));
			fTable.addCell(new Paragraph(
					"Name & Address of Present Employer :", normalFont));
			fTable
					.addCell(new Paragraph(
							"ACCENTURE SERVICES PVT.LTD PLANT-3, GODREJ & BOYCE COMPLEX, PIROJSHAH NAGAR, L.B.S. MARG",
							headingFont));
			fTable.addCell(new Paragraph("13", normalFont));
			fTable.addCell(new Paragraph(
					"P. F. Account No.( Present Employer ) :", normalFont));
			fTable.addCell(new Paragraph("MH/BAN/45665/138867", headingFont));

			table.addCell(fTable);
			PdfPTable sTable = new PdfPTable(sTableP);
			sTable.addCell(new Paragraph(""));
			sTable.addCell(new Paragraph(""));
			sTable.addCell(new Paragraph("a) Employees' Share "));
			sTable.addCell(new Paragraph("b) Employeers' Share "));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("15", normalFont));
			sTable.addCell(new Paragraph(
					"Contribution During the Year 2011-2012", normalFont));
			sTable.addCell(new Paragraph("11300", normalFont));
			sTable.addCell(new Paragraph("8595", normalFont));
			sTable.addCell(new Paragraph("16", normalFont));
			sTable.addCell(new Paragraph(
					"Transfer Received During the Year 2011-2012", normalFont));
			sTable.addCell(new Paragraph("15000", normalFont));
			sTable.addCell(new Paragraph("12000", normalFont));
			sTable.addCell(new Paragraph("17", normalFont));
			sTable.addCell(new Paragraph(
					"Withdrawal during the year 2011-2012 if any", normalFont));
			sTable.addCell(new Paragraph("20000", normalFont));
			sTable.addCell(new Paragraph("15000", normalFont));
			sTable.addCell(new Paragraph("18", normalFont));
			sTable.addCell(new Paragraph("Interest during the year 2011-2012",
					normalFont));
			sTable.addCell(new Paragraph("663", normalFont));
			sTable.addCell(new Paragraph("487", normalFont));
			sTable.addCell(new Paragraph("", headingFont));
			sTable
					.addCell(new Paragraph("Net Amount Transferred",
							headingFont));
			sTable.addCell(new Paragraph("10828", normalFont));
			sTable.addCell(new Paragraph("6093", normalFont));
			sTable.addCell(new Paragraph("", headingFont));
			sTable.addCell(new Paragraph("Total (a+b)", headingFont));
			sTable.addCell(new Paragraph("16921", normalFont));
			sTable.addCell(new Paragraph("", normalFont));

			table.addCell(sTable);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table
					.addCell(new Paragraph(
							"Amount in Words : Rupees Ninteen Thousand Eight Hundred Eighty Nine  Only",
							headingFont));
			table
					.addCell(new Paragraph(
							"Amount Transferred in favour of Through NEFT/RTGS in Bank Account",
							headingFont));

			PdfPTable tTable = new PdfPTable(tTableP);
			tTable.getDefaultCell().setBorderWidth(0.0f);
			tTable.addCell(new Paragraph("19", normalFont));
			tTable
					.addCell(new Paragraph(
							"Details of Withdrawals for  Housing/Marriage/Education Physically Handicaped : ",
							normalFont));
			tTable.addCell(new Paragraph(""));

			tTable.addCell(new Paragraph("20", normalFont));
			tTable.addCell(new Paragraph("Insurance Policy Financed Upto ",
					normalFont));
			tTable.addCell(new Paragraph(""));
			table.addCell(tTable);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(new Paragraph(
					"For SAPIENT CONSULTING EMPLOYEES PROVIDENT FUND TRUST",
					headingFont));
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_BOTTOM);
			table.addCell(new Paragraph("TRUSTEE", headingFont));

			borderTable.addCell(table);

			docum.add(borderTable);
			System.out.println("PDF BAN GAYA");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is " + e);
		} finally {
			docum.close();
		}
	}
}