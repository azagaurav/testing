package com.test.design.patterns.sigleton;

import java.util.Date;

public class EagerSingleton {
	public static final EagerSingleton eagerSinglton = new EagerSingleton(new Date());
	private Date date;
	private EagerSingleton(Date date){
		System.out.println("Creating SimpleSinglton Instance.............. " + date);
		this.date = date;
	}
	
	EagerSingleton(){
		System.out.println("Creating SimpleSinglton Instance.............. ");
	}
	public static EagerSingleton getEagerSingletonInstance(){
		System.out.println("Get Instance hashcode : "+eagerSinglton.hashCode());
		return eagerSinglton;
	}

}
