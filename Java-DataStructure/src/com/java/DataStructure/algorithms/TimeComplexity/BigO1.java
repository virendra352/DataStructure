package com.java.DataStructure.algorithms.TimeComplexity;

public class BigO1 {
    public static void main(String[] args) {
        BigO1 b=new BigO1();
        System.out.println(b.Multiply(10));
    }

    private int Multiply(int i) {
        return i*i;    //there is constant operation for any number
    }
}
