package com.ds.listssssssss.linkedlists.simplelinkedlist;

public class SimpleLinkedList {

	Link first;

	public class Link {
		int val;
		Link next;

		public Link(int val) {
			this.val = val;
		}

		public void displayLink() {
			System.out.print(val + " ");
		}

	}

	public SimpleLinkedList() {

	}

	public void add(int val) {
		Link newLink = new Link(val);
		if (first == null) {
			first = newLink;
		} else {
			Link current = first;
			while (current != null && current.next != null) {
				current = current.next;
			}
			current.next = newLink;
		}
	}

	public Link delete(int val) {

		if (first == null)
			return null;

		Link current = first;
		Link previous = null;
		while (current != null && current.val != val) {
			previous = current;
			current = current.next;
		}

		if (current != null) {
			if (previous == null) {
				first = null;
			} else
				previous.next = current.next;
		}

		return current;
	}
	
	public void displayList()
	{
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public void addAtFirst(int val)
	{
		Link newLink = new Link(val);
		
		if(first != null)
			newLink.next = first;
		first = newLink;
		
	}
	
	public void deleteAtFirst()
	{
		if(first !=null)
			first = first.next;
	}
	
}
