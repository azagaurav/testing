package com.test;

public class A {
	public static void main(String[] st) {
		String str = "ftp://ftps.unitedlex.com\nuser-id  -- ulx119\npassword --\n\nftp://ftps.unitedlex.com\nuser-id  -- ulx119password --\nftp://ftps.unitedlex.com\nuser-id  -- ulx119\npassword -- ";
		System.out.println(str);
		str = str.replaceAll("[^a-zA-Z 0-9]+", "");

		str = str.replaceAll("[\r\n]+", " ");
		String param=str;
		str = (param == null) ? "NA" : param;
		System.out.println("Value of Field after :::: " + str.trim());
		String[] arrStr = { "AS", "fddf", "fsdf", "fsdf", null, "dfs", "sgds" };
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i].charAt(1));
		}

	}
}
