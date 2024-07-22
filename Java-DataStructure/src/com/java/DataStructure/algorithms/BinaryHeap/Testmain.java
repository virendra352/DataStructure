package com.java.DataStructure.algorithms.BinaryHeap;

public class Testmain {
public static void main(String[] args) {
	Maxheap h=new Maxheap(7);
	h.insertNode(10);
	h.insertNode(15);
	h.insertNode(11);
	h.Traverse();
	h.insertNode(40);
	h.insertNode(30);
	h.insertNode(17);
	h.insertNode(33);
	h.Traverse();
	System.out.println("peek value : "+h.peek());
	System.out.println("Detail value : "+h.DeleteMax());
	System.out.println("peek value : "+h.peek());
 }
}
