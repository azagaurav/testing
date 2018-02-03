package com.test.string;

import java.io.IOException;

public class ChangeToProperCaseString {
	public String toProperCase(String string) throws IOException {
		if (string == null) {
			return "";
		} else if (string.equalsIgnoreCase("")) {
			return "";
		}
		boolean precededBySpace = true;
		string = string.toLowerCase();
		StringBuffer properCase = new StringBuffer();
		int j = 0;
		while (j < string.length()) {
			char c = string.charAt(j);
			System.out.println(c);
			if (c == ' ') {
				properCase.append(c);
				precededBySpace = true;
			} else {
				if (precededBySpace) {
					properCase.append(Character.toUpperCase(c));
				} else {
					properCase.append(c);
				}
				precededBySpace = false;
			}
			j++;
		}
		return properCase.toString();
	}

	public static void main(String[] a) {
		ChangeToProperCaseString ctp = new ChangeToProperCaseString();
		String name = "Gaurav kUmar Singh";
		try {
			String newNmae = ctp.toProperCase(name);
			System.out.println(newNmae);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}