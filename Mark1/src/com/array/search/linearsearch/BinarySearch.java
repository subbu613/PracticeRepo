package com.array.search.linearsearch;

import com.array.search.AbstractArraySearch;

public class BinarySearch<K> extends AbstractArraySearch<K>{

	 public BinarySearch(K[] ar,K v) {
		super(ar, v);
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public int searchAbstract() {
		// TODO Auto-generated method stub
		int low=0;
		int high=objArr.length-1;
		
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(objArr[mid].equals(searchVal))
				return mid;
			else if(compare(objArr[mid],searchVal))
				low=mid+1;
			else
				high=mid-1;
			
		}
		
		return -1;
	}
	
	private boolean compare(K arrVal,K val)
	{
		System.out.println("comparing arrVal "+arrVal+ " and val "+ val +" "+(((Comparable<K>)arrVal).compareTo(val)));
		return (((Comparable<K>)arrVal).compareTo(val))<0;
	}
}
