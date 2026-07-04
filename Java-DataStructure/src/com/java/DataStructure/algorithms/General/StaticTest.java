package com.java.DataStructure.algorithms.General;
class Test{
    int a=10;
    void show(){
        System.out.println("test printing.....");
    }
    void run(){
        System.out.println("test printing.....");
    }
}
class ChildTest extends Test{
    int a=20;
    void show(){
        System.out.println("test child printing.....");
    }
    void Test(){
        System.out.println("test child printing.....");
    }
}
public class StaticTest {
    public static void main(String[] args) {
        Test t=new Test();
        Test t1=new ChildTest();
        System.out.println(t1.a);

    }
}
