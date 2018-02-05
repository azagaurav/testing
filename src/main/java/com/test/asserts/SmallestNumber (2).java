/*
 * Created on 30 Nov, 2011
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.test.asserts;


  
public class SmallestNumber
  {
 public static void main( String args[] )
  {
  int a,b,c,value;
  a=10;
  b=5;
  c=23;
  if(a>b && a>c){
  	value=a;
  }else{
  	if(b>c){
  		value=b;
  	}else{
  		value=c;
  	}
  }
  System.out.print( "Smallest Number"+ value );
 } 
  }
