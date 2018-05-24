package com.test.java.stack;

public class StackImplArray {
	//FILO
	int capacity = 5;
	Integer [] array = new Integer[capacity];
	Integer top = -1;
	public static void main(String str []){
		System.out.println("Stack ");
		StackImplArray sia = new StackImplArray();
		sia.push(4);
		sia.push(5);
		sia.push(6);
		sia.push(8);
		sia.push(8);
		sia.push(8);
		sia.pop();
		sia.pop();
		sia.pop();
	}

	private void pop() {
		// TODO Auto-generated method stub
		System.out.println(top);
		if (top >= 0) {
			top--;
			System.out.println("Pop operation done !");
		} else {
			System.out.println("Stack Underflow !");
		}
		printElements();
	}

	private void push(Integer pushedElement) {
		// TODO Auto-generated method stub
		if (top < capacity - 1) {
			top++;
			array[top] = pushedElement;
			System.out.println("Element " + pushedElement
					+ " is pushed to Stack !");
			printElements();
		} else {
			System.out.println("Stack Overflow !");
		}
		
	}

	public void printElements() {
		if (top >= 0) {
			System.out.print("Elements in stack : ");
			for (int i = 0; i <= top; i++) {
				System.out.print(array[i]+ " ");
			}
		}
	}
}
