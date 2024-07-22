package com.java.DataStructure.algorithms.linkedList;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {2,5,10,0,7,8,1};
	
	for (int i = 0; i < arr.length; i++) {
		int min=i;
		for (int j =i+1; j < arr.length; j++) {			
			if(arr[j]<arr[min]) {
				min=j;
			}			
		}
		int tem=arr[min];
		arr[min]=arr[i];
		arr[i]=tem;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
