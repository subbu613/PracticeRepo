package com.array.sort.client;


import com.array.sort.classes.Sort;
import com.array.sort.factory.SortFactory;

public class SortClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] worstArr= {70,60,50,40,30,20,10};
		Integer[] worstArr2= {70,60,50,40,30,20,10};
		Integer[] worstArr3= {70,60,50,40,30,20,10};
		
		Integer[] bestArray= {1,2,3,4,5,6,7,8,9};
		
			Integer[] arr= {20,50,70,40,60,30,10};
		Sort<Integer> bubbleSort=SortFactory.getSearch("BUBBLE", (Integer[])worstArr);
		bubbleSort.sort(worstArr);
		
		Integer[] arr1= {20,50,70,40,60,30,10};
		Sort<Integer> selectionSort=SortFactory.getSearch("SELECTION", (Integer[])worstArr2);
		selectionSort.sort(worstArr2);
		
		Sort<Integer> insertionSort=SortFactory.getSearch("INSERSION", (Integer[])worstArr3);
		insertionSort.sort(worstArr3);
	}

}
