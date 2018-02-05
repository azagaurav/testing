package com.test.design.patterns.sigleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton sbs;
	private StaticBlockSingleton() throws Exception{
		super();
	}
	//static block initialization for exception handling
	static {
		try{
			sbs = new StaticBlockSingleton();
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}
	public static StaticBlockSingleton getStaticBlockSingleton(){
	
		return sbs;
	}
}
