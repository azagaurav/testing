package com.test.java.collection.list.linkedlist;

public class FindNthElementFromLast {
	static Integer numberOfNodes = 0;
	static Node head;
	class Node {
		Node next;
		Integer value;
		public Node(Integer value){
			this.value = value;
			next = null;
			numberOfNodes++;
		}
	}
	
	public void push(Integer value){
		Node newNode = new Node(value);		
		newNode.next = head;
		head = newNode;
	}

	public static void createList(){
		FindNthElementFromLast fnefl = new FindNthElementFromLast();
		fnefl.push(1);		
		fnefl.push(2);
		fnefl.push(3);
		fnefl.push(4);
		fnefl.push(5);
		fnefl.push(6);
		fnefl.push(7);
		fnefl.push(8);
		fnefl.push(9);
		fnefl.push(11);
		fnefl.push(12);
		System.out.println(numberOfNodes);
	}
	
	public static void printList(Node head){
		while(head != null){
			System.out.print(head.value + " ");
			head = head.next;
		}
		
	}
	
	public static void findNthElementFromLast(Integer nodeNumberFromStart){
		int i = 1;
		while(head != null){
			if(nodeNumberFromStart == i)
				System.out.println("Value of nth element from last  :  " + head.value);
			head = head.next;
			i++;
		}		
	}
	
	public static void main(String [] args){
		createList();
		printList(head);
		Integer nodeNumberFromLast = 10;
		Integer nodeNumberFromStart = numberOfNodes-nodeNumberFromLast+1;
		System.out.println();
		findNthElementFromLast(nodeNumberFromStart);
	}
}
