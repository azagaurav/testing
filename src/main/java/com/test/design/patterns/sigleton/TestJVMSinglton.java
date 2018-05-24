package com.test.design.patterns.sigleton;

public class TestJVMSinglton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TestJVMSinglton"+EagerSingleton.getEagerSingletonInstance().hashCode());

	}

}
