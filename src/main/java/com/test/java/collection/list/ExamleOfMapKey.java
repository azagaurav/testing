package com.test.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class ExamleOfMapKey {

	public static void main(String[] args) {
		Collection<String> cls = new ArrayList<String>();
		cls.add("");
		Map<String, String> hmap = new HashMap<String, String>();
		Hashtable<String, String> p = new Hashtable<String, String>();
		p.put("", "");
		p.put("", "");

		System.out.println(p.get("") + "GUrur");
		System.out.println("Size of Hash Table : " + p.size());
		hmap.put(null, null);
		hmap.put(null, null);
		hmap.put(null, null);
		hmap.put("d", "anurag");
		hmap.put("d", "gaurav");
		System.out.println("Size of hash map :" + hmap.size());
		System.out.println(hmap.get("ga"));
	}
}
