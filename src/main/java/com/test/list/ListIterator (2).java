/*
 * Created on 24 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ListIterator {

	public static void main(String[] args) {
		Integer i=new Integer(6);
		String str="gau";
		Double j=new Double(9);
		String [] st={"g","h","j"};
		ArrayList arrayList=new ArrayList();
		arrayList.add(0,i);
		arrayList.add(1,str);
		arrayList.add(2,j);
		arrayList.add(3,st);
		
		System.out.println(arrayList.size());
		
		Iterator itr;
		itr=arrayList.iterator();
		while(itr.hasNext()){
			Object d=itr.next();
			System.out.println(d);			
		}
		
		
		
	}
}
