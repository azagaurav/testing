package com.test.java.string;

// A bubble sort for Strings. 
public class SortStringsArray {
	

	public static void main(String args[]) {
		String arr[] = { "Now", "is", "The", "time", "for", "all", "good",
			"men", "to", "come", "to", "the", "aid", "of", "their", "country" };
		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[j]);
		}
	}
}