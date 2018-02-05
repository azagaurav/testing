/*
 * Created on Mar 16, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.awt.print.PageFormat;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class GatePass {
	public static void main(String[] args) {
		Document docum = new Document(PageSize.A4);
		try {
			System.out.println("Going to Create A PDF");
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9,
					Font.BOLD);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 15,
					Font.BOLD);			
			String SlipType = "Gate Pass";
			String contractor = "Contractor";
			String empName = "Nmae";
			String empId = "Employee ID";
			String fhName = "F/H Name";					
			String desig = "Designation";
			String issuedOn= "Issued On";
			String contrctSign = "Contactor Sign";
			String personSign = "Signature of Authorised Person";
			PdfWriter.getInstance(docum, new FileOutputStream(
					"D:\\Gatepass.pdf"));
			docum.open();
			//System.out.println("Going to Create A PDF MAIN TABLE");
			//MAIN TABLE
			PdfPTable mainTable = new PdfPTable(1);
			mainTable.setWidthPercentage(60f);
			mainTable.getDefaultCell().setBorderWidth(0.5f);
			mainTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			//System.out.println("Going to Create A PDF COMPO TABLE");
			//COMPO TABLE
			PdfPTable compTable = new PdfPTable(1);
			compTable.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			compTable.getDefaultCell().setBorderWidth(0.0f);
			compTable.addCell(new Paragraph(SlipType, font2));
			mainTable.addCell(compTable);
			//System.out.println("Going to Create A PDF CONTRACTOR TABLE");
			//CONTRACTOR TABLE
			float contTablePart[] = { 25f, 75f };
			PdfPTable contTable = new PdfPTable(contTablePart);
			contTable.setWidthPercentage(100f);
			contTable.getDefaultCell().setBorderWidth(0);
			contTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			contTable.addCell(new Paragraph(contractor,font1));			
			contTable.addCell(new Paragraph("GDX Facility & Management Pvt.Ltd.",font1));
			mainTable.addCell(contTable);
			//System.out.println("Going to Create A PDF CONTRACTOR TABLE 1");
			float descMTablePart[] = { 55f, 45f};
			PdfPTable descMTable = new PdfPTable(descMTablePart);
			descMTable.setWidthPercentage(100f);
			descMTable.getDefaultCell().setBorderWidth(0);
			descMTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			float descTablePart[] = { 46f, 64f};
			PdfPTable descTable = new PdfPTable(descTablePart);
			descTable.setWidthPercentage(100f);
			descTable.getDefaultCell().setBorderWidth(0);
			descTable.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_LEFT);
			//System.out.println("Going to Create A PDF CONTRACTOR TABLE 1");
			descTable.getDefaultCell().setFixedHeight(20);
			descTable.addCell(new Paragraph(empName,font1));
			descTable.addCell(new Paragraph("Mani Bhushan Mishra",font1));			
			descTable.addCell(new Paragraph(empId,font1));
			descTable.addCell(new Paragraph("0001",font1));
			descTable.addCell(new Paragraph(fhName,font1));
			descTable.addCell(new Paragraph("Jitendra Mishra",font1));
			descTable.addCell(new Paragraph(desig,font1));
			descTable.addCell(new Paragraph("IT Head",font1));
			descTable.addCell(new Paragraph(issuedOn,font1));
			descTable.addCell(new Paragraph("16-09-2012",font1));			
			descTable.getDefaultCell().setFixedHeight(20);
			descTable.addCell(new Paragraph("",font1));
			descTable.addCell(new Paragraph("",font1));
			descMTable.getDefaultCell()
			.setHorizontalAlignment(Element.ALIGN_LEFT);
			descMTable.addCell(descTable);
			
			try {
				descMTable.addCell(Image.getInstance("D:/Images/images.jpg"));
			} catch (MalformedURLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			descMTable.addCell(new Paragraph(contrctSign,font1));
			descMTable.getDefaultCell()
			.setHorizontalAlignment(Element.ALIGN_RIGHT);
			descMTable.addCell(new Paragraph(personSign,font1));
			//System.out.println("Going to Create A PDF CONTRACTOR TABLE 12");
			mainTable.addCell(descMTable);
			docum.add(mainTable);

			docum.close();

			System.out.println("PDF hase been Created");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}