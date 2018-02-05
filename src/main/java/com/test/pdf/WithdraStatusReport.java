/*
 * Created on 27 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.io.FileOutputStream;

import com.lowagie.text.Document;
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
public class WithdraStatusReport extends Varialbles {

	public static void main(String[] args) {
		System.out.println("KBG");
		Document document = new Document(PageSize.A4, 30, 30, 30, 30);
		try {
			PdfWriter.getInstance(document, new FileOutputStream(
					"D:\\Report.pdf"));
			document.open();

			PdfPTable outterBorder = new PdfPTable(1);
			outterBorder.setWidthPercentage(100f);
			outterBorder.getDefaultCell().setFixedHeight(800f);
			outterBorder.getDefaultCell().setBorderWidth(0f);

			PdfPTable innerBorder = new PdfPTable(1);
			innerBorder.setSpacingAfter(20);
			//innerBorder.getDefaultCell().s
			innerBorder.getDefaultCell().setFixedHeight(700f);
			innerBorder.getDefaultCell().setBorderWidth(0f);

			innerBorder.addCell(new Paragraph("Dear Inder,", font1));
			innerBorder
					.addCell(new Paragraph(
							"The details of PF withdrawal from provident Fund for Repayment of Housing Loan of Rajat Das details are as under :,",
							font1));
			
			outterBorder.addCell(innerBorder);
			document.add(outterBorder);
			if (document.isOpen()) {
				document.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}