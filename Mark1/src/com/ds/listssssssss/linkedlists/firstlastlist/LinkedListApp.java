package com.ds.listssssssss.linkedlists.firstlastlist;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstLastList list = new FirstLastList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addFirst(40);
		list.addLast(50);
		
		System.out.println("Displaying List. Should have values as 40 20 10 30  50\n ");
		list.displayList();
		
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		
		System.out.println("Displaying List after deletion. Should have values as 30  50 \n ");

		list.displayList();
		
		list.deleteFirst();
		list.deleteFirst();
		System.out.println("Displaying List after deletion. Should have empty list \n ");
	}

}
