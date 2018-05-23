package com.test.java.string;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "abababababa";
		char [] charArr = text.toCharArray();
		int len = charArr.length;
		System.out.println(len/2);
		char tmp;
		for (int i=0; i<(len/2)+1; i++){
			len--;
			System.out.println(i + " " + len);
			//System.out.println(charArr[i] + " : " + text.charAt(len));
			if(charArr[i] != text.charAt(len))
				System.out.println("Not");
			
			
		}
		String newText = charArr.toString();
		System.out.println(newText);
		System.out.println(text);
		System.out.println(newText.equals(text));

	}

}
