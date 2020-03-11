package com.array.sort.classes;

public abstract class AbstractSort<K> implements Sort<K> {

	protected K[] arr;
	protected AbstractSort(K[] ar)
	{
		this.arr=ar;
	}
	
	protected void printArray()
	{
		
			System.out.print("Array is ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	protected void swap(int i,int j)
	{
		K temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
	}
	protected boolean compare(int i,int j)
	{
		K from=arr[i];
		K to =arr[j];
		
		return (((Comparable<K>)from).compareTo(to))>0;
		/*
		 * if >0 means from is greater than to need to swap  //assuming need to sort in ascending order.
		 *   <0 means from is less than to don't swap
		 * 
		 * */
	}
}
