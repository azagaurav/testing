package com.test.excel;

import java.text.*;

public class Format4 {
  public static void main(String args[]) {
    String fmt = "The square of {0} is {1}";
    Object values[] = new Object[2];
    int n = 5;
    values[0] = new Integer(n);
    values[1] = new Integer(n * n);

    final int COUNT = 10;

    for (int i = 1; i <= COUNT; i++) {
      String s =
          MessageFormat.format(fmt, values);
      System.out.println(s+" hhhhh "+i);
    }
  }
}