package com.array.sort.classes.december19;

public class InsersionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {7,5,4,8,2,3,1,9,6};
		System.out.println("input  is :");
		printArray(arr);
		System.out.println("output is :");
		sort(arr);
		printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void sort(int [] arr)
	{
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int val = arr[i];
			for (; j >0 && arr[j-1]>val ; j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=val;
		}
	}

}
