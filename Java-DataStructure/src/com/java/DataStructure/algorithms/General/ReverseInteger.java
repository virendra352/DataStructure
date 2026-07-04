package com.java.DataStructure.algorithms.General;

public class ReverseInteger {
    public static int reverse(int x) {

        String s=String.valueOf(Math.abs(x));
        String st="";
        for(int i=s.length()-1 ;i>=0;i--){
            st=st+ (String.valueOf(s.charAt(i)));
        }
        Integer i=Integer.parseInt(st);
        int a=Integer.compare(x,i);
        return x>=i?i:-i;
    }
    public static void main(String[] args) {
        int a=-120;
        System.out.println(reverse(a));
    }
}
