/*
 * Created on 16 Mar, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;


import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class SettlementW {
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
			float fTableP[] = { 3f, 30f, 67f };
			float secondTableP[] = { 3f, 30f, 21f, 3f, 22f, 21f };
			float thirdTableP[] = { 3f, 30f, 67f };
			float sTableP[] = { 3f, 43f, 27f, 27f };
			float forTableP[] = {20f,10f,10f,10f,10f,10f,10f,10f,10f};
			float tTableP[] = { 3f, 47f, 50f };
			//float extableP[]={20f,10f,10f,10f,10f,10f,10f,10f,10f};
			

			docum = new Document(PageSize.A4, 40, 40, 40, 40);
			PdfWriter.getInstance(docum, new FileOutputStream(
					"D:\\SettlementW.pdf"));
			docum.open();

			PdfPTable borderTable = new PdfPTable(1);
			borderTable.setWidthPercentage(100f);
			borderTable.getDefaultCell().setFixedHeight(750);
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
			table.addCell(fTable);
			PdfPTable secondTable = new PdfPTable(secondTableP);
			secondTable.getDefaultCell().setBorderWidth(0.0f);
			secondTable.addCell(new Paragraph("6", normalFont));
			secondTable.addCell(new Paragraph(
					"Date of Joining in Factory/Establishment", normalFont));

			secondTable.addCell(new Paragraph("14-06-2010", headingFont));
			secondTable.addCell(new Paragraph("7", normalFont));
			secondTable.addCell(new Paragraph("Date of Membership  in PF ",
					normalFont));
			secondTable.addCell(new Paragraph("14-06-2010", headingFont));
			secondTable.addCell(new Paragraph("8", normalFont));
			secondTable.addCell(new Paragraph("Date of Membership  in FPF ",
					normalFont));
			secondTable.addCell(new Paragraph("14-06-2010", headingFont));
			secondTable.addCell(new Paragraph("9", normalFont));
			secondTable.addCell(new Paragraph("Date of Leaving :", normalFont));
			secondTable.addCell(new Paragraph("12-08-2011", headingFont));
			secondTable.addCell(new Paragraph("10", normalFont));
			secondTable.addCell(new Paragraph("Total services Period",
					normalFont));
			secondTable.addCell(new Paragraph("4.4 years", headingFont));
			secondTable.addCell(new Paragraph("11", normalFont));
			secondTable.addCell(new Paragraph("PAN No.", normalFont));
			secondTable.addCell(new Paragraph("AYFPP0293B", headingFont));

			secondTable.addCell(new Paragraph("12", normalFont));
			secondTable.addCell(new Paragraph("P.F. Account No.", normalFont));
			secondTable.addCell(new Paragraph("HR/GGN/30659/278", headingFont));
			secondTable.addCell(new Paragraph("13", normalFont));
			secondTable.addCell(new Paragraph("FPF Account No.", normalFont));
			secondTable.addCell(new Paragraph("HR/GGN/30659/278", headingFont));
			table.addCell(secondTable);

			PdfPTable thirdTable = new PdfPTable(thirdTableP);
			thirdTable.getDefaultCell().setBorderWidth(0.0f);
			thirdTable.addCell(new Paragraph("14", normalFont));
			thirdTable.addCell(new Paragraph("Name & Address", normalFont));
			thirdTable.addCell(new Paragraph("PIROJSHAH NAGAR, L.B.S. MARG",
					headingFont));
			thirdTable.addCell(new Paragraph("15", normalFont));
			thirdTable.addCell(new Paragraph("Name & Address of Bank",
					normalFont));
			thirdTable
					.addCell(new Paragraph("MH/BAN/45665/138867", headingFont));
			thirdTable.addCell(new Paragraph("16", normalFont));
			thirdTable.addCell(new Paragraph("Bank Account No.", normalFont));
			thirdTable.addCell(new Paragraph("4039001500010665", headingFont));
			thirdTable.addCell(new Paragraph("17", normalFont));
			thirdTable.addCell(new Paragraph("NEFT/RTGS Details", normalFont));
			thirdTable.addCell(new Paragraph(
					"NEFT/RTGS Details : ICICI0000383", headingFont));
			thirdTable.addCell(new Paragraph("18", normalFont));
			thirdTable.addCell(new Paragraph("Mobile No.", normalFont));
			thirdTable.addCell(new Paragraph("8010009037", headingFont));
			table.addCell(thirdTable);
			PdfPTable sTable = new PdfPTable(sTableP);
			sTable.addCell(new Paragraph(""));
			sTable.addCell(new Paragraph(""));
			sTable.addCell(new Paragraph("a) Employees' Share ", headingFont));
			sTable.addCell(new Paragraph("b) Employeers' Share ", headingFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
			sTable.addCell(new Paragraph("14", normalFont));
			sTable.addCell(new Paragraph("Opening Balance as on 01-04-2011",
					normalFont));
			sTable.addCell(new Paragraph("3865", normalFont));
			sTable.addCell(new Paragraph("11", normalFont));
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
			sTable.addCell(new Paragraph("Gross Total", headingFont));
			sTable.addCell(new Paragraph("10828", normalFont));
			sTable.addCell(new Paragraph("6093", normalFont));
			sTable.addCell(new Paragraph("", headingFont));
			table.addCell(sTable);
			table.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			table.addCell(new Paragraph("Total (a+b)", headingFont));
			table.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			table.addCell(new Paragraph("16921", headingFont));
			
			PdfPTable forTable = new PdfPTable(forTableP);
			forTable.getDefaultCell().setBorderWidth(1.0f);
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("Gaurav", headingFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			forTable.addCell(new Paragraph("16921", headingFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			
			
			forTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("Taxable Income", headingFont));
			forTable.addCell(new Paragraph("103082", headingFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));

			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("Rate of Tax", headingFont));
			forTable.addCell(new Paragraph("Tax", headingFont));
			forTable.addCell(new Paragraph("Education Cess", normalFont));
			forTable.addCell(new Paragraph("Sec Edu. Cess", normalFont));
			forTable.addCell(new Paragraph("Total Tax", headingFont));
			forTable.addCell(new Paragraph(""));

			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("10%", normalFont));
			forTable.addCell(new Paragraph("10308", normalFont));
			forTable.addCell(new Paragraph("206", normalFont));
			forTable.addCell(new Paragraph("103", normalFont));
			forTable.addCell(new Paragraph("10617", normalFont));
			forTable.addCell(new Paragraph(""));

			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("Rebate U/S 88/80C withdrawan",
					normalFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("16731", normalFont));
			forTable.addCell(new Paragraph(""));

			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("Total Tax Deducted", headingFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph("27348", normalFont));
			forTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			forTable.addCell(new Paragraph("27348", headingFont));
			forTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			forTable.addCell(new Paragraph(""));
			forTable
					.addCell(new Paragraph(
							"Net Amount Payable and paid to the subscriber",
							normalFont));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.addCell(new Paragraph(""));
			forTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			forTable.addCell(new Paragraph("159071", headingFont));
			//table.addCell(forTable);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table
					.addCell(new Paragraph(
							"Amount in Words : Rupees Ninteen Thousand Eight Hundred Eighty Nine  Only",
							headingFont));
			table
					.addCell(new Paragraph(
							"Amount Transferred in favour of Through NEFT/RTGS in Bank Account",
							headingFont));

			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(new Paragraph(
					"For SAPIENT CONSULTING EMPLOYEES PROVIDENT FUND TRUST",
					headingFont));
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_BOTTOM);
			table.addCell(new Paragraph("TRUSTEE", headingFont));

			borderTable.addCell(table);

			docum.add(borderTable);
			if (docum.isOpen()) {
				docum.newPage();
			}
			float firTableP[] = { 20f, 25f, 15f, 15f, 15f, 10f };
			PdfPTable borderTable1 = new PdfPTable(1);
			borderTable1.setWidthPercentage(100f);
			borderTable1.getDefaultCell().setFixedHeight(750);
			borderTable1.getDefaultCell().setBorderWidth(2.0f);
			borderTable1.getDefaultCell().setPadding(3);

			PdfPTable table1 = new PdfPTable(1);
			table1.getDefaultCell().setBorderWidth(0.0f);
			table1.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			table1
					.addCell(new Paragraph(
							"Statement showing amount of Tax deducted under Section 192(4)",
							headingFont));
			table1.addCell(new Paragraph("Accounting year 2011-2012",
					headingFont));

			PdfPTable firTable = new PdfPTable(firTableP);
			firTable.getDefaultCell().setBorderWidth(0.0f);
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			firTable.addCell(new Paragraph("TAX", headingFont));
			firTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			firTable.addCell(new Paragraph("Name", headingFont));
			firTable.addCell(new Paragraph("Shiwani Parida", headingFont));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));

			firTable.addCell(new Paragraph("Account No.", headingFont));
			firTable.addCell(new Paragraph("HR/GGN/30659/278", headingFont));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));

			firTable.addCell(new Paragraph("Year", headingFont));
			firTable
					.addCell(new Paragraph("Employers Contribution", normalFont));
			firTable.addCell(new Paragraph("Employers Intt", normalFont));
			firTable.addCell(new Paragraph("Employee's Intt", normalFont));
			firTable.addCell(new Paragraph("Total Income", normalFont));
			firTable.addCell(new Paragraph(""));

			firTable
					.addCell(new Paragraph("Total Taxable Income", normalFont));
			firTable.addCell(new Paragraph("", headingFont));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph(""));
			firTable.addCell(new Paragraph("103082", normalFont));
			firTable.addCell(new Paragraph(""));
			table1.addCell(firTable);
			
			
			float secTablaeP[]={80f,20f};
			
			PdfPTable secTable=new PdfPTable(secTablaeP);
			secTable.getDefaultCell().setBorderWidth(0.0f);
			secTable.addCell(new Paragraph(""));
			secTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			secTable.addCell(new Paragraph("103082", normalFont));
			secTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			secTable.addCell(new Paragraph(
					"TOTAL INCOME TO BE ADDED TO THE CURRENT YEAR'S INCOME", headingFont));
			secTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			secTable.addCell(new Paragraph("103082", normalFont));
			table1.addCell(secTable);
			
			float thiTableP[]={20f, 20f, 20f, 15f, 15f, 10f};
			PdfPTable thiTable=new PdfPTable(thiTableP);
			thiTable.getDefaultCell().setBorderWidth(0.0f);
			thiTable.addCell(new Paragraph("Rate of Tax", headingFont));
			thiTable.addCell(new Paragraph("Tax", headingFont));
			thiTable.addCell(new Paragraph("Education Cess", headingFont));
			thiTable.addCell(new Paragraph("Sec. Edu. Cess", headingFont));
			thiTable.addCell(new Paragraph("Total Tax", headingFont));
			thiTable.addCell(new Paragraph(""));
			
			thiTable.addCell(new Paragraph("10%", headingFont));
			thiTable.addCell(new Paragraph("10308", normalFont));
			thiTable.addCell(new Paragraph("206", normalFont));
			thiTable.addCell(new Paragraph("103", normalFont));
			thiTable.addCell(new Paragraph("10617", normalFont));
			thiTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			thiTable.addCell(new Paragraph("10617", normalFont));
			table1.addCell(thiTable);
			
			float fortTableP[]={30f, 15f, 15f, 15f, 15f, 10f};
			PdfPTable fortTable=new PdfPTable(fortTableP);
			fortTable.getDefaultCell().setBorderWidth(0.0f);
			fortTable.addCell(new Paragraph("CONTRIBUTION MADE BY EMPLOYEES [REBATE U/S-88/80C BE WITHDRAWN]" ,headingFont));
			fortTable.addCell(new Paragraph(""));
			fortTable.addCell(new Paragraph(""));
			fortTable.addCell(new Paragraph(""));
			fortTable.addCell(new Paragraph(""));
			fortTable.addCell(new Paragraph(""));
			
			fortTable.addCell(new Paragraph("2003-2004"));
			fortTable.addCell(new Paragraph("TDS@"));
			fortTable.addCell(new Paragraph("0.0%"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph(""));
			
			fortTable.addCell(new Paragraph("2004-2005"));
			fortTable.addCell(new Paragraph("TDS@"));
			fortTable.addCell(new Paragraph("0.0%"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph(""));
			
			fortTable.addCell(new Paragraph("2004-2005"));
			fortTable.addCell(new Paragraph("TDS@"));
			fortTable.addCell(new Paragraph("0.0%"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph("-"));
			fortTable.addCell(new Paragraph(""));
			
			table1.addCell(fortTable);
			table1.addCell(new Paragraph("T.D.S. CERTIFICATE TO BE ISSUED IN DUE COURSE" ,headingFont));
			borderTable1.addCell(table1);
			docum.add(borderTable1);
			System.out.println("PDF BAN GAYA");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is " + e);
		} finally {
			docum.close();
		}

	}
}