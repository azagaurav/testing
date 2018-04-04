package com.test.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.test.bean.Employee;
import com.test.bean.Users;

public class Test implements Comparator<Employee>{
	 
	    public Test() {
	 
	    }
	    static ArrayListImpl ali = new ArrayListImpl();
	    public static void main(String[] args) {
	    	
	    	ArrayList<Users> userList = ali.createUsers();
	    	ArrayList<Employee> employeeList = ali.createEmployee();
	        
	 
	        Collections.sort(userList);
	 
	        Iterator<Users> itr = userList.iterator();
	 
	        while(itr.hasNext()){
	 
	            Object element = itr.next();
	 
	            System.out.println(element + "\n");
	 
	        }
	 
	    }
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	 
	}
