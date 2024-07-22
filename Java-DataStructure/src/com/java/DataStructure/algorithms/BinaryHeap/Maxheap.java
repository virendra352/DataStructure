package com.java.DataStructure.algorithms.BinaryHeap;

public class Maxheap {
int[] arr;
int size;
int index=0;
int arrsize=0;
public Maxheap(int size) {
	
	this.arr = new int[size];
	this.size = size;
	System.out.println("heap is created successfully....");
}
public void insertNode(int val) {
	arr[arrsize]=val;
	index=arrsize;
	int parent=(index-1)/2;
    
	while(parent>=0 && arr[parent]<arr[index]) {
		int t=arr[parent];
		arr[parent]=arr[index];
		arr[index]=t;
		
		t=parent;
		index=parent;
		parent=(t-1)/2;		
	}
	arrsize++;		
				
}
public void Traverse() {
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]==0) {
			break;
		}
		System.out.println(arr[i]+ " ");
	}
}

public int peek() {
	return arr[0];
}

public int DeleteMax() {
	int max=arr[0];
	arr[0]=arr[arrsize-1];
	heapify(0);
	return max;
}
private void heapify(int index) {
	int l=0;
	int r=0;
	l=2*index+1;
	r=2*index+2;
	int largest=index;
	
	if(l<arrsize &&arr[largest]<arr[l]) {
		largest=l;
	}
	if(r<arrsize &&arr[largest]<arr[r]) {
		largest=r;
	}
	if(largest!=index) {
		int temp=arr[largest];
		arr[largest]=arr[index];
		arr[index]=temp;
		heapify(largest);
	}
	
	
}
}
