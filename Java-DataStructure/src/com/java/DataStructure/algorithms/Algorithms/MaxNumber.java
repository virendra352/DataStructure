package com.java.DataStructure.algorithms.Algorithms;

public class MaxNumber {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
