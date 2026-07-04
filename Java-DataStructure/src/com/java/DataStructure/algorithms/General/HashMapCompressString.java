package com.java.DataStructure.algorithms.General;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapCompressString {
    public static void main(String[] args) {
        String st="fgchgjgcfghg";
        String s="";
        HashMap<Character,Integer> hm=new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
             char ch= st.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,(hm.get(ch)+1));
            }else{
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            s+=String.valueOf(entry.getKey())+entry.getValue();
        }
        System.out.println(s);

       // Set<String> lt=new HashSet<>();
        List<String> lt=new ArrayList<>();
        boolean a = lt.add("A");
        boolean b = lt.add("B");
        boolean c = lt.add("C");
        boolean d = lt.add("C");
        System.out.println(a+" "+b+" "+c+" "+d);
        List<String> lts=new ArrayList<>();
        lts.add("D");
        lt.addAll(lts);
         String remove = lt.remove(3);
        System.out.println(remove);
        System.out.println(lt.size());

    }
}
