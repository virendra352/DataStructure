package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class QuickSort {
	static int partition(int arr[],int low,int high) {
		int pivot=arr[(low+high)/2];
	
		while(low<=high) {
			
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
			
		}
		return low;
	}
public static void main(String[] args) {
	int arr[] = {4,6,1,8,3,7,2};
	
	QuickSort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
	
}
private static void QuickSort(int[] arr, int low, int high) {
	int p=partition(arr,low,high);
	if(low<p-1) {
		QuickSort(arr,low,p-1);		
	}
	if(high>p) {
		QuickSort(arr, p-1, high);
	}
}
}
