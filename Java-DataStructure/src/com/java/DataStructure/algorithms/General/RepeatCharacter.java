package com.java.DataStructure.algorithms.General;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatCharacter {
    public static void main(String[] args) {
        String S = "Java Hungary Blog Alive is Awesome";
        int[] ar={1,2,3,4,5};

        int b=Integer.MAX_VALUE;
        int sum = Arrays.stream(ar).sum();
        String collect = Arrays.stream(S.split(""))
                .filter(c -> Character.isLetter(c.charAt(0)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println(collect);

        System.out.println((double) 5/2);
        System.out.println(10 % 3);
        int a = 10;
        if (a++ > 10) {
            System.out.println("Greater");
        } else {
            System.out.println("Not Greater");
        }

    }
}
