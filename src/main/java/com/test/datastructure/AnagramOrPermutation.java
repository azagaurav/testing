package com.test.datastructure;

public class AnagramOrPermutation {
    static char[] ar = new char[100];
    static int length;
 
    public static void main(String[] args) {
           String inputString = "abcd";
           length = inputString.length();
           ar=inputString.toCharArray();
           System.out.print("Anagram of inputString (" + inputString + ") are: " );
           anagram(length);
    }
           
    public static void anagram(int newLength) {
           if (newLength == 1) // return if newLength is 1.
                  return;
           for (int i = 0; i < newLength; i++){
                  anagram(newLength - 1); // recursively find the remaining anagrams.
                  if (newLength == 2)
                        displayWord();
                  rotate(newLength);
           }
    }
    public static void rotate(int newLength) {
           
           char temp = ar[length - newLength];
           int i=0;
           for (i = (length - newLength) + 1; i < length; i++)
                  ar[i - 1] = ar[i];   //shift elements left.
           ar[i - 1] = temp;
    }
    public static void displayWord() {
           for (int i = 0; i < length; i++)
                  System.out.print(ar[i]);
           System.out.print(" ");
    }
}