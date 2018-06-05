package com.test.java8.functional.interf;

/*An Interface that contains exactly one 
 * abstract method is known as functional interface. 
 * It can have any number of default, 
 * static methods but can contain only one abstract method. 
 * It can also declare methods of object class.*/

@FunctionalInterface
public interface Eatable {

	public void eat();

	public default void say() {
		System.out.println("Eatable Say");
	}

	public static void fly() {

	}

}
