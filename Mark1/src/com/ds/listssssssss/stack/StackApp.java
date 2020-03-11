package com.ds.listssssssss.stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackX stack=new StackX();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.displayStack();
		
		stack.pop();
		stack.displayStack();
	System.out.println("should be 20 "+stack.peek());	
		
		
		stack.pop();
		stack.displayStack();
		
		stack.pop();
		stack.displayStack();
		
		stack.pop();
		stack.displayStack();
		
		
	}

}
