package com.test.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.test.bean.Users;

public class Test {
	 
	    /** Creates a new instance of Test */
	 
	    public Test() {
	 
	    }
	 
	    public static void main(String[] args) {
	 
	        List ts1 = new ArrayList();
	 
	        ts1.add(new Users ("Andy","Admin"));
	 
	        ts1.add(new Users ("Smith","HR"));
	 
	        ts1.add(new Users ("Mark","Non Admin"));
	 
	        ts1.add(new Users ("Dwane","Executive"));
	 
	        Collections.sort(ts1);
	 
	        Iterator itr = ts1.iterator();
	 
	        while(itr.hasNext()){
	 
	            Object element = itr.next();
	 
	            System.out.println(element + "\n");
	 
	        }
	 
	    }
	 
	}
