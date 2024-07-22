package com.java.DataStructure.algorithms.tree;

public class TreeMain {
	public static void main(String[] args) {
		Tree t=new Tree();
		t.InsertNode(1);
		t.InsertNode(2);
		t.InsertNode(3);
		t.InsertNode(4);
		t.InsertNode(5);
		t.InsertNode(6);
		t.InsertNode(7);
		System.out.println("preOrder...............");
		t.TraversePre(t.root);
		System.out.println("inOrder.................");
		t.TraverseIn(t.root);
		System.out.println("postOrder.................");
		t.TraversePost(t.root);
		System.out.println("Level Order Traversal.......");
		
		System.out.println("\n");
		System.out.println(t.DeepestNode().data);
		t.DeleteDeepest();
		t.levelOrder();
		System.out.println("\nThank You..........");
		

	}
}
