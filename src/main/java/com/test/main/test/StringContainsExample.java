/*
 * Created on Jan 20, 2014
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StringContainsExample {

	  
	    public static void main(String args[]) {

	       String word = "Hello GURU";
	      
	       //indexOf return -1 if String does not contain specified word
	       if(word.indexOf("World") != -1){
	           System.out.println("Yes '%s' contains word 'World' %n");
	       }else{
	       		System.out.println("Sorry %s does not contains word 'World' %n ");
	       }
	      
	       //contains method return boolean true if String contains specified word
	       /*if(word.contains("Hello")){
	       	System.out.println("Great '%s' contains word 'Hello' %n" , word);
	       }else{
	       	System.out.println("Sorry %s does not contains word 'Hello' %n" , word);
	       }*/
	      
	    }
	}
