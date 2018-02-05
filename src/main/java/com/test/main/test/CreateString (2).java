/*
 * Created on 23 Dec, 2011
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
public class CreateString {

	public static void main(String[] args) {
		String [] name={"gaurav","anurag","garima","ashish","mani"};
		String b=null;		
		for(int i=0;i<name.length;i++){
			if(i==0){
				b=name[i];
			}else{
				b=b+"!"+name[i];
			}								
		}
		System.out.print(b);
	}
}
