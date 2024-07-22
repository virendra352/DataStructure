package com.java.DataStructure.algorithms.linkedList;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int arr[]= {2,5,10,0,7,8,1};
	
	for (int i=1; i < arr.length; i++) {
		int temp=arr[i],j=i;
		while(j>0 && arr[j-1]>temp) {
			arr[j]=arr[j-1];
			j--;
		}
		
	}
	System.out.println(Arrays.toString(arr));
	int a=0+6/2;
	System.out.println(a);
}
}
