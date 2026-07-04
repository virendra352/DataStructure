package com.java.DataStructure.algorithms.BinaryHeap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {

    public static void main(String[] args) {

        char ch=57658;
        long a = 100000;
        long b = -200000;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        System.out.println(fibnocci(5,hm));
        System.out.println(fibTable(5));
    } //0,1,1,2,3,5,8,13


    //Memorization (Top to Down approach)
    private static int fibnocci(int n, Map<Integer, Integer> hm) {
        if(n==1) return 0;
        if(n==2) return 1;
        if(!hm.containsKey(n)){
            hm.put(n,(fibnocci(n-1,hm)+fibnocci(n-2,hm)));
        }
        return hm.get(n);
    }

    //2: bottom to Up(Top) Approach (Tabulation)

    static int fibTable(int n) {
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <n ; i++) {
            int n1=tb.get(i-1);
            int n2=tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
    }


}
