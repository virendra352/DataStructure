package core.java.Basic;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="my name is kundan name kundan";
        LinkedHashMap<String, Long> collect = Stream.of(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().stream().forEach((key)->{
            System.out.print(key.getKey()+ " ");
        });
    }
}
