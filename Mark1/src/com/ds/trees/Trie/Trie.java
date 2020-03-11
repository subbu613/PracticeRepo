package com.ds.trees.Trie;

public class Trie {

	int ALFLABETS_NO = 26;
	private Node root = new Node();

	private class Node {
		Node arr[] = new Node[ALFLABETS_NO];
		boolean isEndOfWord;

		public Node() {

		}

	}

	public void add(String key) {
		char[] arr = key.toCharArray();

		// Node newNode = new Node();
		Node current = root;

		for (int i = 0; i < arr.length; i++) {
			int no =  arr[i] - 'a';
			if (current.arr[no] == null) {
				current.arr[no] = new Node();
			}
			current = current.arr[no];
		}
		current.isEndOfWord = true;

	}

	public boolean search(String key) {
		Node current = root;
		char[] arr = key.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int no =  arr[i] - 'a';
			if (current.arr[no] == null) {
				return false;
			} else
				current = current.arr[no];
		}
		if (current.isEndOfWord)
			return true;
		else
			return false;

	}
}
