package com.java.DataStructure.algorithms.linkedList;

public class SllPractice {
	public Node head;
	public Node tail;
	public int size;
	
	public void insertNode(int value) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			node.next=null;
			head=node;
			tail=node;
			System.out.println("Node has been added into Linked List as First Node!!!!!");
			size++;
		}else {
			node.next=null;
			tail.next=node;
			tail=node;
			System.out.println("Node has been added into Linked List!!!!!");
			size++;
		}
		
	}
	
	public  void insertAtFirst(int value) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			System.out.println("Linked List is Empty.............");
		}else {
			node.next=head;
			//head.next=node;
			head=node;
			size++;
		}
		
	}
	
	public void Traverse() {
		Node temp=head;
		for(int i=0;i<size;i++) {
			System.out.print(temp.data);
			if(size-1>i) {
				System.out.print(" -> ");
			}
			temp=temp.next;
		}
		System.out.println("\n");
	}
	
	public void insertAtPosition(int value,int position) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			node.next=null;
			head=node;
			tail=node;
			System.out.println("Node has been added into Linked List as First Node!!!!!");
			size++;
		}else if(position==size){
			node.next=null;
			tail.next=node;
			tail=node;
			System.out.println("Node has been added into Linked List!!!!!");
			size++;
		}else {
			Node current=head;
			Node previous = null;
			for(int i=0;i<position-1;i++) {
				previous=current;
				current=current.next;
			}
			node.next=current;
			previous.next=node;
			System.out.println("Node added at : "+position+" position into linked List");
			size++;			
		}
	}
	public void deleteNode(int value) {
		if(head==null) {
			System.out.println("Linked List is empty!!!! or entered wrong position");
		}else {
			Node current=head;
			Node previos=null;
			for(int i=0;i<size;i++) {
							
				if(current.data==value &&i==0) {
					current=current.next;
					head=current;
					System.out.println(value +" Node is deleted....");
					size--;
				}else if(current.data==value &&i==size-1){
					tail=previos;
					previos.next=null;
					System.out.println(value +" Node is deleted....");
					size--;
				}else if(current.data==value){
					previos.next=current.next;
					System.out.println(value +" Node is deleted....");
					size--;
				}
				previos=current;
				current=current.next;
			}
		}
		
	}
public static void main(String[] args) {
	SllPractice lst=new SllPractice();
	lst.insertNode(10);
	lst.insertNode(20);
	lst.insertAtFirst(5);
	lst.Traverse();
	lst.insertAtPosition(7, 2);
	lst.Traverse();
	System.out.println("Linked Size Is :"+lst.size);
	lst.deleteNode(5);
	lst.Traverse();
	lst.deleteNode(10);
	lst.Traverse();
	System.out.println("Linked Size Is :"+lst.size);
	lst.deleteNode(20);
	lst.Traverse();
	System.out.println("Linked Size Is :"+lst.size);
}
}
