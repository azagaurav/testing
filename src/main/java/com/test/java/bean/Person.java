/*
 * Created on 27 Dec, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.bean;

import java.time.LocalDate;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Person {

	private String name;
	private Integer salary;
	private String address;
	private LocalDate birthday;
	private Sex gender;
    private String emailAddress;
    
	public enum Sex {
		MALE, FEMALE
	}
	
	public Person(String name,Integer salary,String address){
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public int getAge() {
		
		return salary;
    }

    public void printPerson() {
        // ...
    }
    
    
    /**
	 * @return the birthday
	 */
	public LocalDate getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public Sex getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Sex gender) {
		this.gender = gender;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
    public int hashCode() {    	
    	return 1;    	
    }
}
