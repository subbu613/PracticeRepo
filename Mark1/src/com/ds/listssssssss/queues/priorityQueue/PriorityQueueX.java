package com.ds.listssssssss.queues.priorityQueue;

public class PriorityQueueX {
	int size;
	int nElems;
	int arr[];

	public PriorityQueueX() {
		size = 4;
		nElems = 0;
		arr = new int[size];
	}

	public void enque(int val) throws Exception {
		int j = moveElementsAsPerPriority(val);

		arr[j+1] = val;
		nElems++;

	}

	private int moveElementsAsPerPriority(int val) throws Exception {
		if (isFull()) 
			throw new Exception("Queue is full");

			int i ;
			for (i = nElems -1; i >= 0; i--) {
				if (arr[i] > val) {
					arr[i + 1] = arr[i];
				} else
					break;
			}
			return i;

	}

	public int deque() throws Exception {
		if(nElems == 0)
			throw new Exception("Queue is Empty");
		return arr[--nElems];
	}

	public int peek() throws Exception {
		if(nElems == 0)
			throw new Exception("Queue is Empty");
		return arr[nElems -1];
	}

	public boolean isFull() {
		return nElems == size;
	}

	public boolean isEmpty() {
		return !isFull();
	}
	
	public void printQueue()
	{
		for (int i = nElems-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
