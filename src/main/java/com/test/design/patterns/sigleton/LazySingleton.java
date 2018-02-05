package com.test.design.patterns.sigleton;

public class LazySingleton {
	
	private static LazySingleton lazyInitializedSingleton;
	
	private LazySingleton(){
		System.out.println("Creating Lazy Initialized Singleton object...............");
	}
	
	public static LazySingleton getLazySingleton(){
		if(null == lazyInitializedSingleton)
			lazyInitializedSingleton = new LazySingleton();
		return lazyInitializedSingleton;
	}

}
