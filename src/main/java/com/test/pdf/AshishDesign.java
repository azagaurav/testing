/*
 * Created on Aug 7, 2013
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
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class AshishDesign {
	public static void main(String[] arg) {

		System.out.println("PDF ");
		// TODO Auto-generated method stub
		Document docum = null;
		try {
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16,
					Font.BOLD);
			Font font3 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11);
			Font font4 = FontFactory.getFont(FontFactory.TIMES_BOLD, 11,
					Font.UNDERLINE);
			Font fonthd = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9,
					Font.BOLD);
			Font fonthd1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9,
					Font.BOLD);

			//docum = new Document(PageSize.A4, 30, 20, 20, 20);
			docum = new Document();
			PdfWriter.getInstance(docum, new FileOutputStream("D:\\claim.pdf"));
			docum.open();
			float pdfHeadd[] = { 50f, 50f };
			float appliTable[] = { 40f, 60f };
			float appliTable1[] = { 50f, 50f };

			PdfPTable borderTable = new PdfPTable(1);
			borderTable.setWidthPercentage(100f);
			borderTable.getDefaultCell().setBorderWidth(0.0f);
			borderTable.getDefaultCell().setPadding(3);

			PdfPTable pdfHead = new PdfPTable(pdfHeadd);
			pdfHead.getDefaultCell().setBorderWidth(0.0f);
			pdfHead.setWidthPercentage(100f);
			pdfHead.addCell(new Paragraph("TRANSFER CLAIM FORM", font4));
			pdfHead.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_RIGHT);
			pdfHead.addCell(new Paragraph("CLAIM ID_________________________",
					font1));
			pdfHead.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			pdfHead.addCell(new Paragraph("     Form 13 (REVISED)", font1));
			pdfHead.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_RIGHT);
			pdfHead.addCell(new Paragraph("(For EPFO Use Only)      ", font1));
			borderTable.addCell(pdfHead);

			PdfPTable declrTable = new PdfPTable(appliTable);
			declrTable.getDefaultCell().setBorderWidth(0.0f);
			declrTable.getDefaultCell().setFixedHeight(35);
			declrTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable.setWidthPercentage(100f);
			PdfPTable imgTable = new PdfPTable(1);
			String lg = "C:/logo/form2.gif";
			Image gif = Image.getInstance(lg);
			imgTable.getDefaultCell().setBorderWidth(0.0f);
			gif.setAlignment(Element.ALIGN_RIGHT);
			imgTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			imgTable.addCell(gif);
			declrTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			declrTable.addCell(imgTable);
			declrTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			declrTable
					.addCell(new Paragraph(
							"EMPLOYEES PROVIDENT FUND SCHEME, 1952\n                            (PARA 57)",
							font1));

			borderTable.addCell(declrTable);
			//THIRD TABLE

			PdfPTable toTable = new PdfPTable(appliTable1);
			toTable.setWidthPercentage(100f);
			toTable.getDefaultCell().setBorderWidth(0.0f);
			toTable.addCell(new Paragraph("To,", font1));
			toTable.addCell(new Paragraph("To,", font1));
			toTable.addCell(new Paragraph("The Regional P F Commissioner,",
					font1));
			toTable
					.addCell(new Paragraph(
							"Trust Name:_______________________________________",
							font1));
			toTable.addCell(new Paragraph(
					"Office Name:_________________________________", font1));
			toTable.addCell(new Paragraph(
					"Trust Address:_____________________________________",
					font1));
			toTable.addCell(new Paragraph(
					"Office Address:_______________________________", font1));
			toTable
					.addCell(new Paragraph(
							"_________________________________________________",
							font1));
			toTable.addCell(new Paragraph(
					"____________________________________________", font1));
			toTable
					.addCell(new Paragraph(
							"_________________________________________________",
							font1));

			toTable.addCell(new Paragraph("(Please see instruction 3)", font1));
			toTable
					.addCell(new Paragraph(
							"(in case thePF A/C is with Exampted Establishment)",
							font1));
			toTable.addCell(new Paragraph("", font1));
			toTable.addCell(new Paragraph("", font1));
			borderTable.addCell(toTable);

			PdfPTable declrTable1 = new PdfPTable(1);
			declrTable1.getDefaultCell().setBorderWidth(0.0f);

			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable1.setWidthPercentage(100f);
			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_JUSTIFIED);
			declrTable1
					.addCell(new Paragraph(
							"Sir,\n         I request that my provident fund balance along with my pension service details may please be transferred to my present account under intimation to me. My details are as under:",
							font1));
			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable1.addCell(new Paragraph("", font1));
			declrTable1.addCell(new Paragraph("", font1));
			declrTable1.addCell(new Paragraph("PART A: PERSONAL INFORMATION",
					fonthd));
			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			declrTable1
					.addCell(new Paragraph(
							"1. *Name:_____________________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"2. *Father/Husband Name:________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"3. Mobile Number:___________________________   4.E-mail Id:________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"5. Bank A/C Number:_________________________   6.IFS code of Bank branch:___________________________________",
							font1));
			declrTable1.addCell(new Paragraph("", font1));
			declrTable1.addCell(new Paragraph("", font1));

			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable1
					.addCell(new Paragraph(
							"PART B: DETAILS OF PREVIOUS ACCOUNT(WHICH IS TO BE TRANSFERED)",
							fonthd));
			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			declrTable1
					.addCell(new Paragraph(
							"1. *Name:_____________________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"2. *Father/Husband Name:________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"3. Mobile Number:___________________________   4.E-mail Id:________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"5. Bank A/C Number:_________________________   6.IFS code of Bank branch:___________________________________",
							font1));
			declrTable1.addCell(new Paragraph("", font1));
			declrTable1.addCell(new Paragraph("", font1));

			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable1.addCell(new Paragraph(
					"PART C: DETAILS OF PRESENT ACCOUNT", fonthd));
			declrTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			declrTable1
					.addCell(new Paragraph(
							"1. *Name:_____________________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"2. *Father/Husband Name:________________________________________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"3. Mobile Number:___________________________   4.E-mail Id:________________________________________________",
							font1));
			declrTable1
					.addCell(new Paragraph(
							"5. Bank A/C Number:_________________________   6.IFS code of Bank branch:___________________________________",
							font1));
			declrTable1.addCell(new Paragraph("", font1));
			declrTable1.addCell(new Paragraph("", font1));
			borderTable.addCell(declrTable1);

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