package com.ds.listssssssss.stack;

public class StackX {
	
	int idx;
	int [] arr;
	int size ;
	public StackX()
	{
		this.size=10;
		arr= new int [size];
		this.idx = -1;
	}
	
	public boolean isFull()
	{
		return idx==size;
	}

	public void push(int val)
	{
		if(!isFull())
		arr[++idx] = val;
	}
	
	public int pop()
	{
		if(!isEmpty())
		return arr[idx--];
		
		return Integer.MIN_VALUE;
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return idx == -1;
	}

	public int peek()
	{
		if(!isEmpty())
		return arr[idx];
		
		return Integer.MIN_VALUE;
	}

	public void displayStack() {
		// TODO Auto-generated method stub
		System.out.println("printing stack");
		for(int i =idx;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("End printing stack");
	}
}
