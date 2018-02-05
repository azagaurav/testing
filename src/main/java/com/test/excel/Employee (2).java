/*
 * Created on 7 Nov, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.excel;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Employee {
	private String PK;
	private String EMP_CODE;
	private String MONTH;
	private String YEAR;
	private String TAX_CODE;
	private String TAX_VALUE;	

	/**
	 * @return Returns the eMP_CODE.
	 */
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	/**
	 * @param emp_code The eMP_CODE to set.
	 */
	public void setEMP_CODE(String emp_code) {
		EMP_CODE = emp_code;
	}
	/**
	 * @return Returns the mONTH.
	 */
	public String getMONTH() {
		return MONTH;
	}
	/**
	 * @param month The mONTH to set.
	 */
	public void setMONTH(String month) {
		MONTH = month;
	}
	/**
	 * @return Returns the pK.
	 */
	public String getPK() {
		return PK;
	}
	/**
	 * @param pk The pK to set.
	 */
	public void setPK(String pk) {
		PK = pk;
	}
	/**
	 * @return Returns the tAX_CODE.
	 */
	public String getTAX_CODE() {
		return TAX_CODE;
	}
	/**
	 * @param tax_code The tAX_CODE to set.
	 */
	public void setTAX_CODE(String tax_code) {
		TAX_CODE = tax_code;
	}
	/**
	 * @return Returns the tAX_VALUE.
	 */
	public String getTAX_VALUE() {
		return TAX_VALUE;
	}
	/**
	 * @param tax_value The tAX_VALUE to set.
	 */
	public void setTAX_VALUE(String tax_value) {
		TAX_VALUE = tax_value;
	}
	/**
	 * @return Returns the yEAR.
	 */
	public String getYEAR() {
		return YEAR;
	}
	/**
	 * @param year The yEAR to set.
	 */
	public void setYEAR(String year) {
		YEAR = year;
	}
}
