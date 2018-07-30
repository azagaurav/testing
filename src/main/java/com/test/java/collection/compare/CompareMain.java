package com.test.java.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.test.java.bean.Student;

/**
 * @author egarsgh
 *
 */

public class CompareMain {

	public static void main(String[] args) {
		List<Student> listOfStudents = createStudents();
		// before Sorting: iterate using Iterator & while-loop
		Iterator<Student> custIterator = listOfStudents.iterator();

		System.out.println("Before Sorting: iterate using Iterator & while-loop\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(listOfStudents, new MultiAttributeComparator());

		// after Sorting: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting: iterate using enhanced for-loop\n");
		for (Student Student : listOfStudents) {
			System.out.println(Student);
		}
	}

	/**
	 * @return
	 * 
	 */
	private static List<Student> createStudents() {
		// TODO Auto-generated method stub
		// create List & ArrayList reference to store Students
		List<Student> listOfStudents = new ArrayList<Student>();

		// create Student objects using constructor initialization
		Student cust1 = new Student("Shalini", "Chennai", 60);
		Student cust2 = new Student("Sneha", "Pune", 73);
		Student cust3 = new Student("Simran", "Bangalore", 37);
		Student cust4 = new Student("Trisha", "Hyderabad", 52);
		Student cust5 = new Student("Shalini", "Chennai", 70);
		Student cust6 = new Student("Abirami", "Bangalore", 48);
		Student cust7 = new Student("Trisha", "Mangalore", 45);
		Student cust8 = new Student("Sneha", "Pune", 62);
		Student cust9 = new Student("Shalini", "Chennai", 50);

		// add Student objects to ArrayList
		listOfStudents.add(cust1);
		listOfStudents.add(cust2);
		listOfStudents.add(cust3);
		listOfStudents.add(cust4);
		listOfStudents.add(cust5);
		listOfStudents.add(cust6);
		listOfStudents.add(cust7);
		listOfStudents.add(cust8);
		listOfStudents.add(cust9);

		return listOfStudents;
	}

}
