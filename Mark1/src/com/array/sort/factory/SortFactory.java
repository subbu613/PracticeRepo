package com.array.sort.factory;


import com.array.sort.classes.BubleSort;
import com.array.sort.classes.InsersionSort;
import com.array.sort.classes.MergeSort;
import com.array.sort.classes.QuickSort;
import com.array.sort.classes.SelectionSort;
import com.array.sort.classes.Sort;

public class SortFactory<K> {

	public static <K> Sort<K> getSearch(String s,K[] arr ) {
		Sort<K> obj;
		switch (s) {
		case "BUBBLE":
			obj = new BubleSort<K>(arr);
			break;
		case "SELECTION":
			obj = new SelectionSort<K>(arr);
			break;
		case "INSERSION":
			obj = new InsersionSort<K>(arr);
			break;
		case "MERGE":
			obj = new MergeSort<K>();
			break;
		case "QUICK":
			obj = new QuickSort<K>();
			break;
		default:
			obj = new BubleSort<K>(arr);
			break;

		}
		return obj;
	}
}
