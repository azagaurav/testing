package com.test.design.patterns.sigleton;

public class TestSingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestSinglton"+EagerSingleton.eagerSingleton.hashCode());
		//System.out.println("StaticBlockSingleton Test "+StaticBlockSingleton.getInstance().hashCode());
		System.out.println("Lazy Initialized Singleton Test : "+ LazySingleton.getLazySingleton().hashCode());
	}

}
