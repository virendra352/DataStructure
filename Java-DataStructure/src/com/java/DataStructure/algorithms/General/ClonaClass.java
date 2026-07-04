package com.java.DataStructure.algorithms.General;
class Clonetest implements Cloneable{
    int a;
    int b;

    public Clonetest(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ClonaClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clonetest clonetest=new Clonetest(10,20);
        System.out.println(clonetest.a+" "+clonetest.b);
        Clonetest c= (Clonetest)clonetest.clone();
        System.out.println(c.a+" "+c.b);
        c.b=40;
        c.a=30;
        System.out.println(c.a+" "+c.b);
    }
}
