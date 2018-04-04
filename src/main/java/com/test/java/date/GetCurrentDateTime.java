/*
 * Created on Jun 4, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.date;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.util.Date;
import java.util.StringTokenizer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
 
 
public class GetCurrentDateTime {
  public static void main(String[] args) {
 
	   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   //get current date time with Date()
	   Date date = new Date();
	   String datestr=dateFormat.format(date);
	   String[] stk=datestr.split("/");
	   System.out.println(stk[0]+" "+stk[1]+" "+stk[2]);
	   System.out.println(date.getDate()+" "+date.getMonth()+" "+date.getYear());
	   StringBuffer strb=new StringBuffer(dateFormat.format(date));
	   //get current date time with Calendar()
	  // Calendar cal = Calendar.getInstance();
	   System.out.println(strb);
 
  }
}