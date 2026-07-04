package com.java.DataStructure.algorithms.General;

public class LongestSubString {
    public static void main(String[] args) {
        String s ="abcaabcdba";//"abcabcbb"; //"abcabcbb" "pwwkew"
        //String s="aab";
        StringBuffer bigSt=new StringBuffer();
        StringBuffer st=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            int i1 = st.indexOf(c);
            if(i1>=0){
                int len=st.length();
                if(st.length()>bigSt.length()) {
                    bigSt.append(st);
                }
                st.delete(0,len);
                st.append(s.charAt(i));
              }else {
                st.append(s.charAt(i));

            }
        }
        System.out.println(bigSt.length()>st.length()?bigSt:st);
    }
}
