/*
 * Created on 9 Apr, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.java.exception;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class NegativeAgeException extends Exception {
	 
	    private int age;
	    
	 
	    public NegativeAgeException(int age){
	        this.age = age;
	    }
	    
	    public String toString(){
	        return "Age cannot be negative" + " " +age ;
	    }
	    
	}