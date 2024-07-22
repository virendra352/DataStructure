package com.java.DataStructure.algorithms.linkedList;

import java.util.Arrays;

public class QuickSort {
	static int partition(int[] array, int start, int end) {
	    int pivot = end;
	    int i = start - 1;
	    for (int j= start; j<=end; j++) {
	      if (array[j] <= array[pivot]) {
	        i++;
	        int temp = array[i];
	        System.out.println("Swapping "+temp+" "+array[j]+" pivot : "+array[pivot]);
	        array[i] = array[j];
	        array[j] = temp;
	        
	      }
	    }
	    return i;
	  }

	public static void quickSort(int[] array, int start, int end) {
	    if (start < end) {
	      int pivot = partition(array, start, end);
	      quickSort(array, start, pivot -1);
	      quickSort(array, pivot + 1, end);
	    }
	  }  
	
	
public static void main(String[] args) {
	//int arr[] = {10,6,1,8,3,7,2};
	int arr[] = {10,80,30,90,40};
	quickSort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
 }
}
