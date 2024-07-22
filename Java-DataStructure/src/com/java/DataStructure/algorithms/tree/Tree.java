package com.java.DataStructure.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	public Node root;
	public Tree() {
		root=null;
	}

	public void TraversePre(Node root) {

		if(root==null) {
			return;
		}
		System.out.print(root.data+ " ");
		TraversePre(root.LeftChild);
		TraversePre(root.rightChild);
	}

	public void TraverseIn(Node root) {

		if(root==null) {
			return;
		}
		
		TraverseIn(root.LeftChild);
		System.out.print(root.data+ " ");
		TraverseIn(root.rightChild);
	}
	public void TraversePost(Node root) {

		if(root==null) {
			return;
		}
	
		TraversePost(root.LeftChild);
		TraversePost(root.rightChild);
		System.out.print(root.data+ " ");
	}
	
	
	//Binary Search Tree
	public void insert(int data) {

		Node node=new Node();
		node.data=data;
		if(root==null) {
			root=node;
		}else {
			Node current=root;
			Node parent=null;
			while(true) {
				parent=current;
				//left node data
				if(data<parent.data) {
					current=current.LeftChild;
					if(current==null) {
						parent.LeftChild=node;
						return;
					}
				}else {
					current=current.rightChild;
					if(current==null) {
						parent.rightChild=node;
						return;
					}
				}
			}
		}
	}
	
	public void levelOrder() {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root)	;
		while(!q.isEmpty()) {
			Node current=q.remove();
			System.out.print(current.data+ " ");
			if(current.LeftChild!=null) {
				q.add(current.LeftChild);
			}if(current.rightChild!=null) {
				q.add(current.rightChild);
			}
		}
	}
	
	//insert by level order traversal 
	public void InsertNode(int value) {
		Node node=new Node();
		node.data=value;
		if(root==null) {
			root=node;
			return;
		}
		Queue<Node> qu=new LinkedList<Node>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node current=qu.remove();
			if(current.LeftChild==null) {
				current.LeftChild=node;
				System.out.println("Inserted successfully.....");
				break;
			}else if(current.rightChild==null) {
				current.rightChild=node;
				System.out.println("Inserted successfully.....");
				break;
			}else {
				qu.add(current.LeftChild);
				qu.add(current.rightChild);
			}
		}
	}
	
	
	//find deepest node
	
	public Node DeepestNode() {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		Node current=null;
		while(!q.isEmpty()) {
			current=q.remove();
			if(current.LeftChild!=null) {
				q.add(current.LeftChild);
			}
		    if(current.rightChild!=null){
			    q.add(current.rightChild);
			}
			}
		return current;
		}
      
	//Delete deepest node
	public void DeleteDeepest() {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		Node previous,current=null;
		while(!q.isEmpty()) {
			previous=current;
			current=q.remove();
			if(current.LeftChild==null) {
				previous.rightChild=null;
				return;
			}else if(current.rightChild==null) {
				current.LeftChild=null;
				return;
			}
			q.add(current.LeftChild);
			q.add(current.rightChild);
		}
	}
	
}
