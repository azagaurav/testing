/*
 * Created on Jan 1, 2002
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.test.pdf;

/**
 * @author a1
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class ConfigPaySlip {
	
	private long pk;
	private int logo_show;//1 for show and 0 for not show
	private int logo_size;//40 for 40,40 and 0 means not show
	private int logo_align;//1 for left,2 for center and 3 for right and 0 means not show
	
	private float comp_lable_size; //default is 12
	private int comp_lable_font; //bold,italic,normal
	private int comp_lable_align;
	
	private float add_lable_size; //default is 12
	private int add_lable_font; //bold,italic,normal
	
	private float payslip_head_size;
	private int payslip_head_font;
	
	private float emp_detail_size;
	private int emp_detail_font;
	
	private float earn_dedu_size;
	
	private float head_size;
	private int head_font;
	
	private int earn_rate_show;
	private int earn_monthly_show;
	private int earn_arrear_show;
	
	private int ded_rate_show;
	private int ded_monthly_show;
	private int ded_arrear_show;
	
	private int ytds_show;
	private String remark;
	private String logosize;
	
	private int MAX_SIZE;
	
	
	



	/**
	 * @return
	 */
	public String getLogosize() {
		return logosize;
	}

	/**
	 * @param logosize
	 */
	public void setLogosize(String logosize) {
		this.logosize = logosize;
	}

	/**
	 * @return
	 */
	public int getMAX_SIZE() {
		return MAX_SIZE;
	}

	/**
	 * @param max_size
	 */
	public void setMAX_SIZE(int max_size) {
		MAX_SIZE = max_size;
	}

	/**
	 * @return
	 */
	public int getAdd_lable_font() {
		return add_lable_font;
	}

	/**
	 * @param add_lable_font
	 */
	public void setAdd_lable_font(int add_lable_font) {
		this.add_lable_font = add_lable_font;
	}

	/**
	 * @return
	 */
	public float getAdd_lable_size() {
		return add_lable_size;
	}

	/**
	 * @param add_lable_size
	 */
	public void setAdd_lable_size(float add_lable_size) {
		this.add_lable_size = add_lable_size;
	}

	/**
	 * @return
	 */
	public int getComp_lable_font() {
		return comp_lable_font;
	}

	/**
	 * @param comp_lable_font
	 */
	public void setComp_lable_font(int comp_lable_font) {
		this.comp_lable_font = comp_lable_font;
	}

	/**
	 * @return
	 */
	public float getComp_lable_size() {
		return comp_lable_size;
	}

	/**
	 * @param comp_lable_size
	 */
	public void setComp_lable_size(float comp_lable_size) {
		this.comp_lable_size = comp_lable_size;
	}

	/**
	 * @return
	 */
	public int getDed_arrear_show() {
		return ded_arrear_show;
	}

	/**
	 * @param ded_arrear_show
	 */
	public void setDed_arrear_show(int ded_arrear_show) {
		this.ded_arrear_show = ded_arrear_show;
	}

	/**
	 * @return
	 */
	public int getDed_monthly_show() {
		return ded_monthly_show;
	}

	/**
	 * @param ded_monthly_show
	 */
	public void setDed_monthly_show(int ded_monthly_show) {
		this.ded_monthly_show = ded_monthly_show;
	}

	/**
	 * @return
	 */
	public int getDed_rate_show() {
		return ded_rate_show;
	}

	/**
	 * @param ded_rate_show
	 */
	public void setDed_rate_show(int ded_rate_show) {
		this.ded_rate_show = ded_rate_show;
	}

	/**
	 * @return
	 */
	public int getEarn_arrear_show() {
		return earn_arrear_show;
	}

	/**
	 * @param earn_arrear_show
	 */
	public void setEarn_arrear_show(int earn_arrear_show) {
		this.earn_arrear_show = earn_arrear_show;
	}

	/**
	 * @return
	 */
	public float getEarn_dedu_size() {
		return earn_dedu_size;
	}

	/**
	 * @param earn_dedu_size
	 */
	public void setEarn_dedu_size(float earn_dedu_size) {
		this.earn_dedu_size = earn_dedu_size;
	}

	/**
	 * @return
	 */
	public int getEarn_monthly_show() {
		return earn_monthly_show;
	}

	/**
	 * @param earn_monthly_show
	 */
	public void setEarn_monthly_show(int earn_monthly_show) {
		this.earn_monthly_show = earn_monthly_show;
	}

	/**
	 * @return
	 */
	public int getEarn_rate_show() {
		return earn_rate_show;
	}

	/**
	 * @param earn_rate_show
	 */
	public void setEarn_rate_show(int earn_rate_show) {
		this.earn_rate_show = earn_rate_show;
	}

	/**
	 * @return
	 */
	public int getEmp_detail_font() {
		return emp_detail_font;
	}

	/**
	 * @param emp_detail_font
	 */
	public void setEmp_detail_font(int emp_detail_font) {
		this.emp_detail_font = emp_detail_font;
	}

	/**
	 * @return
	 */
	public float getEmp_detail_size() {
		return emp_detail_size;
	}

	/**
	 * @param emp_detail_size
	 */
	public void setEmp_detail_size(float emp_detail_size) {
		this.emp_detail_size = emp_detail_size;
	}

	/**
	 * @return
	 */
	public int getHead_font() {
		return head_font;
	}

	/**
	 * @param head_font
	 */
	public void setHead_font(int head_font) {
		this.head_font = head_font;
	}

	/**
	 * @return
	 */
	public float getHead_size() {
		return head_size;
	}

	/**
	 * @param head_size
	 */
	public void setHead_size(float head_size) {
		this.head_size = head_size;
	}

	/**
	 * @return
	 */
	public int getLogo_align() {
		return logo_align;
	}

	/**
	 * @param logo_align
	 */
	public void setLogo_align(int logo_align) {
		this.logo_align = logo_align;
	}

	/**
	 * @return
	 */
	public int getLogo_show() {
		return logo_show;
	}

	/**
	 * @param logo_show
	 */
	public void setLogo_show(int logo_show) {
		this.logo_show = logo_show;
	}

	/**
	 * @return
	 */
	public int getLogo_size() {
		return logo_size;
	}

	/**
	 * @param logo_size
	 */
	public void setLogo_size(int logo_size) {
		this.logo_size = logo_size;
	}

	/**
	 * @return
	 */
	public float getPayslip_head_size() {
		return payslip_head_size;
	}

	/**
	 * @param payslip_head_size
	 */
	public void setPayslip_head_size(float payslip_head_size) {
		this.payslip_head_size = payslip_head_size;
	}

	/**
	 * @return
	 */
	public long getPk() {
		return pk;
	}

	/**
	 * @param pk
	 */
	public void setPk(long pk) {
		this.pk = pk;
	}

	/**
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return
	 */
	public int getYtds_show() {
		return ytds_show;
	}

	/**
	 * @param ytds_show
	 */
	public void setYtds_show(int ytds_show) {
		this.ytds_show = ytds_show;
	}

	/**
	 * @return
	 */
	public int getPayslip_head_font() {
		return payslip_head_font;
	}

	/**
	 * @param payslip_head_font
	 */
	public void setPayslip_head_font(int payslip_head_font) {
		this.payslip_head_font = payslip_head_font;
	}

	/**
	 * @return
	 */
	public int getComp_lable_align() {
		return comp_lable_align;
	}

	/**
	 * @param comp_lable_align
	 */
	public void setComp_lable_align(int comp_lable_align) {
		this.comp_lable_align = comp_lable_align;
	}

	/**
	 * @param pk
	 * @param logo_show
	 * @param logo_size
	 * @param logo_align
	 * @param comp_lable_size
	 * @param comp_lable_font
	 * @param add_lable_size
	 * @param add_lable_font
	 * @param payslip_head_size
	 * @param emp_detail_size
	 * @param emp_detail_font
	 * @param earn_dedu_size
	 * @param head_size
	 * @param head_font
	 * @param earn_rate_show
	 * @param earn_monthly_show
	 * @param earn_arrear_show
	 * @param ded_rate_show
	 * @param ded_monthly_show
	 * @param ded_arrear_show
	 * @param ytds_show
	 * @param remark
	 */
	public ConfigPaySlip(
		long pk,
		int logo_show,
		int logo_size,
		int logo_align,
		int comp_lable_size,
		int comp_lable_font,
		int add_lable_size,
		int add_lable_font,
		int payslip_head_size,
		int emp_detail_size,
		int emp_detail_font,
		int earn_dedu_size,
		int head_size,
		int head_font,
		int earn_rate_show,
		int earn_monthly_show,
		int earn_arrear_show,
		int ded_rate_show,
		int ded_monthly_show,
		int ded_arrear_show,
		int ytds_show,
		String remark) {
		super();
		this.pk = pk;
		this.logo_show = logo_show;
		this.logo_size = logo_size;
		this.logo_align = logo_align;
		this.comp_lable_size = comp_lable_size;
		this.comp_lable_font = comp_lable_font;
		this.add_lable_size = add_lable_size;
		this.add_lable_font = add_lable_font;
		this.payslip_head_size = payslip_head_size;
		this.emp_detail_size = emp_detail_size;
		this.emp_detail_font = emp_detail_font;
		this.earn_dedu_size = earn_dedu_size;
		this.head_size = head_size;
		this.head_font = head_font;
		this.earn_rate_show = earn_rate_show;
		this.earn_monthly_show = earn_monthly_show;
		this.earn_arrear_show = earn_arrear_show;
		this.ded_rate_show = ded_rate_show;
		this.ded_monthly_show = ded_monthly_show;
		this.ded_arrear_show = ded_arrear_show;
		this.ytds_show = ytds_show;
		this.remark = remark;
	}
	/**
	 * 
	 */
	public ConfigPaySlip() {
		super();
		// TODO Auto-generated constructor stub
	}


}
