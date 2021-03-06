package com.test.java.bean;

public class Employee {
	private int id;
	private String name;
	private Address address;//Aggregation

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	} 
	

	public void display() {
		System.out.println(id + " " + name + " " + address);
	}
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id) {this.id = id;}  
	  
	public Employee(String name) {  this.name = name;}  
	  
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;
	    this.address=address;
	}  
	  
	public void show(){  
	    System.out.println(id+" "+name); 
	    System.out.println(address.toString());
	}

	 

}
