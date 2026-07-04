package com.java.DataStructure.algorithms.General;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CompressStrings {
    public static void main(String[] args) {
        String s="ababacscs";
        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((x,y)->{
                    System.out.print(x+""+y);
                });
    }
}
