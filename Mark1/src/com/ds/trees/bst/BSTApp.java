package com.ds.trees.bst;

public class BSTApp {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(50);
		bst.add(30);
		bst.add(40);
		bst.add(60);
		bst.add(45);
		bst.add(55);
		bst.add(10);
		bst.add(70);
		
		
		// Breadth First Search
		bst.bfs();
	}
}
