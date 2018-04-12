package com.test.java.string;

public class NewString {
	public static void main(String[] args) {

		String a = "Java ";
		String b = a + "1.8";
		String c = a.concat("1.8");
		String d= new String("Java 1.8");
		System.out.println(b);
		System.out.println(c);
		System.out.println(c.equals(b));
		System.out.println((c == b));
		System.out.println(c.equals(d));
		System.out.println((c == d));
		System.out.println(a);
	}
}
