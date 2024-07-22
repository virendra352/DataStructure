package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class BinarySearch1 {
public static void main(String[] args) {
	int arr[] = {4,6,1,8,3,7,2};
	int key=4;
	Arrays.sort(arr);
	binarySearch(arr,key);
	//System.out.println(a);
}

static void binarySearch(int[] arr, int key) {
	int l=0;
	int r=arr.length-1;
	while(l<=r) {
		int mid=(l+(r-l))/2;
		if(arr[mid]==key) {
			System.out.println(mid);
			break;
		}else if (key>arr[mid]) {
			l=mid+1;
		}else {
			r=mid-1;
		}
	}
}
}
