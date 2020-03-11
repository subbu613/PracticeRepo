package com.ds.listssssssss.ArrayList;

public class ArrayListImpl {

	int [] arr;
	int size;
	int currIdx;
	
	public ArrayListImpl()
	{
		size =16;
		arr= new int [size];
		currIdx=0;
	}
	
	public void add(int number)
	{
		if(isFull())
			reSizeTheArray();
		arr[currIdx++] = number;
	}

	private void reSizeTheArray() {
		// TODO Auto-generated method stub
		size = size *2;
		
		int [] localArr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			localArr[i] =arr[i];
		}
		arr = localArr;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return currIdx >= size;
	}
	
	public void deleteAtIndex(int idx)
	{
		if(currIdx > idx && idx >=0) {
		for (int i = idx+1; i <=currIdx; i++) {
			arr[i-1] = arr[i];
		}
		currIdx--;
		}
	}
	
	public void insertAtIndex(int idx,int val)
	{
		if(currIdx >=idx && idx >=0) {
				
		for(int i= currIdx ;i >0 && i> idx; i--)
		{
			arr[i]=arr[i-1];
		}
		arr[idx]=val;
		currIdx++;
		}
	}
	
	public void printArr()
	{
		for (int i = 0; i < currIdx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
