/*
 * Created on 21 Oct, 2011
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
public class Form2 {
	public void gaurav() {

	}

public static void main(String[] args) {
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

			docum = new Document(PageSize.A4, 20, 20, 20, 20);
			//String[] emp = empid.split("-");
			//System.out.println("d:\\" + emp[0] + "\\Form 2\\" + empid +
			// ".pdf");
			PdfWriter.getInstance(docum, new FileOutputStream(
					"D:\\sape\\Nomination\\Form2.pdf"));
			docum.open();

			float formhd[] = { 25f, 25f, 25f, 25f };
			System.out.println("KBG");
			float pdfHeadd[] = { 35f, 30f, 35f };
			float empHeadd[] = { 5f, 30f, 3f, 62f };
			float adeclTable[] = { 40f, 10f, 12f, 12f, 21f };
			float certiTable[] = { 5f, 95f };
			float partBTable[] = { 5f, 50f, 15f, 30f };
			float partB1Table[] = { 50f, 15f, 45f };
			float appliTable[] = { 40f, 60f };
			float innerTable[] = { 0.04f, 0.01f, 0.05f, 0.04f };

			PdfPTable borderTable1 = new PdfPTable(1);
			borderTable1.setWidthPercentage(100f);
			borderTable1.getDefaultCell().setFixedHeight(800);
			borderTable1.getDefaultCell().setBorderWidth(1.0f);
			borderTable1.getDefaultCell().setPadding(3);

			PdfPTable pdfuHead = new PdfPTable(1);
			pdfuHead.setWidthPercentage(100f);
			pdfuHead.getDefaultCell().setBorderWidth(1.0f);
			pdfuHead.getDefaultCell().setPadding(7);
			pdfuHead.getDefaultCell().disableBorderSide(Rectangle.BOTTOM);
			pdfuHead.getDefaultCell().enableBorderSide(Rectangle.TOP);
			pdfuHead.getDefaultCell().enableBorderSide(Rectangle.LEFT);
			pdfuHead.getDefaultCell().enableBorderSide(Rectangle.RIGHT);

			PdfPTable pdfHead = new PdfPTable(pdfHeadd);
			pdfHead.getDefaultCell().setBorderWidth(0.0f);
			pdfHead.getDefaultCell().setFixedHeight(35);
			pdfHead.setWidthPercentage(100f);

			PdfPTable imgTable = new PdfPTable(1);
			String lg = "C:/logo/sapelogonew.gif";
			Image gif = Image.getInstance(lg);
			gif.setAlignment(Element.ALIGN_MIDDLE);
			imgTable.getDefaultCell().setBorder(0);
			imgTable.addCell(gif);
			pdfHead.addCell(imgTable);

			Font myContentStyle = new Font();
			PdfPTable table_hd = new PdfPTable(1);
			table_hd.setWidthPercentage(100f);
			table_hd.getDefaultCell().setPadding(3);
			table_hd.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			table_hd.addCell(new Paragraph("Form 2 ( Revised )", font2));
			pdfHead.addCell(table_hd);

			PdfPTable empTable = new PdfPTable(1);
			pdfHead.getDefaultCell().setBorderWidth(1.5f);
			empTable.setWidthPercentage(100f);
			empTable.getDefaultCell().setPadding(3);
			empTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			empTable.addCell(new Paragraph("Employee Id :  ", font1));
			pdfHead.addCell(empTable);
			pdfHead.getDefaultCell().borderWidth();

			PdfPTable declrTable = new PdfPTable(1);
			declrTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			declrTable.getDefaultCell().setBorder(0);
			declrTable.setWidthPercentage(100f);
			declrTable.addCell(new Paragraph(
					"(For Unexempted/Exempted Establishments)", font1));
			declrTable.addCell(new Paragraph("NOMINATION AND DECLARATION FORM",
					fonthd));
			declrTable
					.addCell(new Paragraph(
							"(Declaration and Nomination Form under the Employees’ Provident Funds and Employees’ Pension Scheme)",
							font1));
			declrTable
					.addCell(new Paragraph(
							"(Paragraphs 33 & 61 (1) of the Employees’ Provident Funds Scheme, 1952 and paragraph 18 of the Employees’ Pension Scheme, 1995)",
							fonthd));

			myContentStyle.setStyle("line-through");
			myContentStyle.setStyle("bold");
			myContentStyle.setFamily("TIMES_ROMAN");
			myContentStyle.setSize(9);
			PdfPTable pesoInfo = new PdfPTable(empHeadd);
			pesoInfo.getDefaultCell().setBorder(0);
			pesoInfo.setWidthPercentage(100f);

			pesoInfo.addCell(new Paragraph("1", fonthd));
			pesoInfo.addCell(new Paragraph("Name (in Block Letters)", fonthd));
			pesoInfo.addCell(new Paragraph(": ", fonthd));
			//String name = r2f.getName().trim();
			//System.out.println("value of name " + name);
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("2", fonthd));

			PdfPTable innerTable1 = new PdfPTable(innerTable);

			innerTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			innerTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_TOP);
			innerTable1.getDefaultCell().setBorder(0);

			//innerTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			innerTable1.addCell(new Paragraph("Father’s", fonthd));
			innerTable1.addCell(new Paragraph("/", fonthd));
			innerTable1.addCell(new Paragraph("Husband’s", myContentStyle));
			innerTable1.addCell(new Paragraph("Name	", fonthd));
			pesoInfo.addCell(innerTable1);

			pesoInfo.addCell(new Paragraph(": ", fonthd));
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("3", fonthd));
			pesoInfo.addCell(new Paragraph("Date of birth", fonthd));
			pesoInfo.addCell(new Paragraph(": ", fonthd));
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("4", fonthd));
			pesoInfo.addCell(new Paragraph("Sex", fonthd));
			pesoInfo.addCell(new Paragraph(": ", fonthd));
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("5", fonthd));
			pesoInfo.addCell(new Paragraph("Marital Status", fonthd));
			pesoInfo.addCell(new Paragraph(": ", fonthd));
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("6", fonthd));
			pesoInfo.addCell(new Paragraph("PF Account No. (PF/EPS  Number)	",
					fonthd));
			pesoInfo.addCell(new Paragraph(": ", fonthd));
			pesoInfo.addCell(new Paragraph(" ", font1));
			pesoInfo.addCell(new Paragraph("7", fonthd));
			pesoInfo.addCell(new Paragraph("Address (Residential)", fonthd));
			pesoInfo.addCell(new Paragraph(":", fonthd));
			pesoInfo.addCell(new Paragraph(" PERMANENT :-", font1));
			pesoInfo.addCell(new Paragraph("", fonthd));
			pesoInfo.addCell(new Paragraph("", fonthd));
			pesoInfo.addCell(new Paragraph("", fonthd));
			pesoInfo.addCell(new Paragraph("TEMPORARY :- ", font1));

			PdfPTable partaTable = new PdfPTable(1);
			partaTable.getDefaultCell().setBorder(0);
			partaTable.setWidthPercentage(100f);
			partaTable.addCell(new Paragraph("", fonthd));
			partaTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			partaTable.addCell(new Paragraph("PART A (EPF) #", fonthd));

			PdfPTable partadeclTable1 = new PdfPTable(1);
			partadeclTable1.getDefaultCell().setBorder(0);
			partadeclTable1.setWidthPercentage(100f);
			partadeclTable1.setHorizontalAlignment(Element.ALIGN_LEFT);
			partadeclTable1
					.addCell(new Paragraph(
							"I hereby nominate the person(s)/cancel the nomination made by me previously and nominate, the person(s) mentioned below to receive the amount standing to my credit in the Employees’ Provident Fund, in the event of my death:",
							font1));

			PdfPTable partadeclTable = new PdfPTable(adeclTable);
			partadeclTable.setWidthPercentage(100f);
			partadeclTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);

			partadeclTable.addCell(new Paragraph(
					" Name and Address of the nominee/ nominees", font1));
			partadeclTable.addCell(new Paragraph(
					"Nominee’s relationship with the member", font1));
			partadeclTable.addCell(new Paragraph(" Date of Birth", font1));
			partadeclTable
					.addCell(new Paragraph(
							"Total amount or share of accumulations in Provident Fund to be paid to each nominee (%)",
							font1));
			partadeclTable
					.addCell(new Paragraph(
							"If the nominee is a minor, name and relationship and address of the guardian who may receive the amount during the minority of nominee",
							font1));

			partadeclTable.addCell(new Paragraph("(1)", font1));
			partadeclTable.addCell(new Paragraph("(2)", font1));
			partadeclTable.addCell(new Paragraph("(3)", font1));
			partadeclTable.addCell(new Paragraph("(4)", font1));
			partadeclTable.addCell(new Paragraph("(5)", font1));
			System.out.println("Going to Nominee");
			//int length = r2f.getNominee().length;
			//System.out.println("length of get nominee array " + length);
			//String nomi[] = r2f.getNominee();
			
			/*
			 * String relnomi[] = r2f.getRelnominee(); String nomidob[] =
			 * r2f.getNomineedob(); String totamo[] = r2f.getTotalamount();
			 * String guar[] = r2f.getGuardian();
			 */
			 
			//int i = 0;
			//while (i < length) {
			System.out.println("i m in while loop");
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			System.out.println("Going out of while loop");
			//i++;
			//}
			partadeclTable.addCell(new Paragraph("", font1));
			partadeclTable.addCell(new Paragraph("", font1));
			partadeclTable.addCell(new Paragraph("", font1));
			partadeclTable.addCell(new Paragraph("100%", font1));
			partadeclTable.addCell(new Paragraph("", font1));

			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));
			partadeclTable.addCell(new Paragraph(" ", font1));

			PdfPTable linebeloTable = new PdfPTable(1);
			linebeloTable.setWidthPercentage(100f);
			linebeloTable.getDefaultCell().disableBorderSide(Rectangle.TOP);
			linebeloTable.getDefaultCell().disableBorderSide(Rectangle.LEFT);
			linebeloTable.getDefaultCell().disableBorderSide(Rectangle.RIGHT);
			linebeloTable.getDefaultCell().enableBorderSide(Rectangle.BOTTOM);
			linebeloTable.addCell(new Paragraph(" ", font1));

			PdfPTable declrbeloTable = new PdfPTable(certiTable);
			declrbeloTable.getDefaultCell().setBorder(0);
			declrbeloTable.setWidthPercentage(100f);
			declrbeloTable.addCell(new Paragraph("1 ", fonthd));
			declrbeloTable
					.addCell(new Paragraph(
							"* Certified that I have no family as defined in para 2(g) of the Employees’ Provident Funds Scheme, 1952, and should I acquire a family hereafter, the above nomination should be deemed as cancelled.",
							fonthd));
			declrbeloTable.addCell(new Paragraph("2 ", fonthd));
			declrbeloTable
					.addCell(new Paragraph(
							"* Certified that my father/mother is/are dependent upon me.",
							fonthd));
			declrbeloTable.addCell(new Paragraph("3 ", fonthd));
			declrbeloTable.addCell(new Paragraph(
					"* Strike out whichever is not applicable.", fonthd));

			PdfPTable signatureTable = new PdfPTable(1);
			signatureTable.getDefaultCell().setBorder(0);
			signatureTable.setWidthPercentage(100f);
			signatureTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			signatureTable
					.addCell(new Paragraph(
							"----------------------------------------------------------------",
							fonthd));
			signatureTable.addCell(new Paragraph(
					"Signature or thumb impression of the subscriber", fonthd));

			PdfPTable noteTable = new PdfPTable(1);
			noteTable.getDefaultCell().setBorder(0);
			noteTable.setWidthPercentage(100f);
			noteTable
					.addCell(new Paragraph(
							"Note: - A Fresh nomination shall be made by the member on his marriage and any nomination made before such marriage shall be deemed to be invalid",
							fonthd));

			PdfPTable marriedTable = new PdfPTable(1);
			marriedTable.getDefaultCell().setBorder(0);
			marriedTable.setWidthPercentage(100f);
			marriedTable
					.addCell(new Paragraph(
							"# If Married –> Spouse, Children (married or unmarried), his/her dependent parents, deceased son’s widow and children.If unmarried then Parents, Brother, Sister or any other person(s).",
							fonthd));

			PdfPTable pagenoTable = new PdfPTable(1);
			pagenoTable.getDefaultCell().setBorder(0);
			pagenoTable.setWidthPercentage(100f);
			pagenoTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			pagenoTable.getDefaultCell().setVerticalAlignment(
					Element.ALIGN_BOTTOM);
			pagenoTable.addCell(new Paragraph("Page No. – 1", fonthd));

			pdfuHead.addCell(pdfHead);
			pdfuHead.getDefaultCell().disableBorderSide(Rectangle.TOP);
			pdfuHead.addCell(declrTable);
			pdfuHead.addCell(pesoInfo);
			pdfuHead.addCell(partaTable);
			pdfuHead.addCell(partadeclTable1);
			pdfuHead.addCell(partadeclTable);
			pdfuHead.addCell(linebeloTable);
			pdfuHead.addCell(declrbeloTable);
			pdfuHead.addCell(signatureTable);
			pdfuHead.addCell(noteTable);
			pdfuHead.addCell(marriedTable);
			pdfuHead.getDefaultCell().enableBorderSide(Rectangle.BOTTOM);
			pdfuHead.addCell(pagenoTable);
			borderTable1.addCell(pdfuHead);
			//borderTable1.addCell(pagenoTable);

			docum.add(borderTable1);

			/*
			 * if (docum.isOpen()) { docum.newPage(); }
			 * 
			 * PdfPTable borderTable2 = new PdfPTable(1);
			 * borderTable2.setWidthPercentage(100f);
			 * borderTable2.getDefaultCell().setFixedHeight(800);
			 * borderTable2.getDefaultCell().setBorderWidth(2.0f);
			 * borderTable2.getDefaultCell().setPadding(3);
			 * 
			 * PdfPTable borderTable = new PdfPTable(1);
			 * borderTable.getDefaultCell().setBorderWidth(1.0f);
			 * borderTable.setWidthPercentage(100f);
			 * borderTable.getDefaultCell().setPadding(7);
			 * borderTable.getDefaultCell().disableBorderSide(Rectangle.BOTTOM);
			 * borderTable.getDefaultCell().enableBorderSide(Rectangle.TOP);
			 * borderTable.getDefaultCell().enableBorderSide(Rectangle.LEFT);
			 * borderTable.getDefaultCell().enableBorderSide(Rectangle.RIGHT);
			 * 
			 * PdfPTable partbTable = new PdfPTable(1);
			 * partbTable.getDefaultCell().setBorder(0);
			 * partbTable.setWidthPercentage(100f);
			 * partbTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_CENTER); partbTable .addCell(new Paragraph("Part B
			 * (EPS) (Para 18) $", fonthd));
			 * partbTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); partbTable .addCell(new Paragraph( "I hereby
			 * furnish below particulars of the members of my family who would
			 * be eligible to receive widow/children pension in the event of my
			 * death.", font1));
			 * 
			 * PdfPTable partbdeclTable = new PdfPTable(partBTable);
			 * partbdeclTable.setWidthPercentage(100f);
			 * partbdeclTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_CENTER); partbdeclTable.addCell(new Paragraph("
			 * Sl.No.", fonthd)); partbdeclTable.addCell(new Paragraph( "Name
			 * and address of the family members", fonthd));
			 * partbdeclTable.addCell(new Paragraph(" Date of Birth", fonthd));
			 * partbdeclTable.addCell(new Paragraph( "Relationship with the
			 * member", fonthd));
			 * 
			 * partbdeclTable.addCell(new Paragraph("(1)", fonthd));
			 * partbdeclTable.addCell(new Paragraph("(2)", fonthd));
			 * partbdeclTable.addCell(new Paragraph("(3)", fonthd));
			 * partbdeclTable.addCell(new Paragraph("(4)", fonthd));
			 * 
			 * if (r2f.getMars().equalsIgnoreCase("married")) {
			 * 
			 * String nomiadd[] = r2f.getNomineeadd(); String membdob[] =
			 * r2f.getMembersdob(); String membrel[] = r2f.getMemberrel(); int
			 * length1 = r2f.getNomineeadd().length; int j = 0; int k=1; while
			 * (j < length1) {
			 * 
			 * //System.out.println("I m in while loops " + length1);
			 * partbdeclTable.addCell(new Paragraph("", fonthd));
			 * partbdeclTable.addCell(new Paragraph("", font1));
			 * partbdeclTable.addCell(new Paragraph("", font1));
			 * partbdeclTable.addCell(new Paragraph("", font1)); //j++; //k++;
			 * //} //} else { partbdeclTable.addCell(new Paragraph(" ", font1));
			 * partbdeclTable.addCell(new Paragraph("", font1));
			 * partbdeclTable.addCell(new Paragraph("", font1));
			 * partbdeclTable.addCell(new Paragraph("", font1)); //}
			 * 
			 * PdfPTable decbTable = new PdfPTable(1);
			 * decbTable.getDefaultCell().setBorder(0);
			 * decbTable.setWidthPercentage(100f); decbTable .addCell(new
			 * Paragraph( "** Certified that I have no family, as defined in
			 * para 2(vii) of Employees’ Pension Scheme, 1995 and should I
			 * acquire a family hereafter I shall furnish particulars thereon in
			 * the above form.", font1)); decbTable .addCell(new Paragraph( "I
			 * hereby nominate the following persons for receiving the monthly
			 * widow pension (admissible under para 16 2(a) (i) and (ii) of
			 * Employees’ Pension Scheme, 1995 in the event of my death without
			 * leaving any eligible family member for receiving Pension. ",
			 * font1));
			 * 
			 * PdfPTable partb1Table = new PdfPTable(partB1Table);
			 * partb1Table.setWidthPercentage(100f);
			 * partb1Table.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_CENTER); partb1Table.addCell(new Paragraph( " Name
			 * and Address of the nominee/ nominees", font1));
			 * partb1Table.addCell(new Paragraph(" Date of Birth", font1));
			 * partb1Table.addCell(new Paragraph( "Nominee’s relationship with
			 * the member", font1)); partb1Table.addCell(new Paragraph("(1)",
			 * font1)); partb1Table.addCell(new Paragraph("(2)", font1));
			 * partb1Table.addCell(new Paragraph("(3)", font1)); if
			 * ("unmarried".equalsIgnoreCase("unmarried")) {
			 * 
			 * String mem[] = r2f.getNomineeadd(); String membdob[] =
			 * r2f.getMembersdob(); String membrel[] = r2f.getMemberrel(); int
			 * length1 = r2f.getNomineeadd().length;
			 * 
			 * //int k = 0; //while (k < length1) { partb1Table.addCell(new
			 * Paragraph("NA", font1)); partb1Table.addCell(new Paragraph("NA",
			 * font1)); partb1Table.addCell(new Paragraph("NA", font1)); //k++;
			 * //} } else { partb1Table.addCell(new Paragraph("NA", font1));
			 * partb1Table.addCell(new Paragraph("NA", font1));
			 * partb1Table.addCell(new Paragraph("NA", font1)); }
			 * 
			 * PdfPTable datedTable = new PdfPTable(1);
			 * datedTable.getDefaultCell().setBorder(0);
			 * datedTable.setWidthPercentage(100f);
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); datedTable.addCell(new Paragraph("Dated the
			 * :______________", fonthd));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_RIGHT); datedTable .addCell(new Paragraph( ". . . . . . . . . . . . . . . . . . . . . . . . . ",
			 * font1)); datedTable.addCell(new Paragraph("Signature of the
			 * subscriber", fonthd));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); datedTable.addCell(new Paragraph( "**Strike
			 * out whichever is not applicable.", fonthd));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_CENTER); datedTable.addCell(new
			 * Paragraph("CERTIFICATE BY EMPLOYER", font4));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_JUSTIFIED); Phrase phrase = new Phrase( "Certified
			 * that the above declaration and nomination has been signed/thumb
			 * impressed before me by Shri/Smt./Kumari "); Phrase ph1 = new
			 * Phrase("Gaurav Kumar Singh", FontFactory.getFont(
			 * FontFactory.COURIER, 14, Font.BOLDITALIC)); Phrase ph2 = new
			 * Phrase( " employed in my establishment after he/she has read the
			 * entries/the entries have been read over to him/her by me and got
			 * confirmed by him/her."); phrase.add(ph1); phrase.add(ph2);
			 * 
			 * datedTable.addCell(phrase new Paragraph( "Certified that the
			 * above declaration and nomination has been signed/thumb impressed
			 * before me by
			 * Shri/Smt./Kumari________________________________________________________employed
			 * in my establishment after he/she has read the entries/the entries
			 * have been read over to him/her by me and got confirmed by
			 * him/her.", font1) );
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); datedTable.addCell(new Paragraph("Place:
			 * ___________________ ", fonthd));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); datedTable.addCell(new Paragraph("Dated the
			 * __________________", fonthd));
			 * datedTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_RIGHT); datedTable.addCell(new Paragraph("For ",
			 * fonthd)); datedTable.addCell(new Paragraph(" ", fonthd));
			 * 
			 * PdfPTable authTable = new PdfPTable(1);
			 * authTable.getDefaultCell().setBorderWidth(0);
			 * authTable.getDefaultCell().setHorizontalAlignment(
			 * Rectangle.ALIGN_RIGHT); authTable.setWidthPercentage(50f);
			 * authTable.addCell(new Paragraph("Authorised Signatory", fonthd));
			 * //authTable.addCell(new Paragraph(r2f.getCompoName(), fonthd));
			 * //authTable.addCell(new Paragraph(r2f.getCompoAddress(),
			 * fonthd));
			 * 
			 * PdfPTable condiTable = new PdfPTable(1);
			 * condiTable.getDefaultCell().setBorder(0);
			 * condiTable.setWidthPercentage(100f);
			 * condiTable.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_LEFT); condiTable .addCell(new Paragraph( "$ -
			 * Applicable if Married -> To Spouse and Children (include children
			 * adopted legally before death in service. ", font1));
			 * 
			 * PdfPTable appTable = new PdfPTable(appliTable);
			 * appTable.getDefaultCell().setBorder(0); appTable.getDefaultCell()
			 * .setHorizontalAlignment(Element.ALIGN_LEFT);
			 * appTable.setWidthPercentage(100f);
			 * 
			 * appTable.addCell(new Paragraph( "$$ - Applicable to both Married
			 * and unmarried –", font1)); appTable.getDefaultCell()
			 * .setHorizontalAlignment(Element.ALIGN_LEFT); appTable
			 * .addCell(new Paragraph( "(1) Married ----- To any person(s) other
			 * than spouse and children.", font1)); appTable.getDefaultCell()
			 * .setHorizontalAlignment(Element.ALIGN_LEFT); appTable.addCell(new
			 * Paragraph("", fonthd)); appTable.getDefaultCell()
			 * .setHorizontalAlignment(Element.ALIGN_LEFT); appTable
			 * .addCell(new Paragraph( "(2) Unmarried ----- To Parents, Brother,
			 * Sister or any other person(s).", font1));
			 * 
			 * PdfPTable page2Table = new PdfPTable(1);
			 * page2Table.getDefaultCell().setBorder(0);
			 * page2Table.setWidthPercentage(100f);
			 * page2Table.getDefaultCell().setHorizontalAlignment(
			 * Element.ALIGN_CENTER);
			 * page2Table.getDefaultCell().setVerticalAlignment(
			 * Rectangle.ALIGN_BOTTOM); page2Table.addCell(new Paragraph("Page
			 * No. - 2", fonthd));
			 * 
			 * borderTable.addCell(partbTable);
			 * borderTable.getDefaultCell().disableBorderSide(Rectangle.TOP);
			 * borderTable.addCell(partbdeclTable);
			 * borderTable.addCell(decbTable); borderTable.addCell(partb1Table);
			 * borderTable.addCell(datedTable); borderTable.addCell(authTable);
			 * //borderTable.addCell(condiTable);
			 * //borderTable.addCell(appTable);
			 * borderTable.getDefaultCell().enableBorderSide(Rectangle.BOTTOM);
			 * borderTable.addCell(page2Table);
			 * borderTable2.addCell(borderTable); docum.add(borderTable2);
			 */

			System.out.println("PDF BAN GAYA");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is " + e);
		} finally {
			docum.close();
		}
	}}