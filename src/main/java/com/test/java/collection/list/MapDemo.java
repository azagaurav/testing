package com.test.java.collection.list;

import java.util.*;

public class MapDemo {
  static String newLine = System.getProperty("line.separator");
  
	public void createDictionaryDemo() {
		System.out.println("Console");
	    System.out.println(System.currentTimeMillis());//out.println(newLine + "Dictionary in Java" + newLine);
	    System.out.println("Console");
	    System.out.println("-----------------------" + newLine);
	    System.out.println("Adding items to the Dictionary" + newLine);
	    //Creating dictionary object
	    //dictionary can be created using HashTable object
	    //as dictionary is an abstract class
	    Dictionary<Integer , String> dict = new Hashtable<Integer , String>();	    
	    //you add elements to dictionary using put method
	    //put(key, value)
	    dict.put(1, "Java");
	    dict.put(2, ".NET");
	    dict.put(3, "Javascript");
	    dict.put(4, "HTML");	    
	    System.out.println(newLine + "Items in the dictionary..." + dict + newLine);
	    System.out.println("-----------------------" + newLine);	    
	    //elements can be retrieved using their key
	    System.out.println("Retrieve element from dictionary with key 1 : " + 
	    dict.get(1) + newLine);
	    System.out.println("-----------------------" + newLine);	    
	    //elements can be removed using their key
	    System.out.println("Removing element from dictionary with key 2 : " + 
	    dict.remove(2) + newLine);	    
	    System.out.println("Items in the dictionary after removing..." + dict + newLine);
	    System.out.println("-----------------------" + newLine);		
	}
}
