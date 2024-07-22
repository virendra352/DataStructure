package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class MergeSort {
	static void Merge(int[] arr,int low, int mid,int high) {
		int temp[] =new int[arr.length];
		int i=low; 
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}

		if(i>mid) {
			while(j<=high) {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}else {
			while(i<=mid) {
				temp[k]=arr[i];
				i++;
				k++;
			}
		}
		for (int k2 = 0; k2 < temp.length; k2++) {
			arr[k2]=temp[k2];
		}

	}
	public static void main(String[] args) {
		int arr[] = {4,6,1,8,3,7,2};
		MergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void MergeSort(int[] arr, int low, int high) {

		if(low<high) {
			int mid=(low+high)/2;
			MergeSort(arr,low,mid);
			MergeSort(arr,mid+1,high);
			Merge(arr,low,mid,high);
		}
	}
}
