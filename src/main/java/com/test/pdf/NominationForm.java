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

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPTableEvent;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class NominationForm {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		Document document=new Document();
		String file="D:\\nomination.pdf";
		PdfWriter.getInstance(document,new FileOutputStream(file));
		document.open();
		
		Font hardfont=FontFactory.getFont(FontFactory.TIMES_BOLD,18.0f,2,Color.RED);
		Font headingFont=FontFactory.getFont(FontFactory.TIMES_BOLD,11.0f);
		Font normalFont=FontFactory.getFont(FontFactory.TIMES,10.0f);
		
		float beneficiaryTablePart[]={20f,15f,15f,15f,35f};
		float employeeTablePart[]={11f,32f,14f,23f,7f,13f};
		float policyTablePart[]={30f,40f};
		float awaraTableP[]={30f,40f};
		try{
		System.out.println("Going to create Nomination Form");
		PdfPTable borderTable = new PdfPTable(1);
		borderTable.setWidthPercentage(100f);
		borderTable.getDefaultCell().setFixedHeight(750);
		borderTable.getDefaultCell().setBorderWidth(2.0f);
		borderTable.getDefaultCell().setPadding(10.0f);

		//borderTable.g
		PdfPTable mainTable = new PdfPTable(1);
		mainTable.setWidthPercentage(100f);
		mainTable.getDefaultCell().setBorderWidth(0.0f);
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		mainTable.addCell(new Paragraph("Nomination Form",hardfont));
		mainTable.addCell(new Paragraph("(All Insurances)"));
		mainTable.addCell(new Paragraph(""));
		mainTable.addCell(new Paragraph(""));
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable.addCell(new Paragraph("Sapient ID   :",headingFont));
		mainTable.addCell(new Paragraph("Name of the Person   : ",headingFont));
		mainTable.addCell(new Paragraph(""));
		mainTable.addCell(new Paragraph(""));
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		//mainTable.getDefaultCell().setFixedHeight(30);
		mainTable.addCell(new Paragraph("BENEFICIARY DETAILS",headingFont));		
		
		PdfPTable beneficiaryTable=new PdfPTable(beneficiaryTablePart);
		beneficiaryTable.getDefaultCell().setBorderWidth(1.0f);
		beneficiaryTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		beneficiaryTable.addCell(new Paragraph("Name of Beneficiary *"));
		beneficiaryTable.addCell(new Paragraph("Date of Birth/ Age "));
		beneficiaryTable.addCell(new Paragraph("Relationship to the Life Assured"));
		beneficiaryTable.addCell(new Paragraph("% Share of benefit"));
		beneficiaryTable.addCell(new Paragraph("Remarks"));
		
		beneficiaryTable.getDefaultCell().setFixedHeight(30);
		beneficiaryTable.addCell(new Paragraph(""));		
		beneficiaryTable.addCell(new Paragraph(""));
		beneficiaryTable.addCell(new Paragraph(""));
		beneficiaryTable.addCell(new Paragraph(""));
		beneficiaryTable.addCell(new Paragraph(""));
		
		mainTable.addCell(beneficiaryTable);
		mainTable.getDefaultCell().setFixedHeight(40);
		mainTable.addCell(new Paragraph(""));
		
		
		mainTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		mainTable.getDefaultCell().setFixedHeight(40);
		Font font = new Font(Font.UNDERLINE, 10, Font.BOLD); // 1
		font.setColor(new Color(0x92, 0x90, 0x83));
		
		Chunk chunk = 
			new Chunk("Gaurav Kumar Singh", font); // 2
		mainTable.addCell(new Paragraph("* 	If minor,"+chunk+" the details of the guardian with proof of identity required"));
		mainTable.addCell(new Paragraph("EMPLOYEE SIGNATURE:",headingFont));
		
		PdfPTable employeeTable=new PdfPTable(employeeTablePart);
		employeeTable.getDefaultCell().setBorderWidth(0.0f);
		employeeTable.addCell(new Paragraph("(1)	NAME",headingFont));
		employeeTable.addCell(new Paragraph("Gaurav Kumar Singh",normalFont));
		employeeTable.addCell(new Paragraph("SIGNATURE",headingFont));
		employeeTable.addCell(new Paragraph("……………………",normalFont));
		employeeTable.addCell(new Paragraph("DATE",headingFont));
		employeeTable.addCell(new Paragraph("12/12/2011",normalFont));
		mainTable.addCell(employeeTable);
		mainTable.getDefaultCell().setFixedHeight(0);
	
		PdfPTable policyTable=new PdfPTable(policyTablePart);		
		policyTable.getDefaultCell().setColspan(2);
		policyTable.getDefaultCell().setBorderWidth(1.0f);
		
		policyTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		policyTable.addCell(new Paragraph("For (Policyholder) RM team use only",headingFont));
		policyTable.getDefaultCell().setColspan(0);
		policyTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		policyTable.addCell(new Paragraph("Date of receipt of Form:",headingFont));
		policyTable.addCell(new Paragraph(""));
		policyTable.addCell(new Paragraph("Received By:",headingFont));
		policyTable.addCell(new Paragraph(""));
		policyTable.getDefaultCell().setFixedHeight(35);
		policyTable.addCell(new Paragraph("Signature:",headingFont));
		policyTable.addCell(new Paragraph(""));
				
		mainTable.addCell(policyTable);
		mainTable.addCell(new Paragraph(""));
		borderTable.addCell(mainTable);
		document.add(borderTable);
		System.out.println("Nomination Form has been created");
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
				document.close();
		}
	}
}
