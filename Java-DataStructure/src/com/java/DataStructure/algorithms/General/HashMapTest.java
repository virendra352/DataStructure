package com.java.DataStructure.algorithms.General;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(null,10);
        hashMap.put("Man","Women");
        hashMap.put(10,20);
        System.out.println(hashMap.get(null)); //it will return null if there is no key available
        System.out.println(hashMap.put(10,50));   // old value is 20 based on already existing key
        List list=new ArrayList<>();
        list.add(10);
        list.add("man");
        System.out.println( list.add(true));
        list.add(new Object());
        System.out.println(list.size());
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //Cop
    }
}
