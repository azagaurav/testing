package com.test.collection.list;

import java.util.ArrayList;



public class LinkedListMain {

	public static void main(String [] args){
		ListI lim = new ListImpl();
		LinkedListTemp<String> ll = lim.addItem();
		lim.findMidElementInSingleShot(ll);
		lim.findMidElementByTravers(ll);
		LinkedListFlaten llf = lim.createLinkedList();
		
		//ListIterator<String> litr = l.listIterator();
		
		/*while (litr.hasNext()) {
			System.out.println(litr.next());
		}*/
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("value");
		l2.add("value1");
		l2.add("value2");
		l2.add("value3");
		l2.add("value4");
		 
		
		//System.out.println(l);
		//ArrayList al =new ArrayList();
		//al.add("");
		//System.out.println((Integer)al.get(0));
		//System.out.println(l.equals(l2));
		//findInSingleShot(l);
		//findByTravers();
		
	}

	/*private void findByTravers() {
		// TODO Auto-generated method stub
		Node node = new Node<>();
		node.setValue("value5555");
		l.linkBefore("value5", node);
		
	}*/

	
}
