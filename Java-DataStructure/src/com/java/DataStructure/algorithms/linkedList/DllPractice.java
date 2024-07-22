package com.java.DataStructure.algorithms.linkedList;

public class DllPractice {
    public Node head;
    public Node tail;
    public int size;
    
	public void createLinkedList(int value) {
		Node node=new Node();
		node.data=value;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size++;
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
	public void insertAtLast(int value) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			createLinkedList(value);
		}else {
			tail.next=node;
			node.prev=tail;
			node.next=null;
			tail=node;
			size++;
		}
	}
	public void insertAtFirst(int value) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			createLinkedList(value);
		}else {
			node.next=head;
			node.prev=null;
			head=node;
			size++;
		}
	}
	public void InsertPosition(int value,int position) {
		Node node=new Node();
		node.data=value;
		if(position<=0  && position>size+1) {
			System.out.println("Position is incorrect.....");
		}
		if(head==null) {
			createLinkedList(value);
		}else if(position==1) {
			insertAtFirst(value);
		}else if(position==size+1) {
			insertAtLast(value);
		}else {
			Node current=head;
			Node previous=null;
			for(int i=0;i<position-1;i++) {
				previous=current;
				current=current.next;
			}
			node.next=current;
			node.prev=previous;
			previous.next=node;
			current.prev=node;
					size++;
		}
	}
	
	public void deleteDll(int value) {
		if(head==null) {
			System.out.println("Linked List is empty!!!!");
		}else {
			Node current=head;
			Node previos=null;
			for(int i=0;i<size;i++) {
							
				if(current.data==value &&i==0) {
					current=current.next;
					head=current;
					current.prev=null;
					System.out.println("Node value : "+value +" is deleted....");
					size--;
				}else if(current.data==value &&i==size-1){
					tail=previos;
					previos.next=null;
					current.prev=null;
					System.out.println("Node value : "+value +" is deleted....");
					size--;
				}else if(current.data==value){
					previos.next=current.next;
					current.next.prev=previos;
					System.out.println("Node value : "+value +" is deleted....");
					size--;
				}
				previos=current;
				current=current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		DllPractice dl=new DllPractice();
		dl.createLinkedList(10);
		dl.insertAtFirst(5);
		dl.insertAtLast(15);
		dl.Traverse();
		dl.InsertPosition(12, 3);
		dl.Traverse();
		dl.deleteDll(12);
		dl.deleteDll(5);
		dl.deleteDll(15);
		dl.Traverse();
		System.out.println("size : "+dl.size);
	}
}
