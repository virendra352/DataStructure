package com.java.DataStructure.algorithms;

public class Linklist1 {
	Node head,tail;
	int size;
	
	public Linklist1() {
		head=null;
		tail=null;
		size=0;
		System.out.println("Constructor called.....");
	}
	
     private void add(int i) {
		Node n=new Node(i);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
		size++;
		
	}
    private void addLast(int i) {
    	Node n=new Node(i);
    	if(head==null & tail==null) {
    		System.out.println("Linked List is empty");
    	}else {
    		tail.next=n;
    		tail=n;		
    	} 
    }
    private void deleteFront() {
    	if(head==null) {
    		System.out.println("Linked List is empty !!!!!!!!.........");
    	}else {
    		head=head.next;
    		size--;
    	}
    	
    }
     private void printData() {
 		if(head==null) {
 			System.out.println("Linked List is empty !!!!!!!!.....");
 		}
 		while(head!=null) {
 			System.out.println("Linked List data : "+head.data);
 			head=head.next;
 		}
 	}
     public void traverse() {
         Node current = head;
         if(current==null) {
  			System.out.println("Linked List is empty !!!!!!!!.....");
  		}
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     } 
     class Node {
    	 int data;
    	 Node next;
    	 
    	 public Node(int d) {
    		 this.data=d;
    		 //this.next=null;
    	 }
     }
     public static void main(String[] args) {
		Linklist1 lst=new Linklist1();
		
		lst.add(20);
		lst.add(30);
		System.out.println(lst.size);
		lst.add(40);
		System.out.println(lst.size);
		lst.traverse();
		lst.deleteFront();
		lst.addLast(50);
		lst.traverse();
		lst.deleteLast();
		
	}

	private void deleteLast() {
		if(tail==null) {
			System.out.println("Linked List is empty");
		}else {
			
			while(head.next.next==null) {
				
			}
		}
		
	}	
}
