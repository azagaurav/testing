package com.test.java.string;

public class StringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabet = "ASBCDEFGHIJKLMNOPQRSTUVWXYZabdefghijklmnopqrstuvwxyz";
		char [] abcd={'a','b','c','d'};
		System.out.println("alphabet  :::::::::::::::  " + alphabet);
		System.out.println("charAt(3)  :::::::::::::::  " + alphabet.charAt(4));
		System.out.println("codePointAt(3)  :::::::::::::::  " + alphabet.codePointAt(3));
		System.out.println("  :::::::::::::::  "+alphabet.indexOf("l"));
		System.out.println("  :::::::::::::::  "+alphabet.hashCode());
		System.out.println("gfr  :::::::::::::::  "+alphabet.replaceFirst("S", "L"));
		System.out.println("  :::::::::::::::  ".copyValueOf(abcd));
		// System.out.println("  :::::::::::::::  "+alphabet);

	}

}
