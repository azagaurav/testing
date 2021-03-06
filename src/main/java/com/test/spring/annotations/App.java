package com.test.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		ServiceClass serviceClass = new ServiceClass();
		System.out.println(serviceClass.service);
		serviceClass.service.display();
	}
}