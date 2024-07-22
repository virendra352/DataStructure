package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class MergedSort {
 static void MergeSort(int arr[]){
		int n=arr.length;
		if(n<2) {
			return;
		}
		int mid=n/2;
		int[] larr=new int[mid];
		int[] rarr=new int[(n-mid)];
		
		for (int i = 0; i <=mid-1; i++) {
			larr[i]=arr[i];
		}
		for (int i = mid; i <=n-1; i++) {
			rarr[i-mid]=arr[i];
		}
		
		MergeSort(larr);
		MergeSort(rarr);
		merge(arr,larr,rarr);
		
	}
 static void merge(int[] arr, int[] larr, int[] rarr) {
	int i=0;
	int j=0;
	int k=0;
	 while(i<larr.length && j<rarr.length) {
		 
		 if(larr[i]<rarr[j]) {
			 arr[k]=larr[i];
			 i++;
		 }else {
			 arr[k]=rarr[j];
			 j++;
		 }
		 k++;
	 }
	 while(i<larr.length) {
		 arr[k]=larr[i];
		 i++;
		 k++;
	 }
	 while(j<rarr.length) {
		 arr[k]=rarr[j];
		 j++;
		 k++;
	 }
	
}
public static void main(String[] args) {
	int arr[] = {4,6,1,8,3,7,2};
	MergeSort(arr);
	System.out.println(Arrays.toString(arr));
	
}
}
