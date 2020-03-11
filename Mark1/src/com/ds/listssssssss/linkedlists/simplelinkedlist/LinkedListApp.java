package com.ds.listssssssss.linkedlists.simplelinkedlist;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleLinkedList list = new SimpleLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.addAtFirst(60);
		System.out.println("Displaying List. Should have values as 60 10 20 30 40 50\n ");
		list.displayList();
		
		list.delete(40);
		list.deleteAtFirst();
		
		System.out.println("Displaying List after deletion. Should have values as  10 20 30  50 \n ");

		list.displayList();
	}

}
