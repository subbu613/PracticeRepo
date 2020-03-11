package com.strings.problems;

public class SmallestStringContainingSetOfChars {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="faeaaeeghaeiiaecaijkl";
		char[] set= {'a','e','i'};
		String smallestString=findSmallestStringContainingSetOfChars(s,set);
		System.out.println(" smallestString "+smallestString);
	}

	private static String findSmallestStringContainingSetOfChars(String s, char[] set) {
		char[] arr=s.toCharArray();
		
		int start=0;
		int end=0;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i]==set[0]) {
			start=i;
			System.out.println(start);
			for (int j = i,k=0; j < arr.length && k<set.length; j++) {
				System.out.println(j+" k "+k);
				if(arr[j]==set[k])
				{
					k++;
				}
				if(k==set.length)
					end=j;
				
			}
			System.out.println(" start "+start+" end "+end);
			}
		}
		
		
		return s.substring(start,end+1);
	}

}
