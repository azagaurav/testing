package com.test.spring;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.test.bean.Student;
  
public class Test {  
public static void main(String[] args) { 
	try{
	File file =new File("applicationContext.xml");
	if (file.exists()){
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
	}catch(Exception e){
		System.out.println("Exception Exist");
		e.printStackTrace();
	}
}  
}  
