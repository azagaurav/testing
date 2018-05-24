package com.test.design.patterns.sigleton;

import java.util.Date;

public class EagerSingleton {
	public static final EagerSingleton eagerSingleton = new EagerSingleton(new Date());
	@SuppressWarnings("unused")
	private Date date;
	private EagerSingleton(Date date){
		System.out.println("Creating SimpleSingleton Instance.............. " + date);
		this.date = date;
	}
	
	EagerSingleton(){
		System.out.println("Creating SimpleSingleton Instance.............. ");
	}
	public static EagerSingleton getEagerSingletonInstance(){
		System.out.println("Get Instance hashcode : "+eagerSingleton.hashCode());
		return eagerSingleton;
	}

}
