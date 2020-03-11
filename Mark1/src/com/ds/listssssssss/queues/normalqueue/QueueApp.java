package com.ds.listssssssss.queues.normalqueue;

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueX q = new QueueX();
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		
		q.printQueue();
		
		q.deQueue();
		
		q.peek();
		
	System.out.println("should be 20 ==>"+q.deQueue());	
		
		System.out.println("should conatins 30 and 40");
		q.printQueue();
		
		
		
		
	}

}
