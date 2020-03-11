package com.ds.listssssssss.queues.priorityQueue;

public class PriorityQueueApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PriorityQueueX pq = new PriorityQueueX();
		
		pq.enque(20);
		
		pq.enque(10);
		
		pq.enque(30);
		pq.enque(40);
		
		System.out.println("should display 40 30 20 10 ==>");
		pq.printQueue();
		
		pq.deque();
		pq.deque();
		
		System.out.println("should display 20 10 ==>");
		pq.printQueue();
		
		pq.deque();
		pq.deque();
		pq.deque();
		
		}

}
