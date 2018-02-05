package com.test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.test.bean.Person;

public class PersonImpl {
	public static void main(String arg[]){
		//Person ashish=new Person();
		//Person Ashish1=new Person("Ashish",12000), "New Delhi");
		Person Ashish=new Person("Ashish",new Integer(12000), "New Delhi");
		Person Mani=new Person("Mani", new Integer(21000), "Delhi");
		Person Sanjeev=new Person("San",new Integer(10000),"GZB");
		List<Person> list=new ArrayList<Person>();
		list.add(Ashish);
		list.add(Mani);
		list.add(Sanjeev);
		//List list = new ArrayList();
		
		Iterator<Person> itr;
		itr=list.iterator();
		while(itr.hasNext()){
			Person persn=(Person)itr.next();
			Comparator<Person> comparator = new Comparator<Person>() {
			    public int compare1(Person c1, Person c2) {
			    	int i=c2.getSalary().compareTo(c1.getSalary()); // use your logic
			    	System.out.println("I : "+i);
			    	return i;			         
			    }
				public int compare(Person o1, Person o2) {
					// TODO Auto-generated method stub
					System.out.println("J");
					return 0;
				}
			};

			Collections.sort(list, comparator); // use the comparator as much as u want
			//System.out.println();
			System.out.println(persn.getName());
			//System.out.println("Salary Ashish "+Ashish.getSalary());
		
		}
		
	}

}
