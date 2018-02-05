/*
 * Created on 13 Oct, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class FormF {

	public static void main(String[] args) throws IOException,
			FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(
				"d:\\sape\\Form 2\\FormF.pdf"));
		Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
		Font hardfont = FontFactory.getFont(FontFactory.TIMES_BOLD, 18.0f, 2,
				Color.RED);
		Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 15.0f);
		Font headingFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,
				10.0f);
		Font normalFont=FontFactory.getFont(FontFactory.TIMES,10.0f);
		document.open();

		float payTablePart[] = { 50f, 50f };
		float pay1TablePart[] = { 3f, 97f };
		float bpayTablePart[] = { 50f, 10f, 40f };
		float nomineesTablePart[] = { 21f, 33f, 16f, 14f, 16f };
		float stateTablePart[] = { 5f, 45f, 50f };
		float witnessTablePart[] = { 5f, 30f, 45f, 25f };
		float employerTablePart[] = { 40f, 60f };

		System.out.println("KBG");
		PdfPTable borderTable = new PdfPTable(1);
		borderTable.setWidthPercentage(100f);
		borderTable.getDefaultCell().setFixedHeight(750);
		borderTable.getDefaultCell().setBorderWidth(2.0f);
		borderTable.getDefaultCell().setPadding(10.0f);

		PdfPTable mainTable = new PdfPTable(1);
		mainTable.setWidthPercentage(100f);
		mainTable.getDefaultCell().setBorderWidth(0.0f);

		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable.addCell(new Paragraph("FORM ‘F’", hardfont));
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable.addCell(new Paragraph("[See sub-rule (1) of Rule 6]",
				headFont));
		mainTable.addCell(new Paragraph(""));
		mainTable.addCell(new Paragraph(""));
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable.addCell(new Paragraph("Nomination", headFont));
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable.addCell(new Paragraph("To"));

		PdfPTable payTable = new PdfPTable(1);
		payTable.getDefaultCell().setBorderWidth(0.0f);
		payTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		payTable.addCell(new Paragraph("Sapient Corporation Private Limited "));
		payTable.addCell(new Paragraph("Towers D&E, "));
		payTable.addCell(new Paragraph("DLF Cyber Greens, "));
		payTable.addCell(new Paragraph("Sector 25-A, Phase III, Gurgaon, "));
		payTable.addCell(new Paragraph("Haryana"));
		payTable.addCell(new Paragraph("", font1));
		mainTable.addCell(payTable);

		PdfPTable pay1Table = new PdfPTable(pay1TablePart);
		pay1Table.getDefaultCell().setBorderWidth(0.0f);
		pay1Table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED_ALL);
		Chunk empName=new Chunk("Gaurav Kumar Singh");
		empName.setUnderline(1.0f,0.0f);
		String nam="gaurav";
		String str1 = "I, Shri/Shrimati/Kumari "+empName+" ___________________________________ (Write your full Name) whose particulars are given in the statement below, hereby nominate the person(s) mentioned below to receive the gratuity payable after my death as also the gratuity standing to my credit in the event of my death before that amount has become payable, or having become payable has not been paid and direct that the said amount of gratuity shall be paid in proportion indicated against the name(s) of the nominee(s).";
		String str2 = "I hereby certify that the person(s) mentioned is a/are member(s) of my family within meaning of clause (h) of Section(s) of the Payment of Gratuity Act, 1972.";
		String str3 = "I hereby declare that I have no family within the meaning of clause (h) of Section 2 of the said Act.";
		String str4 = "(a) My father/mother/parents is/are not dependent on me.\n(b) My husband’s father/mother/parents is/are not dependent on my husband.";
		String str5 = "I have excluded my husband from my family by a notice dated the _______________to the controlling authority in terms of the proviso to clause (h) of Section 2 of the said Act.";
		String str6 = "Nomination made herein invalidates my previous nomination.";
		/*pay1Table.addCell(new Paragraph("1.", font1));
		pay1Table.addCell(empName);*/
		pay1Table.addCell(new Paragraph("1.", font1));
		pay1Table.addCell(new Paragraph(str1, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("2.", font1));
		pay1Table.addCell(new Paragraph(str2, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("3.", font1));
		pay1Table.addCell(new Paragraph(str3, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("4.", font1));
		pay1Table.addCell(new Paragraph(str4, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("5.", font1));
		pay1Table.addCell(new Paragraph(str5, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("6.", font1));
		pay1Table.addCell(new Paragraph(str6, font1));
		pay1Table.addCell(new Paragraph("", font1));
		pay1Table.addCell(new Paragraph("", font1));
		mainTable.addCell(pay1Table);

		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable.addCell(new Paragraph("NOMINEE(S)", headingFont));

		PdfPTable nomineesTable = new PdfPTable(nomineesTablePart);
		nomineesTable.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		nomineesTable.addCell(new Paragraph("Full Name of the Nominee", font1));
		nomineesTable.addCell(new Paragraph("Full Address of the Nominee",
				font1));
		nomineesTable.addCell(new Paragraph("Relationship with the Employee",
				font1));
		nomineesTable.addCell(new Paragraph("Age of Nominee", font1));
		nomineesTable.addCell(new Paragraph(
				"Proportion by which Gratuity will be shared", font1));
		nomineesTable.getDefaultCell().setFixedHeight(35);
		nomineesTable.addCell(new Paragraph("Gaurav Kumar Singh",normalFont));
		String Address="Sidhari Primari school ki gali, Sidhari,Azamgarh,U.P.";
		nomineesTable.addCell(new Paragraph(Address,normalFont));
		nomineesTable.addCell(new Paragraph("Father",normalFont));
		nomineesTable.addCell(new Paragraph("22/11/1955",normalFont));
		nomineesTable.addCell(new Paragraph("50",normalFont));
		mainTable.addCell(nomineesTable);

		mainTable.addCell(new Paragraph(""));
		borderTable.addCell(mainTable);
		document.add(borderTable);
		//create a new page
		if (document.isOpen()) {
			document.newPage();
		}
		//Document of New Page

		PdfPTable borderTable1 = new PdfPTable(1);
		borderTable1.setWidthPercentage(100f);
		borderTable1.getDefaultCell().setFixedHeight(750);
		borderTable1.getDefaultCell().setBorderWidth(2.0f);
		borderTable1.getDefaultCell().setPadding(10.0f);

		PdfPTable mainTable1 = new PdfPTable(1);
		mainTable1.setWidthPercentage(100f);
		mainTable1.getDefaultCell().setBorderWidth(0.0f);
		mainTable1.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable1.getDefaultCell().setFixedHeight(20);
		mainTable1.addCell(new Paragraph("Statement", headingFont));
		mainTable1.getDefaultCell().setFixedHeight(0);
		mainTable1.addCell(new Paragraph("", font1));

		PdfPTable stateTable = new PdfPTable(stateTablePart);
		stateTable.addCell(new Paragraph("1", font1));
		stateTable.addCell(new Paragraph("Full Name of the Employee", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("2", font1));
		stateTable.addCell(new Paragraph("Gender", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("3", font1));
		stateTable.addCell(new Paragraph("Religion", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("4", font1));
		stateTable.addCell(new Paragraph(
				"Marital Status (single/married/widow/widower)", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("5", font1));
		stateTable.addCell(new Paragraph(
				"Department/Branch/Section where employed", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("6", font1));
		stateTable.addCell(new Paragraph(
				"Post held with Ticket or Serial No., If any", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("7", font1));
		stateTable.addCell(new Paragraph("Date of appointment", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("8", font1));
		stateTable.getDefaultCell().setFixedHeight(40);
		stateTable.addCell(new Paragraph("Permanent address", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.getDefaultCell().setFixedHeight(0);
		stateTable.addCell(new Paragraph("9", font1));
		stateTable.addCell(new Paragraph("Place/Location", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("10", font1));
		stateTable.addCell(new Paragraph("Date", font1));
		stateTable.addCell(new Paragraph(""));
		stateTable.addCell(new Paragraph("11", font1));
		stateTable.addCell(new Paragraph(
				"Signature/Thumb-impression of the employee", font1));
		stateTable.addCell(new Paragraph(""));

		mainTable1.addCell(stateTable);
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.getDefaultCell().setFixedHeight(20);
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable1.addCell(new Paragraph("Declaration by witnesses",
				headingFont));
		mainTable1.getDefaultCell().setFixedHeight(0);
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable1.addCell(new Paragraph(
				"Nomination signed/thumb-impressed before me.", font1));
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable1.addCell(new Paragraph(
				"Name in full and full address of witnesses:", font1));
		mainTable1.addCell(new Paragraph("", font1));

		PdfPTable witnessTable = new PdfPTable(witnessTablePart);
		witnessTable.getDefaultCell().setHorizontalAlignment(
				Element.ALIGN_CENTER);
		witnessTable.addCell(new Paragraph("S.No", font1));
		witnessTable.addCell(new Paragraph("Full Name", font1));
		witnessTable.addCell(new Paragraph("Full Address", font1));
		witnessTable.addCell(new Paragraph("Signature", font1));
		witnessTable.getDefaultCell().setFixedHeight(25);
		witnessTable.addCell(new Paragraph("1"));
		witnessTable.addCell(new Paragraph(""));
		witnessTable.addCell(new Paragraph(""));
		witnessTable.addCell(new Paragraph(""));
		witnessTable.addCell(new Paragraph("2"));
		witnessTable.addCell(new Paragraph(""));
		witnessTable.addCell(new Paragraph(""));
		witnessTable.addCell(new Paragraph(""));
		mainTable1.addCell(witnessTable);
		
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.addCell(new Paragraph("", font1));

		mainTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable1.addCell(new Paragraph("Place_______________", font1));
		mainTable1.addCell(new Paragraph("", font1));
		mainTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable1.addCell(new Paragraph("Date________________", font1));

		borderTable1.addCell(mainTable1);
		document.add(borderTable1);

		if (document.isOpen()) {
			document.newPage();
		}

		PdfPTable borderTable2 = new PdfPTable(1);
		borderTable2.setWidthPercentage(100f);
		borderTable2.getDefaultCell().setFixedHeight(750);
		borderTable2.getDefaultCell().setBorderWidth(2.0f);
		borderTable2.getDefaultCell().setPadding(10.0f);

		PdfPTable mainTable2 = new PdfPTable(1);
		mainTable2.setWidthPercentage(100f);
		mainTable2.getDefaultCell().setBorderWidth(0.0f);

		mainTable2.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable2.addCell(new Paragraph("Certificate by the Employer",
				headingFont));
		mainTable2.addCell(new Paragraph(" "));
		mainTable2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable2
				.addCell(new Paragraph(
						"Certified that the particulars of the above nomination have been verified and recorded in this establishment."));
		mainTable2.addCell(new Paragraph(" "));
		PdfPTable employerTable = new PdfPTable(employerTablePart);

		employerTable.addCell(new Paragraph("Employer’s Reference No. if any",
				font1));
		employerTable.addCell(new Paragraph(""));
		employerTable.addCell(new Paragraph(
				"Signatures of the employee/officer authorized", font1));
		employerTable.addCell(new Paragraph(""));
		employerTable.addCell(new Paragraph("Designation", font1));
		employerTable.addCell(new Paragraph(""));
		employerTable.getDefaultCell().setFixedHeight(40);
		employerTable.addCell(new Paragraph(
				"Name and address of the establishment", font1));
		employerTable.addCell(new Paragraph(""));
		employerTable.addCell(new Paragraph("Rubber Stamp ", font1));
		employerTable.addCell(new Paragraph(""));
		employerTable.getDefaultCell().setFixedHeight(0);
		employerTable.addCell(new Paragraph("Date ", font1));
		employerTable.addCell(new Paragraph(""));
		mainTable2.addCell(employerTable);
		mainTable2.addCell(new Paragraph(" "));
		mainTable2.getDefaultCell()
				.setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable2.addCell(new Paragraph("Acknowledgement by the employee",
				headingFont));
		mainTable2.addCell(new Paragraph(" "));
		mainTable2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable2
				.addCell(new Paragraph(
						"I received the duplicate copy of nomination in Form ‘F’ filed by me and duly certified by the employer.",
						font1));
		mainTable2.addCell(new Paragraph(" "));
		PdfPTable employeeTable = new PdfPTable(employerTablePart);
		employeeTable.addCell(new Paragraph("Date ", font1));
		employeeTable.addCell(new Paragraph(""));
		employeeTable.getDefaultCell().setFixedHeight(30);
		employeeTable.addCell(new Paragraph("Signature ", font1));
		employeeTable.addCell(new Paragraph(""));
		mainTable2.addCell(employeeTable);
		mainTable2.addCell(new Paragraph(" "));
		mainTable2.addCell(new Paragraph(" "));

		mainTable2.addCell(new Paragraph(
				"Note—Strike out the words/paragraph not applicable.", font1));

		borderTable2.addCell(mainTable2);
		document.add(borderTable2);

		document.close();

	}
}