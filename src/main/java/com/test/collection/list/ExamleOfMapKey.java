/*
 * Created on 26 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;




/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ExamleOfMapKey {

	public static void main(String[] args) {
		Collection cls=new ArrayList();
		Map hmap=new HashMap();
		Hashtable p =new Hashtable();
		p.put("","");
		p.put("","");
		
		System.out.println(p.get("")+"GUrur");
		System.out.println("Size of Hash Table : "+p.size());
		hmap.put(null,null);
		hmap.put(null,null);
		hmap.put(null,null);
		hmap.put("d","anurag");
		hmap.put("d","gaurav");
		System.out.println("Size of hash map :"+hmap.size());
		System.out.println(hmap.get("ga"));
	}
}
