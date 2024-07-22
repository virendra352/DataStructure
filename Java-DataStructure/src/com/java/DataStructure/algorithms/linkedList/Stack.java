package com.java.DataStructure.algorithms.linkedList;

public class Stack {

	public int[] arr;
	int top;;
	
	public Stack(int size){
		arr=new int[size];
		top=-1;
	    System.out.println("Stack has been creaded with the size of "+size);
	}
	
	//peek
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty, .don't have peek data....");
			return -1;
		}else {
			int peek=arr[top];
			return peek;
		}
	}
	//full
	public boolean isFull() {
		if(top==arr.length-1) {
			System.out.println("Stack is full.....");
			return true;
		}else {
			return false;
		}
	}
	
	//empty 
	public boolean isEmpty() {
		if(top==-1) {
			System.out.println("Stack is empty....");
			return true;		
		}else {
			return false;
		}
	}
	//push method
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("stack is full.......");
		}else {
			top++;
			arr[top]=value;			
			System.out.println(value+" has been added into stack");
		}
	}
	
	//pop method
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, Can't perform pop operation....");
			return -1;
		}else {
			int pop=arr[top];
			top--;
			return pop;
		}
	}
	
	//delete stack
	public void Delete() {
		arr=null;
		System.out.println("Stack has been deleted......");
	}
}
