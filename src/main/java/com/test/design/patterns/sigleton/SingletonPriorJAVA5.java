package com.test.design.patterns.sigleton;

/*
 * Prior to Java 5, java memory model had a lot of issues and above
 * approaches used to fail in certain scenarios where too many threads try
 * to get the instance of the Singleton class simultaneously. So Bill Pugh
 * came up with a different approach to create the Singleton class using a
 * inner static helper class. The Bill Pugh Singleton implementation goes
 * like this;
 */
public class SingletonPriorJAVA5 {
		
	/*
	 * This is the most widely used approach for Singleton class as it doesn’t
	 * require synchronization. I am using this approach in many of my projects
	 * and it’s easy to understand and implement also.
	 */
	private SingletonPriorJAVA5(){
		super();
	}
	private static class SingletonHelper{
		private static final SingletonPriorJAVA5 spj= new SingletonPriorJAVA5();
	}
	public static SingletonPriorJAVA5 getSingletonPriorJAVA5(){
		return SingletonHelper.spj;
	}
}
