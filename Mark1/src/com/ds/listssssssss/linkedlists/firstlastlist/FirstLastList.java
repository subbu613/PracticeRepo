package com.ds.listssssssss.linkedlists.firstlastlist;

public class FirstLastList {

	Link first;
	Link last;

	class Link {
		int val;
		Link next;

		public Link(int val) {
			this.val = val;
		}

		public void displayLink() {
			System.out.print(val + " ");
		}
	}

	public FirstLastList() {
		this.first = null;

	}

	public void addFirst(int val) {
		Link currentLink = new Link(val);
		if (last == null)
			last = currentLink;
		if (first != null)
			currentLink.next = first;
		first = currentLink;

	}

	public void addLast(int val) {
		Link currentLink = new Link(val);
		if (first == null)
			first = currentLink;
		if (last != null)
			last.next = currentLink;
		last = currentLink;
	}

	public void deleteFirst() {
		if (first == null)
			return;
		if (first == last)
			last = null;

		first = first.next;
	}

	public void deleteLast() {

	}

	public void displayList() {
		// TODO Auto-generated method stub
		Link currentLink = first;

		while (currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
		System.out.println();
	}
}
