package com.java.DataStructure.algorithms;

public class TestQuick {
public static void main(String[] args) {
	int[] arr= {1,8,5,0,20,4};
	quickSort(arr,0,arr.length-1 );
	for(int a:arr) {
		System.out.print(a+ " ");
	}
}

private static void quickSort(int[] arr,int start,int end) {
	
	if(end<=start) {
		return;
	}
	int pivot=partition(arr,start,end);
	quickSort(arr, start, pivot-1);
	quickSort(arr, pivot+1, end);
	
}

private static int partition(int[] arr,int start,int end) {
	int i=start-1;
	int pivot=arr[end];
	for(int j=start;j<=end-1;j++) {
		if(arr[j]<pivot) {
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;		
		}
	}
	int t=arr[i+1];
	arr[i+1]=arr[end];
	arr[end]=t;
	return i+1;
}
}
