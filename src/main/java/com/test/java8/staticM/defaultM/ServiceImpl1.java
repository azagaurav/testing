package com.test.java8.staticM.defaultM;

/**
 * @author egarsgh
 *
 */
public class ServiceImpl1 implements DefaultStaticMethodEx, Service {

	/* (non-Javadoc)
	 * @see com.test.java8.staticM.defaultM.Service#service()
	 */
	@Override
	public void service() {
		// TODO Auto-generated method stub
		Service.super.service();
		System.out.println("ServiceImpl1");
	}

	/* (non-Javadoc)
	 * @see com.test.java8.staticM.defaultM.DefaultStaticMethodEx#service()
	 */
	/*@Override
	public void service() {
		// TODO Auto-generated method stub
		DefaultStaticMethodEx.super.service();
	}*/

}
