package com.java.DataStructure.algorithms.linkedList;

import java.util.Arrays;

public class MergedSort {
	public static void merge(int[] arr,int start,int mid,int last) {
		int[] leftarr=new int[mid+2];
		int[] rightarr=new int[last-mid+1];
		
		for (int i = 0; i <=mid; i++) {
			leftarr[i]=arr[i];
		}

		for (int i =0; i <=last-mid-1; i++) {			
			rightarr[i]=arr[mid+1+i];
		}
		
		leftarr[mid-start+1] = Integer.MAX_VALUE;
		rightarr[last-mid] = Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=start;k<=last;k++) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}else {
				arr[k]=rightarr[j];
				j++;
			}
		}
		
		
		
	}
	
	public static void mergeSort(int[] arr,int start,int last) {
		
		if(start<last) {
			int mid=start+last/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, last);
			merge(arr,start, mid,last);
		}
	}
	
public static void main(String[] args) {
	int arr[] = {5,0,8,3,1,4};
	mergeSort(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
 }
}
