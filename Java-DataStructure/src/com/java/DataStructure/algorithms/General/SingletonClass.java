package com.java.DataStructure.algorithms.General;

import java.util.*;
 class Parents {
    public Parents(String message) {
        System.out.println("Parent: " + message);
    }
}

 class Childs extends Parents {
    public Childs() {
        super("Hello from Parent"); // Calls the Parent constructor
        System.out.println("Child constructor");
    }
}

public class SingletonClass {
    //eager initialized
    //private static SingletonClass singletonClass=new SingletonClass();
    //Lazy Initialized
    private static SingletonClass singletonClass;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        /*
        if(singletonClass==null){  //will get object when required
            singletonClass=new SingletonClass();
        }*/
        //in Multi thread environment
        synchronized (SingletonClass.class){
            if(singletonClass==null){
                singletonClass=new SingletonClass();
            }
        }
        return singletonClass;
    }
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            SingletonClass instance = SingletonClass.getInstance();
            System.out.println(instance.hashCode());
        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            SingletonClass instance = SingletonClass.getInstance();
            System.out.println(instance.hashCode());
        }).start();

        List<String> ls=new ArrayList<>();
        ls.add("Viru");
        ls.add("Vikas");
        ls.add("patel");
        System.out.println("---------------Iterator-----------------------------");
        Iterator<String> iterator = ls.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator.forEachRemaining(System.out::println);

        System.out.println("---------------SplitIterator-----------------------------");
        Spliterator<String> spliterator = ls.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        stringSpliterator.forEachRemaining(System.out::println);


        System.out.println("---------------ListIterator-----------------------------");
        ListIterator<String> stringListIterator = ls.listIterator();
    }


}
