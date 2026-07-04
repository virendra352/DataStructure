package com.java.ninjaCoding;

import java.util.Locale;

public class reverseVowelString {
    public static void main(String[] args) {
        String s1="hello";  //holle
        String s="lEetcode"; //leotcede// eeoe// eoee//leotcede
        String st="aioueAEIOU";
       /* Boolean[] vowel=new Boolean[128];
        for(char c:st.toCharArray()){
            vowel[c]=true;
        }*/
        char[] ch=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while (left<right){                             //leetcode //out- leotcede

            if(st.indexOf(ch[right])==-1){
                right--;
            }
            else if(st.indexOf(ch[left])==-1){
                left++;
            }
            else if(st.indexOf(ch[left])!=-1 && st.indexOf(ch[right])!=-1){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                right--;
                left++;
            }
        }
        System.out.println(new String(ch));
    }
}
