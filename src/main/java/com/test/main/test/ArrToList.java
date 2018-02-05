/*
 * Created on May 27, 2013
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.*;


public class ArrToList {
  public static void main(String args[]) {
  String[] strArray = new String[] {"Piano", "Guitar",
 "Flute", "Drums","Violen"};

  List l = Arrays.asList(strArray);
  Collections.sort(l);
  System.out.println(l);
  }
}