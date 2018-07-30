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
		Eatable eable = () -> System.out.println("Lambda Expression for Eatable Functional Interface");
		eable.eat();
		List.staticAdd();
		MathOperations mo = (int x, int y)-> {
			System.out.println("Adding Operation : "+(x+y));
			return x+y;
		};
		mo.operations(3, 5);
		
		MathOperations addition = (x, y) -> x+y;
		MathOperations substraction = (int x, int y) -> x-y;
		MathOperations multiplication = (int x, int y) -> x*y;
		MathOperations division = (int x, int y) -> x/y;
		
		System.out.println("Adding Operator : "+ al.operator(5, 10, addition));
		System.out.println("substraction Operator : "+ al.operator(5, 10, substraction));
		System.out.println("multiplication Operator : "+ al.operator(5, 10, multiplication));
		System.out.println("division Operator : "+ al.operator(20, 10, division));
		
	}

	private int operator(int a, int b, MathOperations mo) {
		// TODO Auto-generated method stub
		return mo.operations(a, b);
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
