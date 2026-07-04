package com.java.DataStructure.algorithms.General;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StaticMethod {

    static String name;
    StaticMethod(String name){
        this.name=name;
    }
    public static void main(String[] args) {

        Integer i=new Integer(20);
        Integer i1=new Integer(20);
        System.out.println(i==i1);

        StaticMethod s=new StaticMethod("Mohit");
        StaticMethod s1=new StaticMethod("Rohit");

        System.out.println(StaticMethod.name+" ");
        List<String> lt=new ArrayList<>();
        lt.add("java");
        lt.add("javaScript");
        System.out.println(lt.remove(1));
        StringJoiner sj=new StringJoiner(",");
        sj.add("java");
        sj.add("is");
        sj.add("programming");
        sj.add("language");
        System.out.println(sj);
        StringJoiner sJoin=new StringJoiner(",","[","]");
        sJoin.add("java");
        sJoin.add("is");
        sJoin.add("programming");
        sJoin.add("language");
        System.out.println(sJoin);




    }
}
