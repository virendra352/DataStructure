package com.java.DataStructure.algorithms.TimeComplexity;

public class BigOnSquare {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+ " "+j); //here we have n*n operation=N Square
            }
        }
    }
}
