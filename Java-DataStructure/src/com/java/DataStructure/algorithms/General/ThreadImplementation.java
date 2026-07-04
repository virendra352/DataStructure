package com.java.DataStructure.algorithms.General;
class volatilesTest{
     int a=10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
public class ThreadImplementation {
    public static void main(String[] args) {
        //volatile keyword is used with variable to male sure variable data should be in
        //synch/updated/latest for multiple thraeds,Visibity issue resolved
        volatilesTest volatilesTest=new volatilesTest();

        new Thread(()->{
            try {
                //Thread.sleep(2000);
                volatilesTest.setA(20);
            } catch (Exception e) {

            }
        }).start();

        new Thread(()->{
            System.out.println(volatilesTest.getA());
        }).start();
    }
}
