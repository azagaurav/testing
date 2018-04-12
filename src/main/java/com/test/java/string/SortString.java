package com.test.java.string;

public class SortString {
	public static void main(String[] args) {
		String original = "edczxrdgh";
		int j = 0;
		char temp = 0;
		System.out.println(original);
		char[] chars = original.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println("I : " + chars[i]);
			for (j = 0; j < chars.length; j++) {
				System.out.println("J : " + chars[j]);
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
				System.out.println(chars);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < chars.length; k++) {
			sb.append(chars[k]);
			System.out.println(chars[k]);
		}
		System.out.println(sb.toString());
	}
}
