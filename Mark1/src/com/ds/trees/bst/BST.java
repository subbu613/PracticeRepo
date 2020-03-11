package com.ds.trees.bst;

import java.util.Queue;

public class BST {
	
	Node root;
	
	class Node{
		Node left;
		Node right;
		int val;
		public Node(int val)
		{
			this.val = val;
		}
		public void print()
		{
			System.out.print(val+" ");
		}
	}

	
	public void add(int val)
	{
		Node newNode = new Node(val);
		if(root == null )
		{
			root=newNode;
		}
		else
		{
			Node current = root;
			Node parent = root;
		boolean	isLeft = true;
			while(current!=null)
			{
				parent = current;
				if(val<current.val)
				{
					isLeft = true;
					current = current.left;
				}
				else
				{
					current = current.right;
					isLeft = false;
				}

			}
			if(isLeft)
				parent.left = newNode;
			else
				parent.right = newNode;
			
		}
	}
	
	public boolean find(int val)
	{
		Node current = root;
		while(current!=null)
		{
			if(current.val == val)
				return true;
			
			if(val<current.val)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
				
		}
		return false;
	}
	
	public void delte(int val)
	{
		if(root == null)
			return;
		Node parent = root;
		Node current = root;
		boolean	isLeft = false;
		while(current!=null && current.val!=val)
		{
			parent = current;
			if(val<current.val)
			{
				current = current.left;
				isLeft = true;
			}
			else
			{
				current = current.right;
				isLeft = false;
			}
		}
		if(current == null)
			return;
		else
		{
			//if current node have no child
			if(current.left == null && current.right== null)
			{
				if(isLeft)
				parent.left = null;
				else
					parent.right = null;
			}
			
			//if left is null but right exists
			if(current.left == null && current.right!= null)
			{
				if(isLeft)
				parent.left = current.right;
				else
					parent.right =current.right;
			}
			
			//if left is exists but right is null
			if(current.left != null && current.right== null)
			{
				if(isLeft)
				parent.left = current.left;
				else
					parent.right =current.left;
			}
			//if both left and right child exists?
			if(current.left!=null && current.right !=null)
			{
				Node successor = getSuccessor(current);
				
				if(isLeft)
				{
					parent.left = successor;
				}
				else
				{
					parent.right = successor;
				}
				successor.left = current.left;
				successor.right = current.right;
				
			}
			
		}
	}

	private Node getSuccessor(Node current) {
		// TODO Auto-generated method stub
		Node sp = current;
		Node successor = current;
		Node curr = current.right;
		
		while(current !=null)
		{
			sp = successor;
			successor = current;
			current = current.left;
		}
		
		if(sp != curr)
		{
			sp.left =successor.right;
			successor.right= current.right;
		}
		return successor;
	}
	
	public void bfs()
	{
		Queue<Integer> queue = new pr
	}
}
