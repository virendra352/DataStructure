package com.java.DataStructure.algorithms.General;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram extends  Object {


    public static void main(String[] args) {
        String s="ac";
        String st="bb";
        /*int sum=0;
        int sum2=0;
        for (int i = 0; i <s.length() ; i++) {
            sum+=s.charAt(i);
        }
        for (int i = 0; i <st.length() ; i++) {
            sum2+=st.charAt(i);
        }
        System.out.println(sum+" "+sum2);
        boolean result=(sum==sum2);
        System.out.println(result);*/

        int[] count=new int[256];
        int[] count1=new int[256];

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            char c1 = s.charAt(i);
            count1[c]++;
            count[c1]++;
        }

        Arrays.equals(count1,count);
        System.out.println(Arrays.toString(count1));
        System.out.println(Arrays.toString(count));
   int x=121;
       /* if(x<0){
            return false;
        }*/
        int sum=0;
        while(x>0){
            int a=x%10;
            sum=sum*10+a;
            x=x/10;
        }

        System.out.println(sum);
        System.out.println();

        String a="ac"; //97+99= 196
        String b="bb";  //98+98= 196
        String str1 = "FB";
        String str2 = "Ea";
        System.out.println(a.hashCode()+" "+b.hashCode());
        System.out.println(str1.hashCode()+" "+str2.hashCode());

        String[] array={"A","AB","ABC","ABCD","ABCDE"};
        int[] freq=new int[26];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                 freq[array[i].charAt(j)-65]++;
            }
        }
        System.out.println(Arrays.toString(freq));
        Map<Character, Long> collect = Arrays.stream(array).flatMap(t ->
                        t.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Map<String,Object> map=new HashMap<>();
        map.put("name","Kundan");
        map.put("Age","20");
        Map<String,Object> map2=new HashMap<>();
        map2.put("Home","986664456");
        map2.put("Personal","986666788");
        map.put("PhoneNumber",map2);
        System.out.println(map);
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();/*
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.);
        }*/
        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
           if(next.getValue() instanceof Map){
               Iterator<? extends Map.Entry<String, String>> iterator1 = ((Map<String, String>) next.getValue()).entrySet().iterator();
               while(iterator1.hasNext()){
                   Map.Entry<String, String> next1 = iterator1.next();
                   Map.Entry<String,String> value=Map.entry(next.getKey()+"."+next1.getKey(),next1.getValue());
                   System.out.println(value);
               }
               /*Map.Entry<String,String> value = (Map.Entry<String, String>) next.getValue();
               System.out.println(value);
               Map.entry(next.getKey()+"."+value.getValue(),value.getValue());*/
           }else {
               System.out.println(next);
           }
           int[] ar={1,2,4,2,5,3,5,6};
            Map<Integer,Long> freqMap=Arrays.stream(ar).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println("fequency of Array "+freqMap);
            Map<Integer,Integer> m=new HashMap<>();
            for (int i = 0; i < ar.length; i++) {
                 if(m.containsKey(ar[i])){
                     m.put(ar[i],(m.get(ar[i]))+1);
                 }else {
                     m.put(ar[i],1);
                 }
            }
            System.out.println("Frequency hashMap : "+m);

        }
        //IOC - it's nothing design pattern/ principle but when calls initiate by framework or
        // code of flow is controlled by framework inStread of our code
        // it is achieved by DI(dependency injection)- field,Setter,Constructor

        String removeDuplicate="hello";
        int[] d=new int[26];
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < removeDuplicate.length(); i++) {
            int aCode=removeDuplicate.charAt(i)-97;
                d[aCode]+=1;
                if(d[removeDuplicate.charAt(i)-97]==1){
                    stringBuffer.append(removeDuplicate.charAt(i));
                }
        }
        System.out.println(stringBuffer);


    }
}
