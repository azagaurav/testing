package com.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.test.bean.Employee;

public class TestDIMethodImpl implements TestDIMethod {

	public BeanFactory getBeanFactory() {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory bean = new XmlBeanFactory(r);
		return bean;
	}

	public void showSetterMethodDI(BeanFactory factory) {
		// TODO Auto-generated method stub
		System.out.println("Setter method DI");
		Employee e = (Employee) factory.getBean("obj");
		e.display();
	}

	public void showConstructorDIwithPrimnString(BeanFactory factory) {
		// TODO Auto-generated method stub
		System.out.println("Constructor DI");
		Employee e = (Employee) factory.getBean("obj");
		e.show();
	}

}
