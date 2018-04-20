package com.test.java.collection.list.linkedlist;

public class DeleteItemLastOccuranceLL {
	static Node head;
	class Node {
		Node next;
		Integer value;
		public Node(Integer value){
			this.value = value;
			next = null;
		}
	}
	public Node push(Integer value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		return newNode;
	}
	public static void createList(){
		DeleteItemLastOccuranceLL dilo = new DeleteItemLastOccuranceLL();
		dilo.push(1);		
		dilo.push(2);
		dilo.push(3);
		dilo.push(4);
		dilo.push(2);
		dilo.push(6);
		dilo.push(7);
		dilo.push(8);
		dilo.push(2);
		dilo.push(3);
		dilo.push(12);
	}
	public static void printList(Node head){
		while(head != null){
			System.out.print(head.value + " ");
			head = head.next;
		}
	}
	public static void deleteItemLastOccurance(){
		Node temp = null;
		Node pre = null;
		Node current = head;
		while(current != null){
			if(current.next!=null && current.next.value==8)
	        {
	        pre=current;
	        temp=current.next;
	        }
	        current=current.next;
	    }
	    pre.next=temp.next;
	}
	public static void main(String args []){
		createList();
		printList(head);
		deleteItemLastOccurance();
		System.out.println("\n");
		printList(head);
	}

}
