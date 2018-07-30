package com.test.java.collection.map;

import java.util.HashMap;
import java.util.Map;

import com.test.java.bean.Person;abstract


public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> students = new HashMap<Integer, String> ();
		students.put(null, null);
		students.put(1560000000, "value");
		students.put(2, "value1");
		students.put(3, "value2");
		students.put(4, "value3");
		students.get(4);
		Map<Integer, String> students1 = new HashMap<Integer, String> (students);
		System.out.println(students1);
		students1.putAll(students);
		System.out.println(students1);
		System.out.println(students1.put(4, "value5"));
		//students1.clear();
		//System.out.println(students1);
		System.out.println(students1.containsKey(1));
		System.out.println(students1.containsValue("value"));
		System.out.println(students1.entrySet());
		System.out.println(10 ^ (6-1));
		System.out.println(students1.values());
		System.out.println("------------------------------");
		Map<Integer, Person> students3 = new HashMap<Integer, Person> ();
		students3.put(null, null);
		students3.put(1560000000, new Person("name", 100, "address"));
		students3.put(2, new Person("name1", 100, "address"));
		students3.put(3, new Person("name2", 100, "address"));
		students3.put(4, new Person("name3", 100, "address"));
		System.out.println(students3.size());
	}

}
