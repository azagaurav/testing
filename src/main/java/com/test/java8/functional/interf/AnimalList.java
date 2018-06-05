package com.test.java8.functional.interf;

public interface AnimalList {
	
	public default void defaultAdd() {
		System.out.println("Default add method of Animal Interface");
	}

}
