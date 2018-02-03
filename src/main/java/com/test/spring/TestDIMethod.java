/**
 * 
 */
package com.test.spring;

import org.springframework.beans.factory.BeanFactory;

/**
 * @author Gaurav
 *
 */
public interface TestDIMethod {
	public BeanFactory getBeanFactory();

	public void showSetterMethodDI(BeanFactory factory);

	public void showConstructorDIwithPrimnString(BeanFactory factory);

}
