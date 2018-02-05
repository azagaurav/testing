/*
 * Created on 21 Oct, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/*
 * Created on Sep 26, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Test
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class sapienttest1 {

	public static void main(String[] args) throws IOException,
			FileNotFoundException, DocumentException {

		Document document = new Document();
		PdfWriter
				.getInstance(document, new FileOutputStream("d:\\saptest.pdf"));
		Font font1 = FontFactory.getFont(FontFactory.TIMES_BOLD, 5);
		Font font2 = FontFactory.getFont(FontFactory.TIMES_BOLD, 8);
		Font font3 = FontFactory.getFont(FontFactory.TIMES_BOLD, 8);
		Font font4 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);

		Font hardfont = FontFactory.getFont(FontFactory.TIMES_BOLD, 12.0f);
		Font hardfont1 = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f,
				Font.UNDERLINE);
		Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 15.0f);
		Font Fontb = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f);
		Font headingFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,
				10.0f);
		Font normalFont = FontFactory.getFont(FontFactory.TIMES, 9.0f);
		document.open();

		float payTableimg[] = { 30f, 70f };
		float payTablePart[] = { 50f, 50f };
		float pay1TablePart[] = { 3f, 97f };
		float pay5[] = { 14f, 86F };
		float pay6[] = { 75f, 25F };
		float[] tablebreak1 = { 0f, 27f, 46f, 32f, 26f };
		float[] tablebreak2 = { 10f, 50f, 10f, 15f, 15f };
		float[] tablebreak3 = { 0, 24f, 16f, 16f, 16f, 16f, 16f, 17f, 25f, 20f,
				17f, 18f, 17f, 0f };
		float[] tablebreak4 = { 0f, 35f, 17f, 17f, 17f, 25, 25f, 0f, 0f, 0f };
		float[] tablebreak5 = { 0f, 35f, 17f, 17f, 17f, 25, 25f, 0f };

		float pay1[] = { 50F, 50F };
		float pay2[] = { 50F, 50F };

		String Lable12 = "838 ";
		String Lable13 = "8000.00 ";
		String Lable14 = "8000.00 ";
		String Lable15 = " 0";
		String Lable16 = "0";
		String Lable17 = "0 ";
		String Lable18 = "0 ";
		String Lable19 = "0";
		String Lable20 = "0 ";
		String Lable21 = "0 ";
		String Lable22 = "0";

		String Lable23 = "0555555";
		String Lable24 = " 0";
		String Lable25 = "0";
		String Lable26 = "0 ";
		String Lable27 = "0";
		String Lable28 = "0";
		String Lable29 = "0 ";
		String Lable30 = "0";
		String Lable31 = "0.88888";
		String Lable32 = "06666666 ";

		String Lable33 = "0777777";
		String Lable34 = "0";
		String Lable35 = " 0";
		String Lable36 = "0";
		String Lable37 = "0 ";
		String Lable38 = "0";
		String Lable39 = "0";
		String Lable40 = "0 ";
		String Lable41 = "088888888";
		String Lable42 = "0";
		String Lable43 = "838 ";

		String Lable44 = "\n \n \n 333 ";
		String Lable45 = "\n \n \n 3330 ";
		String Lable46 = " \n \n \n 333";
		String Lable47 = "\n \n \n 333";
		String Lable48 = "\n \n \n 4444 ";

		String Lable49 = " 555";
		String Lable50 = "trtr";
		String Lable51 = "tryuiuiii ";
		String Lable52 = "w ";
		String Lable53 = "wer";

		String Lable54 = "0555555";
		String Lable55 = " a";
		String Lable56 = "r";
		String Lable57 = "d ";
		String Lable58 = "f";

		String Lable59 = "tt";
		String Lable60 = "yy";
		String Lable61 = "oop";
		String Lable62 = "osap";
		String Lable63 = "0.88888";

		System.out.println("test1");
		PdfPTable borderTable = new PdfPTable(1);
		//PdfPTable borderTable5 = new PdfPTable(1);
		borderTable.setWidthPercentage(100f);
		borderTable.getDefaultCell().setFixedHeight(750);
		borderTable.getDefaultCell().setBorderWidth(0.0f);
		borderTable.getDefaultCell().setPadding(30.0f);

		// document.add(borderTable);
		PdfPTable mainTable1 = new PdfPTable(1);
		mainTable1.setWidthPercentage(100f);
		mainTable1.getDefaultCell().setBorderWidth(0.0f);

		PdfPTable mainTableimg = new PdfPTable(payTableimg);
		PdfPTable imgTable1 = new PdfPTable(1);
		mainTableimg.getDefaultCell().setBorderWidth(0.0f);

		String lg = "C:/logo/sapelogo.gif";
		Image gif1 = Image.getInstance(lg);
		gif1.setAlignment(Element.ALIGN_RIGHT);
		imgTable1.getDefaultCell().setBorderWidth(0.0f);
		imgTable1.getDefaultCell().setFixedHeight(40);

		imgTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		imgTable1.addCell(gif1);
		mainTableimg.addCell(imgTable1);
		mainTableimg.addCell(new Paragraph(""));

		mainTable1.addCell(mainTableimg);

		PdfPTable mainTable4 = new PdfPTable(1);
		mainTable4.setWidthPercentage(100f);
		mainTable4.getDefaultCell().setBorderWidth(0.0f);
		mainTable4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		mainTable4.addCell(new Paragraph("      Sapient Consulting Pvt Ltd",
				hardfont));
		mainTable4.addCell(new Paragraph("", font1));
		mainTable4.addCell(new Paragraph("", font1));

		mainTable4.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable4.addCell(new Paragraph(
				"Reimbursment Slip as at September 30,2013", font2));

		mainTable1.addCell(mainTable4);

		PdfPTable maintable22 = new PdfPTable(tablebreak1);

		maintable22.getDefaultCell().setBackgroundColor(Color.white);
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.getDefaultCell().disableBorderSide(20);
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph("", font4));
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph(
				"  \n Name \n Designation \n Department \n Location", font4));

		maintable22.getDefaultCell().enableBorderSide(20);
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph(
				"  \n  \n  \n  \n Gurgaon-Infospace-Unit-II", font4));
		maintable22.getDefaultCell().enableBorderSide(20);
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph(
				"  \n Sapient ID \n Payroll ID \n D.O.J. \n Bank A/C No.",
				font4));

		maintable22.getDefaultCell().enableBorderSide(20);
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph("  \n  \n  \n  \n ", font4));
		;

		mainTable1.addCell(maintable22);

		PdfPTable maintable23 = new PdfPTable(tablebreak3);

		maintable23.getDefaultCell().setBackgroundColor(Color.white);
		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable23.getDefaultCell().disableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable23.addCell(new Paragraph("", font1));
		maintable23.getDefaultCell().disableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph("Description", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Bills C/F \n from \n Previous \n Quarter \n (A)", font1));
		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23
				.addCell(new Paragraph(
						"Entitlement \n C/F deom \n Previous \n Quarter \n (B)",
						font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Jul '13\n Entitlement \n (C) \n  \n ", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Aug '13\n Entitlement \n (C) \n  \n ", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Sep '13\n Entitlement \n (C) \n  \n ", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Sep '13\n Entitlement \n (C) \n  \n ", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Total\n Accumulated  \nammount till date\n(F)=(B+C+D+E)\n ",
				font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(" Bills\n Approved  \n (G)\n \n ",
				font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Payment made\n in Oct 13  \n (H)=Least of \n (F)&(G+A) \n ",
				font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Entitlement\n C/F to next Quarter \n (F-H)  \n  \n ", font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable23.addCell(new Paragraph(
				" Bills C/F \n to next \n Quarter \n (G+A-H) ", font1));

		maintable23.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable23.addCell(new Paragraph("", font1));

		maintable23.addCell(new Paragraph(" ", font1));
		maintable23.getDefaultCell().enableBorderSide(20);

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable23.addCell(new Paragraph(
				" Car\n Fuel/Maintenanace \n Reimbursement \n ", font1));
		maintable23.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable23.addCell(new Paragraph(Lable12, font1));
		maintable23.addCell(new Paragraph(Lable13, font1));
		maintable23.addCell(new Paragraph(Lable14, font1));
		maintable23.addCell(new Paragraph(Lable15, font1));
		maintable23.addCell(new Paragraph(Lable16, font1));
		maintable23.addCell(new Paragraph(Lable17, font1));
		maintable23.addCell(new Paragraph(Lable18, font1));
		maintable23.addCell(new Paragraph(Lable19, font1));
		maintable23.addCell(new Paragraph(Lable20, font1));
		maintable23.addCell(new Paragraph(Lable21, font1));
		maintable23.addCell(new Paragraph(Lable22, font1));

		maintable23.addCell(new Paragraph("", font1));

		maintable23.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);

		maintable23.addCell(new Paragraph(" ", font1));
		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable23.addCell(new Paragraph("  Driver Salary \n Reimbursement  ",
				font1));

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		maintable23.addCell(new Paragraph(Lable23, font1));
		maintable23.addCell(new Paragraph(Lable24, font1));
		maintable23.addCell(new Paragraph(Lable25, font1));
		maintable23.addCell(new Paragraph(Lable26, font1));
		maintable23.addCell(new Paragraph(Lable27, font1));
		maintable23.addCell(new Paragraph(Lable28, font1));
		maintable23.addCell(new Paragraph(Lable29, font1));
		maintable23.addCell(new Paragraph(Lable30, font1));
		maintable23.addCell(new Paragraph(Lable31, font1));
		maintable23.addCell(new Paragraph(Lable31, font1));
		maintable23.addCell(new Paragraph(Lable32, font1));
		maintable23.addCell(new Paragraph("blank", font1));

		maintable23.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable23.addCell(new Paragraph("", font1));

		maintable23.addCell(new Paragraph(" ", font1));
		maintable23.getDefaultCell().enableBorderSide(20);

		maintable23.getDefaultCell().enableBorderSide(20);
		maintable23.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable23.addCell(new Paragraph("  ", font1));
		maintable23.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		//  ((Rectangle) maintable23).setBorder(Rectangle.NO_BORDER);

		// Range(Cells(Lable13, Lable13), Cells(Lable13, Lable13)).Name =
		// "myRange"

		mainTable1.addCell(maintable23);

		PdfPTable maintable32 = new PdfPTable(tablebreak3);

		maintable32.getDefaultCell().setBackgroundColor(Color.white);
		maintable32.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable32.getDefaultCell().disableBorderSide(20);
		maintable32.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable32.addCell(new Paragraph("", font1));
		maintable32.getDefaultCell().disableBorderSide(20);
		maintable32.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable32.addCell(new Paragraph("Total", font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable33, font1));
		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable34, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable35, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable36, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable37, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable38, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable39, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable40, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable41, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable42, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph(Lable43, font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable32.addCell(new Paragraph("Blank"));

		maintable32.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);

		maintable32.addCell(new Paragraph(" ", font1));
		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable32.addCell(new Paragraph("   ", font1));

		maintable32.getDefaultCell().enableBorderSide(20);
		maintable32.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		//  ((Rectangle) maintable32).setBorder(Rectangle.NO_BORDER);

		// Range(Cells(Lable13, Lable13), Cells(Lable13, Lable13)).Name =
		// "myRange"

		mainTable1.addCell(maintable32);

		//  ((Rectangle) maintable31).setBorder(Rectangle.NO_BORDER);

		// Range(Cells(Lable13, Lable13), Cells(Lable13, Lable13)).Name =
		// "myRange"

		PdfPTable mainTable7 = new PdfPTable(1);
		mainTable7.setWidthPercentage(100f);
		mainTable7.getDefaultCell().setBorderWidth(0.0f);
		mainTable7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		mainTable7.addCell(new Paragraph(" ", hardfont));
		mainTable7.addCell(new Paragraph("", font1));
		mainTable7.addCell(new Paragraph("", font1));
		mainTable7.addCell(new Paragraph("", font1));
		mainTable7.addCell(new Paragraph("", font1));

		mainTable1.addCell(mainTable7);

		PdfPTable maintable41 = new PdfPTable(tablebreak5);

		maintable41.getDefaultCell().setBackgroundColor(Color.white);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41.getDefaultCell().disableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41.addCell(new Paragraph("", font1));
		maintable41.getDefaultCell().disableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41.addCell(new Paragraph("Description", font1));

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph("Entitlement \nfor the year \n(1)",
				font1));
		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph("Bill approved \n \n(B))", font1));

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph(
				"Payment made \n till Aug 2013 \n (C) ", font1));

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph(
				"Payment made \n in Oct, 2013 \n(D)=least of(A)&(B)-(C) ",
				font1));

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph(
				"Entitlement C/F \n for next submission  \n(E)=(A)-(C)-(D) ",
				font1));

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable41.addCell(new Paragraph(" blank ", font1));

		maintable41.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable41.addCell(new Paragraph("  ", font1));
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41
				.addCell(new Paragraph("\n \n \n Medical (Example1) ", font1));
		maintable41.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable41.addCell(new Paragraph(Lable44, font1));
		maintable41.addCell(new Paragraph(Lable45, font1));

		maintable41.addCell(new Paragraph(Lable46, font1));
		maintable41.addCell(new Paragraph(Lable47, font1));

		maintable41.addCell(new Paragraph(Lable48, font1));
		maintable41.addCell(new Paragraph("blank", font1));

		maintable41.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41.addCell(new Paragraph("blank", font1));
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable41.addCell(new Paragraph(" Medical (Example2)", font1));
		maintable41.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable41.addCell(new Paragraph(Lable49, font1));
		maintable41.addCell(new Paragraph(Lable50, font1));
		maintable41.addCell(new Paragraph(Lable51, font1));

		maintable41.addCell(new Paragraph(Lable52, font1));
		maintable41.addCell(new Paragraph(Lable53, font1));

		maintable41.addCell(new Paragraph("blank", font1));

		maintable41.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable41.addCell(new Paragraph("  ", font1));
		maintable41.addCell(new Paragraph(" Medical (Example3) \n ", font1));
		maintable41.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable41.addCell(new Paragraph(Lable54, font1));
		maintable41.addCell(new Paragraph(Lable55, font1));

		maintable41.addCell(new Paragraph(Lable56, font1));
		maintable41.addCell(new Paragraph(Lable57, font1));

		maintable41.addCell(new Paragraph(Lable58, font1));
		maintable41.addCell(new Paragraph("blank", font1));

		maintable41.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable41.getDefaultCell().enableBorderSide(20);
		maintable41.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable41.addCell(new Paragraph(" \n ", font1));
		maintable41.addCell(new Paragraph(" ", font1));
		maintable41.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		//  ((Rectangle) maintable41).setBorder(Rectangle.NO_BORDER);

		// Range(Cells(Lable13, Lable13), Cells(Lable13, Lable13)).Name =
		// "myRange"

		mainTable1.addCell(maintable41);

		PdfPTable maintable42 = new PdfPTable(tablebreak5);

		maintable42.getDefaultCell().setBackgroundColor(Color.white);
		maintable42.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable42.getDefaultCell().disableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable42.addCell(new Paragraph("", font1));
		maintable42.getDefaultCell().disableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable42.addCell(new Paragraph("Total (INR)(considered example 1 ",
				font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);
		maintable42.addCell(new Paragraph(Lable59, font1));
		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph(Lable60, font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph(Lable61, font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph(Lable62, font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph(Lable63, font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph("Blank ", font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		maintable42.addCell(new Paragraph(" B\n ", font1));

		maintable42.getDefaultCell().setBorder(Rectangle.NO_BORDER);

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);

		maintable42.addCell(new Paragraph(" ", font1));
		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable42.addCell(new Paragraph("   ", font1));

		maintable42.getDefaultCell().enableBorderSide(20);
		maintable42.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_RIGHT);

		//  ((Rectangle) maintable42).setBorder(Rectangle.NO_BORDER);

		// Range(Cells(Lable13, Lable13), Cells(Lable13, Lable13)).Name =
		// "myRange"

		mainTable1.addCell(maintable42);

		PdfPTable maintable8 = new PdfPTable(1);
		maintable8.setWidthPercentage(100f);
		maintable8.getDefaultCell().setBorderWidth(0.0f);
		maintable8.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

		maintable8.addCell(new Paragraph(" ", hardfont));
		maintable8.addCell(new Paragraph("", font1));
		maintable8.addCell(new Paragraph("", font1));
		maintable8.addCell(new Paragraph("", font1));
		maintable8.addCell(new Paragraph("", font1));

		mainTable1.addCell(maintable8);

		borderTable.addCell(mainTable1);
		document.add(borderTable);
		document.close();

	}
}