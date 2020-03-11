package com.ds.listssssssss.linkedlists.doublylinkedlist;

public class DoublyLinkedListImpl {

	Link first;
	Link last;
	
	class Link
	{
		Link next;
		Link prev;
		int val;
		
		public Link(int val)
		{
			this.val = val;
		}
		public void displayLink()
		{
			System.out.print(val+" ");
		}
	}
	
	public void addFirst(int val)
	{
		Link currentLink = new Link(val);
		if(first==null)
		{
			last = currentLink ;
		}
		else
		{
			currentLink.next =first;
			first.prev = currentLink;
		}
		first = currentLink;
	}
	
	public void addLast(int val)
	{
		Link currentLink = new Link(val);
		
		if(first == null)
		{
			first = currentLink;
		}
		else
		{
			last.next = currentLink;
			currentLink.prev = last;
		}
		last = currentLink;
	}
	
	public void addAfter(int val,int currentVal)
	{
		Link newLink = new Link(val);
		Link currentLink = findCurrentLink(currentVal);
		
		if(null != currentLink)
		{
			if(first == null && last == null)
			{
				first = newLink;
				last = newLink;
			}
			else if(currentLink == last)
			{
				last = newLink;
			}
			else
			{
			currentLink.next.prev = newLink;
			newLink.next = currentLink.next;
			}
			currentLink.next = newLink;
			newLink.prev = currentLink;
		}
	}

	public void addBefore(int val, int currVal)
	{
		Link newLink = new Link(currVal);
		Link currentLink = findCurrentLink(currVal);
		
		if(null != currentLink)
		{
			if(first == null )
			{
				first = newLink;
				last =newLink;
			}
			else if(currentLink== first)
			{
				first = newLink;
			}
			else
			{
				currentLink.prev.next = newLink;
				newLink.prev =  currentLink.prev;
				
			}
			newLink.next= currentLink;
			currentLink.prev = newLink;
		}
		
		
	}
	private Link findCurrentLink(int currentVal) {
		// TODO Auto-generated method stub
		
		Link currentLink = first;
		while(currentLink != null && currentLink.val != currentVal)
		{
			currentLink = currentLink.next;
		}
		
		return currentLink;
	}
	
	
}
