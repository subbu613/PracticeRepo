package com.ds.listssssssss.queues.normalqueue;

public class QueueX {
	
	int front;
	int rear;
	int size;
	int [] arr;
	

	public QueueX() {
		
		this.size = 10;
		arr = new int[size];
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty()
	{
		return rear == -1 && front == 0 || front == rear+1;
	}
	
	public boolean isFull()
	{
		return front == rear && size-1 ==  rear;
	}
	
	public void enQueue(int val)
	{
		arr[++rear] = val;
	}
	
	public int deQueue()
	{
		return arr[front++];
	}
	
	public int peek()
	{
		return arr[front];
	}
	
	public void printQueue()
	{
		for (int i = front; i <=rear; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
