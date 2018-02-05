/*
 * Created on 14 Nov, 2011
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
import java.io.*;

public class  DirListing{
  private static void dirlist(String fname){
  File dir = new File(fname);
    String[] chld = dir.list();
  if(chld == null){
  System.out.println("Specified directory does not exist or is not a directory.");
  System.exit(0);
    }else{
  for(int i = 0; i < chld.length; i++){
  String fileName = chld[i];
  System.out.println(fileName);
  }
  }
  }
  public static void main(String[] args){
  switch(args.length){
  case 0: System.out.println("Directory has not mentioned.");
  System.exit(0);
  case 1: dirlist(args[0]);
  System.exit(0);
  default : System.out.println("Multiple files are not allow.");
    System.exit(0);
  }
  }
}