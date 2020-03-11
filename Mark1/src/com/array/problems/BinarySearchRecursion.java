package com.array.problems;

public class BinarySearchRecursion {
		static int count=1;
	public static void main(String[] args) {

		int arr[]= {0,1,2,3,4,5,6,7,8,9};
		int val=170;
		System.out.println("value is at "+search(0,arr.length-1,arr,val));
		
		
	}

	private static int search(int i, int j, int[] arr, int val) {
		System.out.println("count "+count++);
		if(i<=j)
		{
		int m=(i+j)/2;
		if(val==arr[m])
			return m;
		else if(val<arr[m])
			return search(i,m-1,arr,val);
		else
			return search(m+1,j,arr,val);
		}
		else
			return -1;
	}

}
