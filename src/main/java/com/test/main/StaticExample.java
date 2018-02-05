package com.test.main;
/*
 * Created on Aug 21, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class StaticExample {
	public static String a(){
		System.out.println("Gaurav");
		return "x";
	}
	public static String b(){
		System.out.println("b");
		return "b";
	}
	public static String c(){
		System.out.println("c");
		return "c";
	}
	static{
		System.out.println("Static First");
		System.out.println("static");
	}
	public static void main(String arg[]){
		System.out.println("main");
		System.out.println("a "+StaticExample.a());
		System.out.println("b "+StaticExample.b());
		System.out.println("c "+StaticExample.c());
	}

}
