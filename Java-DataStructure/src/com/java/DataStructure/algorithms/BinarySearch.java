package com.java.DataStructure.algorithms;

import java.util.Arrays;

public class BinarySearch {
	//
	
public static void main(String[] args) {
	int[] ar= {4,8,66,0,33,1}; 
	Arrays.sort(ar); //0,1,4,8,33,66      
	System.out.println(Arrays.toString(ar));
	int key=33;  ///-----------------O(1)
	int left=0;  //
	int right=ar.length-1;//
	
	while(left<=right) {             
		int mid=(left+right)/2;   
		
		if(ar[mid]==key) {
			System.out.println("find Element : "+ar[mid] +" at index "+mid);
			break;
		}else if(ar[mid]>key) {
			 
			right=mid-1;
		}else {
			left=mid+1;
		}
	}

	
	
}
}
