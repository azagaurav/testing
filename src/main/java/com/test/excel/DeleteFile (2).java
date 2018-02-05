/*
 * Created on 20 Dec, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.excel;

/**
 * @author kbg-web
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
import java.io.*;

public class DeleteFile {

	private static void deletefile(String file) {
		System.out.println(file);
		File f1 = new File(file);
		boolean success = f1.delete();
		if (!success) {
			System.out.println("Deletion failed.");
			System.exit(0);
		} else {
			System.out.println("File deleted.");
		}
	}

	public static void main(String[] args) {
		File f=new File("D:\\client/NDF/client-000001/nomination.pdf");
		boolean b=f.exists();
		boolean c=f.delete();
		System.out.println("hhhhh"+b);
		System.out.println("hhhhh"+c);
		switch (args.length) {
		case 0:
			System.out.println("File has not mentioned.");
			System.exit(0);
		case 1:
			deletefile("D:\\client/NDF");
			System.exit(0);
		default:
			System.out.println("Multiple files are not allow.");
			System.exit(0);
		}
	}
}