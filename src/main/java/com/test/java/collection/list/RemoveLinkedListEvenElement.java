package com.test.java.collection.list;

public class RemoveLinkedListEvenElement {
	//Declare head Node
	static Node root;
	
	//Create class Node as blueprint with Next pointer and value of node
	class Node {
		Node next;
		Integer value;
		public Node (Integer value){
			this.value = value;
			next = null;
		}
	}
	
	public static void main(String [] args){
		RemoveLinkedListEvenElement customLinkedlist = new RemoveLinkedListEvenElement();
		customLinkedlist.push(1);
		customLinkedlist.push(2);
		customLinkedlist.push(3);
		customLinkedlist.push(4);
		customLinkedlist.push(5);
		customLinkedlist.push(6);
		customLinkedlist.push(7);
		customLinkedlist.push(8);
		customLinkedlist.push(9);
		customLinkedlist.push(11);
		customLinkedlist.push(12);
		System.out.println(root.value);
		removeEvens();
		customLinkedlist.printList();
		System.out.println(customLinkedlist);
	}
	public void push(Integer value){
		Node node = new Node(value);
		node.next = root;
		root = node;		
	}
	void printList()
    {
        Node temp = root;
        while(temp != null)
        {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
	 public static void removeEvens() {
		 System.out.println("Remove Evens..........");
	        if (root == null) return;
	        // delete root if it's even
	        if (isEven(root))
	            root = root.next;
	        // removing all even nodes after the root
	        Node prev = root;
	        while (prev.next != null) {
	            if (isEven(prev.next))
	                prev.next = prev.next.next;   // next is even: delete it
	            else
	                prev = prev.next;             // next is not even: proceed
	        }	       
	    }

	    private static boolean isEven(Node node) {
	        return node.value % 2 == 0;
	    }
}
