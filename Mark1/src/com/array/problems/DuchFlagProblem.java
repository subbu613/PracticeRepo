package com.array.problems;

public class DuchFlagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,0,1,2,0,1,2,2,0,1,0,2,1,0,1,2,0,2,1,0,1,0,2,1,0,1,2,0,1,2};
		printArray(arr);
		sort(arr);
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=0;
		int k=arr.length-1;
		System.out.println("length "+arr.length);
		while (i<=k)
		{
			System.out.println("at start i "+i+" j "+j+" k "+k);
			if(arr[i]==0)
				swap(j++,i++,arr);
			else if(arr[i]==2)
				swap(k--,i,arr);
			else
				i++;
			
			printArray(arr);
			System.out.println("at end i "+i+" j "+j+" k "+k);
			
		}
	}

	private static void swap(int j, int i, int[] arr) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
