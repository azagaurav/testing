package com.test.interview;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceWord {
	public static void main(String[] arg) {
		String test = "This is is a a a good boy boy";
		String maxNumberWord = createStringToMap(test);
		System.out.println(maxNumberWord);
	}

	public static String createStringToMap(String test) {
		String[] testArray = test.split(" ");
		Map<String, Integer> s = new HashMap<String, Integer>();
		Integer maxNumber = 0;
		for (String word : testArray) {
			if (s.containsKey(word)) {
				maxNumber = s.get(word) + 1;
				s.put(word, maxNumber);
			} else {
				s.put(word, 1);
			}
		}
		return getMaxNumberWord(s);
	}

	public static String getMaxNumberWord(Map<String, Integer> s) {
		Integer maxNumber = 0;
		String maxNumberObj = "";
		for (String val : s.keySet()) {
			s.get(val);
			if (s.get(val) > maxNumber) {
				maxNumber = s.get(val);
				maxNumberObj = val;
			}
		}
		System.out.println(s);
		return maxNumberObj;
	}

}
