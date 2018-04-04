/*
 * Created on 12 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.integer;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StringToIntger {

	public static void main(String[] args) {
		for(int k=0;k<10;k++){
		for(int j=0;j<5;j++){
			System.out.println(j);
			break;
		}
		}
		String str="10000";
		int i=Integer.valueOf(str).intValue();
		System.out.println(i);
		if(true){
			System.out.println("I am true");
		}
		boolean b1=true;
		boolean b2=false;
		boolean b3=false;
		boolean b4=false;
		if(b1==true || b2==false ){
			System.out.println("a");
		}else{
			System.out.println("n");
		}
		
		
	}
}
