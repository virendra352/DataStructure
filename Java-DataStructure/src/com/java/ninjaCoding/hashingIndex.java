package com.java.ninjaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hashingIndex {
	public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        int x=keys.size();
        int[] arr=new int[x];
        for(int i=0;i<keys.size();i++)
        {
               int index=keys.get(i)%x;           
               if(arr[index]!=0){
                    for(int j=index;j<arr.length;j++){
                         if(arr[j]==0){
                             arr[j]=keys.get(i);
                              break;
                         }else {
                           if(j==arr.length-1) {
                               arr[0]=keys.get(i); 
                           }
                         }
                    }
               }else{
                   arr[index]=keys.get(i);              
             }
        }
      return arr;
    }
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(new Integer(1));
	l.add(new Integer(5));
	l.add(new Integer(3));
	l.add(new Integer(7));
	Object[] arr=l.toArray(new Integer);
	System.out.println(Arrays.toString(arr));
	int[] ar=linearProbing(l);
	System.out.println(Arrays.toString(ar));
}
}
