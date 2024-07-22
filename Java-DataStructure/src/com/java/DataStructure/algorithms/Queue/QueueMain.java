package com.java.DataStructure.algorithms.Queue;

public class QueueMain {
public static void main(String[] args) {
	Queue q=new Queue();
	System.out.println(q.isEmpty());
	System.out.println(q.peek());
	q.inQueue(10);
	q.inQueue(20);
	q.Traverse();
	System.out.println(q.isEmpty());
	System.out.println(q.peek());
	System.out.println(q.topOfQueue);
}
}
