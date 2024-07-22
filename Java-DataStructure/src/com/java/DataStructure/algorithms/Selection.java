package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class Selection {
public static void main(String[] args) {
	int arr[] = {4,6,1,8,3,7,2};
 
	 for (int i = 0; i < arr.length-1; i++) {
		 int min=i;
		for (int j = i; j < arr.length; j++) {			
			if(arr[j]<arr[min]) {
              min=j;
			}			
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
	 System.out.println(Arrays.toString(arr));
}
}
