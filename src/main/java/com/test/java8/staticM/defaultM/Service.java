package com.test.java8.staticM.defaultM;

/**
 * @author egarsgh
 *
 */
public interface Service {

	default void service() {
		System.out.println("Service");
	}
}
