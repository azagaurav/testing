/*
 * Created on 15 Nov, 2011
 * 
 * TODO To change the template for this generated file go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
package com.test.zip;

import java.io.*;
import java.util.zip.*;

public class ZipFolderExample {
	String[] a = { "g", "a" };

	public static void main(String a[]) {
		try {

			File inFolder = new File("D:\\client\\NDF\\client-000001");
			File outFolder = new File("D:\\client\\NDF\\client-000001.zip");
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(
					new FileOutputStream(outFolder)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			System.out.println("Gaurav");
			System.out.println(inFolder.list());
			String files[] = inFolder.list();
			System.out.println(files.length);
			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(inFolder
						.getPath()
						+ "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}