package com.java.ninjaCoding;

import java.util.Arrays;

public class minpairsum {
	static int minDiff(int n, int[] arr) {
	       
       // Arrays.sort(arr);
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               int sum=Math.abs(arr[i]-arr[j]);
               System.out.println(arr[i]+ " "+arr[j]);
            if(sum<min){
                min=sum;
                
            }
        } 
       }
     return min;

    }
public static void main(String[] args) {
	int[] ar= {3,-6,7,-7,0};
	int[] arr= {1,8,3,10};
	int[] arrr= {5,5};
	int min= minDiff(ar.length, arrr);
	System.out.println(min);
	if((1+1)%2==0){
		System.out.println("even");
	}
	
}
}
