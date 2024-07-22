package com.java.DataStructure.algorithms;

public class TestMerge {
public static void main(String[] args) {
	int[] arr= {1,8,5,0,20,4};
	mergeSort(arr);
	for(int a:arr) {
		System.out.print(a+ " ");
	}
}

private static void mergeSort(int[] arr) {
    
	if(arr.length<=1) {
		return;
	}
	
	int mid=arr.length/2;
	int[] left=new int[mid];
	int[] right=new int[arr.length-mid];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(i<mid) {
			left[i]=arr[i];
		}else {
			right[j]=arr[i];
			j++;
		}
	}
	mergeSort(left);
	mergeSort(right);
	merge(arr,left,right);	
}

private static void merge(int[] arr,int[] left,int[] right) {
   int i = 0,j = 0,k=0;
	while(i<left.length&&j<right.length) {
		if(left[i]<right[j]) {
			arr[k++]=left[i++];
		}else {
			arr[k++]=right[j++];
		}
	}
	while(i<left.length) {
		arr[k++]=left[i++];
	}
	while(j<right.length) {
		arr[k++]=right[j++];
	}
	
}
}
