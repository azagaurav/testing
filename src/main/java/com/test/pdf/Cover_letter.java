/*
 * Created on 13 Jul, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Graphic;
import com.lowagie.text.ListItem;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.ZapfDingbatsList;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Cover_letter {

	public static void main(String[] args) {
		Document docum = new Document(PageSize.A4, 20, 30, 60, 40);
		try {
			System.out.println("Going to Create A PDF");
			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10,
					Font.BOLD);
			Font font3 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11);
			Font font4 = FontFactory.getFont(FontFactory.TIMES_BOLD, 11,
					Font.UNDERLINE);
			Font fonthd = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9,
					Font.BOLD);
			Font fonthd1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9,
					Font.BOLD);
			String empName = "Kapil Bharati";
			String pf_Account = " Hr/Ggn/26147/3823";
			String Bank_name = "Citi Bank";
			String bankAccount = "5289972228";
			String []firstPara = "We would like to inform you that we have made your Provident Fund full & final settlement for PF a/c no. ~ from Sapient Consulting Employees Provident Fund Trust and transferred the accumulations directly into your ~ bank account ~ as per the details provided by you on form no. 19.".split("~");
			String secondPara="We have attached the breakup of the Provident Fund Full & final settlement for your reference.";
			String thirdPara="We have also attached your EPS withdrawal form 10C duly attested by us. ";
			String fourthPara="You are requested to submit the attached form at the address given below for withdrawal of your EPS (pension) amount from RPFC Gurgaon.";
			String fifthPara="The Employees’ Provident Fund Organization,\n	Bhavishya Nidhi Bhawan,\nPlot No. 43, Sector 44, Institutional Area,\nGurgaon-122002, Haryana,\nPhone No. 0124-2578636";
			String companyAddress="Sapient Consulting Pvt. Ltd.\n Gurgaon Infospace Ltd, Building No-8, Tower-B,\n SEZ Sector-21, Village Dundahera\n Gurgaon-122016, Haryana";
			//String [] frstPara=firstPara.split("$");
			float borderTablePart[]={5f,2f,93f};
			float summaryTablePart[]={17f,32f,17f,17f,17f};
			
			System.out.println(firstPara.length);
			PdfWriter.getInstance(docum, new FileOutputStream(
					"D:\\CoverLetter.pdf"));
			docum.open();
			PdfPTable table_declare1=new PdfPTable(1);
			table_declare1.getDefaultCell().setBorder((0));
			table_declare1.addCell(new Paragraph("\n\n\n",font1));

			table_declare1.setWidthPercentage(100);
			docum.add(table_declare1);
			
			PdfPTable table_15B=new PdfPTable(1);
			table_15B.getDefaultCell().setBorder(0);
			table_15B.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table_15B.addCell(new Paragraph("ANNEXURE - A",font1));
			table_15B.addCell(new Paragraph("DETAILS OF TAX DEDUCTED AND DEPOSITED IN THE CENTRAL GOVERNMENT ACCOUTN THROUGH BOOK ENTRY \n (ThE Employer to provide payment wise details of tax deducted and deposited with respect to the employee",font1));
		   table_15B.setWidthPercentage(100);
//			docum.add(table_15B);
			float table_16B_f[]={};			
			PdfPTable table_16B=new PdfPTable(table_16B_f);
			table_16B.addCell(new Paragraph("S.NO.",font1));
			table_16B.addCell(new Paragraph("Tac Deposited in respect of Employee(RS)",font1));
			PdfPTable table_16Bs=new PdfPTable(1);
			table_16Bs.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table_16Bs.getDefaultCell().setBorder(0);
			table_16Bs.addCell(new Paragraph("Book identification number(BIN)",font1));
			PdfPTable table_16Bs1=new PdfPTable(table_16B);
			table_16Bs1.getDefaultCell().setHorizontalAlignment(1);
			table_16Bs1.getDefaultCell().disableBorderSide(Rectangle.BOTTOM);
			table_16Bs1.getDefaultCell().disableBorderSide(Rectangle.LEFT);
			//table_16Bs1.getDefaultCell().enableBorderSide(Rectangle.RIGHT);
			table_16Bs1.addCell(new Paragraph("Receipt number of Form No.\n 24G",font1));
			table_16Bs1.getDefaultCell().enableBorderSide(Rectangle.RIGHT);
			//table_16Bs1.getDefaultCell().disableBorderSide(Rectangle.RIGHT);
			table_16Bs1.addCell(new Paragraph("DDO Sequence Number in the Book Adjustment Mini Statement",font1));
			//table_16Bs1.getDefaultCell().disableBorderSide(Rectangle.LEFT);
			//table_16Bs1.getDefaultCell().enableBorderSide(Rectangle.RIGHT);
			//table_16Bs1.getDefaultCell().disableBorderSide(8);
			table_16Bs1.getDefaultCell().disableBorderSide(Rectangle.RIGHT);
			table_16Bs1.addCell(new Paragraph("Date on which tax deposited \n (dd/mm/yyyyy)",font1));
			table_16Bs1.getDefaultCell().enableBorderSide(Rectangle.BOTTOM);
			table_16Bs1.setWidthPercentage(100);
		/*	table_16Bs1.addCell(new Paragraph("",font1));
			table_16Bs1.addCell(new Paragraph("",font1));
			table_16Bs1.addCell(new Paragraph("",font1));
			
			table_16Bs1.addCell(new Paragraph("",font1));
			table_16Bs1.addCell(new Paragraph("",font1));
			table_16Bs1.addCell(new Paragraph("",font1));*/
			
			PdfPTable table_16Bs2=new PdfPTable(1);
			table_16Bs2.getDefaultCell().setBorder(0);
			table_16Bs2.addCell(table_16Bs);
			table_16Bs2.addCell(table_16Bs1);
			table_16Bs2.setWidthPercentage(100);
			table_16B.addCell(table_16Bs2);
		table_16B.setWidthPercentage(100);
