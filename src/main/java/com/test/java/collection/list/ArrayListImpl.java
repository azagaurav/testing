package com.test.java.collection.list;

import java.util.ArrayList;

import com.test.java.bean.Employee;
import com.test.java.bean.Users;

public class ArrayListImpl {

	public ArrayList<Users> createUsers() {
		// TODO Auto-generated method stub
		
		ArrayList<Users> ts1 = new ArrayList<Users>();
		 
        ts1.add(new Users ("Andy","Admin"));
 
        ts1.add(new Users ("Smith","HR"));
 
        ts1.add(new Users ("Mark","Non Admin"));
 
        ts1.add(new Users ("Dwane","Executive"));
		return ts1;
	}

	public ArrayList<Employee> createEmployee() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}
