package com.test.design.patterns.sigleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton tss = null;
	private ThreadSafeSingleton(){
		super();
	}

	public static synchronized ThreadSafeSingleton getEagerThreadSafeSingleton(){
		if(tss ==null)
			tss = new ThreadSafeSingleton();
		return tss;		
	}
	public static synchronized ThreadSafeSingleton getLazyThreadSafeSingleton(){
		return tss;		
	}
	/*
	 * Above implementation works fine and provides thread-safety but it reduces
	 * the performance because of cost associated with the synchronized method,
	 * although we need it only for the first few threads who might create the
	 * separate instances. To avoid this extra overhead every time, double
	 * checked locking principle is used. In this approach, the synchronized
	 * block is used inside the if condition with an additional check to ensure
	 * that only one instance of singleton class is created.
	 */
	public static  ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(tss == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(tss == null){
	                tss = new ThreadSafeSingleton();
	            }
	        }
	    }
		return tss;		
	}
}
