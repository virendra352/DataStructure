package com.java.DataStructure.algorithms.General;

import java.util.ArrayList;
import java.util.List;

import static com.java.DataStructure.algorithms.General.StaticVariable.x;
 class Parent {
    public Parent(String message) {
        System.out.println("Parent: " + message);
    }
}

class Child extends Parent {
    public Child() {
        super("Hello from Parent"); // Calls the Parent constructor
        System.out.println("Child constructor");
    }
}
public class TestA {
    protected TestA(){
        int x1=10;  //3rd execute at the time of object creation
        System.out.println("Constructor "+x1);
    }
     {
        int y=20;    //2nd execute at the time of object creation
        System.out.println("Instance Block "+y);
    }
    static{
        int z=30;  // 1st execute at the time of class loading
        System.out.println("Static block "+z);
    }
    void m1(final int i){
        int a=40;  // 4th execute when method will be call from object
        //public int b=20; //CT error: only final is allowed
       // i=40;   // CT: error can not reassign final variable
        System.out.println("method "+a+" "+i);
    }


    public static void main(String[] args) {
        int x;
        //System.out.println(x); //Variable 'x' might not have been initialized
        if(true){
            x=10;
        }
        System.out.println(x);
        TestA testA=new TestA();
        testA.m1(50);
       final  List l=new ArrayList();
        l.add(10);
       // l=null;  CT:  Cannot assign a value to final variable 'l'

    }
}
