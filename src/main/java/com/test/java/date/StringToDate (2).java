/*
 * Created on 22 Mar, 2012
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
import java.util.*;
import java.text.*;
public class StringToDate {
 public static void main(String[] args) {
 try {  String str_date="2007-11-04";
 DateFormat formatter ; 
 Date date ; 
  formatter = new SimpleDateFormat("yyyy-MM-dd");
  date = (Date)formatter.parse(str_date); 
  Format formt;
  formt = new SimpleDateFormat("dd/MM/yyyy");
  String s = formt.format(date);
 System.out.println("Today is " +s );
  } catch (ParseException e)
  {System.out.println("Exception :"+e);  }  
 
 }
}  