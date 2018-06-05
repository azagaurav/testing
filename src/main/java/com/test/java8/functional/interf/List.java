package com.test.java8.functional.interf;

@FunctionalInterface
public interface List /*extends Eatable*/ {
	
	public void add(int x);
	
	public default void  defaultAdd() {
		System.out.println("Default Method of List Interface");
	}
	public static void staticAdd() {
		System.out.println("Static Method of List Interface");
	}

}
