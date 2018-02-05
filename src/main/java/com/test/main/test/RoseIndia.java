package com.test;

public class RoseIndia {
	public RoseIndia() {
		System.out.println("Constructor Called");
	}

	public static void main(String args[]) {
		RoseIndia roseIndiaObject = new RoseIndia();
		System.out.println("Object's Class name =>"
				+ roseIndiaObject.getClass());
	}
}