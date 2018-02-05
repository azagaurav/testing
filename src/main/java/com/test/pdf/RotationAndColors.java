/*
 * Created on Sep 30, 2013
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class RotationAndColors {
	public static void main(String[] args) throws Exception {
		Document docum = null;
		try {
			String addr = "D:/payslip";
			String logosize = "40,40";

			int logo_show = 1;
			int logo_size = 40;
			int logo_align = 0;
			float comp_lable_size = 16;
			int comp_lable_font = 1;
			int comp_lable_align = 0;
			float add_lable_size = 12;
			int add_lable_font = 1;
			float payslip_head_size = 11;
			int payslip_head_font = 1;
			float emp_detail_size = 10;
			int emp_detail_font = 1;
			float earn_dedu_size = 11;
			float head_size = 9;
			float head_size2 = head_size + 1;
			int head_font = 1;
			int earn_rate_show = 1;
			int earn_monthly_show = 1;
			int earn_arrear_show = 1;
			int ded_rate_show = 0;
			int ded_monthly_show = 1;
			int ded_arrear_show = 0;
			int ytds_show = 1;
			String remark = "";
			int MAX_SIZE = 30;
			File fff = new File(addr);
			fff.mkdirs();
			docum = new Document();
			PdfWriter.getInstance(docum, new FileOutputStream(addr
					+ "/PAY_SLIP" + "hd.getEmpCode()" + ".pdf"));
			docum.open();
			Font fonts = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					emp_detail_size, emp_detail_font);
			Font fo = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					earn_dedu_size, Font.BOLD);
			Font fos = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					payslip_head_size, payslip_head_font);

			Font fo1 = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					comp_lable_size, comp_lable_font);
			Font fo2 = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					add_lable_size, add_lable_font);

			Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					head_size2, Font.BOLD);
			Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN,
					head_size, head_font);

			String lg = "C:/logo/vertexlogo.png";
			Image gif = Image.getInstance(lg);
			gif.setAlignment(Element.ALIGN_LEFT);

			String[] logoarr = logosize.split(",");
			System.out.println("size-sanjeev-" + logoarr[0] + "---and--"
					+ logoarr[1]);
			gif.scaleAbsolute(Integer.parseInt(logoarr[0]), Integer
					.parseInt(logoarr[1]));
			docum.add(gif);

			String Label1 = "Vertex Customer Solutions India Private Limited";
			String Label2 = "Gurgaon";
			PdfPTable tables = new PdfPTable(1);
			tables.getDefaultCell().setBorder(0);
			tables.getDefaultCell().setPadding(5);
			tables.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			tables.getDefaultCell().setNoWrap(true);
			tables.addCell(new Paragraph(Label1, fo1));
			tables.addCell(new Paragraph(Label2, fo2));

			tables.setWidthPercentage(100);
			tables.setSpacingAfter(5f);

			docum.add(tables);

			String monthstring = "0";
			String Label = "Pay Slip For [September/2013]";
			PdfPTable tableempty = new PdfPTable(1);
			tableempty.getDefaultCell().setBorder(1);
			tableempty.getDefaultCell().setPadding(1);
			tableempty.getDefaultCell().setHorizontalAlignment(
					Element.ALIGN_CENTER);
			tableempty.getDefaultCell().setNoWrap(true);
			tableempty.addCell("");
			tableempty.setWidthPercentage(100);
			PdfPTable tablee = new PdfPTable(1);
			tablee.getDefaultCell().setBorder(0);
			tablee.getDefaultCell().setPadding(0);
			tablee.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			tablee.getDefaultCell().setNoWrap(true);
			tablee.addCell(new Paragraph(Label, fos));
			tablee.setWidthPercentage(100);
			tablee.setSpacingAfter(2f);
			docum.add(tablee);
			docum.add(tableempty);
			float width[] = { 18f, 38f, 23f, 21f };
			PdfPTable table = new PdfPTable(width);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table.getDefaultCell().disableBorderSide(3);
			table.addCell(new Paragraph("EMP.ID", fonts));
			table.addCell(new Paragraph("000001", fonts));

			table.addCell(new Paragraph("PSID", fonts));
			table.addCell(new Paragraph("NA", fonts));

			table.addCell(new Paragraph("NAME", fonts));
			table.addCell(new Paragraph("Gaurav Kumar Singh", fonts));

			table.addCell(new Paragraph("D.O.J.(YYYY-MM-DD)", fonts));
			table.addCell(new Paragraph("25-03-1984", fonts));

			table.addCell(new Paragraph("DESIGNATION", fonts));
			table.addCell(new Paragraph("Software Developer", fonts));
			table.addCell(new Paragraph("PF NO.", fonts));
			table.addCell(new Paragraph("00005126", fonts));
			table.addCell(new Paragraph("DEPARTMENT", fonts));
			table.addCell(new Paragraph("IT", fonts));
			table.addCell(new Paragraph("PAY DAYS", fonts));
			String spay = String.valueOf("No. Of Pays Days");
			table.addCell(new Paragraph(spay, fonts));
			table.addCell(new Paragraph("LOCATION", fonts));
			table.addCell(new Paragraph("Gurgaon", fonts));
			table.addCell(new Paragraph("PAN", fonts));
			table.addCell(new Paragraph("CKRPS9742Q", fonts));

			table.addCell(new Paragraph("BANK NAME", fonts));
			table.addCell(new Paragraph("IDBI", fonts));
			table.addCell(new Paragraph("Bank A/C No.", fonts));
			table.addCell(new Paragraph("0058690", fonts));
			table.setWidthPercentage(100f);
			docum.add(table);
			PdfPTable table1 = new PdfPTable(1);
			table1.setWidthPercentage(100f);
			table1.addCell("");

			docum.add(tableempty);
			int eshows = earn_rate_show + earn_monthly_show + earn_arrear_show;
			int dshows = ded_rate_show + ded_monthly_show + ded_arrear_show;
			float[] dmc1 = { 50f, 50f };
			float[] dmc2 = { 20f, 10f, 10f, 10f, 20f, 10f, 10f, 10f };
			if (eshows == 3 && dshows == 2) {
				float[] dmc = { 20f, 10f, 10f, 10f, 20f, 15f, 15f };
				dmc2 = dmc;
			} else if (eshows == 3 && dshows == 3) {
				float[] dmc = { 20f, 10f, 10f, 10f, 20f, 10f, 10f, 10f };
				dmc2 = dmc;
			} else if (eshows == 3 && dshows == 1) {
				float[] dmci = { 65, 35 };
				float[] dmc = { 20f, 15f, 15f, 15f, 20f, 15f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 1 && dshows == 3) {
				float[] dmci = { 35, 65 };
				float[] dmc = { 20f, 15f, 20f, 15f, 15f, 15f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 2 && dshows == 3) {
				float[] dmc = { 20f, 15f, 15f, 20f, 10f, 10f, 10f };
				dmc2 = dmc;
			} else if (eshows == 1 && dshows == 1) {
				float[] dmc = { 30f, 20f, 30f, 20f };
				dmc2 = dmc;
			} else if (eshows == 2 && dshows == 2) {
				float[] dmc = { 20f, 15f, 15f, 20f, 15f, 15f };
				dmc2 = dmc;
			} else if (eshows == 2 && dshows == 1) {
				float[] dmci = { 65, 35 };
				float[] dmc = { 25f, 20f, 20f, 20f, 15f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 1 && dshows == 2) {
				float[] dmci = { 35, 65 };
				float[] dmc = { 20f, 15f, 25f, 20f, 20f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 0 && dshows == 1) {
				float[] dmci = { 35, 65 };
				float[] dmc = { 35f, 35f, 30f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 0 && dshows == 2) {
				float[] dmci = { 35, 65 };
				float[] dmc = { 35f, 25f, 20f, 20f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 0 && dshows == 3) {
				float[] dmci = { 25, 75 };
				float[] dmc = { 25f, 30f, 15f, 15f, 15f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 0 && dshows == 0) {
				float[] dmci = { 50, 50 };
				float[] dmc = { 50f, 50f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 3 && dshows == 0) {
				float[] dmci = { 75, 25 };
				float[] dmc = { 30f, 15f, 15f, 15f, 25f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 2 && dshows == 0) {
				float[] dmci = { 65, 35 };
				float[] dmc = { 25f, 20f, 20f, 35f };
				dmc1 = dmci;
				dmc2 = dmc;
			} else if (eshows == 1 && dshows == 0) {
				float[] dmci = { 65, 35 };
				float[] dmc = { 35f, 35f, 30f };
				dmc1 = dmci;
				dmc2 = dmc;
			}

			float w[] = dmc1;
			PdfPTable table2 = new PdfPTable(w);
			table2.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(new Paragraph("Earnings", fo));
			table2.addCell(new Paragraph("Deductions", fo));
			table2.setWidthPercentage(100f);
			docum.add(table2);
			float wid[] = dmc2;
			PdfPTable table3 = new PdfPTable(wid);
			table3.setWidthPercentage(100f);
			table3.addCell(new Paragraph("Description", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (earn_rate_show == 1)
				table3.addCell(new Paragraph("Rate", font1));
			if (earn_monthly_show == 1)
				table3.addCell(new Paragraph("Amount", font1));
			if (earn_arrear_show == 1)
				table3.addCell(new Paragraph("Arrear", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table3.addCell(new Paragraph("Description", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (ded_rate_show == 1)
				table3.addCell(new Paragraph("Rate", font1));
			if (ded_monthly_show == 1)
				table3.addCell(new Paragraph("Amount", font1));
			if (ded_arrear_show == 1)
				table3.addCell(new Paragraph("Arrear", font1));
			table3.getDefaultCell().disableBorderSide(3);

			table3.addCell(new Paragraph("", font2));
			if (earn_rate_show == 1)
				table3.addCell(new Paragraph("", font2));
			if (earn_monthly_show == 1)
				table3.addCell(new Paragraph("", font2));
			if (earn_arrear_show == 1)
				table3.addCell(new Paragraph("", font2));

			table3.addCell(new Paragraph("", font2));
			if (ded_rate_show == 1)
				table3.addCell(new Paragraph("", font2));
			if (ded_monthly_show == 1)
				table3.addCell(new Paragraph("", font2));
			if (ded_arrear_show == 1)
				table3.addCell(new Paragraph("", font2));

			docum.add(table3);
			PdfPTable table4 = new PdfPTable(wid);
			table4.setWidthPercentage(100f);
			table4.addCell(new Paragraph("Total Earning", font2));
			double gplan = 0;
			double gearn = 0;
			double garrear = 0;
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (earn_rate_show == 1)
				table4.addCell(new Paragraph("gplan", font1));
			if (earn_monthly_show == 1)
				table4.addCell(new Paragraph("gearn", font1));
			if (earn_arrear_show == 1)
				table4.addCell(new Paragraph("garrear", font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

			/*
			 * double dplan = 0; double dearn = 0; double darrear = 0; if
			 * (secndhalf != null) { if (ded_rate_show == 1) dplan =
			 * getFinSum(secndhalf.getPlanamt()); if (ded_monthly_show == 1)
			 * dearn = getFinSum(secndhalf.getMainamt()); if (ded_arrear_show ==
			 * 1) darrear = getFinSum(secndhalf.getArrearamt()); }
			 */

			table4.addCell(new Paragraph("Total Deduction", font2));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (ded_rate_show == 1)
				table4.addCell(new Paragraph("dplan", font1));
			if (ded_monthly_show == 1)
				table4.addCell(new Paragraph("dearn", font1));
			if (ded_arrear_show == 1)
				table4.addCell(new Paragraph("darrear", font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

			docum.add(table4);
			docum.add(tableempty);
			double gross = gearn + garrear;
			double ded = 0;
			double net = Math.round(gross - ded);
			float w1[] = { 30f, 20f, 30f, 20f };
			PdfPTable table5 = new PdfPTable(w1);
			table5.setWidthPercentage(100f);
			table5.addCell(new Paragraph("Gross Pay", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("gross", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table5.addCell(new Paragraph("Total Deduction", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("ded", font1));
			docum.add(table5);
			float w2[] = { 50f, 30f, 20f };
			PdfPTable table7 = new PdfPTable(w2);
			table7.setWidthPercentage(100f);
			table7.addCell(new Paragraph("", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table7.addCell(new Paragraph("Net Pay", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table7.addCell(new Paragraph("net", font1));
			if (ytds_show == 1) {
				table7.addCell(new Paragraph("", font1));
				table7.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_LEFT);
				table7.addCell(new Paragraph("Tax deducted till the date",
						font1));
				table7.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_RIGHT);
				table7.addCell(new Paragraph("r", font1));
			}
			docum.add(table7);

			PdfPTable table6 = new PdfPTable(1);

			table6.setWidthPercentage(100f);
			String remarks = "Remarks: " + remark;
			table6.addCell(new Paragraph(remarks, font1));
			docum.add(table6);

			PdfPTable table9 = new PdfPTable(1);
			table9.setWidthPercentage(100f);
			table9.getDefaultCell().setBorder(0);
			table9.getDefaultCell().setPadding(0);
			table9.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			table9
					.addCell(new Paragraph(
							"This is a computer generated Pay Slip and doesn't require signature",
							font1));
			docum.add(table9);
			docum.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (BadElementException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

}