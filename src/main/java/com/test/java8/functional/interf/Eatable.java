package com.test.java8.functional.interf;

/*An Interface that contains exactly one 
 * abstract method is known as functional interface. 
 * It can have any number of default, 
 * static methods but can contain only one abstract method. 
 * It can also declare methods of object class.*/

//@FunctionalInterface
public interface Eatable {

	public void eat();
	//public void run(String arg);

	public default void say() {
		System.out.println("Eatable Say");
	}

	public default void say1() {
		System.out.println("Eatable Say");
	}
	public default void say2() {
		System.out.println("Eatable Say");
	}


	public static void fly() {

	}
	public static void fly1() {

	}
	public static void fly2() {

	}

}
