package com.java.DataStructure.algorithms;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{

	int rank;
	String name;
	
	@Override
	public String toString() {
		return "Student [rank=" + rank + ", name=" + name + "]";
	}

	public Student(int rank, String name) {
		super();
		this.rank = rank;
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.rank<o.rank) 
			return -1;
		else if(this.rank>o.rank) 
			return 1;
	
	return 0;
		
	}
	
}
public class Priority {
public static void main(String[] args) {
	
	PriorityQueue<Student> p=new PriorityQueue<Student>();
	p.add(new Student(3,"Viru"));
	p.add(new Student(1,"Vikas"));
	p.add(new Student(5,"Suresh"));
	p.add(new Student(2,"Vimal"));
	p.add(new Student(4,"Abhi"));
	
	//System.out.println(p.toString());
	
	for (Student student : p) {
		System.out.println(student.toString());
	}
}
}
