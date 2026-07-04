package com.java.DataStructure.algorithms.General;

 class StaticVariable {
    static int x=10;
    public void show(){
        final int b=10;
    }
    public static void main(String[] args) {
        int c;
        //System.out.println(c); //Variable 'c' might not have been initialize
        StaticVariable staticVariable=new StaticVariable();
        staticVariable.x=20;
        System.out.println(staticVariable.x);
        System.out.println(StaticVariable.x);
    }
}
