package com.test.java.bean;


/*To create immutable class in java, you have to do following steps.

 Declare the class as final so it can�t be extended.
 Make all fields private so that direct access is not allowed.
 Don�t provide setter methods for variables
 Make all mutable fields final so that it�s value can be assigned only once.
 Initialize all the fields via a constructor performing deep copy.
 Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

public final class Contacts {
	private final String name;
	private final String mobile;
	private final Address address;

	public Contacts(String name, String mobile, Address address) {
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}
	public String toString(){  
	    return name+" "+mobile+" "+address.toString();  
	} 

}
