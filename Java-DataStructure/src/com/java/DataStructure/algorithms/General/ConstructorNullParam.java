package com.java.DataStructure.algorithms.General;

public class ConstructorNullParam {
    String i;
    String j;
    ConstructorNullParam(String i,String j){
        this.i=i;
        this.j=j;
    }
    public static void main(String[] args) {
        ConstructorNullParam c=new ConstructorNullParam(null,null);
        System.out.println(c.i+ "  "+c.j);
    }
}
