package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class MergePractice {
	public static void divide(int[] arr,int li,int hi) {
		if(hi<=li) {
			return;
		}
		int mid=li+(hi-li)/2;
		divide(arr,li,mid);
		divide(arr,mid+1,hi);
		merge(arr,li,mid,hi);
		
	}
  static void merge(int[] arr, int li, int mid, int hi) {
		int array[]= new int[hi-li+1];
		
		int i=li;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=hi) {
			if(arr[i]<=arr[j]) {
				array[k]=arr[i];
				k++;
				i++;
			}else {
				array[k]=arr[j];
				k++;
				j++;
			}
			
		}
		
		while(i<=mid) {
			array[k]=arr[i];
			k++;
			i++;
		}
		while(j<=hi) {
			array[k]=arr[j];
			k++;
			j++;
		}
		
		for(int f=0,l=li ;f<array.length;f++,l++) {
			arr[l]=array[f];
		}
		
			
		
		
	}
public static void main(String[] args) {
	
	int arr[]= {40,70,30,10,50,20,90};
	divide(arr,0,arr.length-1);
	
	System.out.println("Sorted Array :"+Arrays.toString(arr));
	
 }
}
