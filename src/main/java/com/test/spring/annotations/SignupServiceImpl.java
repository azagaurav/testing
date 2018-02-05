package com.test.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class SignupServiceImpl implements Service{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Signup Service running");
	}
	
	

}
