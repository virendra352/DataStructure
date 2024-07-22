package com.java.DataStructure.algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.rank<o2.rank) {
			return -1;
		}else if(o1.rank>o2.rank) {
			return 1;
		}
		return 0;
	}
	
}
public class PriorityQ {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();

    // Adding elements to the priority queue
    pq.add(5);
    pq.add(2);
    pq.add(8);
    pq.add(1);
    pq.add(4);

    // Printing the elements in ascending order
    while (!pq.isEmpty()) {
        System.out.println(pq.poll());
    }
    PriorityQueue<Student> p = new PriorityQueue<>(new StudentComparator());
    p.add(new Student(3,"Viru"));
	p.add(new Student(1,"Vikas"));
	p.add(new Student(5,"Suresh"));
	p.add(new Student(2,"Vimal"));
	p.add(new Student(4,"Abhi"));
	
	while (!p.isEmpty()) {
        System.out.println(p.poll().toString());
    }
}
}
