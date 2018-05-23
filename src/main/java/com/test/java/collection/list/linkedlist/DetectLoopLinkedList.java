package com.test.java.collection.list.linkedlist;


public class DetectLoopLinkedList {
	static Node head;
	
	class Node {
		Node next;
		Integer value;
		Boolean read;
		public Node(Integer value){
			this.value = value;
			next = null;
			this.read=false;
		}
	}

	public void push(Integer value){
		Node newNode = new Node(value);		
		newNode.next = head;
		head = newNode;
	}

	public static void createList(){
		DetectLoopLinkedList fnefl = new DetectLoopLinkedList();
		fnefl.push(1);		
		fnefl.push(2);
		fnefl.push(3);
		fnefl.push(2);
		fnefl.push(5);
		fnefl.push(6);
		fnefl.push(7);
		fnefl.push(8);
		fnefl.push(9);
		fnefl.push(11);
		fnefl.push(12);
	}
	
	public static void printList(Node head){
		while(head != null){
			System.out.print(head.value + " ");
			if(head.read == false){
				head.read = true;
			}else{
				System.out.println("There is a loop");
				break;
			}
			head = head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createList();
		printList(head);

	}

}
