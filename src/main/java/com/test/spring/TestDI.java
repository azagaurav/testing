package com.test.spring;

import org.springframework.beans.factory.BeanFactory;

public class TestDI {
	public static void main(String[] args) {
		TestDIMethod tdm = new TestDIMethodImpl();
		BeanFactory factory = tdm.getBeanFactory();

		tdm.showSetterMethodDI(factory);
		tdm.showConstructorDIwithPrimnString(factory);

	}
}
