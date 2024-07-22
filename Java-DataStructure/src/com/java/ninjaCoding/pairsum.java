package com.java.ninjaCoding;

import java.util.HashMap;
import java.util.Map;

public class pairsum {
public static void main(String[] args) {
	int[] arr = { 2, 3, 5, 0, 7, 4 };// {2,3} {5,0}-- >no of count =2
	int sum = 5;
	Map<Integer ,Integer> hm=new HashMap<>();
	for(int a:arr) {
		hm.put(a, a);
	} //O(n)
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		 int val=sum-arr[i];
		 if(hm.containsKey(val)) {
			 System.out.println(arr[i]+","+val);
			 count++;
			 hm.remove(arr[i]); 
		 }
	} //O(n)
	System.out.println(count);
}
//time complexity-----O(n)
//space complexity ---O(n)
}
