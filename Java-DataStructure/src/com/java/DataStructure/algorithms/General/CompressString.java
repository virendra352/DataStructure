package com.java.DataStructure.algorithms.General;

public class CompressString {
    public static void main(String[] args) {
        String s="";
        String st="w4a2b2c1k3";
        StringBuffer b=new StringBuffer();
        //int j=1;
        int j=0;
        for (int i = 0; i < st.length(); i++) {
            //int c;

            if(i%2!=0) {
                //c = st.charAt(j) - 48;
               // System.out.println(String.valueOf(ch));
               // s+=String.valueOf(st.charAt(i)).repeat(c);
                //b.append(String.valueOf(st.charAt(i)).repeat(c));
                //j+=2;
                j=Integer.parseInt(String.valueOf(st.charAt(i)));
                b.append(s.repeat(j));
            }
            else{
                s=String.valueOf(st.charAt(i));
            }
        }
        System.out.println(b);
    }
}
