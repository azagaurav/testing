package com.test.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton(){
		System.out.println("Creating Thread Safe Singleton");
	}
	public static synchronized ThreadSafeSingleton getInstance(){
		if(null == threadSafeSingleton)
			threadSafeSingleton = new ThreadSafeSingleton();
		return threadSafeSingleton;
	}
	public static ThreadSafeSingleton getInstanceByDoubleLock(){
		if(null == threadSafeSingleton){
			synchronized (ThreadSafeSingleton.class) {
				if(null == threadSafeSingleton)
					threadSafeSingleton = new ThreadSafeSingleton();
			}
		}
		return threadSafeSingleton;
	}

}
