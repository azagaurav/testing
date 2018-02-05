/*
 * Created on Oct 9, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class RotationAndColors1 {

	/**
	 * @param rs
	 * @param counter
	 * @param empcode
	 * @param codes
	 */
	public void CreatePaySlip(ResultSet rs, String codes, String empcode, int counter) {
		// TODO Auto-generated method stub

		String month = "August";
		Document docum = null;
		try {
			empcode=rs.getString("emp_code");
			//System.out.println("Going to create PDF "+empcode);
			String addr = "D:/payslip/" + month;
			String logosize = "80,80";

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
			//System.out.println("!!!!!!   1");
			docum = new Document();
			String[] compoStr = "BASIC,DA,HRA,CONVeyance,CONVTH,WASH Allowance,	MEDICAL,NGHTALL,CCA,SUPL,Consltfee,STBONUS,SPA,STIPEND,FOODCOPNALL,OTHEARN All,INCENTIVE All,REFINC All,PERFBONUS All,EFFECIENCY ALLOWANCE,Join Bonus All,TRAVELALL All,KRA All,TRAINGATTED All,NOTICPAY All,LEAVEENCASH All,EXGRATIA All,Shift All,LANGALL ALL,ARRLANGALL ALL"
					.split(",");
			PdfWriter.getInstance(docum, new FileOutputStream(addr
					+ "/PAY_SLIP" + rs.getString("emp_code") + ".pdf"));
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

			String lg = "C:/logo/vertexlogo.jpg";
			Image gif = Image.getInstance(lg);
			gif.setAlignment(Element.ALIGN_RIGHT);
			//System.out.println("!!!!!!   2");
			String[] logoarr = logosize.split(",");
			gif.scaleAbsolute(Integer.parseInt(logoarr[0]), Integer
					.parseInt(logoarr[1]));
			docum.add(gif);

			String Label1 = "Vertex Customer Solutions India Private Limited";
			String Label2 = "Gurgaon";
			PdfPTable tables = new PdfPTable(1);
			tables.getDefaultCell().setBorder(0);
			tables.getDefaultCell().setPadding(5);
			tables.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			tables.getDefaultCell().setNoWrap(true);
			tables.addCell(new Paragraph(Label1, fo1));
			//tables.addCell(new Paragraph(Label2, fo2));

			tables.setWidthPercentage(100);
			tables.setSpacingAfter(5f);
			//System.out.println("!!!!!!   3");
			docum.add(tables);

			String monthstring = "0";
			String Label = "Pay Slip For [" + month + "/2013]";
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
			float width[] = { 25f, 25f, 25f, 25f };
			PdfPTable table = new PdfPTable(width);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table.getDefaultCell().disableBorderSide(3);
			table.addCell(new Paragraph("EMP.ID", fonts));
			table.addCell(new Paragraph(rs.getString("emp_code"), fonts));
			table.addCell(new Paragraph("NAME", fonts));
			table.addCell(new Paragraph(rs.getString("emp_Name"), fonts));
			table.addCell(new Paragraph("D.O.J.(DD-MMM-YY)", fonts));
			table.addCell(new Paragraph(rs.getString("doj"), fonts));
			table.addCell(new Paragraph("DESIGNATION", fonts));
			table.addCell(new Paragraph(rs.getString("designation"), fonts));
			table.addCell(new Paragraph("PF NO.", fonts));
			table.addCell(new Paragraph(rs.getString("month"), fonts));
			table.addCell(new Paragraph("DEPARTMENT", fonts));
			table.addCell(new Paragraph(rs.getString("function"), fonts));
			table.addCell(new Paragraph("PAY DAYS", fonts));
			String spay = String.valueOf(rs.getString("days_Worked"));
			table.addCell(new Paragraph(spay, fonts));
			table.addCell(new Paragraph("LOCATION", fonts));
			table.addCell(new Paragraph(rs.getString("location"), fonts));
			/*
			 * table.addCell(new Paragraph("PAN", fonts)); table.addCell(new
			 * Paragraph(rs.getString("location"), fonts));
			 */
			//System.out.println("!!!!!!   4");
			table.addCell(new Paragraph("BANK NAME", fonts));
			table.addCell(new Paragraph(rs.getString("bank_Name"), fonts));
			table.addCell(new Paragraph("Bank A/C No.", fonts));
			table.addCell(new Paragraph(rs.getString("bank_Accno"), fonts));
			/*
			 * table.addCell(new Paragraph("PSID", fonts)); table.addCell(new
			 * Paragraph("NA", fonts));
			 */
			//System.out.println("!!!!!!   5");
			table.setWidthPercentage(100f);
			docum.add(table);
			PdfPTable table1 = new PdfPTable(1);
			table1.setWidthPercentage(100f);
			table1.addCell("");
			docum.add(tableempty);
			float w[] = { 57f, 43f };
			PdfPTable table2 = new PdfPTable(w);
			table2.getDefaultCell()
					.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(new Paragraph("Earnings", fo));
			table2.addCell(new Paragraph("Deductions", fo));
			table2.setWidthPercentage(100f);
			docum.add(table2);
			//Method to set Earning and Deductions
			//System.out.println("Method to set Earning and Deductions");
			Collection clsEarn = getEarning(rs,codes,empcode,counter);
			//System.out.println("EMPCODE !!!!! "+empcode);
			float wid[] = { 25f, 16f, 16f, 25f, 18f };
			//System.out.println("!!!!!!   6");
			PdfPTable table3 = new PdfPTable(wid);
			table3.setWidthPercentage(100f);
			table3.addCell(new Paragraph("Description", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table3.addCell(new Paragraph("Amount", font1));
			table3.addCell(new Paragraph("Arrear", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table3.addCell(new Paragraph("Description", font1));
			table3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table3.addCell(new Paragraph("Amount", font1));
			table3.getDefaultCell().disableBorderSide(3);
			Iterator itr;
			String combined[];
			String combo = "";
			double arrTotal = 0.0;
			double earnTotal = 0.0;
			itr = clsEarn.iterator();
			while (itr.hasNext()) {
				//System.out.println(":::: 1");
				combo = (String) itr.next();
				combined = combo.split(",");
				if ((combined[0]).equals("~")) {
					table3.addCell(new Paragraph("", font2));
				} else {
					table3.getDefaultCell().setHorizontalAlignment(
							Element.ALIGN_LEFT);
					//System.out.println(":::: 2");
					table3.addCell(new Paragraph(combined[0], font2));
				}
				if ((combined[1]).equals("~")) {
					table3.addCell(new Paragraph("", font2));
				} else {
					table3.getDefaultCell().setHorizontalAlignment(
							Element.ALIGN_RIGHT);
					//System.out.println(":::: 3");
					earnTotal = earnTotal + Double.parseDouble(combined[1]);
					table3.addCell(new Paragraph(combined[1], font2));
				}
				if ((combined[2]).equals("~")) {
					table3.addCell(new Paragraph("", font2));
				} else {
					arrTotal = arrTotal + Double.parseDouble(combined[2]);
					//System.out.println(":::: 4");
					table3.addCell(new Paragraph(combined[2], font2));
				}
				if ((combined[3]).equals("~")) {
					table3.addCell(new Paragraph("", font2));
				} else {
					table3.getDefaultCell().setHorizontalAlignment(
							Element.ALIGN_LEFT);
					//System.out.println(":::: 5");
					table3.addCell(new Paragraph(combined[3], font2));
				}
				if ((combined[4]).equals("~")) {
					table3.addCell(new Paragraph("", font2));
				} else {
					table3.getDefaultCell().setHorizontalAlignment(
							Element.ALIGN_RIGHT);
					//System.out.println(":::: 6");
					table3.addCell(new Paragraph(combined[4], font2));
				}
			}
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			table3.addCell(new Paragraph("", font2));
			docum.add(table3);

			PdfPTable table4 = new PdfPTable(wid);
			table4.setWidthPercentage(100f);
			table4.addCell(new Paragraph("Total Earning", font2));
			double grosSal = Double.parseDouble(rs.getString("gross_Salary"));
			double dedTotal = Double.parseDouble(rs
					.getString("total_Deduction"));
			//System.out.println(":::: 7");
			double gearn = 0;
			double garrear = 0;
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table4.addCell(new Paragraph("" + earnTotal, font1));
			table4.addCell(new Paragraph("" + arrTotal, font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table4.addCell(new Paragraph("Total Deduction", font2));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table4.addCell(new Paragraph("" + dedTotal, font1));
			table4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			//System.out.println(":::: 8");
			docum.add(table4);
			docum.add(tableempty);
			double gross = earnTotal + arrTotal;
			double ded = Double.parseDouble(rs.getString("total_Deduction"));
			double net = Math.round(gross - ded);
			float w1[] = { 25f, 32f, 25f, 18f };
			PdfPTable table5 = new PdfPTable(w1);
			table5.setWidthPercentage(100f);
			table5.addCell(new Paragraph("Gross Pay", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("" + gross, font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table5.addCell(new Paragraph("Total Deduction", font1));
			table5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table5.addCell(new Paragraph("" + ded, font1));
			docum.add(table5);
			//System.out.println(":::: 9");
			float w2[] = { 57f, 25f, 18f };
			PdfPTable table7 = new PdfPTable(w2);
			table7.setWidthPercentage(100f);
			table7.addCell(new Paragraph("", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			table7.addCell(new Paragraph("Net Pay", font1));
			table7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			table7.addCell(new Paragraph("" + net, font1));

			docum.add(table7);
			//System.out.println(":::: 10");
			PdfPTable table6 = new PdfPTable(1);

			table6.setWidthPercentage(100f);
			String remarks = "Remarks: " + remark;
			table6.addCell(new Paragraph(remarks, font1));
			docum.add(table6);
			//System.out.println(":::: 11");
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
			//System.out.println(":::: 12");
			docum.add(table9);
			docum.close();
			//System.out.println("PDF has been created!!!!!!!!!!"+empcode);
		} catch (Exception e) {
			codes=codes+empcode;
			System.out.println("Code of Exceptions :::::: "+codes);
			e.printStackTrace();
		} finally {

		}

	}

	/**
	 * @param rs
	 * @param counter
	 * @param empcode
	 * @param codes
	 * @return
	 */
	private Collection getEarning(ResultSet rs, String codes, String empcode, int counter) {
		// TODO Auto-generated method stub
		//System.out.println("Method to set Earning and Deductions 1");
		Collection cls = new ArrayList();
		String combination = "";		
		try {
			empcode=rs.getString("emp_Code");
			//System.out.println("combination ::: " + combination);
			//Earning Part
			double basic_All = Double.parseDouble(rs.getString("basic_All"));
			double arr_Basic_All = Double.parseDouble(rs
					.getString("arr_Basic_All"));
			if (basic_All > 0||basic_All < 0 || arr_Basic_All > 0|| arr_Basic_All< 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Basic," + basic_All + ","
					+ arr_Basic_All;
				} else {
					combination = combination + "!Basic," + basic_All + ","
					+ arr_Basic_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double da_All = Double.parseDouble(rs.getString("da_All"));
			double arda_All = Double.parseDouble(rs.getString("arda_All"));
			if (da_All > 0 || arda_All > 0||da_All < 0 || arda_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "DA," + da_All + "," + arda_All;
				} else {
					combination = combination + "!DA," + da_All + "," + arda_All;
				}
				///System.out.println("combination ::: " + combination);
			}
			double hra_All = Double.parseDouble(rs.getString("hra_All"));
			double arr_hra_All = Double
					.parseDouble(rs.getString("arr_hra_All"));
			if (hra_All > 0 || arr_hra_All > 0||hra_All < 0 || arr_hra_All < 0) {
				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "HRA," + hra_All + ","
					+ arr_hra_All;
				} else {
					combination = combination + "!HRA," + hra_All + ","
					+ arr_hra_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double conv_All = Double.parseDouble(rs.getString("conv_All"));
			double arr_conv_All = Double.parseDouble(rs
					.getString("arr_conv_All"));
			if (conv_All > 0 || arr_conv_All > 0||conv_All < 0 || arr_conv_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Conveyance," + conv_All + ","
					+ arr_conv_All;
				} else {
					combination = combination + "!Conveyance," + conv_All + ","
					+ arr_conv_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double convth_All = Double.parseDouble(rs.getString("convth_All"));
			double arr_Convth_All = Double.parseDouble(rs
					.getString("arr_Convth_All"));
			if (convth_All > 0 || arr_Convth_All > 0||convth_All < 0 || arr_Convth_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "CONVTH," + convth_All + ","
					+ arr_Convth_All;
				} else {
					combination = combination + "!CONVTH," + convth_All + ","
					+ arr_Convth_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double wash_All = Double.parseDouble(rs.getString("wash_All"));
			double arr_wash_All = Double.parseDouble(rs
					.getString("arr_wash_All"));
			if (wash_All > 0 || arr_wash_All > 0||wash_All < 0 || arr_wash_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Wash," + wash_All + ","
					+ arr_wash_All;
				} else {
					combination = combination + "!Wash," + wash_All + ","
					+ arr_wash_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double medical_All = Double
					.parseDouble(rs.getString("medical_All"));
			double arr_medical_All = Double.parseDouble(rs
					.getString("arr_medical_All"));
			if (medical_All > 0 || arr_medical_All > 0||medical_All < 0 || arr_medical_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Medical," + medical_All + ","
					+ arr_medical_All;
				} else {
					combination = combination + "!Medical," + medical_All + ","
					+ arr_medical_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double nghtall_All = Double
					.parseDouble(rs.getString("nghtall_All"));
			double arr_Nghtall_All = Double.parseDouble(rs
					.getString("arr_Nghtall_All"));
			if (nghtall_All > 0 || arr_Nghtall_All > 0||nghtall_All < 0 || arr_Nghtall_All< 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "NGHTALL," + nghtall_All + ","
					+ arr_Nghtall_All;
				} else {
					combination = combination + "!NGHTALL," + nghtall_All + ","
					+ arr_Nghtall_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double cca_All = Double.parseDouble(rs.getString("cca_All"));
			double arr_cca_All = Double
					.parseDouble(rs.getString("arr_cca_All"));
			if (cca_All > 0 || arr_cca_All > 0||cca_All < 0 || arr_cca_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "CCA," + cca_All + ","
					+ arr_cca_All;
				} else {
					combination = combination + "!CCA," + cca_All + ","
					+ arr_cca_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double supl_All = Double.parseDouble(rs.getString("supl_All"));
			double arr_Supl_All = Double.parseDouble(rs
					.getString("arr_Supl_All"));
			if (supl_All > 0 || arr_Supl_All > 0||supl_All < 0 || arr_Supl_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "SUPL," + supl_All + ","
					+ arr_Supl_All;
				} else {
					combination = combination + "!SUPL," + supl_All + ","
					+ arr_Supl_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double conslt_Fee_All = Double.parseDouble(rs
					.getString("conslt_Fee_All"));
			double arr_Conslt_Fee_All = Double.parseDouble(rs
					.getString("arr_Conslt_Fee_All"));
			if (conslt_Fee_All > 0 || arr_Conslt_Fee_All > 0||conslt_Fee_All < 0 || arr_Conslt_Fee_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Consltfee," + conslt_Fee_All
					+ "," + arr_Conslt_Fee_All;
				} else {
					combination = combination + "!Consltfee," + conslt_Fee_All
					+ "," + arr_Conslt_Fee_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double st_Bonus_All = Double.parseDouble(rs
					.getString("st_Bonus_All"));
			double arr_st_Bonus_All = Double.parseDouble(rs
					.getString("arr_st_Bonus_All"));
			if (st_Bonus_All > 0 || arr_st_Bonus_All > 0||st_Bonus_All < 0 || arr_st_Bonus_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "STBONUS," + st_Bonus_All + ","
					+ arr_st_Bonus_All;
				} else {
					combination = combination + "!STBONUS," + st_Bonus_All + ","
					+ arr_st_Bonus_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double spa_All = Double.parseDouble(rs.getString("spa_All"));
			double arr_Spa_All = Double
					.parseDouble(rs.getString("arr_Spa_All"));
			if (spa_All > 0 || arr_Spa_All > 0||spa_All < 0 || arr_Spa_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "SPA," + spa_All + ","
					+ arr_Spa_All;
				} else {
					combination = combination + "!SPA," + spa_All + ","
					+ arr_Spa_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double stipend_All = Double
					.parseDouble(rs.getString("stipend_All"));
			double arr_Stipend_All = Double.parseDouble(rs
					.getString("arr_Stipend_All"));
			if (stipend_All > 0 || arr_Stipend_All > 0||stipend_All < 0 || arr_Stipend_All < 0) {
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "STIPEND," + stipend_All + ","
					+ arr_Stipend_All;
				} else {
					combination = combination + "!STIPEND," + stipend_All + ","
					+ arr_Stipend_All;
				}
				//System.out.println("combination ::: " + combination);
			}
			double foodcopnall_ALL = Double.parseDouble(rs
					.getString("foodcopnall_ALL"));
			double arr_Foodcopnall_ALL = Double.parseDouble(rs
					.getString("arr_Foodcopnall_ALL"));
			if (foodcopnall_ALL > 0 || arr_Foodcopnall_ALL > 0||foodcopnall_ALL < 0 || arr_Foodcopnall_ALL < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "FOODCOPNALL," + foodcopnall_ALL
					+ "," + arr_Foodcopnall_ALL;
				} else {
					combination = combination + "!FOODCOPNALL," + foodcopnall_ALL
					+ "," + arr_Foodcopnall_ALL;
				}
				//System.out.println("combination ::: " + combination);
			}
			double othern_All = Double.parseDouble(rs.getString("othern_All"));
			if (othern_All > 0||othern_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "OTHEARN," + othern_All + ",0.00";
				} else {
					combination = combination + "!OTHEARN," + othern_All + ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double incentive_All = Double.parseDouble(rs
					.getString("incentive_All"));
			if (incentive_All > 0||incentive_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "INCENTIVE," + incentive_All
					+ ",0.00";
				} else {
					combination = combination + "!INCENTIVE," + incentive_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double refinc_All = Double.parseDouble(rs.getString("refinc_All"));
			if (refinc_All > 0||refinc_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "REFINC," + refinc_All + ",0.00";
				} else {
					combination = combination + "!REFINC," + refinc_All + ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double perfbonus_All = Double.parseDouble(rs
					.getString("perfbonus_All"));
			if (perfbonus_All > 0||perfbonus_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "PERFBONUS," + perfbonus_All
					+ ",0.00";
				} else {
					combination = combination + "!PERFBONUS," + perfbonus_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double effeciency_Allow = Double.parseDouble(rs
					.getString("effeciency_Allow"));
			if (effeciency_Allow > 0||effeciency_Allow < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "EFFECIENCY ALLOWANCE,"
					+ effeciency_Allow + ",0.00";
				} else {
					combination = combination + "!EFFECIENCY ALLOWANCE,"
					+ effeciency_Allow + ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double join_Bonus_All = Double.parseDouble(rs
					.getString("join_Bonus_All"));
			if (join_Bonus_All > 0||join_Bonus_All < 0) {
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Join Bonus," + join_Bonus_All
					+ ",0.00";
						} else {
							combination = combination + "!Join Bonus," + join_Bonus_All
							+ ",0.00";
						}
				//System.out.println("combination ::: " + combination);
			}
			double travelall_All = Double.parseDouble(rs
					.getString("travelall_All"));
			if (travelall_All > 0||travelall_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "TRAVELALL," + travelall_All
					+ ",0.00";
				} else {
					combination = combination + "!TRAVELALL," + travelall_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double kra_All = Double.parseDouble(rs.getString("kra_All"));
			if (kra_All > 0||kra_All < 0) {
				combination = combination + "!KRA," + kra_All + ",0.00";
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "KRA," + kra_All + ",0.00";
				} else {
					combination = combination + "!KRA," + kra_All + ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double traingatted_All = Double.parseDouble(rs
					.getString("traingatted_All"));
			if (traingatted_All > 0||traingatted_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "TRAINGATTED," + traingatted_All
					+ ",0.00";
				} else {
					combination = combination + "!TRAINGATTED," + traingatted_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double notic_Pay_All = Double.parseDouble(rs
					.getString("notic_Pay_All"));
			if (notic_Pay_All > 0||notic_Pay_All < 0) {
				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "NOTICPAY," + notic_Pay_All
					+ ",0.00";
				} else {
					combination = combination + "!NOTICPAY," + notic_Pay_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double leave_N_Cash = Double.parseDouble(rs
					.getString("leave_N_Cash"));
			if (leave_N_Cash > 0||leave_N_Cash < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "LEAVEENCASH," + leave_N_Cash
					+ ",0.00";
				} else {
					combination = combination + "!LEAVEENCASH," + leave_N_Cash
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double extra_Tia_All = Double.parseDouble(rs
					.getString("extra_Tia_All"));
			if (extra_Tia_All > 0||extra_Tia_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "EXGRATIA," + extra_Tia_All
					+ ",0.00";
				} else {
					combination = combination + "!EXGRATIA," + extra_Tia_All
					+ ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double shift_All = Double.parseDouble(rs.getString("shift_All"));
			if (shift_All > 0||shift_All < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "Shift," + shift_All + ",0.00";
				} else {
					combination = combination + "!Shift," + shift_All + ",0.00";
				}
				//System.out.println("combination ::: " + combination);
			}
			double lang_ALL = Double.parseDouble(rs.getString("lang_ALL"));
			double arr_Lang_ALL = Double.parseDouble(rs
					.getString("arr_Lang_ALL"));
			if (lang_ALL > 0 || arr_Lang_ALL > 0||lang_ALL < 0 || arr_Lang_ALL < 0) {				
				if (combination.equalsIgnoreCase("")) {
					combination = combination + "LANGALL," + lang_ALL + ","
					+ arr_Lang_ALL;
				} else {
					combination = combination + "!LANGALL," + lang_ALL + ","
					+ arr_Lang_ALL;
				}
				//System.out.println("combination ::: " + combination);
			}
			//System.out.println("GAURAV");
			double gross_Salary = Double.parseDouble(rs
					.getString("gross_Salary"));
			//Deduction Part
			String combination1 = "";
			//System.out.println("combination1 ::: " + combination1);
			double foodcopnded_Ded = Double.parseDouble(rs
					.getString("foodcopnded_Ded"));
			if (foodcopnded_Ded > 0||foodcopnded_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "FOODCOPNDED,"
							+ foodcopnded_Ded;
				} else {
					combination1 = combination1 + "!FOODCOPNDED,"
							+ foodcopnded_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double arr_Foodcopnded_Ded = Double.parseDouble(rs
					.getString("arr_Foodcopnded_Ded"));
			if (arr_Foodcopnded_Ded > 0||arr_Foodcopnded_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "ARRFOODCOPNDED,"
							+ arr_Foodcopnded_Ded;
				} else {
					combination1 = combination1 + "!ARRFOODCOPNDED,"
							+ arr_Foodcopnded_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double advance_Ded = Double
					.parseDouble(rs.getString("advance_Ded"));
			if (advance_Ded > 0||advance_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "ADVANCE," + advance_Ded;
				} else {
					combination1 = combination1 + "!ADVANCE," + advance_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double loan_Ded = Double.parseDouble(rs.getString("loan_Ded"));
			if (loan_Ded > 0||loan_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "LOAN," + loan_Ded;
				} else {
					combination1 = combination1 + "!LOAN," + loan_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double notice_Rec_Ded = Double.parseDouble(rs
					.getString("notice_Rec_Ded"));
			if (notice_Rec_Ded > 0||notice_Rec_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "NOTICERECO,"
							+ notice_Rec_Ded;
				} else {
					combination1 = combination1 + "!NOTICERECO,"
							+ notice_Rec_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double tele_Rec_Ded = Double.parseDouble(rs
					.getString("tele_Rec_Ded"));
			if (tele_Rec_Ded > 0||tele_Rec_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "Tele Reco," + tele_Rec_Ded;
				} else {
					combination1 = combination1 + "!Tele Reco," + tele_Rec_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double other_Ded = Double.parseDouble(rs.getString("other_Ded"));
			if (other_Ded > 0||other_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "OTHDED," + other_Ded;
				} else {
					combination1 = combination1 + "!OTHDED," + other_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double id_Access_Card_Reco_Ded = Double.parseDouble(rs
					.getString("id_Access_Card_Reco_Ded"));
			if (id_Access_Card_Reco_Ded > 0||id_Access_Card_Reco_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "IDACCESSCARDRECO,"
							+ id_Access_Card_Reco_Ded;
				} else {
					combination1 = combination1 + "!IDACCESSCARDRECO,"
							+ id_Access_Card_Reco_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double leave_Anhancepent_Ded = Double.parseDouble(rs
					.getString("leave_Anhancepent_Ded"));
			if (leave_Anhancepent_Ded > 0||leave_Anhancepent_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "Leave Encashment,"
							+ leave_Anhancepent_Ded;
				} else {
					combination1 = combination1 + "!Leave Encashment,"
							+ leave_Anhancepent_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double pf = Double.parseDouble(rs.getString("pf"));
			if (pf > 0||pf < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "PF," + pf;
				} else {
					combination1 = combination1 + "!PF," + pf;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double vpf_Ded = Double.parseDouble(rs.getString("vpf_Ded"));
			if (vpf_Ded > 0||vpf_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "VPF," + vpf_Ded;
				} else {
					combination1 = combination1 + "!VPF," + vpf_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double lwf = Double.parseDouble(rs.getString("lwf"));
			if (lwf > 0||lwf < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "LWF," + lwf;
				} else {
					combination1 = combination1 + "!LWF," + lwf;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double esic = Double.parseDouble(rs.getString("esic"));
			if (esic > 0||esic < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "ESIC," + esic;
				} else {
					combination1 = combination1 + "!ESIC," + esic;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double pt = Double.parseDouble(rs.getString("pt"));
			if (pt > 0||pt < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "PT," + pt;
				} else {
					combination1 = combination1 + "!PT," + pt;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			double it_Ded = Double.parseDouble(rs.getString("it_Ded"));
			if (it_Ded > 0||it_Ded < 0) {
				if (combination1.equalsIgnoreCase("")) {
					combination1 = combination1 + "IT," + it_Ded;
				} else {
					combination1 = combination1 + "!IT," + it_Ded;
				}
				//System.out.println("combination1 ::: " + combination1);
			}
			//Create combination of Earning and Deductions
			//System.out.println("Create combination of Earning and Deductions"
					//+ combination1);
			//System.out.println("Create combination of Earning and Deductions : "
					//+ combination);
			String compo[] = new String[]{};
			String compo1[] = new String[]{};
			int j = -1;
			int k = -1;
			if (combination.equals("")) {

			} else {
				compo = combination.split("!");
				j = compo.length;
			}
			if (combination1.equals("")) {

			} else {
				compo1 = combination1.split("!");
				k = compo1.length;
			}
//System.out.println("wwwww");
			int lent = 0;
			String combined = "";
			if (j > k) {
				lent = compo.length;
				for (int i = 0; i < lent; i++) {
					//System.out.println("EMPCODE :::: "+empcode);
					//System.out.println(":::::::::::::"+compo[i]);
					if (k <=0) {
						//System.out.println("IF :::: " + k);
						combined = compo[i] + ",~,~";
					} else {
						//System.out.println("ELSE :::: " + k);
						//System.out.println("ELSE :::: " + compo1[i]);
						combined = compo[i] + "," + compo1[i];
					}
					//System.out.println("Combined :::: " + combined);
					cls.add(combined);
					k--;
				}
			} else {
				lent = compo1.length;
				for (int i = 0; i < lent; i++) {
					//System.out.println("ELSE :::: " + k);
					if (j <= 0) {
						combined = "~,~,~," + compo1[i];
					} else {
						combined = compo[i] + "," + compo1[i];
					}
					//System.out.println("Combined :::: " + combined);
					cls.add(combined);
					j--;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			counter++;
			codes=codes+empcode;
			System.out.println("Code of Exceptions :: "+codes);
			e.printStackTrace();
			//System.out.println("No of Exceptions :: "+counter);
		}finally{			
			
		}
		return cls;
	}

}