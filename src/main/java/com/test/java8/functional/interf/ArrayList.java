package com.test.java8.functional.interf;

public class ArrayList implements List, AnimalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		List l = new ArrayList();
		al.add(5);
		al.defaultAdd();
		l.add(5);
		l.defaultAdd();
		Eatable als = () -> System.out.println("Lambda Expression : ");
		als.eat();
		List.staticAdd();		
	}

	@Override
	public void add(int x) {
		// TODO Auto-generated method stub
		System.out.println("Implemented method of List Interface");
	}
	//Override Default method of List Interface
	/*@Override
	public void defaultAdd() {
		System.out.println("Override Default method of List Interface");
	}*/

	@Override
	public void defaultAdd() {
		// TODO Auto-generated method stub
		AnimalList.super.defaultAdd();
	}

}
