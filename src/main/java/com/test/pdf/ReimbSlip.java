/*
 * Created on Sep 29, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
public class ReimbSlip {

	public static void main(String[] args) {
		try {
			createReimbSlip();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	/**
	 * 
	 */
	private static void createReimbSlip() throws IOException,
	FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub

		Document document = new Document(PageSize.LETTER.rotate(),10,10,10,10);
		PdfWriter
				.getInstance(document, new FileOutputStream("D:\\Reimbursement_Slip\\saptest.pdf"));
		Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10);
		Font font2 = FontFactory.getFont(FontFactory.TIMES_BOLD, 3);
		Font font3 = FontFactory.getFont(FontFactory.TIMES_BOLD, 8);
		Font font4 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 10);

		Font hardfont = FontFactory.getFont(FontFactory.TIMES_BOLD, 12.0f);
		Font hardfont1 = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f);
		Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 15.0f);
		Font Fontb = FontFactory.getFont(FontFactory.TIMES_BOLD, 9.0f);
		Font headingFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD,10.0f);
		Font normalFont = FontFactory.getFont(FontFactory.TIMES, 9.0f);
		document.open();

		float payTableimg[] = { 30f, 70f };
		float payTablePart[] = { 50f, 50f };
		float pay1TablePart[] = { 3f, 97f };
		float pay5[] = { 14f, 86F };
		float pay6[] = { 75f, 25F };
		float[] tablebreak1 = { 20f, 30f, 20f, 30f };
		float[] tablebreak2 = { 10f, 50f, 10f, 15f, 15f };
		float[] tablebreak3 = { 18f, 16f, 16f, 16f, 16f, 16f, 17f, 16f,
				23f, 17f, 18f };
		float[] tablebreak4 = { 0f, 35f, 17f, 17f, 17f, 25, 25f, 0f, 0f, 0f };
		float[] tablebreak5 = { 35f, 17f, 17f, 17f, 25, 25f };

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
		borderTable.setWidthPercentage(100f);
		borderTable.getDefaultCell().setFixedHeight(570);
		borderTable.getDefaultCell().setBorderWidth(1.0f);
		borderTable.getDefaultCell().setPadding(10.0f);
		
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
		
		imgTable1.addCell(new Paragraph("Sapient Consulting Pvt Ltd", hardfont));		
		imgTable1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		imgTable1.addCell(new Paragraph("Reimbursment Slip as at December 31,2013", hardfont));
		
		mainTable1.addCell(imgTable1);
		
		PdfPTable maintable22 = new PdfPTable(tablebreak1);		
		maintable22.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		maintable22.addCell(new Paragraph("Name", font4));
		maintable22.addCell(new Paragraph("Gaurav Kumar Singh", font4));
		maintable22.addCell(new Paragraph("Sapient ID", font4));
		maintable22.addCell(new Paragraph("Sap ID", font4));
		maintable22.addCell(new Paragraph("Designation", font4));
		maintable22.addCell(new Paragraph("Gaurav Kumar Singh", font4));
		maintable22.addCell(new Paragraph("Payroll ID", font4));
		maintable22.addCell(new Paragraph("Sap ID", font4));
		maintable22.addCell(new Paragraph("Department", font4));
		maintable22.addCell(new Paragraph("Gaurav Kumar Singh", font4));
		maintable22.addCell(new Paragraph("D.O.J.", font4));
		maintable22.addCell(new Paragraph("Sap ID", font4));
		maintable22.addCell(new Paragraph("Location", font4));
		maintable22.addCell(new Paragraph("Gaurav Kumar Singh", font4));
		maintable22.addCell(new Paragraph("Bank A/C No.", font4));
		maintable22.addCell(new Paragraph("Sap ID", font4));
		mainTable1.addCell(maintable22);

		mainTable1.addCell(new Paragraph("", font1));
		
		PdfPTable maintable24 = new PdfPTable(tablebreak3);
		maintable24.getDefaultCell().setFixedHeight(30);
		maintable24.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		maintable24.addCell(new Paragraph("Description", font1));		
		maintable24.addCell(new Paragraph("Bills C/F from Previous Quarter", font1));
		maintable24.addCell(new Paragraph("Entitlement C/F deom Previous Quarter", font1));
		maintable24.addCell(new Paragraph("Oct'13 Entitlement", font1));
		maintable24.addCell(new Paragraph("Nov'13 Entitlement", font1));
		maintable24.addCell(new Paragraph("Dec'13 Entitlement", font1));
		maintable24.addCell(new Paragraph("Total Accumulated ammount till date", font1));
		maintable24.addCell(new Paragraph("Bills Approved", font1));
		maintable24.addCell(new Paragraph("Payment made in Oct'13", font1));
		maintable24.addCell(new Paragraph("Entitlement C/F to next Quarter", font1));
		maintable24.addCell(new Paragraph("Bills C/F to next Quarter",font1));
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));
		
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));
		maintable24.addCell(new Paragraph("", font4));
		maintable24.addCell(new Paragraph("(A)", font4));
		maintable24.addCell(new Paragraph("(B)", font4));
		maintable24.addCell(new Paragraph("(C)", font4));
		maintable24.addCell(new Paragraph("(D)", font4));
		maintable24.addCell(new Paragraph("(E)", font4));
		maintable24.addCell(new Paragraph("(F)=(B+C+D+E)", font4));
		maintable24.addCell(new Paragraph("(G)", font4));
		maintable24.addCell(new Paragraph("(H)={Least of(F)}&(G+A)", font4));
		maintable24.addCell(new Paragraph("(F-H)", font4));
		maintable24.addCell(new Paragraph("(G+A-H)", font4));		
		
		mainTable1.addCell(maintable24);
		mainTable1.addCell(new Paragraph("", font1));		
		borderTable.addCell(mainTable1);		
		document.add(borderTable);
		document.close();	
	}
}