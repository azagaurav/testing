package com.test.design.patterns.sigleton;

public class ReflectionBreakSingleton {
	
	private static final ReflectionBreakSingleton rbs = new ReflectionBreakSingleton();
	private ReflectionBreakSingleton(){
		super();
	}

	public static ReflectionBreakSingleton getReflectionBreakSingleton(){
		return rbs;
	}
}
