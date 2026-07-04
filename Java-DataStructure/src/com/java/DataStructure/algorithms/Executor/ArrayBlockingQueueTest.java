package com.java.DataStructure.algorithms.Executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueueTest =new ArrayBlockingQueue<>(5);

        new Thread(()->{
            int i=0;
            while(true){
                arrayBlockingQueueTest.add(++i);
                try {
                    System.out.println("Inserted . "+i);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());;
                }
            }
        }).start();
        new Thread(()->{

            while(true){

                try {
                    Integer a=arrayBlockingQueueTest.take();
                    System.out.println("Pulled. "+a);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(20));
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());;
                }
            }
        }).start();

    }
}
