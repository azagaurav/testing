package com.test.spring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("loginServiceImpl")
@Qualifier("loginServiceImpl")
public class LoginServiceImpl implements Service {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Login Service is running");
	}

}
