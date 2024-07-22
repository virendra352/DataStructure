package com.java.DataStructure.algorithms;



public class LinkedList {
	node head,tail;
	int size;
	
	public LinkedList() {
		head=null;
		tail=null;
		size=0;
	}
	
	class node{
		int data;
		node next;
		public node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void add(int a) {		
		node n=new node(a);
		if(head==null) {
			head=tail=n;			
		}else {
			tail.next=n;
			tail=n;
		}
		size++;
	}
	public void getData(node head) {
			while(head!=null) {
				System.out.println(head.data);
				head=head.next;
			}
	}
public static void main(String[] args) {
	/*
	 * node n1=new node(1); node n2=new node(2); node n3=new node(3); n1.next=n2;
	 * n2.next=n3; //n3.next=null; System.out.println(n1.data);
	 * System.out.println(n1.next.data); System.out.println(n1.next.next.data);
	 */
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(20);
	
	l.getData(l.head);
	l.remove();
	l.getData(l.head);
}
private void remove() {
	if(head==null) {
		System.out.println("linked list is empty!!!!!!!!!!!!!!!!!!!......");
	}else {
		head=head.next;
	}
	size--;
	
}

}
