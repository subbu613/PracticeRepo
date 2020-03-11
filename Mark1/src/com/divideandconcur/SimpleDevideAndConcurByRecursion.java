package com.divideandconcur;

public class SimpleDevideAndConcurByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";
		divideAndConcure(input);
	}

	private static void divideAndConcure(String input) {
		// TODO Auto-generated method stub
		if(null !=input && input.length()<=0)
			return;
		System.out.println("input "+ input);
		for (int i = 1; i < input.length(); i++) {
			divideAndConcure(input.substring(0, i));
			divideAndConcure(input.substring(i, input.length()));
		}
	}
	

}
