/*
 * Created on 25 Feb, 2012
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
class B{
	final static  int k=0;
}
public class MainMethodOverload extends B {

	public static void main(String[] args) {
		System.out.println(k);
	}
	public static void main(int i){
		MainMethodOverload mmo=new MainMethodOverload();
		try {
			
			mmo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
