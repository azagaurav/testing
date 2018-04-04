package com.test.collection.list;

import java.util.ArrayList;
import java.util.Collections;

class ReverseList{

public static void main(String str[]){
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	al.add(6);
	al.add(7);
	al.add(8);
	al.add(9);
	al.add(10);
	Collections.reverse(al);
	System.out.println(al);
	int size= al.size();
	Integer tmp;
	for(int i=0; i<size; i++){
		size = --size;
		System.out.println(i + " : " + size);
		tmp=al.get(i);
		al.set(i, al.get(size));
		al.set(size, tmp);
	}
	Thread.currentThread().setDaemon(true);
	System.out.println(al);
}
}