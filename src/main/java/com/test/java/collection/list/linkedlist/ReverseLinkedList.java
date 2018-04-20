package com.test.java.collection.list.linkedlist;

public class ReverseLinkedList {
	
	static Node head;
	class Node {
		Integer value;
		Node next;
		public Node(Integer value){
			this.value = value;
			next = null;
		}
	}
	public void push(Integer value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public static ReverseLinkedList createList(){
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.push(1);		
		rll.push(2);
		rll.push(3);
		rll.push(4);
		rll.push(5);
		rll.push(6);
		rll.push(7);
		rll.push(8);
		rll.push(9);
		rll.push(11);
		rll.push(12);
		System.out.println("Print List");
		printList(head);
		return rll;
	}
	public static void printList(Node head){
		while(head != null){
			System.out.print(head.value + " ");
			head = head.next; 
		}
	}
	public static Node reverseList(Node head){		
		Node pre = null;
		Node curr = head;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		head = pre;
		return head;
	}
	public static void main(String args []){
		//ReverseLinkedList rll = 
		createList();
		//printList(head);
		Node node2 = reverseList(head);
		printList(node2);
		//prints(new Object());
		//printm(new String());
	}
	
	static void prints(Object obj){
		System.out.println("Object");
	}
	static void printm(String obj){
		System.out.println("String");
	}

}
