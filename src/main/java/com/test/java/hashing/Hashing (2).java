/*
 * Created on 30 Aug, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Hashing {

	public static void main(String[] args) {
		Map hm=new HashMap();
		hm.put("1","PM");
		hm.put("2","TL");
		hm.put("3","SD");
		System.out.println("321");
		hm.put("","JD");
		System.out.println("123");
		int i=hm.get("1").hashCode();
		int j=hm.get("2").hashCode();
		int k=hm.get("3").hashCode();
		System.out.println(" Before 4");
		//int l=hm.get("-").hashCode();
		System.out.println(" After 4");
		int m=hm.get("1").hashCode();
		
		//System.out.println("Value of Hash Code "+i+" j "+j+" k "+k+" l "+l+" M "+m);
		
	}
}
