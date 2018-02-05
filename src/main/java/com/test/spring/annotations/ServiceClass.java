package com.test.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceClass {
	
	public ServiceClass(){
		
	}
	@Autowired
	@Qualifier("loginServiceImpl")
	public Service service;
}
