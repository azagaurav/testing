/*
 * Created on 14 Nov, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

import java.io.File;


/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class CreateFolder {

	public static void main(String[] args) {

		System.out.println("gggggggggg");
		try{
			  String strDirectoy ="test";
			  String strManyDirectories="D:\\sape/NDF/000001";

			  // Create one directory
			  boolean success = (new File(strDirectoy)).mkdir();
			  if (success) {
			  System.out.println("Directory: " + strDirectoy + " created");
			  }  
			  
			  // Create multiple directories
			  success = (new File(strManyDirectories)).mkdirs();
			  if (success) {
			  System.out.println("Directories: " + strManyDirectories + " created");
			  }

			  }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
	}
}