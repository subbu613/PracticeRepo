package com.array.problems;

import java.util.Stack;

public class ParanthasisProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'{','[','(',')','}',']','(',')'};
		
		char[] noArr={'{','[','(',')','}',']','('};
		
		//validate(arr);
		validate(noArr);
		
	}

	private static void validate(char[] arr) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			
			char c=arr[i];
			System.out.println("char is "+c);
			switch(c)
			{
			case '{':System.out.println("1");
				
			case '[':System.out.println("2");
				
			case '(':System.out.println("3");
				s.push(c);
						break;
			case '}':System.out.println("4");
			case ']':System.out.println("5");
			case ')':System.out.println("6");
					s.pop();
						break;
			}
		}
		
		if(s.isEmpty())
		System.out.println("Paranthsis are matching");
		else
			System.out.println("Paranthsis are not matching");
	}

}
