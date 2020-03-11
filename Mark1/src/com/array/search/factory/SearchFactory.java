package com.array.search.factory;

import com.array.search.Search;
import com.array.search.linearsearch.BinarySearch;
import com.array.search.linearsearch.LinearArraySearch;
//import com.array.search.linearsearch.LinearSearch;

public class SearchFactory<K> {

	public static <K> Search<K> getSearch(String s ,K[] arr,K val ) {
		Search<K> obj;
		switch (s) {
		case "LINEAR":
			obj = new LinearArraySearch<K>(arr,val);
			break;
		case "BINARY":
			obj = new BinarySearch<K>(arr,val);
			break;
		default:
			obj = new LinearArraySearch<K>(arr,val);

		}
		return obj;
	}
}
