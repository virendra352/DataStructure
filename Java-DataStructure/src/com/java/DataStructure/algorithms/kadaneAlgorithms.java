package com.java.DataStructure.algorithms;

public class kadaneAlgorithms {
public static void main(String[] args) {
	 int[] ar={-3, -4, 5, -1, 2, -4, 6, -1};
	 int cursum=0;
	 int maxsum=Integer.MIN_VALUE;
	 for(int i=0;i<ar.length;i++) {
		 cursum+=ar[i];
		 if(cursum>maxsum) {
			 maxsum=cursum;
		 }
		 if(cursum<0) {
			 cursum=0;
		 }
	 }
	 System.out.println(maxsum);
}
}
