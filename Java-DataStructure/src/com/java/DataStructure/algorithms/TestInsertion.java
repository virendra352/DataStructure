package com.java.DataStructure.algorithms;

public class TestInsertion {
public static void main(String[] args) {
	int[] arr= {1,8,5,0,20,4};
	

	for(int j=1;j<arr.length;j++) {
		
		if(arr[j]<arr[j-1]) {
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
		}
		int i=j-1;
		while(i>0&& arr[i]<arr[i-1] ) {
			int temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
			i--;
		}
	}
		
	for(int a:arr) {
		System.out.print(a+ " ");
	}
}
}
