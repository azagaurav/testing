/*
 * Created on Oct 10, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.pdf;

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
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.test.CompanyDom;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class As {

	public static void main(String[] args) {
		Document docum = new Document();
		CompanyDom cmd=new CompanyDom();
		HistoryDom hd=new HistoryDom();
		CreatePayslipDTO firsthalf=new CreatePayslipDTO();
		CreatePayslipDTO secndhalf=new CreatePayslipDTO();
		String foldername = "D:/sapeientff";
		String mystr="";
		ConfigPaySlip config=new ConfigPaySlip();
		String tds="";
		double daysofmnth=1;
		String dol;
		String dor;
		String enchacement;

		try {
			String addr = foldername;
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

			if (config != null) {
				logo_show = config.getLogo_show();
				logo_size = config.getLogo_size();
				logo_align = config.getLogo_align();
				comp_lable_size = config.getComp_lable_size();
				comp_lable_font = config.getComp_lable_font();
				comp_lable_align = config.getComp_lable_align();
				add_lable_size = config.getAdd_lable_size();
				add_lable_font = config.getAdd_lable_font();
				payslip_head_size = config.getPayslip_head_size();
				payslip_head_font = config.getPayslip_head_font();
				emp_detail_size = config.getEmp_detail_size();
				emp_detail_font = config.getEmp_detail_font();
				earn_dedu_size = config.getEarn_dedu_size();
				head_size = config.getHead_size();
				head_size2 = head_size + 1;
				head_font = config.getHead_font();
				earn_rate_show = config.getEarn_rate_show();
				earn_monthly_show = config.getEarn_monthly_show();
				earn_arrear_show = config.getEarn_arrear_show();
				ded_rate_show = config.getDed_rate_show();
				ded_monthly_show = config.getDed_monthly_show();
				ded_arrear_show = config.getDed_arrear_show();
				ytds_show = config.getYtds_show();
				remark = config.getRemark();
				MAX_SIZE = config.getMAX_SIZE();
				if (config.getLogosize() != null) {
					logosize = config.getLogosize();
				}

				//System.out.println("size" + logosize);

			}
			File fff = new File(addr);
			fff.mkdirs();
			docum = new Document();
			PdfWriter.getInstance(docum, new FileOutputStream(addr
					+ "/PAY_SLIP" + hd.getEmpCode() + ".pdf"));
			docum.open();
			//System.out.println("value of left" + Image.LEFT );
			//System.out.println("value of right" + Image.RIGHT );
			//System.out.println("value of center" + Image.ALIGN_CENTER );
			// Declaring Fonts
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

			if (cmd != null) {
				//sanjeev image not availabe
				if (logo_show == 1) {
					if (cmd.getLogo().equalsIgnoreCase("NA") == false) {
						String lg = "C:/logo/" + cmd.getLogo();
						Image gif = Image.getInstance(lg);
						gif.setAlignment(Element.ALIGN_LEFT);

						String[] logoarr = logosize.split(",");
						System.out.println("size-sanjeev-" + logoarr[0]
								+ "---and--" + logoarr[1]);
						gif.scaleAbsolute(Integer.parseInt(logoarr[0]), Integer
								.parseInt(logoarr[1]));
						docum.add(gif);
					}
				}//image code--
				String Label1 = cmd.getCompName();
				String Label2 = cmd.getCompAdd();
				PdfPTable tables = new PdfPTable(1);
				tables.getDefaultCell().setBorder(0);
				tables.getDefaultCell().setPadding(5);
				tables.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_RIGHT);
				tables.getDefaultCell().setNoWrap(true);
				tables.addCell(new Paragraph(Label1, fo1));
				tables.addCell(new Paragraph(Label2, fo2));

				tables.setWidthPercentage(100);
				tables.setSpacingAfter(5f);

				docum.add(tables);

			}
			String monthstring = "0";
			String Label = "Pay Slip For " + "[" + mystr + "]";
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
			table.addCell(new Paragraph(hd.getEmpCode(), fonts));

			table.addCell(new Paragraph("PSID", fonts));
			table.addCell(new Paragraph(hd.getDob(), fonts));

			table.addCell(new Paragraph("NAME", fonts));
			table.addCell(new Paragraph(hd.getEmpName(), fonts));

			table.addCell(new Paragraph("D.O.J.(YYYY-MM-DD)", fonts));
			table.addCell(new Paragraph(hd.getDoj(), fonts));

			table.addCell(new Paragraph("DESIGNATION", fonts));
			table.addCell(new Paragraph(hd.getDesg(), fonts));
			table.addCell(new Paragraph("PF NO.", fonts));
			table.addCell(new Paragraph(hd.getPfnumber(), fonts));

			/*
			 * table.addCell(new Paragraph("ESI NO.",fonts)); table.addCell(new
			 * Paragraph(hd.getEsinumber() ,fonts));
			 */

			table.addCell(new Paragraph("DEPARTMENT", fonts));
			table.addCell(new Paragraph(hd.getDept(), fonts));
			table.addCell(new Paragraph("PAY DAYS", fonts));
			double paydays = daysofmnth - hd.getLeave();
			String spay = String.valueOf(paydays);
			table.addCell(new Paragraph(spay, fonts));
			table.addCell(new Paragraph("LOCATION", fonts));
			table.addCell(new Paragraph(hd.getLocation(), fonts));
			table.addCell(new Paragraph("PAN", fonts));
			table.addCell(new Paragraph(hd.getPanno(), fonts));

			table.addCell(new Paragraph("BANK NAME", fonts));
			table.addCell(new Paragraph(hd.getBankName(), fonts));
			//table.addCell(new Paragraph("GRADE",fonts));
			//table.addCell(new Paragraph("",fonts));
			table.addCell(new Paragraph("Bank A/C No.", fonts));
			table.addCell(new Paragraph(hd.getBankAcc(), fonts));
			/*
			 * table.addCell(new Paragraph("BAND",fonts)); table.addCell(new
			 * Paragraph(hd.getGrade(),fonts));
			 * 
			 * 
			 * table.addCell(new Paragraph("",fonts)); table.addCell(new
			 * Paragraph("",fonts));
			 */
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

			if (firsthalf != null) {
				if (MAX_SIZE < firsthalf.getCompo().length) {
					MAX_SIZE = firsthalf.getCompo().length + 2;
				}
			}
			if (secndhalf != null) {
				if (MAX_SIZE < secndhalf.getCompo().length) {
					MAX_SIZE = secndhalf.getCompo().length + 2;
				}
			}

			for (int po = 0; po < MAX_SIZE; po++) {
				if (firsthalf == null) {
					table3.addCell(new Paragraph("", font2));
					if (earn_rate_show == 1)
						table3.addCell(new Paragraph("", font2));
					if (earn_monthly_show == 1)
						table3.addCell(new Paragraph("", font2));
					if (earn_arrear_show == 1)
						table3.addCell(new Paragraph("", font2));

				} else {

					if (po < firsthalf.getCompo().length) {
						table3.getDefaultCell().setHorizontalAlignment(
								Element.ALIGN_LEFT);
						table3.addCell(new Paragraph(firsthalf.getCompo()[po],
								font2));
						table3.getDefaultCell().setHorizontalAlignment(
								Element.ALIGN_RIGHT);
						if (earn_rate_show == 1)
							table3.addCell(new Paragraph("Rnd(firsthalf.getPlanamt()[po])", font2));
						if (earn_monthly_show == 1)
							table3.addCell(new Paragraph("Rnd(firsthalf.getMainamt()[po])", font2));
						if (earn_arrear_show == 1)
							table3.addCell(new Paragraph("Rnd(firsthalf.getArrearamt()[po])", font2));
					} else {
						table3.addCell(new Paragraph("", font2));
						if (earn_rate_show == 1)
							table3.addCell(new Paragraph("", font2));
						if (earn_monthly_show == 1)
							table3.addCell(new Paragraph("", font2));
						if (earn_arrear_show == 1)
							table3.addCell(new Paragraph("", font2));

					}
				}
				if (secndhalf == null) {
					table3.addCell(new Paragraph("", font2));
					if (ded_rate_show == 1)
						table3.addCell(new Paragraph("", font2));
					if (ded_monthly_show == 1)
						table3.addCell(new Paragraph("", font2));
					if (ded_arrear_show == 1)
						table3.addCell(new Paragraph("", font2));

				} else {

					if (po < secndhalf.getCompo().length) {
						table3.getDefaultCell().setHorizontalAlignment(
								Element.ALIGN_LEFT);
						table3.addCell(new Paragraph(secndhalf.getCompo()[po],
								font2));
						table3.getDefaultCell().setHorizontalAlignment(
								Element.ALIGN_RIGHT);
						if (ded_rate_show == 1)
							table3.addCell(new Paragraph("Rnd(secndhalf.getPlanamt()[po])", font2));
						if (ded_monthly_show == 1)
							table3.addCell(new Paragraph("Rnd(secndhalf.getMainamt()[po])", font2));
						if (ded_arrear_show == 1)
							table3.addCell(new Paragraph("Rnd(secndhalf.getArrearamt()[po])", font2));
					} else {
						table3.addCell(new Paragraph("", font2));
						if (ded_rate_show == 1)
							table3.addCell(new Paragraph("", font2));
						if (ded_monthly_show == 1)
							table3.addCell(new Paragraph("", font2));
						if (ded_arrear_show == 1)
							table3.addCell(new Paragraph("", font2));

					}
				}

			}

			docum.add(table3);

			PdfPTable table4 = new PdfPTable(wid);
			table4.setWidthPercentage(100f);
			table4.addCell(new Paragraph("Total Earning", font2));
			double gplan = 0;
			double gearn = 0;
			double garrear = 0;

			if (firsthalf != null) {
				//if (earn_rate_show == 1)
					//gplan = getFinSum(firsthalf.getPlanamt());
				//if (earn_monthly_show == 1)
					//gearn = getFinSum(firsthalf.getMainamt());
				//if (earn_arrear_show == 1)
					//garrear = getFinSum(firsthalf.getArrearamt());
			}
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (earn_rate_show == 1)
				table4
						.addCell(new Paragraph("Rnd(String.valueOf(gplan))",
								font1));
			if (earn_monthly_show == 1)
				table4
						.addCell(new Paragraph("Rnd(String.valueOf(gearn))",
								font1));
			if (earn_arrear_show == 1)
				table4.addCell(new Paragraph("Rnd(String.valueOf(garrear))",
						font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

			double dplan = 0;
			double dearn = 0;
			double darrear = 0;
			if (secndhalf != null) {
				//if (ded_rate_show == 1)
					//dplan = getFinSum(secndhalf.getPlanamt());
				//if (ded_monthly_show == 1)
					//dearn = getFinSum(secndhalf.getMainamt());
				//if (ded_arrear_show == 1)
					//darrear = getFinSum(secndhalf.getArrearamt());
			}

			table4.addCell(new Paragraph("Total Deduction", font2));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			if (ded_rate_show == 1)
				table4
						.addCell(new Paragraph("Rnd(String.valueOf(dplan))",
								font1));
			if (ded_monthly_show == 1)
				table4
						.addCell(new Paragraph("Rnd(String.valueOf(dearn))",
								font1));
			if (ded_arrear_show == 1)
				table4.addCell(new Paragraph("Rnd(String.valueOf(darrear))",
						font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);

			docum.add(table4);
			docum.add(tableempty);

			double gross = gearn + garrear;
			double ded = dearn + darrear;
			double net = Math.round(gross - ded);

			float w1[] = { 30f, 20f, 30f, 20f };

			PdfPTable table5 = new PdfPTable(w1);

			table5.setWidthPercentage(100f);
			table5.addCell(new Paragraph("Gross Pay", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("Rnd(String.valueOf(gross))", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table5.addCell(new Paragraph("Total Deduction", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("Rnd(String.valueOf(ded))", font1));

			docum.add(table5);

			float w2[] = { 50f, 30f, 20f };

			PdfPTable table7 = new PdfPTable(w2);
			table7.setWidthPercentage(100f);

			table7.addCell(new Paragraph("", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table7.addCell(new Paragraph("Net Pay", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table7.addCell(new Paragraph("Rnd(String.valueOf(net))", font1));
			if (ytds_show == 1) {
				table7.addCell(new Paragraph("", font1));
				table7.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_LEFT);
				table7.addCell(new Paragraph("Tax deducted till the date",
						font1));
				table7.getDefaultCell().setHorizontalAlignment(
						Element.ALIGN_RIGHT);
				table7.addCell(new Paragraph("Rnd(String.valueOf(tds))", font1));
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

			//code for digital signatue
			/*
			 * PdfReader pdf = new
			 * PdfReader(addr+"/PAY_SLIP"+hd.getEmpCode()+".pdf"); PdfStamper
			 * stp = new PdfStamper(pdf, new FileOutputStream("c:\\out.pdf"));
			 * PdfFormField sig = PdfFormField.createSignature(stp.getWriter());
			 * sig.setWidget(new Rectangle(100, 100, 200, 200), null);
			 * sig.setFlags(PdfAnnotation.FLAGS_PRINT); sig.put(PdfName.DA, new
			 * PdfString("/Helv 0 Tf 0 g")); sig.setFieldName("Signature1");
			 * sig.setPage(1); stp.addAnnotation(sig, 1); stp.close();
			 */
			//end of code of digital sinature
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

		//return 1;
	
}
}