package com.java.DataStructure.algorithms.linkedList;

public class main {
public static void main(String[] args) {
	singleLinkedList sl=new singleLinkedList();
	sl.createLinkedList(10);
	//System.out.println(sl.size);
	//System.out.println(sl.head.data);
	//System.out.println(sl.head.next);
	//System.out.println(sl.head==null);
	sl.insertAtLocation(5, 0);
	sl.insertAtLocation(15, 2);
	sl.insertAtLocation(10, 1);
	System.out.println(sl.head.data);
	//System.out.println(sl.head.next);
	System.out.println(sl.tail.data);
	//System.out.println(sl.tail.next);
	sl.traverseLinkedList();
	sl.SearchLinkedList(10);
	
	
}
}
