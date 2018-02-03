package com.test.main;

public class RegexPattern {
	public static void main(String[] st) {
		String onlyAlphabet = "[^a-zA-Z 0-9]+";
		String str = "hai ? i @c / ho(w) : <are>,,,&() ^ you ??";
		System.out.println(str);
		str = str.replaceAll(onlyAlphabet, "");

		System.out.println(str);
	}
}
