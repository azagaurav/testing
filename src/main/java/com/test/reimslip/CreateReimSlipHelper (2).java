/*
 * Created on Jan 8, 2014
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.reimslip;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
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
public class CreateReimSlipHelper {
	public void createReimbSlip(String[] recArray, ResultSet rs)
			throws IOException, FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
		System.out.println(":::::::::: ");
		try {
			Document document = new Document(PageSize.LETTER.rotate(), 10, 10,
					10, 10);
			PdfWriter.getInstance(document,
					new FileOutputStream("D:\\Reimbursement_Slip\\REIMB_SLIP"
							+ recArray[0] + ".pdf"));
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_BOLD, 3);
			Font font3 = FontFactory.getFont(FontFactory.TIMES_BOLD, 8);
			Font font4 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10);

			Font hardfont = FontFactory.getFont(FontFactory.TIMES_BOLD, 12.0f);
			Font hardfont1 = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f);
			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,
					15.0f);
			Font Fontb = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f);
			Font headingFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,
					10.0f);
			Font normalFont = FontFactory.getFont(FontFactory.TIMES, 11.0f);
			document.open();
			//System.out.println(":::::::::: ");
			float payTableimg[] = { 30f, 70f };
			float payTablePart[] = { 50f, 50f };
			float pay1TablePart[] = { 3f, 97f };
			float pay5[] = { 14f, 86F };
			float pay6[] = { 75f, 25F };
			float[] tablebreak1 = { 20f, 30f, 20f, 30f };
			float[] tablebreak2 = { 10f, 50f, 10f, 15f, 15f };
			float[] tablebreak3 = { 20f, 16f, 16f, 16f, 16f, 16f, 17f, 16f,
					23f, 17f, 18f };
			float[] tablebreak4 = { 0f, 35f, 17f, 17f, 17f, 25, 25f, 0f, 0f, 0f };
			float[] tablebreak5 = { 35f, 17f, 17f, 17f, 25, 25f };

			float pay1[] = { 50F, 50F };
			float pay2[] = { 50F, 50F };
			System.out.println(":::::::::: ");
			PdfPTable borderTable = new PdfPTable(1);
			borderTable.setWidthPercentage(100f);
			borderTable.getDefaultCell().setFixedHeight(570);
			borderTable.getDefaultCell().setBorderWidth(1.0f);
			borderTable.getDefaultCell().setPadding(2.0f);

			PdfPTable mainTable1 = new PdfPTable(1);
			mainTable1.setWidthPercentage(100f);
			mainTable1.getDefaultCell().setBorderWidth(0.0f);

			PdfPTable imgTable1 = new PdfPTable(1);
			imgTable1.getDefaultCell().setBorderWidth(0.0f);
			String lg = "C:/logo/sapelogo.gif";
			Image gif1 = Image.getInstance(lg);
			gif1.setAlignment(Element.ALIGN_LEFT);
			imgTable1.getDefaultCell().setBorderWidth(0.0f);
			imgTable1.getDefaultCell().setFixedHeight(40);
			imgTable1.addCell(gif1);
			//System.out.println(":::::::::: ");
			imgTable1
					.addCell(new Paragraph("Sapient Consulting Ltd", hardfont));
			imgTable1.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			imgTable1.addCell(new Paragraph(
					"Reimbursment Slip as at December 31,2013", hardfont));

			mainTable1.addCell(imgTable1);

			PdfPTable maintable22 = new PdfPTable(tablebreak1);
			maintable22.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			maintable22.addCell(new Paragraph("Name", font4));
			maintable22.addCell(new Paragraph(rs.getString(3), font4));
			maintable22.addCell(new Paragraph("Sapient ID", font4));
			maintable22.addCell(new Paragraph(rs.getString(4), font4));
			maintable22.addCell(new Paragraph("Designation", font4));
			maintable22.addCell(new Paragraph(rs.getString(10), font4));
			maintable22.addCell(new Paragraph("Payroll ID", font4));
			maintable22.addCell(new Paragraph(rs.getString(2), font4));
			maintable22.addCell(new Paragraph("Department", font4));
			maintable22.addCell(new Paragraph(rs.getString(11), font4));
			maintable22.addCell(new Paragraph("D.O.J.", font4));
			maintable22.addCell(new Paragraph(rs.getString(6), font4));
			maintable22.addCell(new Paragraph("Location", font4));
			maintable22.addCell(new Paragraph(rs.getString(14), font4));
			maintable22.addCell(new Paragraph("Bank A/C No.", font4));
			maintable22.addCell(new Paragraph(rs.getString(21), font4));
			mainTable1.addCell(maintable22);
			//System.out.println(":::::::::: ");
			mainTable1.addCell(new Paragraph("", font1));

			PdfPTable maintable24 = new PdfPTable(tablebreak3);
			maintable24.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			maintable24.addCell(new Paragraph("Description", font1));
			maintable24.addCell(new Paragraph(
					"Bills C/F from Previous Quarter", font1));
			maintable24.addCell(new Paragraph(
					"Entitlement C/F from Previous Quarter", font1));
			maintable24.addCell(new Paragraph("Oct'13 Entitlement", font1));
			maintable24.addCell(new Paragraph("Nov'13 Entitlement", font1));
			maintable24.addCell(new Paragraph("Dec'13 Entitlement", font1));
			maintable24.addCell(new Paragraph(
					"Total Accumulated amount till date", font1));
			maintable24.addCell(new Paragraph("Bills Approved", font1));
			maintable24.addCell(new Paragraph("Payment made in Jan'14", font1));
			maintable24.addCell(new Paragraph(
					"Entitlement C/F to next Quarter", font1));
			maintable24.addCell(new Paragraph("Bills C/F to next Quarter",
					font1));
			maintable24.addCell(new Paragraph("", font4));
			maintable24.addCell(new Paragraph("(A)", font4));
			maintable24.addCell(new Paragraph("(B)", font4));
			maintable24.addCell(new Paragraph("(C)", font4));
			maintable24.addCell(new Paragraph("(D)", font4));
			maintable24.addCell(new Paragraph("(E)", font4));
			maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
			maintable24.addCell(new Paragraph("(G)", font4));
			maintable24
					.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
			maintable24.addCell(new Paragraph("(F-H)", font4));
			maintable24.addCell(new Paragraph("(G+A-H)", font4));

			if (!(recArray[1].equalsIgnoreCase("NA"))) {				
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
				maintable24.addCell(new Paragraph(recArray[1], font4));
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
				maintable24.addCell(new Paragraph(recArray[2], font4));
				maintable24.addCell(new Paragraph(recArray[3], font4));
				maintable24.addCell(new Paragraph(recArray[4], font4));
				maintable24.addCell(new Paragraph(recArray[5], font4));
				maintable24.addCell(new Paragraph(recArray[6], font4));
				maintable24.addCell(new Paragraph(recArray[7], font4));
				maintable24.addCell(new Paragraph(recArray[8], font4));
				maintable24.addCell(new Paragraph(recArray[9], font4));
				maintable24.addCell(new Paragraph(recArray[10], font4));
				maintable24.addCell(new Paragraph(recArray[11], font4));
			}
			if (!(recArray[12].equalsIgnoreCase("NA"))) {
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
				maintable24.addCell(new Paragraph(recArray[12], font4));
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
				maintable24.addCell(new Paragraph(recArray[13], font4));
				maintable24.addCell(new Paragraph(recArray[14], font4));
				maintable24.addCell(new Paragraph(recArray[15], font4));
				maintable24.addCell(new Paragraph(recArray[16], font4));
				maintable24.addCell(new Paragraph(recArray[17], font4));
				maintable24.addCell(new Paragraph(recArray[18], font4));
				maintable24.addCell(new Paragraph(recArray[19], font4));
				maintable24.addCell(new Paragraph(recArray[20], font4));
				maintable24.addCell(new Paragraph(recArray[21], font4));
				maintable24.addCell(new Paragraph(recArray[22], font4));
			}//System.out.println(":::::::::: ");
			if (!(recArray[23].equalsIgnoreCase("NA"))) {
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
				maintable24.addCell(new Paragraph(recArray[23], font4));
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
				maintable24.addCell(new Paragraph(recArray[24], font4));
				maintable24.addCell(new Paragraph(recArray[25], font4));
				maintable24.addCell(new Paragraph(recArray[26], font4));
				maintable24.addCell(new Paragraph(recArray[27], font4));
				maintable24.addCell(new Paragraph(recArray[28], font4));
				maintable24.addCell(new Paragraph(recArray[29], font4));
				maintable24.addCell(new Paragraph(recArray[30], font4));
				maintable24.addCell(new Paragraph(recArray[31], font4));
				maintable24.addCell(new Paragraph(recArray[32], font4));
				maintable24.addCell(new Paragraph(recArray[33], font4));
			}
			if (!(recArray[34].equalsIgnoreCase("NA"))) {
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
				maintable24.addCell(new Paragraph(recArray[34], font4));
				maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
				maintable24.addCell(new Paragraph(recArray[35], font4));
				maintable24.addCell(new Paragraph(recArray[36], font4));
				maintable24.addCell(new Paragraph(recArray[37], font4));
				maintable24.addCell(new Paragraph(recArray[38], font4));
				maintable24.addCell(new Paragraph(recArray[39], font4));
				maintable24.addCell(new Paragraph(recArray[40], font4));
				maintable24.addCell(new Paragraph(recArray[41], font4));
				maintable24.addCell(new Paragraph(recArray[42], font4));
				maintable24.addCell(new Paragraph(recArray[43], font4));
				maintable24.addCell(new Paragraph(recArray[44], font4));
			}
			//System.out.println("Going to ADD");
			//System.out.println("LLLLLLLLLLLLL "+recArray[3]+"LLLLLLLLLLLLL			"+recArray[14]+"LLLLLLLLLLLLL "+recArray[25]+"LLLLLLLLLLLLL			 "+recArray[36]);
			int total2 = Integer.parseInt(recArray[2])
					+ Integer.parseInt(recArray[13])
					+ Integer.parseInt(recArray[24])
					+ Integer.parseInt(recArray[35]);
			//System.out.println("Going to ADD");
			int total3 = Integer.parseInt(recArray[3])
					+ Integer.parseInt(recArray[14])
					+ Integer.parseInt(recArray[25])
					+ Integer.parseInt(recArray[36]);
			int total4 = Integer.parseInt(recArray[4])
					+ Integer.parseInt(recArray[15])
					+ Integer.parseInt(recArray[26])
					+ Integer.parseInt(recArray[37]);
			//System.out.println("Going to ADD");
			int total5 = Integer.parseInt(recArray[5])
					+ Integer.parseInt(recArray[16])
					+ Integer.parseInt(recArray[27])
					+ Integer.parseInt(recArray[38]);
			int total6 = Integer.parseInt(recArray[6])
					+ Integer.parseInt(recArray[17])
					+ Integer.parseInt(recArray[28])
					+ Integer.parseInt(recArray[39]);
			int total7 = Integer.parseInt(recArray[7])
					+ Integer.parseInt(recArray[18])
					+ Integer.parseInt(recArray[29])
					+ Integer.parseInt(recArray[40]);
			int total8 = Integer.parseInt(recArray[8])
					+ Integer.parseInt(recArray[19])
					+ Integer.parseInt(recArray[30])
					+ Integer.parseInt(recArray[41]);
			System.out.println("Going to ADD");
			int total9 = Integer.parseInt(recArray[9])
					+ Integer.parseInt(recArray[20])
					+ Integer.parseInt(recArray[31])
					+ Integer.parseInt(recArray[42]);
			int total10 = Integer.parseInt(recArray[10])
					+ Integer.parseInt(recArray[21])
					+ Integer.parseInt(recArray[32])
					+ Integer.parseInt(recArray[43]);
			int total11 = Integer.parseInt(recArray[11])
					+ Integer.parseInt(recArray[22])
					+ Integer.parseInt(recArray[33])
					+ Integer.parseInt(recArray[44]);
			System.out.println(" total2 ::: "+total2);
			maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);			
			maintable24.addCell(new Paragraph("Total", font4));
			maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			maintable24.addCell(new Paragraph("" +total2, font4));
			maintable24.addCell(new Paragraph("" +total3, font4));
			maintable24.addCell(new Paragraph("" +total4, font4));
			maintable24.addCell(new Paragraph("" +total5, font4));
			maintable24.addCell(new Paragraph("" +total6, font4));
			maintable24.addCell(new Paragraph("" +total7, font4));
			maintable24.addCell(new Paragraph("" +total8, font4));
			maintable24.addCell(new Paragraph("" +total9, font4));
			maintable24.addCell(new Paragraph("" +total10, font4));
			maintable24.addCell(new Paragraph("" +total11, font4));

			mainTable1.addCell(maintable24);
			mainTable1.addCell(new Paragraph("",font1));
			mainTable1.addCell(new Paragraph("",font1));
			mainTable1.addCell(new Paragraph("",font1));
			mainTable1.addCell(new Paragraph("Note:- Driver’s Salary is processed on the basis of the declaration submitted by you, hence “Bills C/F to next quarter” is zero.", font1));
			borderTable.addCell(mainTable1);
			document.add(borderTable);
			System.out.println(" total2 ::: "+total2);
			document.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}