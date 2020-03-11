package com.array.search;

public abstract class AbstractArraySearch<K> implements Search<K> {

	
	protected K[] objArr;
	protected K searchVal;
	
	
	protected AbstractArraySearch(K[] arr,K v)
	{
		this.objArr=arr;
		this.searchVal=v;
		
	}
	
	
	public int search()
	{
		printArray();
		int i =searchAbstract();
		
		printArray();
		return i;
		
		
	}
protected abstract int searchAbstract();

	protected void printArray() {
		// TODO Auto-generated method stub
		System.out.print("Array is ");
		for (int i = 0; i < objArr.length; i++) {
			System.out.print(" "+objArr[i]);
		}
		System.out.println();
	}

}
