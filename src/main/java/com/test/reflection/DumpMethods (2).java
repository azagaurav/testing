/*
 * Created on 23 Mar, 2012
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.reflection;

/**
 * @author kbg-web
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.lang.reflect.*;

  public class DumpMethods {  	
     public static void main(String args[])
     {
     	
        try {
           Class c = Class.forName(/*"java.util.Stack"*/"com.test.pdf.Form2");
           Method m[] = c.getDeclaredMethods();
           for (int i = 0; i < m.length; i++)
           System.out.println(m[i].toString());
        }
        catch (Throwable e) {
           System.err.println(e);
        }
     }
  }