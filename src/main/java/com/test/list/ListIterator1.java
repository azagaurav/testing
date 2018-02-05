/*
 * Created on 24 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ListIterator1 {

	public static void main(String[] args) {
		String str1="Gaurav";
		String str2="Anand";
		String str3="Supriya";
		String str4="Rinki";
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add(0,str1);
		arrayList.add(1,str2);
		arrayList.add(2,str3);
		arrayList.add(3,str4);
		
		System.out.println(arrayList.retainAll(arrayList));
		
		ArrayList<String> newArrayList=(ArrayList<String>) arrayList.clone();
		newArrayList.remove("Anand");
		System.out.println(arrayList);
		System.out.println(newArrayList);
		System.out.println(newArrayList.retainAll(newArrayList));
		Iterator<String> itr;
		itr= arrayList.iterator();
		while(itr.hasNext()){
			Object d=itr.next();
			System.out.println(d);			
		}
		
		
		
	}
}