//		docum.add(table_16B);
			PdfPTable table_16Bs3=new PdfPTable(table_16B);
			
			
			
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.addCell(new Paragraph("\n",font1));
			table_16Bs3.setWidthPercentage(100);
			//docum.add(table_16Bs3);
			PdfPTable table_16Bs4=new PdfPTable(table_16B_f);
			table_16Bs4.addCell(new Paragraph("Total",font1));
			table_16Bs4.addCell(new Paragraph("",font1));
			table_16Bs4.addCell(new Paragraph("",font1));
			table_16Bs4.setWidthPercentage(100);
			//docum.add(table_16Bs4);
			
			PdfPTable compTable=new PdfPTable(1);
			compTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			compTable.getDefaultCell().setBorderWidth(0.0f);
			compTable.addCell(new Paragraph(companyAddress,font1));
			
			Graphic horizontalLine = new Graphic(); 
            horizontalLine.setHorizontalLine(1f, 80f); 
            PdfPCell c430 = new PdfPCell(new Phrase (" ")); 
            c430.setColspan(5); 
            c430.setBorder(PdfPCell.NO_BORDER); 
            c430.addElement(horizontalLine);
            
            PdfPTable toTable=new PdfPTable(1);
			toTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			toTable.setHorizontalAlignment(Element.ALIGN_JUSTIFIED_ALL);
			toTable.getDefaultCell().setBorderWidth(0.0f);
			toTable.addCell(new Paragraph("",font1));
			toTable.addCell(new Paragraph("",font1));
			toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph("To",font1));
            toTable.addCell(new Paragraph(empName,font1));
            toTable.addCell(new Paragraph("Dear "+empName+",",font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph(firstPara[0]+pf_Account+firstPara[1]+Bank_name+firstPara[2]+bankAccount+firstPara[3],font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph(secondPara,font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph(thirdPara,font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph(fourthPara,font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph(fifthPara,font2));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph("Thanking you",font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph("Your faithfully,\n For, Sapient Consulting Pvt. Ltd.",font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph("",font1));
            toTable.addCell(new Paragraph("Authorised Signatory",font2));
            toTable.addCell(new Paragraph("",font1));
            PdfPTable noteTable=new PdfPTable(borderTablePart);
            noteTable.getDefaultCell().setBorderWidth(0f);
            noteTable.addCell(new Paragraph("Note",font1));
            noteTable.addCell(new Paragraph(":",font1));
            noteTable.addCell(new Paragraph(" Before submission, please ensure you have attached the following - ",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("•",font1));
            noteTable.addCell(new Paragraph("	Attested copy of any photo ID issued by the Govt. (e.g. PAN card, passport, voter ID etc.)",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("•",font1));
            noteTable.addCell(new Paragraph("	Attested copy of Bank Passbook or statement or crossed cheque (on the cheque, statement or passbook printed employee name, IFSC code, and branch address should be mentioned.) ",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("•",font1));
            noteTable.addCell(new Paragraph("	Also please write the following sentence at the back side of cheque leaf\n(I will be responsible if my bank A/c is closed before six months from the date of submission of 	my withdrawal form)",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("•",font1));
            noteTable.addCell(new Paragraph("	Bank A/c in joint name is not acceptable. ",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("•",font1));
            noteTable.addCell(new Paragraph("	Write your Mobile Number on top of the form to get SMS alerts.",font1));
            
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("",font1));
            noteTable.addCell(new Paragraph("",font1));           
            noteTable.addCell(new Paragraph("Encl",font1));
            noteTable.addCell(new Paragraph(":",font1));
            noteTable.addCell(new Paragraph("Annexure K,Form-10C and 7PS",font1));            
            noteTable.addCell(new Paragraph("Note",font1));
            noteTable.addCell(new Paragraph(":",font1));
            noteTable.addCell(new Paragraph("You can do follow up with RPFC Gurgaon directly after submitting the form.\n For, any query regarding this drop a mail to exithelpdesk@sapient.com",font1));
           
            PdfPTable hraded1 = new PdfPTable(1);
			hraded1.setWidthPercentage(100f);
			//GAURAV
			hraded1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			hraded1.addCell(new Paragraph("HRA Calculation", font1));

			float w15[] = { 10f, 8f, 8f, 8f, 11f, 11f, 11f, 11f, 11f, 11f };
			PdfPTable hraded = new PdfPTable(w15);
			hraded.setWidthPercentage(100f);
			hraded.getDefaultCell().setBorder(0);
			hraded.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			hraded.addCell(new Paragraph("Month", font1));
			hraded.addCell(new Paragraph("Working Days", font1));
			hraded.addCell(new Paragraph("Lwp", font1));
			hraded.addCell(new Paragraph("City Mode", font1));
			hraded.addCell(new Paragraph("Rent Paid", font1));
			hraded.addCell(new Paragraph("Salary", font1));
			hraded.addCell(new Paragraph("Rent Paid Over 10% of Salary",
					font1));
			hraded.addCell(new Paragraph("Actual HRA", font1));
			hraded.addCell(new Paragraph("40 or 50% of Salary", font1));
			hraded.addCell(new Paragraph("Least of the three (HRA REBATE)",
					font1));
			hraded.getDefaultCell().setColspan(10);
			//hraded.addCell(tableempty);
			hraded.getDefaultCell().setColspan(1);

			for (int i = 0; i < 12; i++) {
				hraded.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_LEFT);
				hraded.addCell(new Paragraph("ABC", font1));
				hraded.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_RIGHT);
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
				hraded.addCell(new Paragraph((""), font1));
			}
			hraded.getDefaultCell().setColspan(10);
			//hraded.addCell(tableempty);
			hraded.getDefaultCell().setColspan(1);

			hraded.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_LEFT);
			hraded.addCell(new Paragraph("Total", font1));
			hraded.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_RIGHT);
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph("-", font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
			hraded.addCell(new Paragraph((""), font1));
hraded.getDefaultCell().setBorderWidth(0);
			hraded1.addCell(hraded);
			
			PdfPTable LTATablemain=new PdfPTable(1);
			LTATablemain.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			//LTATablemain.getDefaultCell().setFixedHeight(100f);
			LTATablemain.addCell(new Paragraph("LTA Calculation",font1));
			
            float borderTableLTAPart[]={25f,25f,25f,25f};
            float borderTableMEDPart[]={25f,25f,25f,25f};	            
            PdfPTable LTATable=new PdfPTable(borderTableLTAPart);	            
            LTATable.getDefaultCell().setBorder(0);
            LTATable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            LTATable.addCell(new Paragraph("LTA Entitlement",font1));            
            LTATable.addCell(new Paragraph("Approved LTA Bills",font1));
            LTATable.addCell(new Paragraph("LTA Taxable",font1));
            LTATable.addCell(new Paragraph("LTA NonTaxable",font1));
            LTATable.addCell(new Paragraph("1000",font1));            
            LTATable.addCell(new Paragraph("1000",font1));
            LTATable.addCell(new Paragraph("1000",font1));
            LTATable.addCell(new Paragraph("1000",font1));
            PdfPTable LTATablemain1=new PdfPTable(1);
			LTATablemain1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			LTATablemain1.getDefaultCell().setBorder(0);
			LTATablemain1.addCell(new Paragraph("",font1));  
            
			PdfPTable MEDTablemain=new PdfPTable(1);
            MEDTablemain.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            MEDTablemain.getDefaultCell().setColspan(10);
            MEDTablemain.addCell(new Paragraph("MEDICAL Calculation",font1));  
            
            PdfPTable MEDTable=new PdfPTable(borderTableMEDPart);
            MEDTable.getDefaultCell().setBorder(0);
            MEDTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            MEDTable.addCell(new Paragraph("MEDICAL Entitlement",font1));            
            MEDTable.addCell(new Paragraph("Approved Medical Bills",font1));
            MEDTable.addCell(new Paragraph("Medical Taxable",font1));
            MEDTable.addCell(new Paragraph("Medical NonTaxable",font1));
            MEDTable.addCell(new Paragraph("1000",font1));            
            MEDTable.addCell(new Paragraph("1000",font1));
            MEDTable.addCell(new Paragraph("1000",font1));
            MEDTable.addCell(new Paragraph("1000",font1));				
			//Gaurav
            LTATablemain.addCell(LTATable);
            MEDTablemain.addCell(MEDTable);
           // docum.add(summaryTable);
            docum.add(compTable);
            docum.add(horizontalLine);
           // docum.add(toTable);
            //docum.add(noteTable);
            docum.add(LTATablemain);
            docum.add(LTATablemain1);
            docum.add(MEDTablemain);
            docum.add(hraded1);
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