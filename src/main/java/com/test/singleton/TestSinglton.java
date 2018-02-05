package com.test.singleton;

public class TestSinglton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestSinglton"+EagerSinglton.eagerSinglton.hashCode());
		//System.out.println("StaticBlockSingleton Test "+StaticBlockSingleton.getInstance().hashCode());
		System.out.println("Lazy Initialized Singleton Test : "+ LazySingleton.getInstance().hashCode());
	}

}
