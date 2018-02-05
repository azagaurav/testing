/*
 * Created on 8 Nov, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.excel;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] numbers = { "1", "1", "2", "3"," 5"," 8"," 13","21","34","55" };

    List list = Arrays.asList(numbers);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
  }
}

