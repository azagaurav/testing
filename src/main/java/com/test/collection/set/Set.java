/*
 * Created on 5 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
class Name {
	Name(String str, String str1, String str2) {
	}
}

public class Set {
	public static void main(String[] arg) {
		boolean i=setExample();
		System.out.println("gauatauiay"+i);
		Collection ts = new ArrayList();
		ts.add("55");
		ts.add("66");
		ts.add("5");
		ts.add("6");
		ts.add("616");
		ts.add("51");
		ts.add("61");
		ts.add("614");
		Iterator itr;
		itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			System.out.println(itr.next());
		}
		System.out.println("Guru");
		List al = new ArrayList();
		Name n1 = new Name("Gaurav", "Kumar", "Singh");
		Name n2 = new Name("Mani", "Bhusan", "Mishra");
		Name n3 = new Name("Ashish", "kumar", "Alok");
		Name n4 = new Name("Anurag", "Kumar", "Singla");
		al.add(n1);
		al.add(n2);
		al.add(n3);
		al.add(n4);
		Iterator itr1;
		itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println("hyhy"+itr1.next());
			System.out.println("hyhy111"+itr1.next());
		}
		System.out.println("Guru");
		//Collections.sort(al);
		Iterator itr2;
		itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println("gghghg"+itr2.next());
		}
	}

	/**
	 * @return
	 */
	private static boolean setExample() {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		boolean f=set.add("0");
		boolean s=set.add("0");
		return s;
	}
}