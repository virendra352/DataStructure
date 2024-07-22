package com.java.DataStructure.algorithms.Queue;

public class Queue {
 public int begningOfQueue;
 public int topOfQueue;
 
 public Node head;
 public Node tail;
 
 public Queue() {
	 this.begningOfQueue=-1;
	 this.topOfQueue=0;
 }
 
 public boolean isEmpty() {
	 if(topOfQueue==0) {
		 return true;
	 }else {
		 return false;
	 }
 }
 
 public void inQueue(int value) {
	 
	 Node node=new Node();
	 node.data=value;
	 
	 if(head==null) {
		 node.next=null;
		 head=node;
		 tail=node;
		 System.out.println("head node has been added..............");
		 
	 }
	 else {
		node.next=null;
		tail.next=node;
		tail=node;
		System.out.println("Current node has been added..............");
		
	 }
	 topOfQueue++;
 }
 
 public void Traverse() {
	 
	 Node temp=head;
	 for(int i=0;i<topOfQueue;i++) {
		 System.out.println(temp.data+" ");
		 temp=temp.next;
	 }
 }
 
 public void deQueue() {
	 if(isEmpty()) {
		 System.out.println("Queue is empty ...................");
		 return;
	 }else if(head==tail) {
		 System.out.println(head.data+" ");
		 head=null;
		 tail=null;
		
	 }else {
		 System.out.println(head.data+" ");
		 head.next=head;
	 }
	 topOfQueue--;
 }
 
 public int peek() {
	 if(head==null) {
		 return -1;
	 }else {
		 int peek=tail.data;
		 return peek;
	 }
 }
	
}
