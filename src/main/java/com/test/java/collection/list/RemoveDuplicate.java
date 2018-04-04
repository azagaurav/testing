package com.test.collection.list;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate{

	public static void main(String str[]){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(6);
		al.add(2);
		al.add(1);
		al.add(9);
		System.out.println(al);
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer i : al){
			set.add(i);		
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>(set);
		System.out.println(al1);
	}

}