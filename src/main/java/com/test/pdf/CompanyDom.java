/*
 * Created on Jul 3, 2007
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.test.pdf;

/**
 * @author Rnath
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class CompanyDom {
	
	private long pk;
	private String compName;
	private String compAdd;
	private String panno;
	private String tanno;
	private String pfno;
	private String esino;
	private String tds;
	private String logo;
	
	
	private int hflag;
	private int gflag;
	private int nflag;
	
	private int hround;
	private int ground;
	private int nround;

	private String location;
	private String generateDate;
	
	private String comp_res;
	private String comp_res_fat;
	private String designation;
	
	private String taxdeductaccnodeductor;
	private String pangirdeductor;
	private String period;
	private String ackstr;
	


	
	/**
	 * @return
	 */
	public String getAckstr() {
		return ackstr;
	}

	/**
	 * @param ackstr
	 */
	public void setAckstr(String ackstr) {
		this.ackstr = ackstr;
	}

	/**
	 * @return
	 */
	public String getPangirdeductor() {
		return pangirdeductor;
	}

	/**
	 * @param pangirdeductor
	 */
	public void setPangirdeductor(String pangirdeductor) {
		this.pangirdeductor = pangirdeductor;
	}

	/**
	 * @return
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * @param period
	 */
	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * @return
	 */
	public String getTaxdeductaccnodeductor() {
		return taxdeductaccnodeductor;
	}

	/**
	 * @param taxdeductaccnodeductor
	 */
	public void setTaxdeductaccnodeductor(String taxdeductaccnodeductor) {
		this.taxdeductaccnodeductor = taxdeductaccnodeductor;
	}

	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return
	 */
	public String getComp_res() {
		return comp_res;
	}

	/**
	 * @param comp_res
	 */
	public void setComp_res(String comp_res) {
		this.comp_res = comp_res;
	}

	/**
	 * @return
	 */
	public String getComp_res_fat() {
		return comp_res_fat;
	}

	/**
	 * @param comp_res_fat
	 */
	public void setComp_res_fat(String comp_res_fat) {
		this.comp_res_fat = comp_res_fat;
	}

	/**
	 * @return
	 */
	public String getGenerateDate() {
		return generateDate;
	}

	/**
	 * @param generateDate
	 */
	public void setGenerateDate(String generateDate) {
		this.generateDate = generateDate;
	}

	/**
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return
	 */
	public int getGround() {
		return ground;
	}

	/**
	 * @param ground
	 */
	public void setGround(int ground) {
		this.ground = ground;
	}

	/**
	 * @return
	 */
	public int getHround() {
		return hround;
	}

	/**
	 * @param hround
	 */
	public void setHround(int hround) {
		this.hround = hround;
	}

	/**
	 * @return
	 */
	public int getNround() {
		return nround;
	}

	/**
	 * @param nround
	 */
	public void setNround(int nround) {
		this.nround = nround;
	}

	/**
	 * @return
	 */
	public String getCompAdd() {
		return compAdd;
	}

	/**
	 * @param compAdd
	 */
	public void setCompAdd(String compAdd) {
		this.compAdd = compAdd;
	}

	/**
	 * @return
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * @param compName
	 */
	public void setCompName(String compName) {
		this.compName = compName;
	}

	/**
	 * @return
	 */
	public String getEsino() {
		return esino;
	}

	/**
	 * @param esino
	 */
	public void setEsino(String esino) {
		this.esino = esino;
	}

	/**
	 * @return
	 */
	public int getGflag() {
		return gflag;
	}

	/**
	 * @param gflag
	 */
	public void setGflag(int gflag) {
		this.gflag = gflag;
	}

	/**
	 * @return
	 */
	public int getHflag() {
		return hflag;
	}

	/**
	 * @param hflag
	 */
	public void setHflag(int hflag) {
		this.hflag = hflag;
	}

	/**
	 * @return
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return
	 */
	public int getNflag() {
		return nflag;
	}

	/**
	 * @param nflag
	 */
	public void setNflag(int nflag) {
		this.nflag = nflag;
	}

	/**
	 * @return
	 */
	public String getPanno() {
		return panno;
	}

	/**
	 * @param panno
	 */
	public void setPanno(String panno) {
		this.panno = panno;
	}

	/**
	 * @return
	 */
	public String getPfno() {
		return pfno;
	}

	/**
	 * @param pfno
	 */
	public void setPfno(String pfno) {
		this.pfno = pfno;
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
	public String getTanno() {
		return tanno;
	}

	/**
	 * @param tanno
	 */
	public void setTanno(String tanno) {
		this.tanno = tanno;
	}

	/**
	 * @return
	 */
	public String getTds() {
		return tds;
	}

	/**
	 * @param tds
	 */
	public void setTds(String tds) {
		this.tds = tds;
	}

	/**
	 * 
	 */
	public CompanyDom() {
		super();
		// TODO Auto-generated constructor stub
	}

}
