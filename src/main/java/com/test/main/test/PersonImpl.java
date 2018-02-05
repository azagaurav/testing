/*
 * Created on 27 Dec, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PersonImpl {
	public static void main(String arg[]){
		//Person ashish=new Person();
		//Person Ashish1=new Person("Ashish",12000), "New Delhi");
		Person Ashish=new Person("Ashish",new Integer(12000), "New Delhi");
		Person Mani=new Person("Mani", new Integer(21000), "Delhi");
		Person Sanjeev=new Person("San",new Integer(10000),"GZB");
		List list=new ArrayList();
		list.add(Ashish);
		list.add(Mani);
		list.add(Sanjeev);
		//List list = new ArrayList();
		
		Iterator itr;
		itr=list.iterator();
		while(itr.hasNext()){
			Person persn=(Person)itr.next();
			Comparator comparator = new Comparator() {
			    public int compare(Person c1, Person c2) {
			    	int i=c2.getSalary().compareTo(c1.getSalary()); // use your logic
			    	System.out.println("I : "+i);
			    	return i;			         
			    }
				public int compare(Object o1, Object o2) {
					// TODO Auto-generated method stub
					System.out.println("J");
					return 0;
				}
			};

			Collections.sort(list, comparator); // use the comparator as much as u want
			//System.out.println();
			System.out.println(persn.getName());
			//System.out.println("Salary Ashish "+Ashish.getSalary());
		
		}
		
	}

}
