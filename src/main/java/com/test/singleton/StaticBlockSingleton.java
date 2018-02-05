package com.test.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton staticBlockSingleton;
	private StaticBlockSingleton(){
		System.out.println("Creating Static block Singleton Object............");
	}
	
	static{
		try{
			staticBlockSingleton = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Runtime Exception occured............");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return staticBlockSingleton;
	}
}
