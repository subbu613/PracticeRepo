package com.array.search.client;

import com.array.search.Search;
import com.array.search.factory.SearchFactory;


public class SearchClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr= {10,20,30,40,50,60,70};
		
		Search<Integer> linearSearch1=SearchFactory.getSearch("LINIER",arr,60);
		System.out.println( "linear Search value is at index at "+linearSearch1.search());
		
		Search<Integer> binarySearch1=SearchFactory.getSearch("BINARY",arr,60);
	System.out.println("binary Search value is at index at "+	binarySearch1.search());
		
	}

}
