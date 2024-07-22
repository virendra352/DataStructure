package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class Insertion {
public static void main(String[] args) {
	int arr[] = {10,6,1,8,3,7,2};
	
	for (int i = 1; i < arr.length; i++) {
		int key=arr[i];
		int j=i-1;
		 while(j>-1 && arr[j]>key) {
			 arr[j+1]=arr[j];
			 j--;
		 }
		 arr[j+1]=key;
				
	}
	System.out.println(Arrays.toString(arr));
}
}
