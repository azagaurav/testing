/*
 * Created on Jan 30, 2014
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
package com.test.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListRetainAll {
	public static void main(String[] args) {
		// Create two collections:
		List al = new ArrayList();
		LinkedList ll = new LinkedList();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		System.out.println("The LinkedList collection before: " + ll);
		System.out.println("Size of LinkedList :" + ll.size());
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		System.out.println("The ArrayList collection before : " + al);
		System.out.println("Size of ArrayList :" + al.size());
		// Delete the elements of ArrayList that are not in LinkedList:
		boolean b = al.;
		//If list get changed return true otherwise false
		System.out.println("List becomes change :" + b);
		// Display the collection after:
		System.out.println("The ArrayList collection after : " + al);
		System.out.println("Size of ArrayList remains :" + al.size());
		System.out.println("The LinkedList collection after: " + ll);
		System.out.println("Size of LinkedList :" + ll.size());
	}
}