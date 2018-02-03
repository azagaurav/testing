/*
 * Created on 6 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.bean;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Users implements Comparable { // Users class implementing
	// Comparable Interface

	/** Creates a new instance of Users */

	public String userName;

	public String privilege;

	public Users() {
	}//Constructor without Parameter

	public Users(String userName1, String privilege1) {

		userName = userName1;

		privilege = privilege1;

	}//Constructro with Name and Privileage

	public String toString() {

		return "User ID " + userName + "\n" + "Privilege " + privilege + "\n";

	}

	public int compareTo(Object o1) {

		//Sorting logic

		return (this.userName.compareTo(((Users) o1).getUserName()));

	}

	public String getUserName() {

		return userName;

	}

}