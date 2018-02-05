package com.test.collection.list;




public class ListImpl implements ListI{
	Node head;
	
	public class Node {
		public Node next;
		public Integer item;
		public Node down;
		public Node(Integer item,Node node){
			this.next = null;
			this.item = item;
			this.down = null;
		}		
	}
	
	public Node push(Node node, Integer data){
		Node newNode = new Node(data,null);		
		newNode.down=node;
		node = newNode;			
		return node;		
	}

	@Override
	public LinkedListTemp<String> addItem() {
		// TODO Auto-generated method stub
		LinkedListTemp<String> l = new LinkedListTemp<String>();
		l.add("value");
		l.add("value1");
		l.add("value2");
		l.add("value3");
		l.add("value4");
		l.add("value5");
		return l;
	}
	

	@Override
	public void findMidElementInSingleShot(LinkedListTemp<String> ll) {
		// TODO Auto-generated method stub
		int i = ll.size()/2;
		System.out.println(ll.get(i));
	}

	@Override
	public void findMidElementByTravers(LinkedListTemp<String> ll) {
		// TODO Auto-generated method stub
		Node tail = new Node(1, null);
		Node node5 = new Node(2, tail);
        Node node4 = new Node(3, node5);
        Node node3 = new Node(4, node4);
        Node node2 = new Node(5, node3);
        Node head = new Node(6, node2);
		Node fastPointer = head;
		Node slowPointer = head;
		while(fastPointer != null && fastPointer.next != null){
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println(slowPointer.item);		
	}


	@Override
	public LinkedListFlaten createLinkedList() {
		// TODO Auto-generated method stub
		LinkedListFlaten llf = new LinkedListFlaten();
		push(head, 5);
		return null;
	}

}
