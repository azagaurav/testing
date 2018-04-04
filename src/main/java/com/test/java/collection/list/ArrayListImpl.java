package com.test.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.test.bean.Employee;
import com.test.bean.Users;

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
