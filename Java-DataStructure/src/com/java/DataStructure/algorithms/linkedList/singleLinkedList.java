package com.java.DataStructure.algorithms.linkedList;

import java.util.Iterator;

public class singleLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public Node createLinkedList(int nodeValue) {
		
		head=new Node(); //assigning head as node
		Node node=new Node();  //creating new blank node
		node.next=null;   //assigning null reference 
		node.data=nodeValue;  //putting value into newly created node
		head=node;   //assigning node address to head
		tail=node;   //assigning node address to tail
		size=1;      //size for tracking how many nodes are there in linked list
		return head;  //returning head reference 
	}
	
	//insert method singly list 
	public void insertAtLocation(int nodeValue,int location) {
		
		Node node=new Node();
		node.data=nodeValue;
		
		if(head==null) {    //if there is no node in linked list
			createLinkedList(nodeValue);
			return;
		}else if(location==0) {  //inserting node at first location
			node.next=head;
			head=node;
		}else if(location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
		}else {
		   Node tem=head; 
		   int index=0;
		   while(index<location-1) {
			   Node nextNode=tem.next;
			   tem.next=node;
			   node.next=nextNode;
			   
		   }
		}
		size++;
	}
	
	public void traverseLinkedList() {
		
		Node temp=head;
		if(head==null) {
			System.out.println("sll is empty");
		}else {
		for (int i = 0; i <size-1; i++) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	  }
	}
	
	public boolean SearchLinkedList(int value) {
		
		Node temp=head;
		if(head==null) {
			System.out.println("linked List is empty");
			return false;
		}else {
			for(int i=0;i<size-1;i++) {
				if(temp.data==value) {
					System.out.println("\n");
					System.out.println("Element found at index: "+i+ " - "+value);
					return true;
				}
				temp=temp.next;
			}
		}
		return false;		
	}
	
}
