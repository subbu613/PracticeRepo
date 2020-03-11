package com.ds.trees.Trie;

public class TrieApp {

	public static void main(String[] args) {

		Trie trie = new Trie();
		trie.add("geek");
		trie.add("geeks");
		trie.add("geeksfor");
		trie.add("geeksforgeeks");
		
	System.out.println(	trie.search("geek"));
	System.out.println(	trie.search("geeks"));
	System.out.println(	trie.search("geeksfor"));
	System.out.println(	trie.search("geeksforgeeks"));
	System.out.println(	trie.search("biryani"));
	System.out.println(	trie.search("geeksforgeeks"));
	System.out.println(	trie.search("kabab"));
	
	System.out.println(	trie.search(null));
		
	}

}
