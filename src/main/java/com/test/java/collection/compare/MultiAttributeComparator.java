package com.test.java.collection.compare;

import java.util.Comparator;

import com.test.java.bean.Student;

/**
 * @author egarsgh
 *
 */
public class MultiAttributeComparator implements Comparator<Student>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	/*@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		int nameCompare = student1.getName().compareTo(student2.getName());
		int ageCompare = student1.getAge().compareTo(student2.getAge());
		int cityCompare = student1.getCity().compareTo(student2.getCity());
		if(nameCompare == 0) {
			return ((ageCompare == 0) ? ageCompare : cityCompare);
		} else {
			return nameCompare;
		}
	}
	*/

	@Override
	public int compare(Student student1, Student student2) {
		int nameCompare = student1.getName().compareTo(student2.getName());
		int ageCompare = student1.getAge().compareTo(student2.getAge());
		if(nameCompare == 0) {
			return ageCompare;
		} else {
			return nameCompare;
		}
		
	}
}
