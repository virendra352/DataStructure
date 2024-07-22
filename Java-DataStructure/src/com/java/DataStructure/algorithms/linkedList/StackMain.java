package com.java.DataStructure.algorithms.linkedList;

public class StackMain {
public static void main(String[] args) {
	Stack st=new Stack(3);
	st.push(10);
	st.push(20);
	st.push(30);
	System.out.println(st.isEmpty());
	System.out.println(st.isFull()); 
	
	
}
}
