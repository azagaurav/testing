package com.test.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		String str1 = "12,9,13,16";
		String str2 = "10,12,15,16";
		String str3 = "12,15,10,9";
		String str4 = "12,9,13";

		String str5 = "120,90,130,160";
		String str6 = "100,120,150,160";
		String str7 = "120,150,100,90";
		String str8 = "120,90";
		HashSet set = getHeader(str1, str2, str3, str4, str5, str6, str7, str8);
		HashMap hm = getValues(str1, str2, str3, str4, str5, str6, str7, str8,
				set);

		System.out.println(set);
	}

	private static HashMap getValues(String str1, String str2, String str3,
			String str4, String str5, String str6, String str7, String str8,
			HashSet set) {
		// TODO Auto-generated method stub
		System.out.println("IN GET VALUES");
		HashMap hm = new HashMap();
		//Going to change the Set into List
		Iterator itr;
		itr = set.iterator();
		List list2 = new ArrayList();
		while (itr.hasNext()) {
			for (int n = 0; n < set.size(); n++) {
				String st = (String) itr.next();
				list2.add(st);
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			String[] arr1 = str1.split(",");
			List list = new ArrayList();
			for (int n = 0; n < arr1.length; n++) {
				String st = arr1[n];
				list.add(st);
			}
			System.out.println("Y");
			String[] arr2 = str5.split(",");
			List list3 = new ArrayList();
			for (int n = 0; n < arr2.length; n++) {
				String st = arr2[n];
				list3.add(st);
			}
			for (int j = 0; j < list.size(); j++) {
				if ((list2.get(i)).equals(list.get(j))) {
					hm.put(list2.get(i), list3.get(j));					
					break;
				} else {
					hm.put(list2.get(i), "NA");
				}				
			}
			System.out.println(hm);
		}
		return hm;
	}

	private static HashSet getHeader(String str1, String str2, String str3,
			String str4, String str5, String str6, String str7, String str8) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		String[] arr1 = str1.split(",");
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		String[] arr2 = str2.split(",");
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		String[] arr3 = str3.split(",");
		for (int i = 0; i < arr3.length; i++) {
			set.add(arr3[i]);
		}
		String[] arr4 = str4.split(",");
		for (int i = 0; i < arr4.length; i++) {
			set.add(arr4[i]);
		}
		return set;
	}
}