/*
 * Created on 29 Feb, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

import java.util.Vector;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class InstanceOf {
	public static void main(String[] arg) {
		DirListing dl=new DirListing();
		if(DirListing.class.isInstance(dl)){
			System.out.println("Gaurav");
		}else{
			System.out.println("Singh");
		}
		if(dl instanceof DirListing){
			System.out.println("gaurav");
		}else{
			System.out.println("singh");
		}
		Vector v=new Vector();
		System.out.println(v.capacity());
		StringBuffer strbuff=new StringBuffer();
		System.out.println(strbuff.capacity());
		StringBuilder strbuild=new StringBuilder();
		System.out.println(strbuild.capacity());
		Thread thr=new Thread();
		 
	}
}