package com.array.search.linearsearch;

import com.array.search.AbstractArraySearch;

public class LinearArraySearch<K> extends AbstractArraySearch<K>{

	public LinearArraySearch(K[] ar,K val) {
		super(ar,val);
	}
	

	@Override
	protected int searchAbstract() {
		for (int i = 0; i < objArr.length; i++) {
			if(objArr[i].equals(searchVal))
				return i;
		}
		return -1;
	}

	
}

