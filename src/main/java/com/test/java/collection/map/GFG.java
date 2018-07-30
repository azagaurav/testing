package com.test.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author egarsgh
 *
 */
//Driver code
class GFG {
	public static void main(String[] args) {

		// creating two Objects with
		// same state
		Geek g1 = new Geek("aditya", 12);
		Geek g2 = new Geek("aditya", 1);
		Geek g11 = new Geek("aditya", 1);
		Geek g22 = new Geek("aditya", 1);
		System.out.println(Objects.equals(null, g1));

		Map<Geek, String> map = new HashMap<Geek, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");
		map.put(g11, "CSE");
		map.put(g22, "IT2");
		System.out.println(map.size());

		System.out.println(map.get(g1));
		System.out.println(map.containsValue("CSE")+"\n");

		for (Geek geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

	}
}
